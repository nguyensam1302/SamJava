package Bai6_VongLap_For;

public class For_don_gian {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            System.out.println("Java");
        }
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);

        }
        for (int i = 0; i <= 20 || i < 20; i += 2) {
            System.out.println(i);
            if (i == 20){
                System.out.println("Kết thúc");
            }

        }
    }
}
