package codes;

public class Dog extends Animal {
	
//	Animal클래스를 상속받고
//	집을 지키는 기능을 추가
	void keepHome() {
		System.out.println("개가 집을 지킵니다.");
	}
	
	@Override
		void bark() {
		
//			super.bark();
			
			System.out.println("왈왈!");
		}

}
