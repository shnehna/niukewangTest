import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * @Author shenhan
 * @Date: 2019/5/8 12:33
 * @Description:
 */
public class Buchongfuzhengshu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scInt = scanner.nextInt();
        char[] chars = Integer.toString(scInt).toCharArray();
        char[] newChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            newChars[chars.length - i - 1] = chars[i];
        }
        HashSet set = new LinkedHashSet();
        for (char newChar : newChars) {
            set.add(newChar);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Object o : set) {
            stringBuilder.append(o);
        }
        System.out.println(stringBuilder.toString());
    }
}
