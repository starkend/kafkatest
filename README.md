# kafkatest

Kafka with Spring Boot proof of concept

# Built with
- **Spring Boot**
- **Apache Kafka**
  - Using Zookeeper
  
# Startup instructions
- **Download Kafka tarball from https://kafka.apache.org/quickstart**
  - Untar, unzip: tar -xzf kafka_<INSERT_VERSION_HERE>.tgz
- **Start Zookeeper**
  - cd kafka_2.12-2.3.0
  - bin/zookeeper-server-start.sh config/zookeeper.properties
- **Start Kafka server**
  - bin/kafka-server-start.sh config/server.properties
  
   
