package days26;

import java.io.Serializable;

public class UserInfo implements Serializable{

	private static final long serialVersionUID = 7786568682604565605L;
	
	String name;
	// transient 키워드
	//   ㄴ 일시적인
	//   ㄴ 직렬화 대상에서 제외하겠다.
	transient String password;
	int age; 
	
	public UserInfo() {
		this("UnKnown", "1111", 0); 
	} 
	public UserInfo(String name, String password, int age) {
		this.name = name;
		this.password = password;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", password=" + password + ", age=" + age + "]";
	}
	
}
  