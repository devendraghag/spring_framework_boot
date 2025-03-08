package spring_01_demo.springdemo;
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}
	
	public String getHappyFortuneService() {
		return "Today is your lucky day!, its from HappyFortuneService class";
	}

}