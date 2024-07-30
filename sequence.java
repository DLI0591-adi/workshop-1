package Day4;

import java.util.HashSet;
public class sequence {
    public static void main(String[] args) {
        int[] arr = {8, 7, 5, 1, 9,2,4,3};
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        int answer = 0;
        for (int n : arr) {
            if (!set.contains(n - 1)) {
                int n1 = n;
                int streak = 1;
                while (set.contains(n1 + 1)) {
                    n1++;
                    streak++;
                }
                answer = Math.max(answer, streak);
            }
        }
        System.out.println(answer);
    }
}
