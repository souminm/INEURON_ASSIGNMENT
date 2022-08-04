import java.util.Scanner;
public class PatternAssign1c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i>(n-1)/2 && i-j>=n/2 || i>(n-1)/2 && j-i>=(n-1)/2||i==n-1||i>(n)/2 && i!=n-1 && j-i<=(n-2)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
