import java.io.*;
class Array{
public static void main(String args[])throws Exception{
    
    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    int limit,i,j,temp=0;
    System.out.print("Enter the array limit :");
    limit = Integer.parseInt(bf.readLine());
    //Array Declaration
    int arr [] = new int[30];
    System.out.print("Enter the element to array : \n");

    for(i=0;i<limit;i++)
    {
        arr[i] = Integer.parseInt(bf.readLine());
    }
    
    // Sort the array 
    for(i=0;i<limit;i++)
     { 
         for(j=i+1;j<limit;j++)
         {
            if(arr[i]>arr[j])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp; 
            }
         }
     }
    
    for(i=0;i<limit;i++)
        {
          System.out.print(arr[i] + " ");       
        }
        //to find smallest amount in the array
    System.out.println("\nThe smallest element in the array is :"+ arr[0]);
    System.out.println("The Largest element in the array is :"+ arr[limit-1]);
    System.out.println("The second largest element in the array is :"+ arr[limit-2]);
    
    
}
}