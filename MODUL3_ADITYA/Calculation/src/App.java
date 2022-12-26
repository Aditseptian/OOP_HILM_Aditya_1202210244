import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean repeat = true;
    boolean report = false;
    
    do {
      try {
        System.out.println("Choose your option:");
        System.out.println("1. Calculate Square Area");
        System.out.println("2. Calculate Circle Area");
        System.out.println("3. Calculate Trapezoid Area");
        System.out.println("0. Exit");
        int option = scanner.nextInt();
  |      }
        switch (option) {
          case 1:
            System.out.println("Input the length of the square side:");
            int length = scanner.nextInt();
            System.out.println("The area of the square is: " + length * length);
            break;
          case 2:
            System.out.println("Input the radius of the circle:");
            int circle = scanner.nextInt();
            break;
        case 3 :
            System.out.println("Input the length");
            int square =scanner.nextInt();
            break;
        }
