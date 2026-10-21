package Bai13_Trang_thai_static;

import Constant_Hang_So.ConfigData;

public class HamStatic {
    public String name;
    public int age;
    public static String className = "ĐH Bách KHoa";

    public static void getInfo(){
        System.out.println(className); //Hàm static có thể gọi trực tiếp biến static

        HamStatic demoHamStatic = new HamStatic();
        System.out.println(demoHamStatic.name); //name là biến non-static nên không gọi trực tiếp đc

    }

}


