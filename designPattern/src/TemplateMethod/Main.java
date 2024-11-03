package TemplateMethod;

public class Main {

	public static void main(String[] args) {
		//템플릿메서드 패턴
		/*
		 * 알고리즘의 구조를 메서드에 정의하고
		 * 하위 클래스에서 알고리즘 구조의
		 * 변경없이 알고리즘을 재정의 하는 패턴
		 * 
		 * */
		/*템플릿 메서드는 이럴때 구현한다!
		 * 1. 구현하려는 알고리즘이 일정한 프로세스가 있다.
		 * 2. 구현하려는 알고리즘이 변경가능성이 있다.
		 */
		/* 알고리즘 작성 절차
		 * 1. 알고리즘을 여러단계로 나눈다.
		 * 2. 나눠진 알고리즘의 단계를 메소드로 선언한다.
		 * 3. 알고리즘을 수행할 템플릿 메소드를 만든다.
		 * 4. 하위 클래스에서 나눠진 메소드들을 구현한다.
		 */
		
		AbstGameConnectHelper helper = new DefaultGameConnectHelper();
		
		helper.requestConnection("아이디 암호 등 접속 정보");
		
	}

}
