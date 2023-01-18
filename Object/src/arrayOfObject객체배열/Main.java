package arrayOfObject객체배열;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Food food1 =new Food("pizza");
		Food food2 =new Food("hambuger");
		Food food3 =new Food("hotdog");
		
		Food[] refrigeratorFoods = {food1,food2,food3};
		
		System.out.println(refrigeratorFoods[0].name);
		
//		refrigeratorFoods[0] =food1;
//		refrigeratorFoods[1] =food2;
//		refrigeratorFoods[2] =food3;
	}

}
