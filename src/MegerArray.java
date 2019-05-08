import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @Author shenhan
 * @Date: 2019/5/8 16:37
 * @Description:
 */
public class MegerArray {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int[] number1 = new int[0];
        int[] number2 = new int[0];
        if (scanner.hasNext()) {
            int n1 = scanner.nextInt();
            number1 = new int[n1];
            for (int i = 0; i < n1; i++) {
                number1[i] = scanner.nextInt();
            }
            int n2 = scanner.nextInt();
            number2 = new int[n2];
            for (int i = 0; i < n2; i++) {
                number2[i] = scanner.nextInt();
            }
        }
        int[] newNu = new int[number1.length + number2.length];
        for (int i = 0; i < newNu.length; i++) {
            if (i < number1.length) {
                newNu[i] = number1[i];
            } else {
                newNu[i] = number2[number2.length-(newNu.length-i)];
            }
        }
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : newNu) {
            set.add(i);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Object o : set) {
            stringBuilder.append(o);
        }
        System.out.println(stringBuilder.toString());*/
        Scanner scan=new Scanner(System.in);
        TreeSet ts=new TreeSet();
        while(scan.hasNext())
        {
            int m=scan.nextInt();
            for(int i=0;i<m;i++){
                ts.add(scan.nextInt());
            }
            int n=scan.nextInt();
            for(int i=0;i<n;i++){
                ts.add(scan.nextInt());
            }
            Iterator it=ts.iterator();
            while(it.hasNext())
            {
                System.out.print(it.next());
            }
        }
    }
}
