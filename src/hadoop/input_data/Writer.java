package hadoop.input_data;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    public static void main(String[] args) throws IOException {
        //Target: make 100MB file
        // 100MB = 100000000Bytes, one line = 5 bytes, so 1MB = 100000000/5 = 20000000 lines.
        FileWriter myWriter = new FileWriter("/Users/linzeyang/Desktop/personal/gitHub/data-structures-algorithms/src/hadoop/input_data/input.txt",true);
        for(int i=0;i<20000000;i++){
            myWriter.append("wwww\n");
        }
        myWriter.close();
    }
}
