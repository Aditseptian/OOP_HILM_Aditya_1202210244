public class Waiter implements Runnable {

    private final int orderQty;
    private final int customerID;
    static int FoodPrice = 25000;

    public Waiter(int customerID, int orderQty) {
        this.customerID = customerID;
        this.orderQty = orderQty;
    }
    @Override
    public void run() {
        while (true) {
            getFood();
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void orderInfo() {
        System.out.println("==========================================================");
        System.out.println("Customer ID: " + this.customerID);
        System.out.println("Numbeer of Food: " + this.orderQty);
        System.out.println("Total Price: " + this.orderQty * FoodPrice);
        System.out.println("==========================================================");
    }
    // create synchronized method getFood

    public void getFood() {
        synchronized(Restaurant.getLock()) {

            System.out.println("Waiter: Food is ready to deliver");
            Restaurant Restaurant = new Restaurant();
            Restaurant.setWaitingForPickup(false);

            if (Restaurant.getFoodNumber() == this.orderQty + 1) {
                orderInfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("Waiter: Tell the Restaurant  to make another Food\n");

        }
    }
}