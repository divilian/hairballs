
import java.util.ArrayList;

public class Cat {
    private String color;
    private ArrayList<Hairball> theHairballs;

    Cat() {
        this.theHairballs = new ArrayList<Hairball>();
    }
    public static void main(String args[]) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.println("Welcome to our Cat simulator!");
        System.out.println("Meoww!!!");
    }
}
