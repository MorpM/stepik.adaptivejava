/**Find the number of "Ds", "Cs", "Bs" and "As" for the last test on informatics in the class consisting of n students.
 *  The program gets number n as input, and then gets the grades themselves (one by one).
 *  The program should output four numbers in a single line - the number of "D", the number of "C",
 *  the number of "B" and the number of "A" grades.*/
import java.util.HashMap;
import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer,Integer> gradesMap = new HashMap<>(4);
        for (int i = 0; i < n; i++) {
            int grade = sc.nextInt();
            if (gradesMap.containsKey(grade)){
                int count = gradesMap.get(grade);
                count++;
                gradesMap.put(grade,count);
            }
            else {
                gradesMap.put(grade,1);
            }
        }
        for (int i = 2; i < 6; i++) {
            if (gradesMap.containsKey(i))
            System.out.print(gradesMap.get(i)+" ");
            else System.out.print("0 ");
        }
    }
}
