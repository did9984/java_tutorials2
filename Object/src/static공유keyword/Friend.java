package static공유keyword;

public class Friend {
  
	String name; 
	static int numberOfFriend; //static 이 있으면  new friend 없으 불러오기가능 
	
	Friend(String name){
		this.name =name;
		numberOfFriend++;
	}
	
	static void displayFriends() {
		System.out.println("You have"+numberOfFriend);
	}
}
