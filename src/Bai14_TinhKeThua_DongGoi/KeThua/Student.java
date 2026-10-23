package Bai14_TinhKeThua_DongGoi.KeThua;

public class Student extends Person {

    private String phone;
    private String address;

    public Student(String name1, int age1, float height1, String phone, String address){
        //Không cần trùng name, age, height với class cha
        //String phone, String address: khai báo riêng cho lớp con
        super(name1, age1, height1); //Dùng super để cho lớp con truy cập những thứ lien quan đến lớp cha
        this.phone = phone;
        this.address = address;
    }

    public String getPhone(){
        return phone;
    }

    public String getAddress(){
        return address;
    }

    public void getInfo(){ //Ghi đè phương thức getInfo ở lớp cha
        super.getInfo(); //Hàm này lấy từ class cha
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        Student student = new Student("linh", 27, 165, "12232424", "HN");
        student.getInfo();
        System.out.println(student.getPhone());
        System.out.println(student.getAddress());
    }
}
