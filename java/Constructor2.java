import java.util.Scanner;
public class Constructor2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cars c = new Cars(sc.nextLine(), sc.nextInt());
        System.out.println(c.getModel() + " has a speed of " + c.getSpeed() + "km/h");
        if (c.isFast()) {
            System.out.println("It's a supercar!");
        }
    }
}
