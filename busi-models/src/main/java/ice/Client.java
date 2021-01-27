package ice;

import demo.PrinterPrx;
import com.zeroc.Ice.Communicator;
import com.zeroc.Ice.Util;
import com.zeroc.Ice.ObjectPrx;


public class Client {
    public static void main(String[] args) {
        int status = 0;
        Communicator ic = null;
        try {
            //初始化通信器
            Communicator communicator = Util.initialize(args);
            com.zeroc.Ice.ObjectPrx base = communicator.stringToProxy("SimplePrinter:default -p 10000");
            //通过checkedCast向下转型，获取Printer接口的远程，并同时检测根据传入的名称获取服务单元是否Printer的代理接口，如果不是则返回null对象
            PrinterPrx printer = PrinterPrx.checkedCast(base);
            if(printer == null){
                throw new Error("Invalid proxy");
            }
            //把Hello world传给服务端，让服务端打印出来，因为这个方法最终会在服务端上执行
            printer.printString("Hello World!");
        } catch (Exception e) {
            e.printStackTrace();
            status = 1;
        }finally{
            if(ic != null){
                ic.destroy();
            }
        }
        System.exit(status);
    }
}