import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Main2able main2able1;
        Scanner sc = new Scanner(System.in);
        System.out.print("\n");

        Main2able function = n -> {
           if (n.equals("1")){
               System.out.println("Type your number: ");
               int number = Integer.parseInt(sc.nextLine());
               if (number >= 30)System.exit(-1);
               int result = 1;
               for (int i = 1; i <= number; i++)
                   result = i * result;
               return String.valueOf(result);
           }
           if (n.equals("2")){
               System.out.println("Type your String: ");
                String string = (sc.nextLine());
               StringBuilder sb=new StringBuilder(string);
               sb.reverse();
               return sb.toString();
           }
           return n;

        };

//        System.out.println(function.func("2"));
        System.out.println(function.func("1"));
        System.out.println(function.func("1"));
        System.out.println(function.func("1"));
        System.out.println(function.func("1"));
        System.out.println(function.func("1"));
        System.out.println(function.func("1"));  System.out.println(function.func("1"));

        System.out.println("Done");

    }
}
