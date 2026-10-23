package Bai14_TinhKeThua_DongGoi.KeThua;

public class LoginPage extends BasePage{
    public LoginPage(String browser) {
        super(browser); //Đảm bảo cấu trúc của class BasePage
    }

    public void loginCRM(String email, String password){
        System.out.println("Đăng nhập với email: " + email + " và password: " + password);
        logout();//Gọi từ class BasePage
    }
}
