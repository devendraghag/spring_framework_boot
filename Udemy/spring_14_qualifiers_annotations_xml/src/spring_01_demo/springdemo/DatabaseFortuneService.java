package spring_01_demo.springdemo;
import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "I am from DatabaseFortuneService";
	}

}