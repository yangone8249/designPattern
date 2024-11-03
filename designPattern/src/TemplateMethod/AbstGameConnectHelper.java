package TemplateMethod;

public abstract class AbstGameConnectHelper {
	
	// 외부에서 알고리즘 유출이 안되야하니 private일것같지만
	// 외부에서 사용해야하니 protected로 접근제한자를 둬야한다.
	// 그리고 추상 메서드이니까 abstract를 선언한다.
	protected abstract String doSecurity(String string);
	protected abstract boolean authentication(String id, String password);
	protected abstract int authorizaion(String userName);
	protected abstract String connection(String info);
		
	// ↓ 이게 템플릿 메소드이다.
	public String requestConnection(String encodedInfo) {

		//보안작업 -> 암호화된 문자열을 디코드한다. (복호화)
		String decodedInfo = doSecurity(encodedInfo);
		
		//반환된 것을 가지고 아이디, 암호를 할당한다.
		String id = "aaa";
		String password = "bbb";
		
		if(!authentication(id, password)) {
			throw new Error("아이디 암호 불일치");
		}
		
		String userName = "userName";
		int i = authorizaion(userName);
		
		switch(i) {
		case -1://게임 매니저
			break;
		case 0://게임 매니저
			break;
		case 1://유료 회원
			break;
		case 2://무료 회원
			break;
		case 3://권한없음
			break;
		default://기타 상황
			break;
		}
		
		return connection(decodedInfo);
	}
}
