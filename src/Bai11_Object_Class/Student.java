package Bai11_Object_Class;

public class Student {
    String name;
    int age;
    String address;
    String phone;

    public void displayInfo() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
        System.out.println(phone);
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        // Khai báo đối tượng thuộc class Student (sử dụng từ khóa new)
        Student sv1 = new Student();
        sv1.displayInfo();
        sv1.getName();

        Student sv2 = new Student();
        sv2.getName();
    }
}
