package Bai10_Thuoc_tinh;

import java.util.ArrayList;

public class Phuongthuc {
    int number = 20;

    public void inSochan() {
        if(number % 2==0){
            System.out.println("Là số chẵn");
             }else {
            System.out.println("Là số lẻ");
        };
    }

    public ArrayList<Integer> timSoChan (int number){
        ArrayList<Integer> arrayList = new ArrayList();
        for (int i =0; i<=number; i++){
            if (i % 2 ==0){
                arrayList.add(i);
            }
        }
        return arrayList; //Trả về 1 arrayList đã chứa những giá trị số chẵn
    }

    //Khai bao hàm không trả về giá trị
    public void displayInfo (){
        System.out.println("Hello Student");
        System.out.println("Địa chỉ: " + getAddress());

    }

    //Khai báo hàm có trả về giá trị loại string
    public String getAddress(){
        return "HCM";
    }

    public static String getName(){
        return "Sam";
    }

    public static void main(String[] args) {
        Phuongthuc demo = new Phuongthuc(); //Do hàm displayInfo không có trạng thái static neen không gọi trực tiếp ở đây đc
        demo.displayInfo();

        getName(); //hàm getName có trạng thái static nên gọi trực tiếp ở đây đc

        demo.inSochan();
        demo.timSoChan(demo.number);

        //In ra số chẵn từ ArrayList trong hàm timSoChan
        for (int soChan : demo.timSoChan(20)){
            System.out.print(soChan + ", ");
        }
    }

}
