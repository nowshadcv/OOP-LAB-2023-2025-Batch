package symmetrixmatrix;
import java.util.Scanner;
public class matrixsymmetry{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The Number Of Rows:");
        int rows=sc.nextInt();
        System.out.println("Enter The Number Of Coloumns:");
        int cols=sc.nextInt();
        int matrix[][]=new int[rows][cols];
        System.out.println("Enter The Elements To The Matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        sc.close();
        System.out.println("The Given Matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j]+ "\t");
            System.out.println();}}

        if(rows!=cols)
                System.out.println("The Given Matrix Is Not A Square MAtrix.");
        else{
            boolean symmetric=true;
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
            if (matrix[i][j]!=matrix[j][i]){
                symmetric=false;break;
            }
        if (symmetric)
            System.out.println("The Given Matrix Is Symmetric.");

        else
            System.out.println("The Given Matricx Is Not Symmetric");
    }
}}



        
    }
}