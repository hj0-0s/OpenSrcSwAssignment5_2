import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("출력시킬 단 : ");
        int num = scan.nextInt();
        if (num == 0) {
            for (int i = 1; i <= 9; i++) {
                for (num = 2; num <= 9; num++)
                    System.out.printf("%d * %d = %2d  ", num, i, (num * i));
                System.out.println();
            }
        } else {
            for (int i = 1; i <= 9; i++)
                System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}