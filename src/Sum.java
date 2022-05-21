import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1 : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter num2 : ");
        int num2 = scanner.nextInt();
        int sum = num1+num2;
        System.out.println("sum = "+sum);

        int a = 10;
        float b = 35.67f;
        System.out.println(a+b);

        // type casting
        int num = (int)(56.789f);
        System.out.println(num); // 56

        int num4 = 257;
        byte bt = (byte)(num4);
        System.out.println(bt); // 257%256 =1 , max value of byte is 256
        */
        byte bt_a = 40;
        byte bt_b = 50;
        byte bt_c = 100;
        int bt_d = (bt_a*bt_b)/bt_c; // intermediate result of 40*50 is 2000 datatype int
        System.out.println(bt_d);

        int number = 'A';
        System.out.println(number);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d - s);
        System.out.println((f * b) +" "+  (i / c) +" "+ (d - s));
        System.out.println(result);


    }
}
