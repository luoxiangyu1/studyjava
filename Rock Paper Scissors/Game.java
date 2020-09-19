import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请从石头剪刀布中选择：1.石头 2.剪刀 3.布");
        int choice = scanner.nextInt();
        int random = 1 + (int) (Math.random() * 3);
        int res = random - choice;
        switch (random) {
            case 1:
                System.out.println("系统出的石头");
                break;
            case 2:
                System.out.println("系统出的剪刀");
                break;
            case 3:
                System.out.println("系统出的布");
                break;
            default:
                break;
        }
        switch (res) {
            case 0:
                System.out.println("平局");
                break;
            case -1:
            case 2:
                System.out.println("系统赢了");
                break;
            case 1:
            case -2:
                System.out.println("你赢了");
                break;
            default:
                break;
        }
    }
}