/****** Java is the Heart of Networking. *****/

import java.io.*;
import java.util.*;

class Simple 
{ 
    static double pow(int a, int b) 
      { 
          double num = 1; 
          for(int i = 0; i < b; i++) 
            { 
                num = num*a; 
            }
          return num; 
       } 

    public static void main(String[] args)
      { 
//         double j = 0;
           int i, max;
           double k = 0;
           String w = new String();
           String x = new String();
           String y = new String();
           String z = new String();
//              double count = 0;
//              System.out.println(pow(2, 128));
//              for(double i = 0; i < pow(2, 128) + 1; i++)
//                {
           String l = new String();
           String m = new String();
           String n = new String();
           
//              int ko;
//              j = 80 + i;
           k = pow(13, 1);
           l = Integer.toBinaryString((int)k);
//           System.out.print(l + " "); 
//           System.out.println(l.length());
           String zero1 = new String("0");
           while(l.length() < 32)
            {
                l = zero1.concat(l);
//                System.out.print(l + " "); 
//                System.out.println(l.length());
            }
//            System.out.println(l + " ");
            w = l;
// Next Section.------------------------------------------------------------
           k = pow(7, 1);
           l = Integer.toBinaryString((int)k);
//           System.out.print(l + " "); 
//           System.out.println(l.length());
           String zero2 = new String("0");
           while(l.length() < 32)
            {
                l = zero2.concat(l);
//                System.out.print(l + " "); 
//                System.out.println(l.length());
            }
//           System.out.println(l + " ");
           x = l;
// Next Section.------------------------------------------------------------
           k = pow(11, 1);
           l = Integer.toBinaryString((int)k);
//           System.out.print(l + " "); 
//           System.out.println(l.length());
           String zero3 = new String("0");
           while(l.length() < 32)
            {
                l = zero3.concat(l);
//                System.out.print(l + " "); 
//                System.out.println(l.length());
            }
//            System.out.println(l + " ");
            y = l;
// Next Section.------------------------------------------------------------
           k = pow(5, 1);
//           j = pow(2,(int)j) % (k + 1);
           l = Integer.toBinaryString((int)k);
//              ko = Integer.parseInt(l,2);
//              System.out.println(ko);              
//           System.out.print(l + " "); 
//           System.out.println(l.length());
           String zero = new String("0");
           while(l.length() < 32)
            {
                l = zero.concat(l);
            };
            z = l;
            
// Next Section.------------------------------------------------------------
           w = w.concat(x);
//           System.out.println(w + " ");
           w = w.concat(y);
//           System.out.println(w + " ");
           w = w.concat(z);
//         System.out.println(w + " ");
// Exclusive-OR Section.------------------------------------------------------------
           l = "1011010101111110101011000001010100101001010111011000101011111100101011110010110111011101010101101"; // RightHandSide.
           m = "1010101011111100101010101011111"; // LeftHandSide.
           char[] o = m.toCharArray();          //  LeftHandSide.
           char b4 = o[3];
//           System.out.println(b4);
           if(b4 == '0')
             {
                max = 128;
                n = "100110100101001001010011001100000001000111010111101100010111011010100001011001101000011111011011001100010000011";
//                System.out.println(zero);
//                System.out.println(zero.length());
                for(i = 0; i < max - n.length() - 1; i++)
                  {
                      zero = zero.concat("0");
                  }
                n = n.concat(zero);
                
//------------------------------------------------------------                

                zero = "0";
                for(i = 0; i < max - l.length() - 1; i++)
                  {
                        zero = zero.concat("0");
                  }
                  l = l.concat(zero);

                char[] r = n.toCharArray();
                char[] q = w.toCharArray();
                char[] p = l.toCharArray();
            }
           else /* if(b4 == '1') */
            {
                max = 131;
                for(i = 0; i < max - l.length() -1; i++)
                  {
                           zero = zero.concat("0");
                  }
                l = l.concat(zero);
                zero = "0";
                for(i = 0; i < max - w.length() - 1; i++)
                  {
                     zero = zero.concat("0");
                  }
                  w = w.concat(zero);
                  System.out.println(w);
                  System.out.println(w.length() + "\n");
                n = "10011010010101111110100000100101110000011111000000111001101100100110110110111011101010111010010110111111111011110000110100001000011";
                char[] r = n.toCharArray();
                char[] q = w.toCharArray();
                char[] p = l.toCharArray();
            }
//            else
            {
//                max = 128;
//                System.out.println("Bad Signal");
            }
//------------------------------------------------------------ 
          char[] r = n.toCharArray();
          char[] q = w.toCharArray();
          char[] p = l.toCharArray();
          
          for(i = 0; i < max; i++)
            {
              if(p[i] == q[i])
               {
                  p[i] = '0';
               }
              else
               {
                  p[i] = '1';    
               }
            }
//----------------------------------------------------------------------------------
         for(i = 0; i < max; i++)
           {
              if(p[i] == r[i])
                {
                   p[i] = '0';
                }
              else
                {
                   p[i] = '1';    
                }
           }
// BlockSize Division.------------------------------------------------------------
   
