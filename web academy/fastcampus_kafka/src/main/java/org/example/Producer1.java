package org.example;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

public class Producer1 {

    private final static String BOOTSTRAP_SERVERS = "agree.iptime.org:29092";
    private final static String TOPIC_NAME = "topic1";
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();

        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, BOOTSTRAP_SERVERS);
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.put(ProducerConfig.ACKS_CONFIG, "all");
        properties.put(ProducerConfig.RETRIES_CONFIG, "100");

        KafkaProducer<String, String> producer = new KafkaProducer<>(properties);

        String message = "First Message";

        ProducerRecord<String, String> record = new ProducerRecord<>(TOPIC_NAME, message);

        RecordMetadata metadata = producer.send(record).get();

        System.out.printf(">>> %s, %d, %d", message, metadata.partition(), metadata.offset());

        producer.flush();
        producer.close();
    }

}
