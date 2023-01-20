package method함수Overriding덮어쓰기;

public class Dog extends Animal { //Animal 부모 태그 

	@Override
	void speak() { // 보모태그의 함수를 덮어쓰기 
		System.out.println("The dog goes bark");
	}
}
