package com.iiht.controller;

import java.net.URI;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.DefaultHttpClient;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Demo {
	
	public Response getResponse(String url) throws Exception {

		URIBuilder builder = new URIBuilder();
		builder.setScheme("https").setHost(url)
		.setParameter("stock_exchange", "NYSE")
		.setParameter("api_token", "zqrxjkjhm99u57savrwi7jfivllrnouk")
		.setParameter("symbol", "AAPL");
		URI uri = builder.build();

		HttpGet httpGet = new HttpGet(uri);
		httpGet.addHeader("Accept", "application/json");
		HttpClient client = new DefaultHttpClient();
		HttpResponse response = client.execute(httpGet);
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.readValue(response.getEntity().getContent(), Response.class);
		}
	
	public static void main(String args[]) throws Exception {
		
		Demo d = new Demo();
		
		
		System.out.println("@@@@@@@@@@@@@"+d.getResponse("http://203.192.246.136:8000/createIdmUser"));
	}

}
