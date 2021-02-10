package kr.co.ch03.sub1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * ��¥ : 2021/02/09
 * �̸� : �̽���
 * ���� : DI ������̼��� �̿��� ������ Ioc �ǽ�
 * 
 */

public class IocTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx =  new GenericXmlApplicationContext("spring-context.xml");
		
		Tv lgTv      = (Tv) ctx.getBean("lgTv");
		Tv samsungTv = (Tv) ctx.getBean("samsungTv");
		
		lgTv.power();
		lgTv.chUp();
		lgTv.soundUp();
		
		samsungTv.power();
		samsungTv.chDown();
		samsungTv.soundDown();
		
	}
	
}