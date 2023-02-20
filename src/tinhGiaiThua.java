import java.util.Scanner;

public class tinhGiaiThua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so n : ");
        int n = scanner.nextInt();
        System.out.println(giaThua(n));
    }

    public static int giaThua(int x) {
        if (x > 0) {
            return x * giaThua(x - 1);
        }
        else {
            return 1;
        }
    }
}

