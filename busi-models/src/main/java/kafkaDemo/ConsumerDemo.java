package kafkaDemo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import kafka.consumer.ConsumerIterator;
import kafka.consumer.KafkaStream;
import kafka.javaapi.consumer.ConsumerConnector;
import kafka.utils.VerifiableProperties;
import org.apache.kafka.clients.consumer.;
import java.sql.SQLException;
import java.util.;

import kafka.serializer.;

import org.apache.log4j.BasicConfigurator;
import org.springframework.context.ConfigurableApplicationContext;

public class ConsumerDemo {

    private Consumer<String, String> consumer;

    private static String group = "group-1";

    private static String TOPIC = "oozieTopic";

    private ConsumerDemo() {
        Properties props = new Properties();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "192.168.6.146:6667");
        props.put(ConsumerConfig.GROUP_ID_CONFIG, group);
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "latest");
        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true"); // 自动commit
        props.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, "1000"); // 自动commit的间隔
        props.put(ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG, "30000");
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer");
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer");
        consumer = new KafkaConsumer<String, String>(props);
    }


//
//    private void consume() {
//        consumer.subscribe(Arrays.asList(TOPIC));
//
//        while (true) {
//            ConsumerRecords<String, String> records = consumer.poll(1000);
//            for (ConsumerRecord<String, String> record : records) {
//                System.out.printf("offset = %d, key = %s, value = %s \n", record.offset(), record.key(), record.value());
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }


    public void consume() {
        //取得作业参数列表
//        Map<String, String> paramMap = mTJobParamService.getTJobParamMap(jobId);
//        RawServiceClient.init(paramMap.get(ApiConsts.DSM_GRPC_HOST), Integer.parseInt(paramMap.get(ApiConsts.DSM_GRPC_PORT)));
        String zookeeperConnect = "192.168.6.143:2181";

        String kafkaTopic = "ttt";
        String kafkaGroupId = "cwz2";
        Properties props = new Properties();

//        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "192.168.6.146:6667");
//        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer");
//        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer");
        // zookeeper 配置
        props.put("zookeeper.connect", zookeeperConnect);
        // group 代表一个消费组
        props.put("group.id", kafkaGroupId);
        // zk连接超时
        props.put("zookeeper.session.timeout.ms", "4000");
        props.put("zookeeper.sync.time.ms", "200");
        props.put("rebalance.max.retries", "5");
        props.put("rebalance.backoff.ms", "1200");
        //提交偏移量的方式enable.auto.commit设置成true（默认为true）auto.commit.interval.ms提交的时间间隔
        props.put("auto.commit.interval.ms", "1000");
        //auto.offset.reset，smallest and largest
        props.put("auto.offset.reset", "smallest");
        // 序列化类
        props.put("serializer.class", "kafka.serializer.StringEncoder");

        kafka.consumer.ConsumerConfig config = new kafka.consumer.ConsumerConfig(props);
        ConsumerConnector consumer = kafka.consumer.Consumer.createJavaConsumerConnector(config);
//        log.info("kafka consumer connect");
        Map<String, Integer> topicCountMap = new HashMap<String, Integer>();
        topicCountMap.put(kafkaTopic, new Integer(1));
        StringDecoder keyDecoder = new StringDecoder(new VerifiableProperties());
        StringDecoder valueDecoder = new StringDecoder(new VerifiableProperties());
        Map<String, List<KafkaStream<String, String>>> consumerMap = consumer.createMessageStreams(topicCountMap, keyDecoder, valueDecoder);
        KafkaStream<String, String> stream = consumerMap.get(kafkaTopic).get(0);
        ConsumerIterator<String, String> it = stream.iterator();
        //修改了一下
        String massage = null;
        String filePath = "/tmp/pgError.txt";
        while (it.hasNext()) {
            try {
                massage = it.next().message();
                Params params = JSON.parseObject(massage, Params.class);
                System.out.println(params.getDc_id());


//                log.info("input para massage:" + massage);
                //取得kafka订阅消费者topic的参数并转成参数
                //Params params = JSON.parseObject(massage, Params.class);
//                Map<String, String> params = JSON.parseObject(massage, new TypeReference<Map<String, String>>() {
//                });
//                if (params != null) {
//                    String type = params.get("hive_partition_type");
//                    try {
//                        Integer.parseInt(type);
//                    } catch (NumberFormatException e) {
//                        if ("0".equals("hive_partition_value")) {
//                            params.put("hive_partition_type", "0");
//                        } else {
//                            params.put("hive_partition_type", "3");
//                        }
//                    }
////                    iDataHandleService.handleSaveTask(params);
//                }
            } catch (Exception e) {
//
////                log.error("任务调度失败：", sql);
            }
        }
    }


        public static void main (String[]args){
            BasicConfigurator.configure();

            ConsumerDemo consumer = new ConsumerDemo();
            consumer.consume();
//            new ConsumerDemo().consume();
        }
    }