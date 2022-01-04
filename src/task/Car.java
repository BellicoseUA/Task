package task;

public class Car extends Vehicle{

    private int capacity = 10000; // kg
    private int cost = 20;  // $ per item

    public void run() {
        System.out.println("Car running");
    }

    public void refueling() {
        System.out.println("Car refueling");
    }

    public void loading() {
        System.out.println("Car loading");
    }

    public void cost(int weight){
        int quantity=capacity/weight; int total = quantity*cost;
        System.out.println("The cost of transportation by car will be: "+total+"$");
        System.out.println("Number of units: "+quantity+".\n");
    }
}
