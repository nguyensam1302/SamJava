package Bai7_Xu_ly_mang;

public class Mang_1_chieu {
    public static void main(String[] args) {
        //khai báo và khởi tạo mảng
        int a[] = new int[3]; //3 là số lượng phần tử trong mảng
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        //Truy xuất giá trị thủ công thông qua vị tri
        System.out.println(a[1]);
        System.out.println(a.length); //Độ dài mảng

        //Truy xuất giả trị đồng loạt
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        System.out.println("=======");
        int b[] = new int[5];
        //Copy giá trị mảng a vào mảng b
        for (int i = 0; i < a.length; i++){
            b[i] = a[i];
        }
        for (int i = 0; i < a.length; i++){
            System.out.println(b[i]);
        }
        System.out.println("=======");
        String sinhvienArray[] = new String[3];
        sinhvienArray[0] = "Anh1";
        sinhvienArray[1] = "Anh2";
        sinhvienArray[2] = "Anh3";
        for (int i = 0; i < sinhvienArray.length; i++){
            System.out.println(sinhvienArray[i]);
        }
    }
}
