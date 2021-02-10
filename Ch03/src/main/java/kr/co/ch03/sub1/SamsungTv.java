package kr.co.ch03.sub1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("smTv3")
public class SamsungTv implements Tv {

	@Autowired //inject 와 autowired는 똑같다
	private Speaker speaker;

	@Override
	public void power() {
		System.out.println("SamsugTv power...");
		
	}

	@Override
	public void chUp() {
		System.out.println("SamsungTv chUp...");
		
	}

	@Override
	public void chDown() {
		System.out.println("SamsungTv chDown...");
		
	}

	@Override
	public void soundUp() {
		speaker.soundUp();// TODO Auto-generated method stub
		
	}

	@Override
	public void soundDown() {
		speaker.soundDown();// TODO Auto-generated method stub
		
	}

}
