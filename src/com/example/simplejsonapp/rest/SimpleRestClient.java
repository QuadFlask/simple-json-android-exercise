package com.example.simplejsonapp.rest;

import org.springframework.http.converter.json.GsonHttpMessageConverter;

import com.example.simplejsonapp.entity.User;
import com.googlecode.androidannotations.annotations.rest.Get;
import com.googlecode.androidannotations.annotations.rest.Rest;

@Rest(rootUrl = "http://192.168.0.3:8080", converters = { GsonHttpMessageConverter.class })
public interface SimpleRestClient {
	
	@Get("/getUser?userId={id}")
	public User getUserById(String id);
	
}