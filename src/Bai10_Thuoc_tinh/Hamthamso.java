package Bai10_Thuoc_tinh;

public class Hamthamso {
    //Khai báo hàm có 2 tham số với kiểu dữ liệu tương ứng
    public static int tong2SoNguyen(int number1, int number2){
        return number1 + number2;
    }
public static void showInfo (String name, int age, String address){
    System.out.println("Họ và tên: "+ name);
    System.out.println("Tuổi: "+ age);
    System.out.println("Địa chỉ: " +address);
}
    public static void main(String[] args) {
        System.out.println("tổng 2 số: " + tong2SoNguyen(5, 10));
        showInfo("Sam", 20, "Ha Noi");
        showInfo("Sam2", 30, "Ha Noi");
    }
}
