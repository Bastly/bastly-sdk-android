package com.bastly.bastlysdk.interfaces;

/**
 * Created by goofyahead on 20/04/15.
 */
public interface MessageListener <T>{
    void onMessageReceived(String channel, T message);
}