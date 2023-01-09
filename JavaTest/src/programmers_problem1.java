
public class programmers_problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] array = {1,5,7,9,11,13,15};
      int height = 11;
      int answer = 0;
      for(int i=0;i<array.length;i++) 
      {if(array[i]>height) {
    	  answer++;
      }}
      System.out.println(answer);
     
	}

}
