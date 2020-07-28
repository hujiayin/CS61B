public class TriangleDrawer {
    public static void drawTriangle(int N) {
        int row = 1;
        while (row <= N) {
            int col = 1; 
            while (col < row){
                System.out.print("*");
                col += 1;
            }
            System.out.println("*");
            row += 1;
        }
    }

    public static void main(String[] args) {
        int N = 10; 
        drawTriangle(N);
    }
 }