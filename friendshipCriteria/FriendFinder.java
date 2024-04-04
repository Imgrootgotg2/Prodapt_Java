package friendshipCriteria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendFinder {
	public static void main(String[] args) {
		List<FriendshipareaCriteria<String, String>> friendslist = new ArrayList<>();
		friendslist.add(new FriendshipareaCriteria<>("Praveen","Kancheepuram"));
		friendslist.add(new FriendshipareaCriteria<>("Shiv", "Kodambakkam"));
		friendslist.add(new FriendshipareaCriteria<>("Gokul", "Madhavaram"));
		
		List<FriendshipageCriteria<String, Integer>> friendslist1 = new ArrayList<>();
		friendslist1.add(new FriendshipageCriteria<>("Elita", 21));
		friendslist1.add(new FriendshipageCriteria<>("Raji", 21));
		friendslist1.add(new FriendshipageCriteria<>("Roshika", 22));
		
		Scanner sc = new Scanner(System.in);
		System.out.println( "Target Location");
		String targetLocation = sc.next();
		
		for (FriendshipareaCriteria<String, String> friend : friendslist) {
			if (friend.getAttribute().equalsIgnoreCase(targetLocation)) {
				System.out.println(friend.getName() + " is a nearest friend.");
			}
		}
		System.out.println( "Target Age");
		int targetage = sc.nextInt();
		for (FriendshipageCriteria<String, Integer> friend : friendslist1) {
			if (friend.getage()==targetage) {
				System.out.println(friend.getName() + " is of the same age.");
			}
		}
		sc.close();
	}
}