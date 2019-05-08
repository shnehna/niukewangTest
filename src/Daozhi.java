import java.util.Scanner;

/**
 * @Author shenhan
 * @Date: 2019/5/8 12:32
 * @Description:
 */
public class Daozhi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sc = scanner.nextLine();
        String daozhi = daozhi(sc);
        System.out.println(daozhi);
    }

    private static String daozhi(String str) {
        String[] s = str.split(" ");
        StringBuilder s1 = new StringBuilder();
        for (int i = s.length-1; i >= 0; i--) {
            if (i == 0) {
                s1.append(s[i]);
            } else {
                s1.append(s[i]).append(" ");
            }
        }
        return s1.toString();
    }
}
