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

public class DagFailureReq implements java.lang.Cloneable,
                                      java.io.Serializable
{
    public String dagId;

    public String getDagId()
    {
        return dagId;
    }

    public void setDagId(String dagId)
    {
        this.dagId = dagId;
    }

    public DagFailureReq()
    {
        this.dagId = "";
    }

    public DagFailureReq(String dagId)
    {
        this.dagId = dagId;
    }

    public boolean equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        DagFailureReq r = null;
        if(rhs instanceof DagFailureReq)
        {
            r = (DagFailureReq)rhs;
        }

        if(r != null)
        {
            if(this.dagId != r.dagId)
            {
                if(this.dagId == null || r.dagId == null || !this.dagId.equals(r.dagId))
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
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, "::rpc::bean::DagFailureReq");
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, dagId);
        return h_;
    }

    public DagFailureReq clone()
    {
        DagFailureReq c = null;
        try
        {
            c = (DagFailureReq)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void ice_writeMembers(com.zeroc.Ice.OutputStream ostr)
    {
        ostr.writeString(this.dagId);
    }

    public void ice_readMembers(com.zeroc.Ice.InputStream istr)
    {
        this.dagId = istr.readString();
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, DagFailureReq v)
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

    static public DagFailureReq ice_read(com.zeroc.Ice.InputStream istr)
    {
        DagFailureReq v = new DagFailureReq();
        v.ice_readMembers(istr);
        return v;
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<DagFailureReq> v)
    {
        if(v != null && v.isPresent())
        {
            ice_write(ostr, tag, v.get());
        }
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, DagFailureReq v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            int pos = ostr.startSize();
            ice_write(ostr, v);
            ostr.endSize(pos);
        }
    }

    static public java.util.Optional<DagFailureReq> ice_read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.FSize))
        {
            istr.skip(4);
            return java.util.Optional.of(DagFailureReq.ice_read(istr));
        }
        else
        {
            return java.util.Optional.empty();
        }
    }

    private static final DagFailureReq _nullMarshalValue = new DagFailureReq();

    /** @hidden */
    public static final long serialVersionUID = 8212749211887453774L;
}
