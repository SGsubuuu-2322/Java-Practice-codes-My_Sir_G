public class Java_Loop_Y{
    public static void main(String [] args){
        int n = 9;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j && i <= n/2 || (i+j) == (n-1) && i <= n/2 || j == n/2 && i >= n/2)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}