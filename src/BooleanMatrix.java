import java.util.Scanner;
public class BooleanMatrix {
    static Scanner sc = new Scanner(System.in);
    public static int[][] arrInput(int m, int n){
                int[][] arr = new int[m][n];
                for(int i=0; i<m; i++){
                        for(int j=0; j<n; j++){
                                arr[i][j] = sc.nextInt();
                        }
                }
                return arr;
        }

    // TODO: Implement the function to modify the matrix
        // Logic: Check each row. If it contains a 1, set the whole row to 1.
    public static int[][] BooleanMatrixProblem(int[][] arr, int m, int n){
        boolean[] check = new boolean[m];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j] == 1){
                    check[i] = true;
                    break;
                }
            }
        }
        for(int i=0; i<m; i++){
            if(check[i]){
                for (int j=0; j<n; j++){
                    arr[i][j] = 1;
                }
            }
        }
        return arr;
    }

    public static void arrOutput(int[][] arr,int m, int n){
                for(int i=0; i<m; i++){
                        for(int j=0; j<n; j++){
                                System.out.print(arr[i][j]);
                                if(j != n-1){
                                        System.out.print(" ");
                                }
                        }
                if(i != m-1)
                        System.out.println();
                }
        }
    
        // TODO: Read m and n
        // TODO: Read the matrix elements
        // TODO: Call BooleanMatrixProblem(mat, m, n)
        // TODO: Print the modified matrix
    public static void main(String[] args) {
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = arrInput(m,n);
        arr = BooleanMatrixProblem(arr, m, n);
        arrOutput(arr, m, n);
    }
}