package Bai14_TinhKeThua_DongGoi.KeThua;

public class LoginTest {
    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage("Chrome");
        loginPage.loginCRM("admin@example.com", "34343");
        loginPage.logout();//Gọi từ class cha BasePage
    }
}
