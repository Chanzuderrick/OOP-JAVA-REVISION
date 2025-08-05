public class App {
    public static void main(String[] args) throws Exception {
        //static makes a variable or method belong to a class
        //commonly used for utility methods or thread resources

        //object
        Friend friend1 = new Friend("James");
        Friend friend2 = new Friend("Spongebob");
        Friend friend3 = new Friend("Derrick");
        Friend friend4 = new Friend("Patrick");
        Friend friend5 = new Friend("Gary");

        System.out.println(Friend.numOfFriends);
        //we just use the Friend class. There's no need of using the friend1 and friend2 and the variable numOfFriends is static
        Friend.showFriends();

        //Math class has static attributes and methods eg math.round();
        
    }
}
