import java.util.Scanner;

/**
 * @Author shenhan
 * @Date: 2019/5/8 15:00
 * @Description:
 */
public class ReverseOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        char[] chars = line.toCharArray();
        char[] newChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            newChars[i] = chars[chars.length - i - 1];
        }
        System.out.println(new String(newChars));
    }
}
