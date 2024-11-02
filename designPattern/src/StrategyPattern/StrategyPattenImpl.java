package StrategyPattern;

public class StrategyPattenImpl implements StrategyPatternInterface {

	@Override
	public void funcA() {

		//인터페이스는 기능에대한 선언과 구현을 분리한다.
		//기능 사용에 대한 통로를 제공
		System.out.println("AAA");
	}

}
