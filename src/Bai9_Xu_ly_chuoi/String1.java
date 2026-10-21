package Bai9_Xu_ly_chuoi;

import java.lang.reflect.Array;

public class String1 {
    public static void main(String[] args) {
        //Cách 1 Khai báo biến dạng chuỗi
        String name = "Sam";

        //Cách 2 Khai báo hằng chuỗi (truc tiep không qua biến)
        System.out.println("Auto Test".toUpperCase());

        //Cách 3
        String str2 = "Auto test2, java".toUpperCase();
        System.out.println(str2);

        String str3 = "Auto test3".replace(" ", "-");
        System.out.println(str3);

        // Cắt chuỗi_ hàm substring
        System.out.println(str3.substring(5));
        System.out.println(str3.substring(5, 6));

        //Ghép chuỗi_dùng dấu + hặc concat
        System.out.println(str2.concat(str3));
        System.out.println(str2.concat(" ").concat(str3));

        //Tách chuỗi_split
        System.out.println("Tach chuoi: " + str3.split("-")[0]);
        System.out.println("Tach chuoi + trim: " + str2.split(",")[1].trim()); //trim: xóa khoảng trống đầu và cuối

        //So sánh
        String str4 = "Api Testing With postman";
        String str5 = "Api testing with postman Tool";
        String str6 = "api testing with postman";

        System.out.println("So sanh chứa: " + str4.contains("postman"));
        System.out.println("So sánh bằng: " + str4.equals(str6));
        System.out.println("So sánh bằng: " + str4.equalsIgnoreCase(str6));//Bỏ qua phân biệt hoa thường

        //Kiểm tra giá trị bắt đầu và kết thúc
        System.out.println("Bắt đầu: " + str4.startsWith("A"));
        System.out.println("Bắt đầu: " + str4.endsWith("man"));

        String str7 = " ";
        System.out.println("Không xem space là chuỗi rỗng: " + str7.isEmpty());
        System.out.println("Xem space là chuỗi rỗng: " + str7.isBlank());

    }
}
