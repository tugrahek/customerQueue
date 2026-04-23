
package customerqueue;


public class Demo {

    
    public static void main(String[] args) {
        //creating the customers 
        CustomerQueue queue = new CustomerQueue();
        Customer customer1 = new Customer(1, "Ali");
        Customer customer2 = new Customer(2, "Veli");
        Customer customer3 = new Customer(3, "Osman");
        Customer customer4 = new Customer(4, "Ahmet");
        Customer customer5 = new Customer(5, "Mehmet");
        
        
        //adding the customers to the queue
        queue.addCustomer(customer1);
        queue.addCustomer(customer2);
        queue.addCustomer(customer3);
        System.out.println("Initial queue: ");
        queue.printElements();
        
        //emptying the queue
        System.out.println("\nRemoving all customers");
        while(queue.size()>0){
            System.out.println("Removed: " + queue.removeCustomer());
        }
        System.out.println("\nQueue after emptying: ");
        queue.printElements();
        
        //adding new customers and using peek method
        queue.addCustomer(customer4);
        queue.addCustomer(customer5);
        
        System.out.println("\nQueue after adding 2 new customers:");
        queue.printElements();
        
        System.out.println("\nPeek customer: "+queue.peekCustomer());
    
        //printing customers after peek methpod
        System.out.println("\nQueue after peek: ");
        queue.printElements();
    
       
    }
    
}
