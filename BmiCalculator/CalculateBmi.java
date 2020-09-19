import java.util.Scanner;
public class CalculateBmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入身高（米）：");
        double high = scanner.nextDouble();
        System.out.println("请输入体重（公斤）：");
        double wight = scanner.nextDouble();
        double bmi = wight / (high * high);
        if (bmi < 18.5) {
            System.out.printf("过轻，你的体质指数为：%.1f",bmi);
        } else if (bmi < 25) {
            System.out.printf("正常，你的体质指数为：%.1f",bmi);
        } else if (bmi < 28) {
            System.out.printf("过重，你的体质指数为：%.1f",bmi);
        } else if (bmi < 32) {
            System.out.printf("肥胖，你的体质指数为：%.1f",bmi);
        } else {
            System.out.printf("非常肥胖，你的体质指数为：%.1f",bmi);
        }
    }
}