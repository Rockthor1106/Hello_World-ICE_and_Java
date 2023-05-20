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

public interface ChatManagerPrx extends com.zeroc.Ice.ObjectPrx
{
    default void subscribe(String hostname, CallbackPrx callback)
    {
        subscribe(hostname, callback, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void subscribe(String hostname, CallbackPrx callback, java.util.Map<String, String> context)
    {
        _iceI_subscribeAsync(hostname, callback, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> subscribeAsync(String hostname, CallbackPrx callback)
    {
        return _iceI_subscribeAsync(hostname, callback, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> subscribeAsync(String hostname, CallbackPrx callback, java.util.Map<String, String> context)
    {
        return _iceI_subscribeAsync(hostname, callback, context, false);
    }

    /**
     * @hidden
     * @param iceP_hostname -
     * @param iceP_callback -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_subscribeAsync(String iceP_hostname, CallbackPrx iceP_callback, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "subscribe", null, sync, null);
        f.invoke(false, context, null, ostr -> {
                     ostr.writeString(iceP_hostname);
                     ostr.writeProxy(iceP_callback);
                 }, null);
        return f;
    }

    default String[] getState()
    {
        return getState(com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default String[] getState(java.util.Map<String, String> context)
    {
        return _iceI_getStateAsync(context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<String[]> getStateAsync()
    {
        return _iceI_getStateAsync(com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<String[]> getStateAsync(java.util.Map<String, String> context)
    {
        return _iceI_getStateAsync(context, false);
    }

    /**
     * @hidden
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<String[]> _iceI_getStateAsync(java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<String[]> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "getState", null, sync, null);
        f.invoke(true, context, null, null, istr -> {
                     String[] ret;
                     ret = istr.readStringSeq();
                     return ret;
                 });
        return f;
    }

    default void sendMessage(String msg)
    {
        sendMessage(msg, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void sendMessage(String msg, java.util.Map<String, String> context)
    {
        _iceI_sendMessageAsync(msg, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> sendMessageAsync(String msg)
    {
        return _iceI_sendMessageAsync(msg, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> sendMessageAsync(String msg, java.util.Map<String, String> context)
    {
        return _iceI_sendMessageAsync(msg, context, false);
    }

    /**
     * @hidden
     * @param iceP_msg -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_sendMessageAsync(String iceP_msg, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "sendMessage", null, sync, null);
        f.invoke(false, context, null, ostr -> {
                     ostr.writeString(iceP_msg);
                 }, null);
        return f;
    }

    default long fibonacci(int pos, String host)
    {
        return fibonacci(pos, host, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default long fibonacci(int pos, String host, java.util.Map<String, String> context)
    {
        return _iceI_fibonacciAsync(pos, host, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<java.lang.Long> fibonacciAsync(int pos, String host)
    {
        return _iceI_fibonacciAsync(pos, host, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<java.lang.Long> fibonacciAsync(int pos, String host, java.util.Map<String, String> context)
    {
        return _iceI_fibonacciAsync(pos, host, context, false);
    }

    /**
     * @hidden
     * @param iceP_pos -
     * @param iceP_host -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<java.lang.Long> _iceI_fibonacciAsync(int iceP_pos, String iceP_host, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<java.lang.Long> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "fibonacci", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     ostr.writeInt(iceP_pos);
                     ostr.writeString(iceP_host);
                 }, istr -> {
                     long ret;
                     ret = istr.readLong();
                     return ret;
                 });
        return f;
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static ChatManagerPrx checkedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, ice_staticId(), ChatManagerPrx.class, _ChatManagerPrxI.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param context The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static ChatManagerPrx checkedCast(com.zeroc.Ice.ObjectPrx obj, java.util.Map<String, String> context)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, context, ice_staticId(), ChatManagerPrx.class, _ChatManagerPrxI.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static ChatManagerPrx checkedCast(com.zeroc.Ice.ObjectPrx obj, String facet)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, facet, ice_staticId(), ChatManagerPrx.class, _ChatManagerPrxI.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @param context The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static ChatManagerPrx checkedCast(com.zeroc.Ice.ObjectPrx obj, String facet, java.util.Map<String, String> context)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, facet, context, ice_staticId(), ChatManagerPrx.class, _ChatManagerPrxI.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param obj The untyped proxy.
     * @return A proxy for this type.
     **/
    static ChatManagerPrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(obj, ChatManagerPrx.class, _ChatManagerPrxI.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    static ChatManagerPrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj, String facet)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(obj, facet, ChatManagerPrx.class, _ChatManagerPrxI.class);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the per-proxy context.
     * @param newContext The context for the new proxy.
     * @return A proxy with the specified per-proxy context.
     **/
    @Override
    default ChatManagerPrx ice_context(java.util.Map<String, String> newContext)
    {
        return (ChatManagerPrx)_ice_context(newContext);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the adapter ID.
     * @param newAdapterId The adapter ID for the new proxy.
     * @return A proxy with the specified adapter ID.
     **/
    @Override
    default ChatManagerPrx ice_adapterId(String newAdapterId)
    {
        return (ChatManagerPrx)_ice_adapterId(newAdapterId);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the endpoints.
     * @param newEndpoints The endpoints for the new proxy.
     * @return A proxy with the specified endpoints.
     **/
    @Override
    default ChatManagerPrx ice_endpoints(com.zeroc.Ice.Endpoint[] newEndpoints)
    {
        return (ChatManagerPrx)_ice_endpoints(newEndpoints);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the locator cache timeout.
     * @param newTimeout The new locator cache timeout (in seconds).
     * @return A proxy with the specified locator cache timeout.
     **/
    @Override
    default ChatManagerPrx ice_locatorCacheTimeout(int newTimeout)
    {
        return (ChatManagerPrx)_ice_locatorCacheTimeout(newTimeout);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the invocation timeout.
     * @param newTimeout The new invocation timeout (in seconds).
     * @return A proxy with the specified invocation timeout.
     **/
    @Override
    default ChatManagerPrx ice_invocationTimeout(int newTimeout)
    {
        return (ChatManagerPrx)_ice_invocationTimeout(newTimeout);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for connection caching.
     * @param newCache <code>true</code> if the new proxy should cache connections; <code>false</code> otherwise.
     * @return A proxy with the specified caching policy.
     **/
    @Override
    default ChatManagerPrx ice_connectionCached(boolean newCache)
    {
        return (ChatManagerPrx)_ice_connectionCached(newCache);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the endpoint selection policy.
     * @param newType The new endpoint selection policy.
     * @return A proxy with the specified endpoint selection policy.
     **/
    @Override
    default ChatManagerPrx ice_endpointSelection(com.zeroc.Ice.EndpointSelectionType newType)
    {
        return (ChatManagerPrx)_ice_endpointSelection(newType);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for how it selects endpoints.
     * @param b If <code>b</code> is <code>true</code>, only endpoints that use a secure transport are
     * used by the new proxy. If <code>b</code> is false, the returned proxy uses both secure and
     * insecure endpoints.
     * @return A proxy with the specified selection policy.
     **/
    @Override
    default ChatManagerPrx ice_secure(boolean b)
    {
        return (ChatManagerPrx)_ice_secure(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the encoding used to marshal parameters.
     * @param e The encoding version to use to marshal request parameters.
     * @return A proxy with the specified encoding version.
     **/
    @Override
    default ChatManagerPrx ice_encodingVersion(com.zeroc.Ice.EncodingVersion e)
    {
        return (ChatManagerPrx)_ice_encodingVersion(e);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its endpoint selection policy.
     * @param b If <code>b</code> is <code>true</code>, the new proxy will use secure endpoints for invocations
     * and only use insecure endpoints if an invocation cannot be made via secure endpoints. If <code>b</code> is
     * <code>false</code>, the proxy prefers insecure endpoints to secure ones.
     * @return A proxy with the specified selection policy.
     **/
    @Override
    default ChatManagerPrx ice_preferSecure(boolean b)
    {
        return (ChatManagerPrx)_ice_preferSecure(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the router.
     * @param router The router for the new proxy.
     * @return A proxy with the specified router.
     **/
    @Override
    default ChatManagerPrx ice_router(com.zeroc.Ice.RouterPrx router)
    {
        return (ChatManagerPrx)_ice_router(router);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the locator.
     * @param locator The locator for the new proxy.
     * @return A proxy with the specified locator.
     **/
    @Override
    default ChatManagerPrx ice_locator(com.zeroc.Ice.LocatorPrx locator)
    {
        return (ChatManagerPrx)_ice_locator(locator);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for collocation optimization.
     * @param b <code>true</code> if the new proxy enables collocation optimization; <code>false</code> otherwise.
     * @return A proxy with the specified collocation optimization.
     **/
    @Override
    default ChatManagerPrx ice_collocationOptimized(boolean b)
    {
        return (ChatManagerPrx)_ice_collocationOptimized(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses twoway invocations.
     * @return A proxy that uses twoway invocations.
     **/
    @Override
    default ChatManagerPrx ice_twoway()
    {
        return (ChatManagerPrx)_ice_twoway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses oneway invocations.
     * @return A proxy that uses oneway invocations.
     **/
    @Override
    default ChatManagerPrx ice_oneway()
    {
        return (ChatManagerPrx)_ice_oneway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses batch oneway invocations.
     * @return A proxy that uses batch oneway invocations.
     **/
    @Override
    default ChatManagerPrx ice_batchOneway()
    {
        return (ChatManagerPrx)_ice_batchOneway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses datagram invocations.
     * @return A proxy that uses datagram invocations.
     **/
    @Override
    default ChatManagerPrx ice_datagram()
    {
        return (ChatManagerPrx)_ice_datagram();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses batch datagram invocations.
     * @return A proxy that uses batch datagram invocations.
     **/
    @Override
    default ChatManagerPrx ice_batchDatagram()
    {
        return (ChatManagerPrx)_ice_batchDatagram();
    }

    /**
     * Returns a proxy that is identical to this proxy, except for compression.
     * @param co <code>true</code> enables compression for the new proxy; <code>false</code> disables compression.
     * @return A proxy with the specified compression setting.
     **/
    @Override
    default ChatManagerPrx ice_compress(boolean co)
    {
        return (ChatManagerPrx)_ice_compress(co);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its connection timeout setting.
     * @param t The connection timeout for the proxy in milliseconds.
     * @return A proxy with the specified timeout.
     **/
    @Override
    default ChatManagerPrx ice_timeout(int t)
    {
        return (ChatManagerPrx)_ice_timeout(t);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its connection ID.
     * @param connectionId The connection ID for the new proxy. An empty string removes the connection ID.
     * @return A proxy with the specified connection ID.
     **/
    @Override
    default ChatManagerPrx ice_connectionId(String connectionId)
    {
        return (ChatManagerPrx)_ice_connectionId(connectionId);
    }

    /**
     * Returns a proxy that is identical to this proxy, except it's a fixed proxy bound
     * the given connection.@param connection The fixed proxy connection.
     * @return A fixed proxy bound to the given connection.
     **/
    @Override
    default ChatManagerPrx ice_fixed(com.zeroc.Ice.Connection connection)
    {
        return (ChatManagerPrx)_ice_fixed(connection);
    }

    static String ice_staticId()
    {
        return "::Demo::ChatManager";
    }
}
