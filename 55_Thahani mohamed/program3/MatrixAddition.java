package MatrixAddition;

import java.util.Scanner;
public class MatrixAddition {
    public static void main(String[]args){
        int p,q,m,n;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter The Number Of Rows In Matrix A:");
        p=s.nextInt(); 

        System.out.print("Enter The Number Of Coloumns In Matrix A:");
        q=s.nextInt(); 

        System.out.print("Enter The Number Of Rows In Matrix B:");
        m=s.nextInt(); 

        System.out.print("Enter The Number Of Coloumns In Matrix B:");
        n=s.nextInt(); 

        if(p == m && q == n){
            int a[][]=new int [p][q];
            int b[][]=new int [m][n];

            System.out.println("Enter The Elements Of Matrix A:");
            for(int i=0;i<p;i++){
                for(int j=0;j<q;j++){
                    a[i][j]=s.nextInt();
                }
            }


            System.out.println("Enter The Elements Of Matrix B:");
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    b[i][j]=s.nextInt();
                }
            }


            System.out.println("Matrix A:");
            for(int i=0;i<p;i++){
                for(int j=0;j<q;j++){
                    System.out.println(a[i][j] + "  ");
                System.out.println();
                }
            }

            System.out.println("Matrix B:");
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    System.out.println(b[i][j] + "  ");
                System.out.println();
                }
            }


            System.out.println("The Sum Matrix:");
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    System.out.println(a[i][j]+b[i][j] + "  ");
                System.out.println();
                }
            }

        }
        else{
            System.out.println("These Matrux Cannot Be Added.....");
        }
    }
}