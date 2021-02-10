package kr.co.ch05.sub1;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * ��¥ : 2021/02/10
 * �̸� : �̽���
 * ���� : ������ JDBC �ǽ��ϱ�
 */

public class JDBCTest {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		
		UserDao dao = (UserDao) ctx.getBean("userDao");
		
		dao.insertUser();
		dao.updateUser();
		dao.deleteUser();
		List<UserVo> users = dao.selectUser();

		for (UserVo user : users) {
			System.out.println("----------------------");
			System.out.println("���̵� : "+user.getUid());
			System.out.println("�� �� : "+user.getName());
			System.out.println("�޴��� : "+user.getHp());
			System.out.println("�� �� : "+user.getAge());
		}
		
		System.out.println("���α׷� ����...");
		
	}

}
