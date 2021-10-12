import java.io.*;

public class Transpose {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int i,j,m,n,sum=0;
        
        int[][] arr1 = new int[10][10];
        int[][] arr2 = new int[10][10];
        System.out.print("Enter number of rows and columns :");
        m=Integer.parseInt(bf.readLine());
        n=Integer.parseInt(bf.readLine());
    
        System.out.println("Enter "+(m*n)+"  values : ");   
    //read the array
  for(i=0;i<m;i++){
      for(j=0;j<n;j++){
         arr1[i][j] = Integer.parseInt(bf.readLine());
      }
  }

  //Transpose of a matrix
 System.out.println("Transpose of matrix ");
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++){
       arr2[i][j] = arr1[j][i];
       System.out.print("  "+arr2[i][j] + "  ");
    }
    System.out.print("\n");
   }

        if((m+n)%2==0)
         {
             int h=m+n/2;
             for(i=0;i<h;i++)
             {
                 sum+=arr1[i][i];
             }
             System.out.println("Trace of the matrix is : "+sum);
          }
    
    }
}