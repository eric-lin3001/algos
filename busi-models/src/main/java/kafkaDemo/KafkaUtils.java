package kafkaDemo;

import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class KafkaUtils {
    private static Producer<String, String> producer;
    /**
     * 发送kafka消息
     * @param servers
     * @param record
     * @return
     * @throws Exception
     */
    public static Boolean sendKafkaMsg(String servers, ProducerRecord<String, String> record) throws Exception {
//        //先判断servers是否有变化，若有变化，则重新获取生产者链接
//        if (!servers.equals(bootstrapServers)) {
//            //先关闭原先链接
//            closeProducer();
//            //获取新的链接
//            getProducer(servers);
//            if (null == producer) {
//                throw new Exception(String.format("获取kafka生产者[%s]链接失败", servers));
//            }
//            //保存地址
//            bootstrapServers = servers;
//        }

        //若发送数据为空，则直接返回
        if (null == record) {
            return true;
        }

        producer.send(record);
        return true;
    }

}
