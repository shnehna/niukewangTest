import java.util.Scanner;

/**
 * @Author shenhan
 * @Date: 2019/5/8 13:53
 * @Description:
 */
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a + b);
        }
    }
}
