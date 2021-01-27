package ice;

import com.cecdat.schedule.control.rpc.bean.TaskFailureReq;
import com.zeroc.Ice.Communicator;
import com.zeroc.Ice.Util;
import com.cecdat.schedule.control.rpc.bean.AirflowControlServicePrx;

import java.util.HashMap;
import java.util.Map;

public class ClientAirflow {

    public static void main(String[] args) {
        int status = 0;
        Communicator ic = null;
        try {
            //初始化通信器
            Communicator communicator = Util.initialize(args);
            com.zeroc.Ice.ObjectPrx base = communicator.stringToProxy("AirFlowAdapterDemoUnit:default -p 10000");
            //通过checkedCast向下转型，获取Printer接口的远程，并同时检测根据传入的名称获取服务单元是否Printer的代理接口，如果不是则返回null对象
            AirflowControlServicePrx acService = AirflowControlServicePrx.checkedCast(base);
            if(acService == null){
                throw new Error("Invalid proxy");
            }
            TaskFailureReq taskFailureReq = new TaskFailureReq();
            taskFailureReq.setTaskId("lzy123");
            Map<String,String> map = new HashMap<>();
            //把Hello world传给服务端，让服务端打印出来，因为这个方法最终会在服务端上执行
            acService.taskFailureCallback(taskFailureReq,map);
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
