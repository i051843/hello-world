package com.santander.box.todolist.service;

import org.apache.avro.generic.GenericRecord;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;

@Service
@EnableKafka
public class Consumer {

    private static final Logger logger = LoggerFactory.getLogger(Consumer.class);

    @KafkaListener(topics = "${app.topic.input}")
    //@KafkaListener(topicPartitions =
      //      { @TopicPartition(topic = "${app.topic.input}",
        //            partitionOffsets = @PartitionOffset(partition = "0", initialOffset = "0"))})
    public void listen(ConsumerRecord<String, GenericRecord> records) {
        System.out.println("Received Message in group: " + records.value());
    }

}
