package Bai12_Pham_vi_truy_cap.HamXayDung;

public class HamContructor_co_tham_so {
    public String name;
    public int age;
    public String address;

    //khai báo hàm xây dựng
    public HamContructor_co_tham_so(String name, int age){
        System.out.println("Hàm xây dựng 2 tham số");
        this.name = name; //this: đại diện các thành phần trong nội tại class
        this.age = age;

    }
    public HamContructor_co_tham_so(String name, int age, String address) {
        System.out.println("Hàm xây dựng 3 tham số");
        this.name = name; //this: đại diện các thành phần trong nội tại class
        this.age = age;
        this.address = address;

    }
    public void showInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: "+ address);
    }

    public static void main(String[] args) {
        HamContructor_co_tham_so demoHamXD1 = new HamContructor_co_tham_so("Sam", 30);
        demoHamXD1.showInfo();

        HamContructor_co_tham_so demoHamXD2 = new HamContructor_co_tham_so("Sam2", 20);
        demoHamXD2.showInfo();

        HamContructor_co_tham_so demoHamXD3 = new HamContructor_co_tham_so("Sam2", 20, "HN");
        demoHamXD3.showInfo();

    }
}
