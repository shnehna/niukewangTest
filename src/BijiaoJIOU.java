import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author shenhan
 * @Date: 2019/5/8 14:34
 * @Description:
 */
public class BijiaoJIOU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] number = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i : number) {
            if (i%2==0) {
                count++;
            }
        }
        if (count <= (number.length - count)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
