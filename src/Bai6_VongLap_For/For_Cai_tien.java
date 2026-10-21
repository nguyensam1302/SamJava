package Bai6_VongLap_For;

public class For_Cai_tien {
    public static void main(String[] args) {
        int number[] = {12, 23, 44, 56, 78};
        String name[] = {"Hoa", "Linh", "Truong", "Han"};
        for (int i : number) {
            System.out.println(i);
        }
        for (String ten : name) {
            System.out.println(ten);

        }
        for (int i : number){
            if (i == 12){
                System.out.println("Có tồn tại số 12");
            }
        }
    }
}
