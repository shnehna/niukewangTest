import com.sun.deploy.util.ArrayUtil;

import java.util.*;

/**
 * @Author shenhan
 * @Date: 2019/5/8 15:08
 * @Description:
 */
public class DelString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            String a = scanner.nextLine();
            String b = scanner.nextLine();
            StringBuilder s3 = new StringBuilder();
            char[] charsa = a.toCharArray();
            char[] charsb = b.toCharArray();
            for (int i = 0; i < charsa.length; i++) {
                int count = 0;
                for (int i1 = 0; i1 < charsb.length; i1++) {
                    if (charsa[i] != charsb[i1]) {
                        count++;
                    }
                }
                if (count == charsb.length) {
                    s3.append(charsa[i]);
                }
            }
            System.out.println(s3.toString());
        }
    }
}
