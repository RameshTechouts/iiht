package com.iiht.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iiht.model.Model;

@RequestMapping(value="/urldata")
public class Controller
{

	
 @SuppressWarnings({ "unchecked", "resource" })
 public static void main(String[] args) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
	List<Model> list= context.getBean("urlList",ArrayList.class);
	System.out.println(list);
	
	for(Model model: list)
	{
		System.out.println("AliasName: "+model.getAlias()+" Url: "+model.getUrl());
	}

}}