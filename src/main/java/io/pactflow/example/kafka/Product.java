package io.pactflow.example.kafka;

import lombok.Data;

import jakarta.persistence.*;

@Data
@Entity
class Product {
  private @Id String id;
  private String name;
  private String type;
  private String version;
  private String event;
  private double price;

  Product() {}
  Product(String id, String name, String type, String version, String event, double price) {
    this.id = id;
    this.name = name;
    this.type = type;
    this.version = version;
    this.event = event;
    this.price = price;
  }
}