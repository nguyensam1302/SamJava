package Bai14_TinhKeThua_DongGoi.DongGoi;

public class ThongTin {
    public static void main(String[] args) {
        Student student1 = new Student();
        //Gán giá trị thông qua hàm set
        student1.setName("Xuan");
        student1.setAge(25);
        student1.setPhone("354435");

        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getPhone());
    }
}
