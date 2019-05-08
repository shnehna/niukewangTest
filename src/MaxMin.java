import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author shenhan
 * @Date: 2019/5/8 13:29
 * @Description:
 */
public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[0];
        if (scanner.hasNext()) {
            int N = scanner.nextInt();
            number = new int[N];
            for (int i = 0; i < N; i++) {
                number[i] = scanner.nextInt();
            }
        }
        Arrays.sort(number);
        System.out.println(number[number.length-1] + " " + number[0]);
    }
}
