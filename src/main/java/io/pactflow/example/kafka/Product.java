package io.pactflow.example.kafka;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
class Product {
  private @Id String id;
  private String name;
  private String type;
  private String version;
  private String event;

  Product() {}
  Product(String id, String name, String type, String version, String event) {
    this.id = id;
    this.name = name;
    this.type = type;
    this.version = version;
    this.event = event;
  }
}