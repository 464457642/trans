package com.shu.function;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class Function {
	// �÷������Ǳ�¶����������ķ���
	public String tranString(String words) {
		String red = "";
		for (char ch : red.toCharArray()) {
			red += "/t" + ch + "/t";

		}
		return red;
	}

	// ʹ��main��������service
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9001/Service/Function", new Function());
		System.out.println("Publish Success~");
	}
}
