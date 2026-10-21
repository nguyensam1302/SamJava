package Bai13_Trang_thai_static;

public class KhoiStatic {
    public String name;
    public int age;
    public static String className = "ĐH Bách KHoa"; //Biến static

    static {
        System.out.println("Khối static"); //Khối static chạy trước hàm main
    }

    public static void main(String[] args) {
        System.out.println(className);
    }
    static {
        System.out.println("Khối static 2"); //Khối static chạy trước hàm main
    }
}
