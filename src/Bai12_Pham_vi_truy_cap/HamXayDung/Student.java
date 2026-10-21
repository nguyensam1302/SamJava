package Bai12_Pham_vi_truy_cap.HamXayDung;

public class Student {
    //Không khai báo pvi truy cập => ngầm hiểu Default, không được truy cập ngoài package
    int age = 30;
    String phone = "132322434";

    protected String getPhone(){
        return phone;
    }

}
