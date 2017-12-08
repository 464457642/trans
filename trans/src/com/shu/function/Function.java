package com.shu.function;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class Function {
	// 该方法就是暴露给其他程序的方法
	public String tranString(String words) {
		String red = "";
		for (char ch : red.toCharArray()) {
			red += "/t" + ch + "/t";

		}
		return red;
	}

	// 使用main方法发布service
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9001/Service/Function", new Function());
		System.out.println("Publish Success~");
	}
}
