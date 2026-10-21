package Bai5_IfElse;

public class SwitchCase {
    public static void main(String[] args) {
        int number = 20;
        switch (number){
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            default:
                System.out.println("Not 10 or 20");
        }

        String browser = "Chrome";
        switch (browser){
            case "Chrome":
                System.out.println("Run Chrome Browser...");
                break;
            case "Edge":
                System.out.println("Run Edge Browser...");
                break;
            default:
                System.out.println("Run Chrome Browser (default)...");
        }
    }
}
