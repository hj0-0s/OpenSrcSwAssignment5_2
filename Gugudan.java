import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("출력시킬 단 : ");
        int num = scan.nextInt();
        for (int i = 1; i <= 9; i++)
            System.out.println(num + " * " + i + " = " + (num * i));

    }
}