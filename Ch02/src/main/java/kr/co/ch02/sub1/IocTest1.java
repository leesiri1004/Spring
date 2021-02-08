package kr.co.ch02.sub1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * ��¥ : 2021/02/08
 * �̸� : �̽���
 * ���� : ������ Ioc �ǽ��ϱ�
 */

public class IocTest1 {
	
	public static void main(String[] args) {
		
		// Ioc �������� ���� ��ü����
		Tv ltv = new LgTv(); // LgTv => Tv ������
		ltv.power();
		ltv.chUp();
		ltv.chDown();
		
		Tv stv = new SamsungTv();
		stv.power();
		stv.chUp();
		stv.chDown();
		
		// Ioc ������ ��ü ����
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		
		Tv lgTv = (Tv) ctx.getBean("lgTv");
		Tv smTv = (Tv) ctx.getBean("smTv");
		
		lgTv.power();
		lgTv.chUp();
		lgTv.chDown();
		
		smTv.power();
		smTv.chUp();
		smTv.chDown();
		
		
	}

}
