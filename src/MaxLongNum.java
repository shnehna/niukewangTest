import java.util.*;

/**
 * @Author shenhan
 * @Date: 2019/5/8 17:42
 * @Description:
 */
public class MaxLongNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] chars = str.toCharArray();
        List<String> list = new ArrayList<>();
        StringBuilder stemp = new StringBuilder();
        for (char aChar : chars) {
            if (aChar >= '0' && aChar <= '9') {
                stemp.append(aChar);
            } else {
                list.add(stemp.toString());
                stemp = new StringBuilder();
            }
            list.add(stemp.toString());
        }
        list.sort((o1, o2) -> o2.length()-o1.length());
        String s = list.get(0);
        System.out.println(s);
    }
}
