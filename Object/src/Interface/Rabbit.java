package Interface;

public class Rabbit implements Prey {

	@Override // implemnets 는 override 를 하지않으면 사용할수없다
	public void flee() {
		System.out.println("*The rabbit is fleeing*");
		
        }

	
}
