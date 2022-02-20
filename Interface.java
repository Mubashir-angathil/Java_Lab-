/*
Author : Mubashir Angathil
Program: Create an interface volume with member variable pi and method readdata() and disvolume().
         create two classes sphere and cylinder to implement this interfaces
Date   : 20-02-2022
Time   : 05:59 PM

*/
import java.util.Scanner;

interface Volume {
    double pie = 3.14285714286;

    void readdata();

    void disvloume();
}

// class Sphere
class Sphere implements Volume {
    int radius;

    public void readdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the sphere:");
        radius = sc.nextInt();
    }

    public void disvloume() {
        double volume = (4.0 / 3.0) * Volume.pie * (radius * radius * radius);
        System.out.print("Radius of the sphere: " + volume);
    }
}

// class cylinder
class cylinder implements Volume {
    // volume = π · r2 · h
    int radius, height;

    public void readdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter height of the cylinder: ");
        height = sc.nextInt();
        System.out.print("Enter radius of the cylinder: ");
        radius = sc.nextInt();

    }

    public void disvloume() {
        double volume = Volume.pie * (radius * radius) * height;
        System.out.println("Volume of the cylinder=" + volume);
    }

}

// Main method
public class Interface {
    public static void main(String args[]) {
        Sphere sp = new Sphere();
        cylinder c = new cylinder();
        sp.readdata();
        sp.disvloume();
        c.readdata();
        c.disvloume();

    }
}

/*
             OUTPUT
  _____________________________
  Enter radius of the sphere:5
  Radius of the sphere: 523.80952381
  Enter height of the cylinder: 5
  Enter radius of the cylinder: 6
  Volume of the cylinder=565.7142857148
  
 */