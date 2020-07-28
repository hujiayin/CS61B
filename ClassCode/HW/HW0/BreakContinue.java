public class BreakContinue {
  public static void windowPosSum(int[] a, int n) {
    /** Return array replacing each element a[i] with the sum of a[i] through a[i + n], 
     *  but only if a[i] is positive valued.*/ 
    int N = a.length;
    for (int i = 0; i < N; i++) {
        if (a[i] < 0) {
            continue;
        }
        for (int x = 1; x <= n; x++) {
            if (i + x < N) {
                a[i] = a[i] + a[i + x];
            } else {
                break;
            }
        }
    }
  }

  public static void main(String[] args) {
    int[] a = {1, 2, -3, 4, 5, 4};
    int n = 3;
    windowPosSum(a, n);

    // Should print 4, 8, -3, 13, 9, 4
    System.out.println(java.util.Arrays.toString(a));
  }
}