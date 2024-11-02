package StrategyPattern;

public class deligate {
	public void funcAA() {

		StrategyPatternInterface strategy = new StrategyPattenImpl();
		strategy.funcA();
		strategy.funcA();
	}
}
