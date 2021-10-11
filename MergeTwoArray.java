import java.io.*;
class Array{
public static void main(String args[])throws Exception{
    
    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    
    System.out.print("Enter the first array limit :");
     int limit1 = Integer.parseInt(bf.readLine());
    
    System.out.print("Enter the second array limit :");
     int limit2 = Integer.parseInt(bf.readLine());
     int i;

    //Array Declaration
    int arr [] = new int[30];
    int arr1 [] = new int[30];
    int arr2 [] = new int[30];

    System.out.print("Enter the element to 1st array : \n");

    for(i=0;i<limit1;i++)
    {
        arr[i] = Integer.parseInt(bf.readLine());
    }

    System.out.print("Enter the element to 2nd array : \n");

    for(i=0;i<limit2;i++)
    {
        arr1[i] = Integer.parseInt(bf.readLine());
    }
 
    //Array Merge
     int j=0;      
    for(i=0;i<limit1;i++)
    {
        arr2[j] = arr[i];
        j++;
    }
    
    for(i=0;i<limit2;i++)
    {
        arr2[j] = arr1[i];
        j++;
    }
    System.out.print("\nArray After Merging :\n");
    for(i=0;i<limit1+limit2;i++)
    {
        System.out.print(arr2[i] +" ");
    }
    System.out.println("");
}
}