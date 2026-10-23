package Bai17_TryCatch;

public class TryCatch {

    public void setTimeout(String timeout){
        System.out.println("Set Timeout: " + Integer.parseInt(timeout));
    }

    public static void main(String[] args) { //Try Catch: nếu lỗi thì bỏ qua và chạy tiếp xuống dưới
        try {
            TryCatch demoTryCatch = new TryCatch();
            demoTryCatch.setTimeout("10s");
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        System.out.println("Error");

    }
}
