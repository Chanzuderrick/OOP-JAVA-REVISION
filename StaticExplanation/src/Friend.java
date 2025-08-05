public class Friend{
        String name;
        static int numOfFriends;
        //all objects can access it but it belongs to the class
          //we make this static so it belongs to the whole class instead of a particular object

        //constructor
        
        Friend(String name) {
            this.name = name;
            numOfFriends++;

        }

        static void showFriends() {
        System.out.println("You have " +numOfFriends +" friends"); //we dont use this.numOfFriends because the attribute is static
    }
}