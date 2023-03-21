import java.util.Scanner;

public class App {
  
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the amount of fibonnaci numbers you would like: ");
        
        int amount = scanner.nextInt();
        int a = 0, b = 1;
        
        for(int i = 1; i <= amount; i++){
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
        scanner.close();
    }
}
