package thinkingInJava.demos.reuse;

public class SprinklerSystem {
    String value1,value2;
    int i;
    WaterSource waterSource = new WaterSource();

    @Override
    public String toString(){
        value1 = "value1";
        String rst = "value1="+ value1 +", value2="+ value2+", int i="+i+", water_source: ";
        System.out.println(rst);
        WaterSource waterSource = new WaterSource();
        rst += rst+waterSource;
        return rst;
    }


    public static void main(String[] args) {
        SprinklerSystem s = new SprinklerSystem();
        System.out.println(s);
        WaterSource w = new WaterSource();
        System.out.println(w.a);
    }
}
