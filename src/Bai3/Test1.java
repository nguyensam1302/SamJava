package Bai3;

public class Test1 {

        public static int n = 20; // Bien instance (toàn cục) nằm ngoài phương thuc

        public static void main(String[] args) {
           String name = "Huyen Sam"; //biến local
           int number = 10; //biến local
           int a = 20;
           int b = 10;
           String s = (a % b == 0) ? "a chia hết cho b" : "a không chia hết cho b";
            System.out.println(a += b); //a = a + b =30
           System.out.println(name);
           System.out.println(number);
           System.out.println(n);
            System.out.println(s);
            System.out.println("giá trị của a: " + a); //lúc này giá trị a = 30 (không phải 10)
            System.out.println(a < 5 && b > 0);
            System.out.println(a < 5 || b > 0);
    }
}
