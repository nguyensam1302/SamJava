package Bai14_TinhKeThua_DongGoi.KeThua;

public class School extends Student{
    public School(String name1, int age1, float height1, String phone, String address) {
        super(name1, age1, height1, phone, address);
    }

    public void testGetInfoAll(){
        getPhone();
        getAddress();
        getInfo(); //gọi hàm này từ Person thông qua Student
    }

    public static void main(String[] args) {
        School school = new School("sam2", 20, 154, "12344353534", "HaNoi");
       school.getInfo();
    }
}
