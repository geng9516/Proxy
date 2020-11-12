package com.chen.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

public class MyHandler implements InvocationHandler {

	//目標対象
	private Object target;

	public MyHandler(Object target) {
		super();
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//追加の機能
		System.out.println(new Date());
		//目標対象のメソッド
		Object res = method.invoke(target, args);
		//追加の機能
		System.out.println("what are you doning!");
		return res;
	}

}
