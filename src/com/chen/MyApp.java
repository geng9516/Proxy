package com.chen;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.chen.handler.MyHandler;
import com.chen.impl.SayHelloImpl;
import com.chen.service.SayHello;

public class MyApp {
	public static void main(String[] args) {
		SayHello sh = new SayHelloImpl();
		InvocationHandler h = new MyHandler(sh);
		//
		SayHello proxy = (SayHello) Proxy.newProxyInstance(sh.getClass().getClassLoader(), sh.getClass().getInterfaces(), h);
		//プロキシ　com.sun.proxy.$Proxy0
		System.out.println(proxy.getClass().getName());
		proxy.sayHello("lisi");

	}

}
