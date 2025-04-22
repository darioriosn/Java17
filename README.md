# Java17
New functionalities for Java 17

## Running kakfa
```bash
docker-compose up -d
```

## Sending messages to kafka
http://localhost:8080/send?message=Hello_World

##Create a new topic
```bash
docker exec -it <kafka_container_id> opt/kafka/bin/kafka-topics.sh --create --topic <topic_name> --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1
```

## Check message in topic
```bash
docker exec -it 257fb4671ce6 kafka-console-consumer.sh --topic advice-topic --from-beginning --bootstrap-server localhost:9092
```
