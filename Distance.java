import java.util.Scanner;
public class Distance{
    public static void main(String args[]){
        int x1,x2,y1,y2;
        Double distance;
 
        Scanner read =new Scanner(System.in);
        System.out.println("Enter First point: ");
        x1=read.nextInt();
        x2=read.nextInt();
        System.out.println("Enter Second point: ");
        y1=read.nextInt();
        y2=read.nextInt();
        
        distance =Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("Distance between ("+x1+","+y1+"),"+"("+x2+","+y2+"): "+distance);
        
    }
}