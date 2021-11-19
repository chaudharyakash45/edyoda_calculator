import java.io.*;
 
// Class 1
// Helper class behaving as a Singleton Class
class Table1 {
 
    // Lazy Instantiation also referred as On-demand
    // Instantiation
 
    // Private static member variables
    private static Table1 table1;
    private static String customerNameBooked;
 
    // Constructor of this class which is private
    // To display customer name whom table1 is booked for
    private Table1(String customerName)
    {
 
        // Print and display the customer name
        System.out.println("Table1 is now Booked for "
                           + customerName);
 
        // Booking under the same person
        customerNameBooked = customerName;
    }
 
    // Non thread-safe block of code to
    // demonstrate thread safe with updation in its methods
 
    // Method 1
    // To get the status of table
    public static Table1
    getTable1Instance(String customerName)
    {
 
        // If table is nor book/reserve
        if (table1 == null) {
 
            // book under the derired customer name
            table1 = new Table1(customerName);
        }
 
        // If table is already booked
        else
 
            // Calling th method
            tableBooked(customerName);
 
        return table1;
    }
 
    // Method 2 (auxiliary)
    // To display whom table is booked for
    private static void tableBooked(String customerName)
    {
 
        // Print the custom name and
        // name of customer under which table i booked
        System.out.println(
            "Sorry " + customerName
            + " Table 1 is already Booked for "
            + customerNameBooked);
    }
}
 

public class Restaurant {
 
  
    public static void main(String args[])
    {
 
       
 
        
        Thread t1 = new Thread(new Runnable() {
            
            public void run()
            {
 
            
                Table1 customer1
                    = Table1.getTable1Instance("ABC");
            }
        });
 
       
        
        Thread t2 = new Thread(new Runnable() {
           
            public void run()
            {
 
                Table1 customer2
                    = Table1.getTable1Instance("XYZ");
            }
        });
 
      
        Thread t3 = new Thread(new Runnable() {
           
            public void run()
            {
 
                Table1 customer3
                    = Table1.getTable1Instance("PQR");
            }
        });
 
        t1.start();
        t2.start();
 
        try {
 
            Thread.sleep(1000);
        }
 
       
        }
 
        
        t3.start();
    }
}