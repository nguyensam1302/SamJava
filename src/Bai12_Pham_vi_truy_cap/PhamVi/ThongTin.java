package Bai12_Pham_vi_truy_cap.PhamVi;

import Bai12_Pham_vi_truy_cap.HamXayDung.Student;

public class ThongTin extends Student { //extends: kế thừa
    public static void main(String[] args) {
        Private demoPrivate = new Private();
        System.out.println(demoPrivate.getName()); //Không gọi trực tiếp name được do private

        Student student = new Student();


        Protected demoProtected = new Protected();
        demoProtected.getAddress();

        ThongTin thongTin = new ThongTin();
        thongTin.getPhone(); //Gọi được phạm vi protected khac package khi kế thừa
    }
}
