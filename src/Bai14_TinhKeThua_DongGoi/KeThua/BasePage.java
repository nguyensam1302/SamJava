package Bai14_TinhKeThua_DongGoi.KeThua;

public class BasePage {
    private  String driver;
    public BasePage(String driver){
        this.driver = driver;
    }

    public  String getDriver(){
        return driver;
    }
    public void logout(){
        System.out.println("Đăng xuất");
    }
    public void checkNotifications(){
        System.out.println("Check thông báo mới");
            }
    public void searchCommon(String text){
        System.out.println("Tìm kiếm với từ khóa: " + text);
    }
}
