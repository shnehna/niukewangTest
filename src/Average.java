import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @Author shenhan
 * @Date: 2019/5/8 14:48
 * @Description:
 */
public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] number = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i : number) {
            sum += i;
        }
        float average = (float) sum / (float) number.length;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        System.out.println(decimalFormat.format(average));
    }
}
