public class Java_Loop_J{
    public static void main(String [] args){
        int n = 9;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 && j >= n/4 && j <= (3*n)/4 || j == n/2 || i == n-1 && j >= 0 && j <= n/2 || j == 0 && i >= (3*n)/4)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}