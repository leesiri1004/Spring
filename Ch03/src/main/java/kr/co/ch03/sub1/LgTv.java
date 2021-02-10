package kr.co.ch03.sub1;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

@Component("lgTv3")
public class LgTv implements Tv {

	@Inject
	private Speaker speaker;

	@Override
	public void power() {
		System.out.println("LgTv power...");
		
	}

	@Override
	public void chUp() {
		System.out.println("LgTv chUp...");
		
	}

	@Override
	public void chDown() {
		System.out.println("LgTv chDown...");
		
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
