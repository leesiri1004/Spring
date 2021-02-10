package kr.co.ch04.sub1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * ��¥ : 2021/02/09
 * �̸� : �̽���
 * ���� : ������ AOP �ǽ��ϱ�
 * 
 * ������ AOP(Aspect Oriented Programming)
 *  - �ٽɰ��ɰ� ��ü�� ����Ǵ� �������(Ⱦ�ܰ���)�� �и��ؼ� ���α׷��� �ϴ� ���
 * 
 * ��������Ʈ(JoinPoint)
 *  - �����ϴ� ��� �ٽɰ��� �޼���(����Ʈ��)
 *  
 * ����Ʈ��(PointCut)
 *  - ����Ʈ����Ʈ ��� ����Ǵ� �ٽɰ��� �޼��� 
 *  
 * �����̽�(Advice)
 *  - Ⱦ�ܰ��ɿ� �ش��ϴ� ������ �ΰ���� �޼���
 *  
 * ������Ʈ(Aspect)
 *  - ����Ʈ�ư� �����̽��� ���յ� �������
 *  
 * ����(Weavinig)
 *  - ����Ʈ��(�ٽɰ���)�� ����ɶ� �����̽��� ����Ʈ�ƿ� ���յǴ� ����
 * 
 */

public class AOPMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		BoardService bs = (BoardService) ctx.getBean("boardService");
		
		bs.insert();
		bs.select();
		bs.update();
		bs.delete();
		
	}
	
}
