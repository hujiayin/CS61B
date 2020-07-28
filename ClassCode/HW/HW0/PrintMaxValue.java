public class PrintMaxValue {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        int max = m[0]; 
        int N = m.length; 
        for (int i = 1; i < N; i++) {
            if (m[i] > max) {
                max = m[i];
            }
        }
        return max;
    }
    
    public static int max_while(int[] m) {
        int max = m[0]; 
        int N = m.length; 
        int i = 1;
        while (i < N) {
            if (m[i] > max) {
                max = m[i];
            }
            i = i + 1;
        }
        return max;
    }
    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
       int max = max(numbers); 
       System.out.println(max);
       int while_max = max_while(numbers); 
       System.out.println(while_max);
    }
}
