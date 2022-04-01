#!/bin/bash

id=$(date +%s)
echo "generating a message. Edit /scripts/producer.sh to change the behaviour"
echo '{ "id": '${id}', "name": "product name", "type": "product type", "event": "CREATED", "version": "v1" } ' | /opt/kafka_2.13-2.7.0/bin/kafka-console-producer.sh --topic products --sync --bootstrap-server localhost:9092

echo "run the following command to see an updated product catalog: curl localhost:8080/products | jq ."