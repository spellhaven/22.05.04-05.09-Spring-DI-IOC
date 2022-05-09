package com.spellhaven.spring_0502_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		/* 22.05.09 추가 - 이게 DI와 IOC 컨테이너를 쓰는 코드다, ㅋ. */	
		
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		// 컨테이너 설정 및 ctx 생성
		
		MyCalculator myCal = ctx.getBean("myCal", MyCalculator.class); //컨테이너에서 빈 객체 주입
		
		myCal.add();	
		
		
		
/*		
		// 아래 주석 처리된 방법은 우리가 원래부터 써 오던, 전통적인 개발 방법이다.
		// 카페에서 원두, 그라인더, 우유 등등을 직접 만드는...
		// 씹인싸 방법인 DI에 대해서는 다음 주 월요일! 5월 9일에 계속해 보도록 하자. 😀
		
		MyCalculator myCal = new MyCalculator();	
		Calculator cal = new Calculator();
		// 아래 라인을 봐라. Calculator로 만든 객체를 (세터로) 넣어 줘야 MyCalculator로 만든 객체가 초기화될 수 있다... "의존하니까".
		// 여튼 그래서 Calculator를 굳이 선언까지 해야 하는 거지. 귀찮아 죽겠네.
		
		myCal.setCalcu(cal); //멤버 객체 calcu 초기화
		
		myCal.setA(10); //멤버 변수 a 초기화
		myCal.setB(20); //멤버 변수 b 초기화
		
		myCal.add();
*/		
	}

}
