[["java:package:com.cecdat.schedule.control"]]
#include <scheduler_control_root.ice>

module rpc{
    module bean{
        ["java:getset"]
        struct TaskFailureReq{
            string taskId;//Task_ID
        };
        ["java:getset"]
        struct TaskSuccessReq{
            string taskId;//Task_ID
        };
        ["java:getset"]
        struct TaskExecuteReq{
            string taskId;//Task_ID
        };
        ["java:getset"]
        struct DagFailureReq{
            string dagId;//Task_ID
        };
        ["java:getset"]
        struct DagSuccessReq{
            string dagId;//Task_ID
        };


        interface AirflowControlService{
          void taskFailureCallback(TaskFailureReq req)throws RpcException; //task失败回调
          void taskSuccessCallback(TaskSuccessReq req)throws RpcException; //task成功回调
          void taskExecuteCallback(TaskExecuteReq req)throws RpcException; //task运行回调
          void dagFailureCallback(DagFailureReq req)throws RpcException;//Dag失败回调
          void dagSuccessCallback(DagSuccessReq req)throws RpcException ;//Dag成功回调
        };
    };
};
