public class DrawingTriangle {
    public static void main(String[] args){
        int row = 1;
        int Size = 5;
        while (row <= Size) {
            int col = 1; 
            while (col < row){
                System.out.print("*");
                col += 1;
            }
            System.out.println("*");
            row += 1;
        }
    }
}