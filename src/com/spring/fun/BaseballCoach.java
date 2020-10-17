package com.spring.fun;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	public String getDailyWorkout() {
		return "Spend 30 minutes in batting cage!!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	
}
