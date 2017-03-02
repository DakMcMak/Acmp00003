import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fiver = scanner.nextInt();
        int generou = fiver;
        fiver = fiver / 10;
        if(fiver > 0) {
            int auxiliary = fiver++;
            System.out.println((fiver * auxiliary) + "25");
        }
        if(fiver == 0){
            generou = generou * generou;
            System.out.println(generou);
        }
    }
}
