package days26;

import java.io.Serializable;

/**
 * @author 김예지
 * @date 2025. 3. 11.
 * @subject
 * @content
 */
public class UserInfo implements Serializable {
	private static final long serialVersionUID = -3903204132601444481L;
	
	// The serializable class UserInfo does not declare a static final serialVersionUID field of type long
	// serialVersionUID: 직렬화(Serialization)와 역직렬화(Deserialization) 과정에서 클래스 버전 관리를 위한 고유한 ID
	//		ㄴ 객체를 파일이나 네트워크를 통해 저장/전송할 때, 같은 클래스인지 검증하는 역할을 함
	/* serialVersionUID가 필요한 이유
		만약 serialVersionUID를 명시하지 않으면, 컴파일러가 자동으로 생성하는데,
		이 값은 클래스의 구조(필드, 메서드 등)에 따라 달라질 수 있음.
		즉, 다음과 같은 경우 문제가 생길 수 있음:
		
		클래스를 변경(필드 추가/삭제)하면 자동 생성된 serialVersionUID 값이 바뀜
		변경된 클래스와 기존에 저장된 직렬화된 객체의 ID가 다르면 역직렬화 시 오류 발생
		
		명시적으로 serialVersionUID를 선언하여 클래스 버전을 고정하면,
		클래스에 변경이 있어도 같은 버전으로 인식할 수 있음.
	 */
	
	String name;
	transient String password;
	// transient : 일시적인 (사전적으로)
	// 		ㄴ 이 키워드가 붙으면 직렬화 대상에서 제외됨
	int age;
	
	public UserInfo() {
		this("Unknown", "1111", 0);
	}
	
	public UserInfo(String name, String password, int age) {
		this.name = name;
		this.password = password;
		this.age = age;
	}
	
} // class
