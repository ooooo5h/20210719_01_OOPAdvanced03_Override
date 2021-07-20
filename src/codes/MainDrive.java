package codes;

public class MainDrive {
	
	public static void main(String[] args) {
		
//		Dog를 객체화
		Dog d1 = new Dog();
		
		d1.name = "바둑이";
		d1.birthYear = 2015;
		
		System.out.println(d1);
//		클래스를 찍었더니 codes.Dog@4361bd48(패키지.클래스이름@메모리주소)이라고 나왔다
//		참조형 변수(Dog)를 syso로 출력하면 자동으로 실행되는 toString() 기능!
//		참조형 변수는 찾아가야할 번지수를 담아두는데, 그 번지수의 주소가 사람이 알아볼 수 있는 문장으로 변환되는 기능!

//		똑같은 강아지 한마리를 추가 생성했다
//		전제 : 이름/생년이 같다면 같은 강아지로 취급하고싶어
		Dog d2 = new Dog();
		d2.name = "바둑이";
		d2.birthYear = 2015;
		
		
		if(d1 == d2) {
			System.out.println("같은 강아지입니다.");
		}
		else {
			System.out.println("다른 강아지입니다.");
		}
//		결과가 다른 강아지라고 나온다 그 이유는?
//		참조형변수 안에는 어디로 가야하는 지 목적지가 적혀있음
//		변수 안에 적혀있는 목적지주소가 같은가? 아니, 적혀있는 값이 다름!! 그래서 false
		
	}

}
