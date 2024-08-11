 import java.util.*;

public class MultiThread extends Thread {

    private int tableNumber;

    private int max;



    public MultiThread(int tableNumber, int max) {

        this.tableNumber = tableNumber;

        this.max = max;

    }



   // @Override

    public void run() {

        for (int i = 1; i <= max; i++) {

            System.out.println(tableNumber + " x " + i + " = " + (tableNumber * i));

            try {

                Thread.sleep(1000); // Add a slight delay to better visualize the output

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        }

    }



    public static void main(String[] args) {

        int limit = 10;



Scanner in =new Scanner(System.in);

System.out.println("Enter three numbers for multiplication tables: ");

int x=in.nextInt();

int y=in.nextInt();

int z=in.nextInt();

        // Create three threads with different priorities

        MultiThread t1 = new MultiThread(x, limit);

        MultiThread t2 = new MultiThread(y, limit);

        MultiThread t3 = new MultiThread(z, limit);



        // Set different priorities to the threads (MIN_PRIORITY = 1, MAX_PRIORITY = 10)

        t1.setPriority(Thread.MIN_PRIORITY);

        t2.setPriority(Thread.NORM_PRIORITY);

        t3.setPriority(Thread.MAX_PRIORITY);



        // Start the threads

        t1.start();

        t2.start();

        t3.start(); 

    }

}