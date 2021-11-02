//Lab-18
//Write program to implement a package.

import java.io.*;
import RVR.MCA.Addition;
import RVR.MCA.Subtraction;
import RVR.MCA.Multiplication;
import RVR.MCA.Division;
            class PackageDemo
            {
               public static void main(String args[])
               {
                Addition a= new Addition();
                Subtraction s = new Subtraction();
                Multiplication m = new Multiplication();
                Division d = new Division();

               System.out.println("Addition of 10,20:"+a.sum(10,20));
               System.out.println("Subtarction of 10,20:"+s.sub(10,20));
               System.out.println("Multiplication of 10,20:"+m.mul(10,20));
               System.out.println("Division of 10,20:"+d.div(10,20));
               }
           } 