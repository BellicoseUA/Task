package task;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Vehicle p = new Plane();
        Vehicle t = new Train();
        Vehicle c = new Car();

        System.out.println("Welcome to our company!\n");
        System.out.println("Status of our vehicles: ");
        p.refueling();
        t.run();
        c.loading();

        System.out.println("\nEnter the weight of one unit in kg: ");
        int weight = in.nextInt();
        p.cost(weight);
        t.cost(weight);
        c.cost(weight);
    }
}
