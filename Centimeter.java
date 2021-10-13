import java.io.*;
public class Centimeter{

  public static void main(String args[])throws Exception
  {
      
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter Centimeter : ");
      float cent=Float.parseFloat(bf.readLine());
      float I=(float)(cent/2.54);
      float K=(float)(cent/100000);
      float M=(float)(cent / 100);
      System.out.println("Inch      :"+I);
      System.out.println("Meter     :"+M);
      System.out.println("Kilometer :"+K);

    }
	    
}