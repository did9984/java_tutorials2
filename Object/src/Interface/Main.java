package Interface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rabbit rb = new Rabbit();
		rb.flee();
		Hawk hk = new Hawk();
		hk.hunt();
		
		Fish fi = new Fish();
		fi.flee();
		fi.hunt();

	}

}
