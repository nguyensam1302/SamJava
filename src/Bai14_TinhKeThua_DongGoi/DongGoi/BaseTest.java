package Bai14_TinhKeThua_DongGoi.DongGoi;

public class BaseTest {
    private String driver;
    private boolean headless;
    private boolean report;

    public BaseTest(String driver, boolean headless, boolean report){
        this.driver = driver;
    }
    public  String getDriver(){
        return driver;
    }
    public void setDriver(String driver){
        this.driver = driver;
    }

    public boolean isHeadless() {
        return headless;
    }

    public void setHeadless(boolean headless) {
        this.headless = headless;
    }

    public boolean isReport() {
        return report;
    }

    public void setReport(boolean report) {
        this.report = report;
    }
}
