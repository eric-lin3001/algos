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

public interface AirflowControlServicePrx extends com.zeroc.Ice.ObjectPrx
{
    default void taskFailureCallback(TaskFailureReq req)
        throws com.cecdat.schedule.control.rpc.RpcException
    {
        taskFailureCallback(req, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void taskFailureCallback(TaskFailureReq req, java.util.Map<String, String> context)
        throws com.cecdat.schedule.control.rpc.RpcException
    {
        try
        {
            _iceI_taskFailureCallbackAsync(req, context, true).waitForResponseOrUserEx();
        }
        catch(com.cecdat.schedule.control.rpc.RpcException ex)
        {
            throw ex;
        }
        catch(com.zeroc.Ice.UserException ex)
        {
            throw new com.zeroc.Ice.UnknownUserException(ex.ice_id(), ex);
        }
    }

    default java.util.concurrent.CompletableFuture<Void> taskFailureCallbackAsync(TaskFailureReq req)
    {
        return _iceI_taskFailureCallbackAsync(req, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> taskFailureCallbackAsync(TaskFailureReq req, java.util.Map<String, String> context)
    {
        return _iceI_taskFailureCallbackAsync(req, context, false);
    }

    /**
     * @hidden
     * @param iceP_req -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_taskFailureCallbackAsync(TaskFailureReq iceP_req, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "taskFailureCallback", null, sync, _iceE_taskFailureCallback);
        f.invoke(true, context, null, ostr -> {
                     TaskFailureReq.ice_write(ostr, iceP_req);
                 }, null);
        return f;
    }

    /** @hidden */
    static final Class<?>[] _iceE_taskFailureCallback =
    {
        com.cecdat.schedule.control.rpc.RpcException.class
    };

    default void taskSuccessCallback(TaskSuccessReq req)
        throws com.cecdat.schedule.control.rpc.RpcException
    {
        taskSuccessCallback(req, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void taskSuccessCallback(TaskSuccessReq req, java.util.Map<String, String> context)
        throws com.cecdat.schedule.control.rpc.RpcException
    {
        try
        {
            _iceI_taskSuccessCallbackAsync(req, context, true).waitForResponseOrUserEx();
        }
        catch(com.cecdat.schedule.control.rpc.RpcException ex)
        {
            throw ex;
        }
        catch(com.zeroc.Ice.UserException ex)
        {
            throw new com.zeroc.Ice.UnknownUserException(ex.ice_id(), ex);
        }
    }

    default java.util.concurrent.CompletableFuture<Void> taskSuccessCallbackAsync(TaskSuccessReq req)
    {
        return _iceI_taskSuccessCallbackAsync(req, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> taskSuccessCallbackAsync(TaskSuccessReq req, java.util.Map<String, String> context)
    {
        return _iceI_taskSuccessCallbackAsync(req, context, false);
    }

    /**
     * @hidden
     * @param iceP_req -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_taskSuccessCallbackAsync(TaskSuccessReq iceP_req, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "taskSuccessCallback", null, sync, _iceE_taskSuccessCallback);
        f.invoke(true, context, null, ostr -> {
                     TaskSuccessReq.ice_write(ostr, iceP_req);
                 }, null);
        return f;
    }

    /** @hidden */
    static final Class<?>[] _iceE_taskSuccessCallback =
    {
        com.cecdat.schedule.control.rpc.RpcException.class
    };

    default void taskExecuteCallback(TaskExecuteReq req)
        throws com.cecdat.schedule.control.rpc.RpcException
    {
        taskExecuteCallback(req, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void taskExecuteCallback(TaskExecuteReq req, java.util.Map<String, String> context)
        throws com.cecdat.schedule.control.rpc.RpcException
    {
        try
        {
            _iceI_taskExecuteCallbackAsync(req, context, true).waitForResponseOrUserEx();
        }
        catch(com.cecdat.schedule.control.rpc.RpcException ex)
        {
            throw ex;
        }
        catch(com.zeroc.Ice.UserException ex)
        {
            throw new com.zeroc.Ice.UnknownUserException(ex.ice_id(), ex);
        }
    }

    default java.util.concurrent.CompletableFuture<Void> taskExecuteCallbackAsync(TaskExecuteReq req)
    {
        return _iceI_taskExecuteCallbackAsync(req, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> taskExecuteCallbackAsync(TaskExecuteReq req, java.util.Map<String, String> context)
    {
        return _iceI_taskExecuteCallbackAsync(req, context, false);
    }

    /**
     * @hidden
     * @param iceP_req -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_taskExecuteCallbackAsync(TaskExecuteReq iceP_req, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "taskExecuteCallback", null, sync, _iceE_taskExecuteCallback);
        f.invoke(true, context, null, ostr -> {
                     TaskExecuteReq.ice_write(ostr, iceP_req);
                 }, null);
        return f;
    }

    /** @hidden */
    static final Class<?>[] _iceE_taskExecuteCallback =
    {
        com.cecdat.schedule.control.rpc.RpcException.class
    };

    default void dagFailureCallback(DagFailureReq req)
        throws com.cecdat.schedule.control.rpc.RpcException
    {
        dagFailureCallback(req, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void dagFailureCallback(DagFailureReq req, java.util.Map<String, String> context)
        throws com.cecdat.schedule.control.rpc.RpcException
    {
        try
        {
            _iceI_dagFailureCallbackAsync(req, context, true).waitForResponseOrUserEx();
        }
        catch(com.cecdat.schedule.control.rpc.RpcException ex)
        {
            throw ex;
        }
        catch(com.zeroc.Ice.UserException ex)
        {
            throw new com.zeroc.Ice.UnknownUserException(ex.ice_id(), ex);
        }
    }

    default java.util.concurrent.CompletableFuture<Void> dagFailureCallbackAsync(DagFailureReq req)
    {
        return _iceI_dagFailureCallbackAsync(req, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> dagFailureCallbackAsync(DagFailureReq req, java.util.Map<String, String> context)
    {
        return _iceI_dagFailureCallbackAsync(req, context, false);
    }

    /**
     * @hidden
     * @param iceP_req -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_dagFailureCallbackAsync(DagFailureReq iceP_req, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "dagFailureCallback", null, sync, _iceE_dagFailureCallback);
        f.invoke(true, context, null, ostr -> {
                     DagFailureReq.ice_write(ostr, iceP_req);
                 }, null);
        return f;
    }

    /** @hidden */
    static final Class<?>[] _iceE_dagFailureCallback =
    {
        com.cecdat.schedule.control.rpc.RpcException.class
    };

    default void dagSuccessCallback(DagSuccessReq req)
        throws com.cecdat.schedule.control.rpc.RpcException
    {
        dagSuccessCallback(req, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void dagSuccessCallback(DagSuccessReq req, java.util.Map<String, String> context)
        throws com.cecdat.schedule.control.rpc.RpcException
    {
        try
        {
            _iceI_dagSuccessCallbackAsync(req, context, true).waitForResponseOrUserEx();
        }
        catch(com.cecdat.schedule.control.rpc.RpcException ex)
        {
            throw ex;
        }
        catch(com.zeroc.Ice.UserException ex)
        {
            throw new com.zeroc.Ice.UnknownUserException(ex.ice_id(), ex);
        }
    }

    default java.util.concurrent.CompletableFuture<Void> dagSuccessCallbackAsync(DagSuccessReq req)
    {
        return _iceI_dagSuccessCallbackAsync(req, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> dagSuccessCallbackAsync(DagSuccessReq req, java.util.Map<String, String> context)
    {
        return _iceI_dagSuccessCallbackAsync(req, context, false);
    }

    /**
     * @hidden
     * @param iceP_req -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_dagSuccessCallbackAsync(DagSuccessReq iceP_req, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "dagSuccessCallback", null, sync, _iceE_dagSuccessCallback);
        f.invoke(true, context, null, ostr -> {
                     DagSuccessReq.ice_write(ostr, iceP_req);
                 }, null);
        return f;
    }

    /** @hidden */
    static final Class<?>[] _iceE_dagSuccessCallback =
    {
        com.cecdat.schedule.control.rpc.RpcException.class
    };

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static AirflowControlServicePrx checkedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, ice_staticId(), AirflowControlServicePrx.class, _AirflowControlServicePrxI.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param context The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static AirflowControlServicePrx checkedCast(com.zeroc.Ice.ObjectPrx obj, java.util.Map<String, String> context)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, context, ice_staticId(), AirflowControlServicePrx.class, _AirflowControlServicePrxI.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static AirflowControlServicePrx checkedCast(com.zeroc.Ice.ObjectPrx obj, String facet)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, facet, ice_staticId(), AirflowControlServicePrx.class, _AirflowControlServicePrxI.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @param context The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static AirflowControlServicePrx checkedCast(com.zeroc.Ice.ObjectPrx obj, String facet, java.util.Map<String, String> context)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, facet, context, ice_staticId(), AirflowControlServicePrx.class, _AirflowControlServicePrxI.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param obj The untyped proxy.
     * @return A proxy for this type.
     **/
    static AirflowControlServicePrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(obj, AirflowControlServicePrx.class, _AirflowControlServicePrxI.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    static AirflowControlServicePrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj, String facet)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(obj, facet, AirflowControlServicePrx.class, _AirflowControlServicePrxI.class);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the per-proxy context.
     * @param newContext The context for the new proxy.
     * @return A proxy with the specified per-proxy context.
     **/
    @Override
    default AirflowControlServicePrx ice_context(java.util.Map<String, String> newContext)
    {
        return (AirflowControlServicePrx)_ice_context(newContext);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the adapter ID.
     * @param newAdapterId The adapter ID for the new proxy.
     * @return A proxy with the specified adapter ID.
     **/
    @Override
    default AirflowControlServicePrx ice_adapterId(String newAdapterId)
    {
        return (AirflowControlServicePrx)_ice_adapterId(newAdapterId);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the endpoints.
     * @param newEndpoints The endpoints for the new proxy.
     * @return A proxy with the specified endpoints.
     **/
    @Override
    default AirflowControlServicePrx ice_endpoints(com.zeroc.Ice.Endpoint[] newEndpoints)
    {
        return (AirflowControlServicePrx)_ice_endpoints(newEndpoints);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the locator cache timeout.
     * @param newTimeout The new locator cache timeout (in seconds).
     * @return A proxy with the specified locator cache timeout.
     **/
    @Override
    default AirflowControlServicePrx ice_locatorCacheTimeout(int newTimeout)
    {
        return (AirflowControlServicePrx)_ice_locatorCacheTimeout(newTimeout);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the invocation timeout.
     * @param newTimeout The new invocation timeout (in seconds).
     * @return A proxy with the specified invocation timeout.
     **/
    @Override
    default AirflowControlServicePrx ice_invocationTimeout(int newTimeout)
    {
        return (AirflowControlServicePrx)_ice_invocationTimeout(newTimeout);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for connection caching.
     * @param newCache <code>true</code> if the new proxy should cache connections; <code>false</code> otherwise.
     * @return A proxy with the specified caching policy.
     **/
    @Override
    default AirflowControlServicePrx ice_connectionCached(boolean newCache)
    {
        return (AirflowControlServicePrx)_ice_connectionCached(newCache);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the endpoint selection policy.
     * @param newType The new endpoint selection policy.
     * @return A proxy with the specified endpoint selection policy.
     **/
    @Override
    default AirflowControlServicePrx ice_endpointSelection(com.zeroc.Ice.EndpointSelectionType newType)
    {
        return (AirflowControlServicePrx)_ice_endpointSelection(newType);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for how it selects endpoints.
     * @param b If <code>b</code> is <code>true</code>, only endpoints that use a secure transport are
     * used by the new proxy. If <code>b</code> is false, the returned proxy uses both secure and
     * insecure endpoints.
     * @return A proxy with the specified selection policy.
     **/
    @Override
    default AirflowControlServicePrx ice_secure(boolean b)
    {
        return (AirflowControlServicePrx)_ice_secure(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the encoding used to marshal parameters.
     * @param e The encoding version to use to marshal request parameters.
     * @return A proxy with the specified encoding version.
     **/
    @Override
    default AirflowControlServicePrx ice_encodingVersion(com.zeroc.Ice.EncodingVersion e)
    {
        return (AirflowControlServicePrx)_ice_encodingVersion(e);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its endpoint selection policy.
     * @param b If <code>b</code> is <code>true</code>, the new proxy will use secure endpoints for invocations
     * and only use insecure endpoints if an invocation cannot be made via secure endpoints. If <code>b</code> is
     * <code>false</code>, the proxy prefers insecure endpoints to secure ones.
     * @return A proxy with the specified selection policy.
     **/
    @Override
    default AirflowControlServicePrx ice_preferSecure(boolean b)
    {
        return (AirflowControlServicePrx)_ice_preferSecure(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the router.
     * @param router The router for the new proxy.
     * @return A proxy with the specified router.
     **/
    @Override
    default AirflowControlServicePrx ice_router(com.zeroc.Ice.RouterPrx router)
    {
        return (AirflowControlServicePrx)_ice_router(router);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the locator.
     * @param locator The locator for the new proxy.
     * @return A proxy with the specified locator.
     **/
    @Override
    default AirflowControlServicePrx ice_locator(com.zeroc.Ice.LocatorPrx locator)
    {
        return (AirflowControlServicePrx)_ice_locator(locator);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for collocation optimization.
     * @param b <code>true</code> if the new proxy enables collocation optimization; <code>false</code> otherwise.
     * @return A proxy with the specified collocation optimization.
     **/
    @Override
    default AirflowControlServicePrx ice_collocationOptimized(boolean b)
    {
        return (AirflowControlServicePrx)_ice_collocationOptimized(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses twoway invocations.
     * @return A proxy that uses twoway invocations.
     **/
    @Override
    default AirflowControlServicePrx ice_twoway()
    {
        return (AirflowControlServicePrx)_ice_twoway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses oneway invocations.
     * @return A proxy that uses oneway invocations.
     **/
    @Override
    default AirflowControlServicePrx ice_oneway()
    {
        return (AirflowControlServicePrx)_ice_oneway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses batch oneway invocations.
     * @return A proxy that uses batch oneway invocations.
     **/
    @Override
    default AirflowControlServicePrx ice_batchOneway()
    {
        return (AirflowControlServicePrx)_ice_batchOneway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses datagram invocations.
     * @return A proxy that uses datagram invocations.
     **/
    @Override
    default AirflowControlServicePrx ice_datagram()
    {
        return (AirflowControlServicePrx)_ice_datagram();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses batch datagram invocations.
     * @return A proxy that uses batch datagram invocations.
     **/
    @Override
    default AirflowControlServicePrx ice_batchDatagram()
    {
        return (AirflowControlServicePrx)_ice_batchDatagram();
    }

    /**
     * Returns a proxy that is identical to this proxy, except for compression.
     * @param co <code>true</code> enables compression for the new proxy; <code>false</code> disables compression.
     * @return A proxy with the specified compression setting.
     **/
    @Override
    default AirflowControlServicePrx ice_compress(boolean co)
    {
        return (AirflowControlServicePrx)_ice_compress(co);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its connection timeout setting.
     * @param t The connection timeout for the proxy in milliseconds.
     * @return A proxy with the specified timeout.
     **/
    @Override
    default AirflowControlServicePrx ice_timeout(int t)
    {
        return (AirflowControlServicePrx)_ice_timeout(t);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its connection ID.
     * @param connectionId The connection ID for the new proxy. An empty string removes the connection ID.
     * @return A proxy with the specified connection ID.
     **/
    @Override
    default AirflowControlServicePrx ice_connectionId(String connectionId)
    {
        return (AirflowControlServicePrx)_ice_connectionId(connectionId);
    }

    /**
     * Returns a proxy that is identical to this proxy, except it's a fixed proxy bound
     * the given connection.@param connection The fixed proxy connection.
     * @return A fixed proxy bound to the given connection.
     **/
    @Override
    default AirflowControlServicePrx ice_fixed(com.zeroc.Ice.Connection connection)
    {
        return (AirflowControlServicePrx)_ice_fixed(connection);
    }

    static String ice_staticId()
    {
        return "::rpc::bean::AirflowControlService";
    }
}