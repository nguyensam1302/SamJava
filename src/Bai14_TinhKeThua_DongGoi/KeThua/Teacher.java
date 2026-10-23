package Bai14_TinhKeThua_DongGoi.KeThua;

public class Teacher extends Person{

    private  double salary;

    public Teacher(String name, int age, float height, double salary) {
        super(name, age, height);
        this.salary = salary;
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Lan", 30, 160, 30000000);
        teacher.getInfo();
        System.out.println("Salary: " + teacher.salary);
    }
}
