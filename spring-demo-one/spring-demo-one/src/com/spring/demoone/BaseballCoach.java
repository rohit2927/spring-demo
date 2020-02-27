package com.spring.demoone;

public class BaseballCoach implements Coach {
	private HappyFortuneService fortuneService;
	 public BaseballCoach(HappyFortuneService thefortune) {
		// TODO Auto-generated constructor stub
		 fortuneService = thefortune;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do pinch htting";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
