package task;

public class Plane extends Vehicle{

    private int capacity = 45000; // kg
    private int cost = 90;  // $ per item

    public void run() {
        System.out.println("Plane running");
    }

    public void refueling() {
        System.out.println("Plane refueling");
    }

    public void loading() {
        System.out.println("Plane loading");
    }

    public void cost(int weight){
        int quantity=capacity/weight; int total = quantity*cost;
        System.out.println("The cost of transportation by plane will be: "+total+"$");
        System.out.println("Number of units: "+quantity+".\n");
    }
}