import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          int number = scanner.nextInt();
//        int a = number % 10;
//        number = number / 10;
//        int b = number % 10;
//        number = number / 10;
//        int c = number % 10;
//        System.out.println(a + b + c);

        int result = 0;
        for (int i = 0; i < 3; i++) {
            result = result + number % 10;
            number /= 10;
        }
        System.out.println(result);
    }
}