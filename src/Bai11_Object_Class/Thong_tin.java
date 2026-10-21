package Bai11_Object_Class;

public class Thong_tin {
    float vat = 10;
    double hocphi = 1500000;

    public double getVat() {
        return vat;
    }

    public double getHocPhi() {
        return hocphi;
    }

    public static void main(String[] args) {
        Student sv1 = new Student(); //Khai báo và khởi tạo giá trị cho 1 class đầy đủ
        sv1.displayInfo();

        //Khai báo annonymous (vô danh)
        new Student().displayInfo();


        Thong_tin tt1 = new Thong_tin();
        tt1.getHocPhi();
        Thong_tin tt2 = new Thong_tin();
        tt2.getHocPhi();
    }
}
