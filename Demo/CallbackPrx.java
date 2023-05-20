//
// Copyright (c) ZeroC, Inc. All rights reserved.
//
//
// Ice version 3.7.9
//
// <auto-generated>
//
// Generated from file `printer.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package Demo;

public interface CallbackPrx extends com.zeroc.Ice.ObjectPrx
{
    default void notifyCallback()
    {
        notifyCallback(com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void notifyCallback(java.util.Map<String, String> context)
    {
        _iceI_notifyCallbackAsync(context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> notifyCallbackAsync()
    {
        return _iceI_notifyCallbackAsync(com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> notifyCallbackAsync(java.util.Map<String, String> context)
    {
        return _iceI_notifyCallbackAsync(context, false);
    }

    /**
     * @hidden
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_notifyCallbackAsync(java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "notifyCallback", null, sync, null);
        f.invoke(false, context, null, null, null);
        return f;
    }

    default void printResultFibo(String response)
    {
        printResultFibo(response, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void printResultFibo(String response, java.util.Map<String, String> context)
    {
        _iceI_printResultFiboAsync(response, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> printResultFiboAsync(String response)
    {
        return _iceI_printResultFiboAsync(response, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> printResultFiboAsync(String response, java.util.Map<String, String> context)
    {
        return _iceI_printResultFiboAsync(response, context, false);
    }

    /**
     * @hidden
     * @param iceP_response -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_printResultFiboAsync(String iceP_response, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "printResultFibo", null, sync, null);
        f.invoke(false, context, null, ostr -> {
                     ostr.writeString(iceP_response);
                 }, null);
        return f;
    }

    default void printHostnamesList(String hosts)
    {
        printHostnamesList(hosts, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void printHostnamesList(String hosts, java.util.Map<String, String> context)
    {
        _iceI_printHostnamesListAsync(hosts, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> printHostnamesListAsync(String hosts)
    {
        return _iceI_printHostnamesListAsync(hosts, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> printHostnamesListAsync(String hosts, java.util.Map<String, String> context)
    {
        return _iceI_printHostnamesListAsync(hosts, context, false);
    }

    /**
     * @hidden
     * @param iceP_hosts -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_printHostnamesListAsync(String iceP_hosts, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "printHostnamesList", null, sync, null);
        f.invoke(false, context, null, ostr -> {
                     ostr.writeString(iceP_hosts);
                 }, null);
        return f;
    }

    default void printMessage(String message)
    {
        printMessage(message, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void printMessage(String message, java.util.Map<String, String> context)
    {
        _iceI_printMessageAsync(message, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> printMessageAsync(String message)
    {
        return _iceI_printMessageAsync(message, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> printMessageAsync(String message, java.util.Map<String, String> context)
    {
        return _iceI_printMessageAsync(message, context, false);
    }

    /**
     * @hidden
     * @param iceP_message -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_printMessageAsync(String iceP_message, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "printMessage", null, sync, null);
        f.invoke(false, context, null, ostr -> {
                     ostr.writeString(iceP_message);
                 }, null);
        return f;
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static CallbackPrx checkedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, ice_staticId(), CallbackPrx.class, _CallbackPrxI.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param context The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static CallbackPrx checkedCast(com.zeroc.Ice.ObjectPrx obj, java.util.Map<String, String> context)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, context, ice_staticId(), CallbackPrx.class, _CallbackPrxI.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static CallbackPrx checkedCast(com.zeroc.Ice.ObjectPrx obj, String facet)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, facet, ice_staticId(), CallbackPrx.class, _CallbackPrxI.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @param context The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static CallbackPrx checkedCast(com.zeroc.Ice.ObjectPrx obj, String facet, java.util.Map<String, String> context)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, facet, context, ice_staticId(), CallbackPrx.class, _CallbackPrxI.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param obj The untyped proxy.
     * @return A proxy for this type.
     **/
    static CallbackPrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(obj, CallbackPrx.class, _CallbackPrxI.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    static CallbackPrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj, String facet)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(obj, facet, CallbackPrx.class, _CallbackPrxI.class);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the per-proxy context.
     * @param newContext The context for the new proxy.
     * @return A proxy with the specified per-proxy context.
     **/
    @Override
    default CallbackPrx ice_context(java.util.Map<String, String> newContext)
    {
        return (CallbackPrx)_ice_context(newContext);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the adapter ID.
     * @param newAdapterId The adapter ID for the new proxy.
     * @return A proxy with the specified adapter ID.
     **/
    @Override
    default CallbackPrx ice_adapterId(String newAdapterId)
    {
        return (CallbackPrx)_ice_adapterId(newAdapterId);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the endpoints.
     * @param newEndpoints The endpoints for the new proxy.
     * @return A proxy with the specified endpoints.
     **/
    @Override
    default CallbackPrx ice_endpoints(com.zeroc.Ice.Endpoint[] newEndpoints)
    {
        return (CallbackPrx)_ice_endpoints(newEndpoints);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the locator cache timeout.
     * @param newTimeout The new locator cache timeout (in seconds).
     * @return A proxy with the specified locator cache timeout.
     **/
    @Override
    default CallbackPrx ice_locatorCacheTimeout(int newTimeout)
    {
        return (CallbackPrx)_ice_locatorCacheTimeout(newTimeout);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the invocation timeout.
     * @param newTimeout The new invocation timeout (in seconds).
     * @return A proxy with the specified invocation timeout.
     **/
    @Override
    default CallbackPrx ice_invocationTimeout(int newTimeout)
    {
        return (CallbackPrx)_ice_invocationTimeout(newTimeout);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for connection caching.
     * @param newCache <code>true</code> if the new proxy should cache connections; <code>false</code> otherwise.
     * @return A proxy with the specified caching policy.
     **/
    @Override
    default CallbackPrx ice_connectionCached(boolean newCache)
    {
        return (CallbackPrx)_ice_connectionCached(newCache);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the endpoint selection policy.
     * @param newType The new endpoint selection policy.
     * @return A proxy with the specified endpoint selection policy.
     **/
    @Override
    default CallbackPrx ice_endpointSelection(com.zeroc.Ice.EndpointSelectionType newType)
    {
        return (CallbackPrx)_ice_endpointSelection(newType);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for how it selects endpoints.
     * @param b If <code>b</code> is <code>true</code>, only endpoints that use a secure transport are
     * used by the new proxy. If <code>b</code> is false, the returned proxy uses both secure and
     * insecure endpoints.
     * @return A proxy with the specified selection policy.
     **/
    @Override
    default CallbackPrx ice_secure(boolean b)
    {
        return (CallbackPrx)_ice_secure(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the encoding used to marshal parameters.
     * @param e The encoding version to use to marshal request parameters.
     * @return A proxy with the specified encoding version.
     **/
    @Override
    default CallbackPrx ice_encodingVersion(com.zeroc.Ice.EncodingVersion e)
    {
        return (CallbackPrx)_ice_encodingVersion(e);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its endpoint selection policy.
     * @param b If <code>b</code> is <code>true</code>, the new proxy will use secure endpoints for invocations
     * and only use insecure endpoints if an invocation cannot be made via secure endpoints. If <code>b</code> is
     * <code>false</code>, the proxy prefers insecure endpoints to secure ones.
     * @return A proxy with the specified selection policy.
     **/
    @Override
    default CallbackPrx ice_preferSecure(boolean b)
    {
        return (CallbackPrx)_ice_preferSecure(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the router.
     * @param router The router for the new proxy.
     * @return A proxy with the specified router.
     **/
    @Override
    default CallbackPrx ice_router(com.zeroc.Ice.RouterPrx router)
    {
        return (CallbackPrx)_ice_router(router);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the locator.
     * @param locator The locator for the new proxy.
     * @return A proxy with the specified locator.
     **/
    @Override
    default CallbackPrx ice_locator(com.zeroc.Ice.LocatorPrx locator)
    {
        return (CallbackPrx)_ice_locator(locator);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for collocation optimization.
     * @param b <code>true</code> if the new proxy enables collocation optimization; <code>false</code> otherwise.
     * @return A proxy with the specified collocation optimization.
     **/
    @Override
    default CallbackPrx ice_collocationOptimized(boolean b)
    {
        return (CallbackPrx)_ice_collocationOptimized(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses twoway invocations.
     * @return A proxy that uses twoway invocations.
     **/
    @Override
    default CallbackPrx ice_twoway()
    {
        return (CallbackPrx)_ice_twoway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses oneway invocations.
     * @return A proxy that uses oneway invocations.
     **/
    @Override
    default CallbackPrx ice_oneway()
    {
        return (CallbackPrx)_ice_oneway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses batch oneway invocations.
     * @return A proxy that uses batch oneway invocations.
     **/
    @Override
    default CallbackPrx ice_batchOneway()
    {
        return (CallbackPrx)_ice_batchOneway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses datagram invocations.
     * @return A proxy that uses datagram invocations.
     **/
    @Override
    default CallbackPrx ice_datagram()
    {
        return (CallbackPrx)_ice_datagram();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses batch datagram invocations.
     * @return A proxy that uses batch datagram invocations.
     **/
    @Override
    default CallbackPrx ice_batchDatagram()
    {
        return (CallbackPrx)_ice_batchDatagram();
    }

    /**
     * Returns a proxy that is identical to this proxy, except for compression.
     * @param co <code>true</code> enables compression for the new proxy; <code>false</code> disables compression.
     * @return A proxy with the specified compression setting.
     **/
    @Override
    default CallbackPrx ice_compress(boolean co)
    {
        return (CallbackPrx)_ice_compress(co);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its connection timeout setting.
     * @param t The connection timeout for the proxy in milliseconds.
     * @return A proxy with the specified timeout.
     **/
    @Override
    default CallbackPrx ice_timeout(int t)
    {
        return (CallbackPrx)_ice_timeout(t);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its connection ID.
     * @param connectionId The connection ID for the new proxy. An empty string removes the connection ID.
     * @return A proxy with the specified connection ID.
     **/
    @Override
    default CallbackPrx ice_connectionId(String connectionId)
    {
        return (CallbackPrx)_ice_connectionId(connectionId);
    }

    /**
     * Returns a proxy that is identical to this proxy, except it's a fixed proxy bound
     * the given connection.@param connection The fixed proxy connection.
     * @return A fixed proxy bound to the given connection.
     **/
    @Override
    default CallbackPrx ice_fixed(com.zeroc.Ice.Connection connection)
    {
        return (CallbackPrx)_ice_fixed(connection);
    }

    static String ice_staticId()
    {
        return "::Demo::Callback";
    }
}
