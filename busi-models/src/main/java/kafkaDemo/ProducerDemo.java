package kafkaDemo;

import org.apache.kafka.clients.producer.*;
import com.alibaba.fastjson.JSONObject;
import java.util.Properties;
import java.util.concurrent.Future;


import kafka.producer.ProducerConfig;
import kafka.producer.KeyedMessage;

import kafka.javaapi.producer.Producer;


public class ProducerDemo {


    public static void main(String[] args) throws Exception {

        String topic = "ttt";

        String test1 = "{dc_id:\"123\",hive_database:\"yy0002_user\",hive_table:\"emp_conn\",hive_fields:\"id,phno,email,ppppppppppj\"," +
                "hive_partition_type:\"month\",hive_partition_value:\"201810\",ftp_ip:\"192.168.1.23\"," +
                "ftp_filePath:\"/home/share/cwz/\",ftp_count:\"10\"}";

//        Properties props = new Properties();
//        //Assign localhost id
//
//        props.put("bootstrap.servers", "192.168.6.146:6667,192.168.6.147:6667,192.168.6.148:6667");
//        props.put("key.serializer",
//                "org.apache.kafka.common.serialization.StringSerializer");
//        props.put("value.serializer",
//                "org.apache.kafka.common.serialization.StringSerializer");
//
//        Producer<String, String> producer = new KafkaProducer<String, String>(props);
//
//        for(int i=1;i<5;i++){
//            Future<RecordMetadata> metadataFuture =  producer.send(new ProducerRecord<String, String>(topic,
//                    Integer.toString(1),   test1));
//            System.out.println("Message sent successfully");
//
//        }
//        producer.close();


        Properties props = new Properties();
        props.put("metadata.broker.list", "192.168.6.146:6667,192.168.6.147:6667,192.168.6.148:6667");
        props.put("serializer.class",
                "kafka.serializer.StringEncoder");
        ProducerConfig config = new ProducerConfig(props);
        Producer<String, String> producer = new Producer<String, String>(config);

        for(int i=1;i<10;i++){
            producer.send(new KeyedMessage<String, String>(topic, Integer.toString(1), test1));
            System.out.println("Message sent successfully");
        }
        producer.close();
    }

}
