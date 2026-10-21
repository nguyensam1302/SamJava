package Bai13_Trang_thai_static;

public class ThongTin {
    public static void main(String[] args) {
        System.out.println(StaticVariable.className);
    }

    public void getInfo(){
        StaticVariable bienStatic = new StaticVariable();
        System.out.println(StaticVariable.className);
    }
}
