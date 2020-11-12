package com.chen.impl;

import com.chen.service.SayHello;

public class SayHelloImpl implements SayHello{

	@Override
	public void sayHello(String name) {
		System.out.println("hello :" + name);
	}
}
