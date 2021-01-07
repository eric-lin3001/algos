package codeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public final class CapsLock {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String inputStr = in.readLine();
        Boolean flag = true;
        for(int i=0; i<inputStr.length();i++){
            char ch = inputStr.charAt(i);
            if(i!=0){
                String chUpper = String.valueOf(ch).toUpperCase();
                if(!chUpper.equals(String.valueOf(ch))){
                    flag = false;
                    break;
                }
            }
        }
        String outputStr = "";

        if(flag){
            for(int i=0; i<inputStr.length();i++){
                char ch = inputStr.charAt(i);
                String chUpper = String.valueOf(ch).toUpperCase();
                if(!chUpper.equals(String.valueOf(ch))){
                    String charOne = chUpper.toUpperCase();
                    outputStr = outputStr + charOne;
                }else {
                    String charOne = chUpper.toLowerCase();
                    outputStr = outputStr + charOne;
                }
            }
        }else {
            outputStr = inputStr;
        }

        out.print(outputStr);
        out.close();
    }
}
