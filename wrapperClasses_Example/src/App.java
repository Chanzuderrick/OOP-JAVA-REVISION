public class App {
    public static void main(String[] args) throws Exception {
       /*
       Wrapper Classes
       allow primitive values (int,char,double,boolean)
       to be used as objects. Wrap them in an object
       Generally don't wrap primitives unless you need an object
       Allows use of Collections, Framework and static utility methods
       */

       //int a = 123; //rather than doing this we can do this:

       /*
        * This is a depreceated method

          Integer a = new Integer(123);
       Double b = new Double(34.89);
       Character c = neW Character('b');
       Boolean d = new Boolean(true);
       */

       //Autoboxing
       //these are all reference data types
       //Integer a = 123;
       //Double b = 3.14;
       //Character c = 'b';
       //Boolean d = true;

       //String e = "pizza";

       //unboxing - converting back to primitive
       //int x = a;
      // double y =b

      /*
       *
       *  String a = Integer.toString(123);
          String b= Double.toString(3.14);
      String c= Character.toString('c');
      String d = Boolean.toString(false);

      String x = a + b + c + d;
      System.out.println(x);
     
      */

      //converting back to primitive type

      /*
       *   int a = Integer.parseInt("123");
      double b = Double.parseDouble("3.14");
      char c = "PIZZA".charAt(0);
      boolean d = Boolean.parseBoolean("true");
      
      String x = a + b + c + d;
      
      //cant run because its primitive data type
      */

      char letter = 'b';
      System.out.println(Character.isLetter(letter)); //we've used wrapper classes to show whether the character is a letter
      System.out.println(Character.isUpperCase(letter)); //CHECKING WHETHER CHARACTER IS UPPERCASE

    
    }
}
