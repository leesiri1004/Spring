package kr.co.ch02.sub3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 날짜 : 2021/02/08
 * 이름 : 이슬이
 * 내용 : DI 어노테이션을 이용한 Ioc구현
 */

public class IocTest3 {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		
		Tv lgTv3 = (Tv) ctx.getBean("lgTv3");
		Tv smTv3 = (Tv) ctx.getBean("smTv3");
		
		lgTv3.power();
		lgTv3.chUp();
		lgTv3.chDown();
		lgTv3.soundUp();
		lgTv3.soundDown();
		
		smTv3.power();
		smTv3.chUp();
		smTv3.chDown();
		smTv3.soundUp();
		smTv3.soundDown();
		
		
	}
	
}
