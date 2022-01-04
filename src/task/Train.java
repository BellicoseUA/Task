package task;

public class Train extends Vehicle{

    private int capacity = 30000; // kg
    private int cost = 40;  // $ per item

    public void run() {
        System.out.println("Train running");
    }

    public void refueling() {
        System.out.println("Train refueling");
    }

    public void loading() {
        System.out.println("Train loading");
    }

    public void cost(int weight){
        int quantity=capacity/weight; int total = quantity*cost;
        System.out.println("The cost of transportation by train will be: "+total+"$");
        System.out.println("Number of units: "+quantity+".\n");
    }
}
