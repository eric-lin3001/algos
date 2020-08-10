package kafkaDemo;

public class Params {

    //采集任务id
    private String dc_id;

    //贴源库hive
    private String hive_url;

    //贴源库hive用户名
    private String hive_user;

    //贴源库hive密码
    private String hive_password;

    //医院数据库名也是做为hive的database名
    private String hive_database;

    //医院数据表名也是做为hive的table名	 "emp_conn"
    private String hive_table;

    //医院数据表字段，字段间用逗号隔开	"id,name,code"
    private String hive_fields;

    //分区类型（month、day）	 "month"
    private String hive_partition_type;

    //分区类型（month、day）	 "month"
    private String hive_partition_value;

    //ftp ip	 "192.168.1.23"
    private String ftp_ip;

    //ftp用户名	 "test"
    private String ftp_user;

    //ftp密码	 "123456"
    private String ftp_password;

    //ftp文件路径	 "/home/share/cwz/"
    private String ftp_filePath;

    //ftp文件路径下所有文件里的数据总条数	 "15"
    private String ftp_count;

    //ftp文件名称，多个使用“,”分隔
    private String file_list_v2;

    public String getDc_id() {
        return dc_id;
    }

    public void setDc_id(String dc_id) {
        this.dc_id = dc_id;
    }

    public String getHive_url() {
        return hive_url;
    }

    public void setHive_url(String hive_url) {
        this.hive_url = hive_url;
    }

    public String getHive_user() {
        return hive_user;
    }

    public void setHive_user(String hive_user) {
        this.hive_user = hive_user;
    }

    public String getHive_password() {
        return hive_password;
    }

    public void setHive_password(String hive_password) {
        this.hive_password = hive_password;
    }

    public String getHive_database() {
        return hive_database;
    }

    public void setHive_database(String hive_database) {
        this.hive_database = hive_database;
    }

    public String getHive_table() {
        return hive_table;
    }

    public void setHive_table(String hive_table) {
        this.hive_table = hive_table;
    }

    public String getHive_fields() {
        return hive_fields;
    }

    public void setHive_fields(String hive_fields) {
        this.hive_fields = hive_fields;
    }

    public String getHive_partition_type() {
        return hive_partition_type;
    }

    public void setHive_partition_type(String hive_partition_type) {
        this.hive_partition_type = hive_partition_type;
    }

    public String getHive_partition_value() {
        return hive_partition_value;
    }

    public void setHive_partition_value(String hive_partition_value) {
        this.hive_partition_value = hive_partition_value;
    }

    public String getFtp_ip() {
        return ftp_ip;
    }

    public void setFtp_ip(String ftp_ip) {
        this.ftp_ip = ftp_ip;
    }

    public String getFtp_user() {
        return ftp_user;
    }

    public void setFtp_user(String ftp_user) {
        this.ftp_user = ftp_user;
    }

    public String getFtp_password() {
        return ftp_password;
    }

    public void setFtp_password(String ftp_password) {
        this.ftp_password = ftp_password;
    }

    public String getFtp_filePath() {
        return ftp_filePath;
    }

    public void setFtp_filePath(String ftp_filePath) {
        this.ftp_filePath = ftp_filePath;
    }

    public String getFtp_count() {
        return ftp_count;
    }

    public void setFtp_count(String ftp_count) {
        this.ftp_count = ftp_count;
    }


    public String getFile_list_v2() {
        return file_list_v2;
    }

    public void setFile_list_v2(String file_list_v2) {
        this.file_list_v2 = file_list_v2;
    }
}
