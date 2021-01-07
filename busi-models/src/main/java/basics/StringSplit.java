package basics;

public class StringSplit {

    public static void main(String[] args) {
        String rstNodes = "";
        String rstIp = "";
        String s = "192.168.1.73:9200,192.168.1.74:9200,192.168.1.75:9200";
        String[] oneNode = s.split(",");
        for(int i=0;i<oneNode.length;i++){
            String ip = oneNode[i].split(":")[0];
            String port = oneNode[i].split(":")[1];
            rstNodes += ip;
            if(i!=oneNode.length-1){
                rstNodes+= ",";
            }
            rstIp = port;
        }

        System.out.println(1);
    }
}
