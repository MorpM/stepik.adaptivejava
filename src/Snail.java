import java.util.Scanner;

/**Snail creeps up the vertical pole of height H feets. Per day it goes A feets up, and per night it goes B feets down.
 *  In which day the snail will reach the top of the pole?

        Input data format

        On the input the program receives non-negative integers H, A, B, where H > B and A > B. Every integer does not exceed 100.
*/

public class Snail {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 1;
        if((h - a) % (a - b)>0)result++;
        result +=((h - a) / (a - b));
        System.out.println(result);
    }
}
