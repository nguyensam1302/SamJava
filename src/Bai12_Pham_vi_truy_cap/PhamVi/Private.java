package Bai12_Pham_vi_truy_cap.PhamVi;

public class Private { //Không thể là private class hoặc protected class
    private String name = "Sam";
    private void showInfo(){
        System.out.println("Hello");
    }
    public String getName(){
        return name;
    }
}
