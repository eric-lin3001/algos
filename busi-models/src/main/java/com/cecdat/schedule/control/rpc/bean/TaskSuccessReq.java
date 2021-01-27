//
// Copyright (c) ZeroC, Inc. All rights reserved.
//
//
// Ice version 3.7.3
//
// <auto-generated>
//
// Generated from file `scheduler_control_airflow.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.cecdat.schedule.control.rpc.bean;

public class TaskSuccessReq implements java.lang.Cloneable,
                                       java.io.Serializable
{
    public String taskId;

    public String getTaskId()
    {
        return taskId;
    }

    public void setTaskId(String taskId)
    {
        this.taskId = taskId;
    }

    public TaskSuccessReq()
    {
        this.taskId = "";
    }

    public TaskSuccessReq(String taskId)
    {
        this.taskId = taskId;
    }

    public boolean equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        TaskSuccessReq r = null;
        if(rhs instanceof TaskSuccessReq)
        {
            r = (TaskSuccessReq)rhs;
        }

        if(r != null)
        {
            if(this.taskId != r.taskId)
            {
                if(this.taskId == null || r.taskId == null || !this.taskId.equals(r.taskId))
                {
                    return false;
                }
            }

            return true;
        }

        return false;
    }

    public int hashCode()
    {
        int h_ = 5381;
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, "::rpc::bean::TaskSuccessReq");
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, taskId);
        return h_;
    }

    public TaskSuccessReq clone()
    {
        TaskSuccessReq c = null;
        try
        {
            c = (TaskSuccessReq)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void ice_writeMembers(com.zeroc.Ice.OutputStream ostr)
    {
        ostr.writeString(this.taskId);
    }

    public void ice_readMembers(com.zeroc.Ice.InputStream istr)
    {
        this.taskId = istr.readString();
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, TaskSuccessReq v)
    {
        if(v == null)
        {
            _nullMarshalValue.ice_writeMembers(ostr);
        }
        else
        {
            v.ice_writeMembers(ostr);
        }
    }

    static public TaskSuccessReq ice_read(com.zeroc.Ice.InputStream istr)
    {
        TaskSuccessReq v = new TaskSuccessReq();
        v.ice_readMembers(istr);
        return v;
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<TaskSuccessReq> v)
    {
        if(v != null && v.isPresent())
        {
            ice_write(ostr, tag, v.get());
        }
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, TaskSuccessReq v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            int pos = ostr.startSize();
            ice_write(ostr, v);
            ostr.endSize(pos);
        }
    }

    static public java.util.Optional<TaskSuccessReq> ice_read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            istr.skip(4);
            return java.util.Optional.of(TaskSuccessReq.ice_read(istr));
        }
        else
        {
            return java.util.Optional.empty();
        }
    }

    private static final TaskSuccessReq _nullMarshalValue = new TaskSuccessReq();

    /** @hidden */
    public static final long serialVersionUID = -3663679663386867699L;
}