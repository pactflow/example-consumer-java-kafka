package io.pactflow.example.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ProductEventListener {
	public static Logger logger = LoggerFactory.getLogger(Application.class);
	@Autowired
	private ProductRepository repository;

	@KafkaListener(topics = "products")
	public void listen(Product product) throws Exception {
		logger.info("received product event: {}", product);

		repository.save(product);
	}
}