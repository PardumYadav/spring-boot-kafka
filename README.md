# spring-boot-kafka
This is a simple Spring Boot project demonstrating Kafka integration with a basic Producer and Consumer setup.

# Features

- ✅ Kafka Producer to send messages
- ✅ Kafka Consumer to receive messages
- ✅ REST endpoint to publish messages to Kafka

# Technologies

- Java 17
- Spring Boot
- Apache Kafka
- Maven

# Kafka REST API
http://localhost:9091/kafka/publish?message=HelloKafka

 # ▶️ Publish a message 
message=HelloKafka

**Response:**
Message has published
## Prerequisites

- Apache Kafka & ZooKeeper running locally
- Java 17+

## Running the App

1. Start ZooKeeper and Kafka
2. Run the Spring Boot application:

