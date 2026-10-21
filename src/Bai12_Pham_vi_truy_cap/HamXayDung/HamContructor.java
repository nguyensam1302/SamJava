package Bai12_Pham_vi_truy_cap.HamXayDung;

public class HamContructor {
    public String name;
    public int age;

    //khai báo hàm xây dựng
    public HamContructor(){
        System.out.println("Tôi nằm trong hàm xây dựng");
        name = "Sam";//Khởi tạo giá trị
        age = 30;

    }

    public void showInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        HamContructor demoHamXD = new HamContructor();
        demoHamXD.showInfo();

    }
}
