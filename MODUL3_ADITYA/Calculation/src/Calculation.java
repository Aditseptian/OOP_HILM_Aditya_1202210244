
public class Calculation implements Runnable {
    private double radius;
    private double side;
    private double area;
    private double phi = 3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) throws IllegalArgumentException {
        if(side < 1) {
            throw new IllegalArgumentException("side must be greater than 1");
        }
        this.side = side;
    }

    public double getArea() {
        return area;
    }

    public void setSquare() {
        this.area = side * side;
    }

    public double getSquare() {
        return area;
    }

    public void setCircle() {
        this.area = phi * radius * radius;
    }

    public double getCircle() {
        return area;
    }

    public void setTrapezoid(){
        this.setTrapezoid ;
    }

    @Override
    public void run() {
        System.out.println("Program will start in");
        try {
            for(int i = 3; i > 0; i--) {
                Thread.sleep(1000);
                System.out.println(i);
            }
            System.out.println("Program has been started");
        } catch (InterruptedException e) {
            System.out.println("Error occured");
        }
    }

        
        
    }