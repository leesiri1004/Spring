package kr.co.ch02.sub2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * ��¥ : 2021/02/08
 * �̸� : �̽���
 * ���� : DI �����ڸ� �̿��� Ioc����
 */

public class IocTest2 {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		
		Tv lgTv2 = (Tv) ctx.getBean("lgTv2");
		Tv smTv2 = (Tv) ctx.getBean("smTv2");
		
		lgTv2.power();
		lgTv2.chUp();
		lgTv2.chDown();
		lgTv2.soundUp();
		lgTv2.soundDown();
		
		smTv2.power();
		smTv2.chUp();
		smTv2.chDown();
		smTv2.soundUp();
		smTv2.soundDown();
		
		
		
		
		
	}
	
}
