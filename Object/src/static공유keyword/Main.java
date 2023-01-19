package static공유keyword;

public class Main {
 public static void main(String[] args) {
	
	 Friend fr = new Friend("spongebob");
	 Friend fr1 = new Friend("spongebob1");
	 Friend fr2 = new Friend("spongebob2");
	 System.out.println(Friend.numberOfFriend);//static 이 있으면  new friend 없으 불러오기가능 
	 Friend.displayFriends();
	 
	
}
 
}
