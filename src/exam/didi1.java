package exam;

import java.util.Scanner;

/**
 * Created by lk on 16/9/18.
 */
public class didi1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int value=in.nextInt();
        System.out.print(fun1(value));
    }
    public static int fun1(int n)
    {
        int num = 0;
        int i,j;

        for (i = 5;i <= n;i += 5)
        {
            j = i;
            while (j % 5 == 0)
            {
                num++;
                j /= 5;
            }
        }

        return num;
    }
}
