package Bai4_Epkieudulieu;

public class EpKieudulieu {
    public static void main(String[] args) {
        float c = 35.8f;
        int b = (int) c + 1;
        System.out.println(c);
        System.out.println((int) c);
        System.out.println(b);
        //Chuyển kiểu số về chuỗi


        String numberString = String.valueOf(b);
        System.out.println(numberString + 2); //dạng String nên nối vào

        //Chuyển kiểu chuỗi về số
        System.out.println(Integer.parseInt(numberString) + 2); //Dạng số nên thực hiện phép cộng
        System.out.println(Float.parseFloat(numberString) + 2);
        System.out.println(Long.parseLong(numberString) + 2);

    }
}
