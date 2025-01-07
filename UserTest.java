/** Tests the User class. */
public class UserTest {
    public static void main(String[] args) {
        System.out.println("...Testing the User class...\n");

        System.out.println("...To get started, creating a dummy user for testing the toString and follows methods...\n");
        User dummy = new User("Dummy", true);
        System.out.println(dummy);
        System.out.println("Dummy follows Bar: " + dummy.follows("Bar"));
        System.out.println("Dummy follows Gil: " + dummy.follows("Gil")); 

        System.out.println("\n...Now starts the serious testing..\n");

        System.out.println("...Creating a user named Alex...");
        User alex = new User("Alex");
        System.out.println(alex);

        System.out.println("\n...Adding Ben, Neta, and Dana to the follows list of Alex...");
        alex.addFollowee("Ben");
        alex.addFollowee("Neta");
        alex.addFollowee("Dana");
        System.out.println(alex);

        System.out.println("\n...Trying to add Ben again...");
        alex.addFollowee("Ben");    

        System.out.println("\n...Trying to add Or, Zohar, Dror, Josh, Idan, Uri, Maya, and Dan to Alex...");
        alex.addFollowee("Or");
        alex.addFollowee("Zohar");
        alex.addFollowee("Dror");
        alex.addFollowee("Josh");
        alex.addFollowee("Idan");
        alex.addFollowee("Uri");
        alex.addFollowee("Maya");
        alex.addFollowee("Dan"); // Exceeds the array limit           
        System.out.println(alex);

        System.out.println("\n...Removing Neta...");
        alex.removeFollowee("Neta");

        System.out.println("\n...Trying to remove Liam...");
        alex.removeFollowee("Liam");

        System.out.println(alex);

        System.out.println("\n...Creating a user named Orly...");
        User orly = new User("Orly");
        System.out.println(orly);
        
        System.out.println("\n...Adding Boaz, Maya, Talia, Alex, and Dror to the follows list of Orly...");
        orly.addFollowee("Boaz");
        orly.addFollowee("Maya");
        orly.addFollowee("Talia");
        orly.addFollowee("Dror");
        System.out.println(orly);

        // Tests the countMutual method
        System.out.println("\n...Counting how many users are followed by both Alex and Orly...");
        System.out.println("The number of users that both Alex and Orly follow: " + alex.countMutual(orly));
        System.out.println("The number of users that both Orly and Alex follow: " + orly.countMutual(alex));

        // Tests the isFriend method
        System.out.println("\n...Checking if Alex and Orly are friends...");
        System.out.println("Alex is a friend of Orly: " + alex.isFriendOf(orly));
        System.out.println("Orly is a friend of Alex: " + orly.isFriendOf(alex));
        
        // Making Alex and Orly friends
        System.out.println("\n...Adding Orly to the follows list of Alex, and Alex to the follows list of Orly...");
        alex.addFollowee("Orly");
        orly.addFollowee("Alex");

        // Tests the isFriend method
        System.out.println("\n...Checking if Alex and Orly are friends...");
        System.out.println("Alex is a friend of Orly: " + alex.isFriendOf(orly));
        System.out.println("Orly is a friend of Alex: " + orly.isFriendOf(alex));
        
        System.out.println("\nAll User class tests completed.");
    }
}
