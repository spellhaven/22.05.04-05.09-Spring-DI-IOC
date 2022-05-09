package com.spellhaven.spring_0502_1;

public class MyCalculator {
	
	private int a;
	private int b;
	Calculator calcu; // 객체를 멤버 변수로 선언(MyCalculator로 만든 객체는 Calculator로 만든 객체에게 의존하네. 하하하.)
	
	public void add() {
		calcu.addition(a, b);
	}
	
	public void sub() {
		calcu.subtraction(a, b);
	}
	
	public void mul() {
		calcu.multiplication(a, b);
	}
	
	public void div() {
		calcu.division(a, b);
	}

	
	// 어. 세터만 만들어 줬어. a랑 b를 넣어야 계산을 하든지 할 거 아니야.
	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void setCalcu(Calculator calcu) {
		this.calcu = calcu;
	}
	
	
	
}
