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
	
	@Override
		public String toString() {

		
		String message = this.name + " / " + this.birthYear + "년생";
		return message;
		
		}
	
	@Override
		public boolean equals(Object obj) {
			
		Dog otherDog = (Dog) obj;  // 안배운 개념
		
		if(this.name == otherDog.name) {
			return true;
		}
		else {
			return false;
		}
		
		}

}
