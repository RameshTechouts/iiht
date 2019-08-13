package com.iiht.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.iiht.inter.HttpHeader;

@RequestMapping(value="/list")
public class RestController
{
	@Autowired
	RestTemplate restTemplate;
	
	public static String test()
	{
		String accessToken = "zqrxjkjhm99u57savrwi7jfivllrnouk";

		MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
		headers.add(HttpHeader.AUTHORIZATION, HttpHeader.BEARER + accessToken);
		headers.add(HttpHeader.CONTENT_TYPE, HttpHeader.APPLICATION_JSON);

		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

		HttpEntity<String> entity = new HttpEntity<String>(new String(), headers);
		System.out.println("hi**************");
		 ResponseEntity<String> response = restTemplate.exchange("http://203.192.246.136:8000/magentoLogin",HttpMethod.POST, entity, String.class);
	 
	        String result = response.getBody();
	 
	        System.out.println(result);
	        
		return result;
		
	}
	public static void main(String[] args) {
		RestController.test();
	}
}
