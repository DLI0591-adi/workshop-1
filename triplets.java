package Day4;

import java.util.Arrays;
class triplets {
    static void findTriplets(int[] arr, int n)
    {
        boolean b = false;
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            int l = i + 1;
            int r = n - 1;
            while (l < r) {
                if (arr[i] + arr[l] + arr[r] == 0) {
                    System.out.print(arr[i] + " ");
                    System.out.print(arr[l] + " ");
                    System.out.println(arr[r] + " ");
                    l++;
                    r--;
                    b = true;
                }
                else if (arr[i] + arr[l] + arr[r] < 0)
                    l++;
                else
                    r--;
            }
        }
        if (!b)
            System.out.println(" No Triplet Found");
    }
    public static void main(String[] args)
    {
        int[] arr = { 0, -1, 2, -3, 1 };
        int n = arr.length;
        findTriplets(arr, n);
    }
}