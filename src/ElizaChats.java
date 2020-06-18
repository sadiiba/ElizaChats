import java.util.Scanner;

public class ElizaChats {
    public static void main(String[] args) {
String greetings = "Welcome to ElizaChats!";
System.out.println(greetings);
        Scanner input = new Scanner(System.in);
        System.out.println("What's your name: ");
        String you  = input.nextLine();
        System.out.println("How has your day been " + you +"?" );
        String how = input.nextLine();
        System.out.println("Okay, Anything in particular that makes you feel " +how+"?" );
        String feel = input.nextLine();
        System.out.println("Okay, Well it has been my pleasure to speak with you. Have a nice day " + you +"!");
        String bye = input.nextLine();
        System.out.println("Here are Sadiiba's responses:\n " + you + "\n "+ how +" \n "+ feel+ "\n "+ bye);







    }
}
