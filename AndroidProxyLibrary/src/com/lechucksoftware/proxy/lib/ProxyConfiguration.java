package com.lechucksoftware.proxy.lib;

import org.apache.http.HttpHost;

import android.net.wifi.WifiConfiguration;

public class ProxyConfiguration
{
	public static final String TAG = "ProxyConfiguration";

	public WifiConfiguration wifiConfiguration;
	public HttpHost proxy;
	public String exclusionList;
	
	public ProxyConfiguration(HttpHost pHost, String exList, WifiConfiguration conf)
	{
		proxy = pHost;
		exclusionList = exList;
		wifiConfiguration = conf;
	}
	
	@Override
	public String toString()
	{
		return String.format("Proxy: %s\nExclusion List: %s\nAP configuration: %s",proxy.toHostString(), exclusionList, wifiConfiguration.toString() );
	}
}