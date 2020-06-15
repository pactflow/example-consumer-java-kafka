package io.pactflow.example.kafka;

class ProductNotFoundException extends RuntimeException {
  private static final long serialVersionUID = 8087803211710068858L;

  ProductNotFoundException(String id) {
    super("Could not find product " + id);
  }
}