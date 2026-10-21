package Bai5_IfElse;

public class If_Else {
    public static void main(String[] args) {

        String address = "Can Tho";
        String phone = "123456";
        int a = 5;
        int b = 10;

        if (address.equals("Can Tho")) {
            System.out.println("Địa chỉ Cần thơ");

        } else {
            System.out.println("Địa chỉ khác");

        }

        if ((a+b) >10){
            System.out.println("OK");

        }else {
            System.out.println("NG");
        }
    }
}