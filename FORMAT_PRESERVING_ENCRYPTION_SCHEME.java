/***** Java is the Heart of Networking. *****/

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
           int i, max;
           double k0, k1, k3, k4;
           String w = new String();
           String x = new String();
           String y = new String();
           String z = new String();
           String l = new String();
           String m = new String();
           String n = new String();
           double k2;
           k2 = pow(2, 31); 
           k2 = k2 - 1;
           int i1;
           int count = 0, count1 = 0;
//----------------------------------------------------------------------------------
           i1 = 8;
           k0 = pow(13, i1);
           k1 = pow(7, i1);
           k3 = pow(11, i1);
           k4 = pow(5, i1);
//------------------------------------------------------------           
        while(count < pow(2, 2) + 1)
        {
          count++;
          System.out.println("\n" + count);
//---------------------------------------------------------------------------------- 
          if(k0 < k2 && count1 == 0)
           {
             k0 = pow(13, i1);
//             System.out.println(k0 + " ");
             if(k0 > k2)
             {
                k0 = k0 % k2;
//                System.out.println(k0 + " ");
                count1++;
//                System.out.println(count1 + " ");
             }
           }
          else
           {
//              System.out.println("2");
              k0 = k0 * 13;
              k0 = k0 % k2;
//              System.out.println(k0 + " ");
           }
//----------------------------------------------------------------------------------          
//           if(new String(k0) == "NaN" )
           {
//              System.out.println("YES");
           }
//           System.out.print(k0 + " ");
           l = Integer.toBinaryString((int)k0);
           System.out.print(l + " "); 
           
           
//           System.out.println(l.length());
           String zero1 = new String("0");
           while(l.length() < 32)
            {
                l = zero1.concat(l);
//                System.out.println(l + " "); 
//                System.out.println(l.length());
            }
           System.out.println(l + " ");
//           System.out.println(l.length());
           w = l;
// Next Section.------------------------------------------------------------
          if(k1 < k2 && count1 == 0)
           {
              k1 = pow(7, i1);
//             System.out.println(k1 + " ");
              if(k1 > k2)
               {
                 k1 = k1 % k2;
//                System.out.println(k1 + " ");
                 count1++;
//                System.out.println(count1 + " ");
               }
           }
          else
           {
//              System.out.println("2");
              k1 = k1 * 7;
              k1 = k1 % k2;
//              System.out.println(k1 + " ");
           }
//----------------------------------------------------------------------------------          
           l = Integer.toBinaryString((int)k1);
           System.out.print(l + " "); 
//           System.out.println(l.length());
           String zero2 = new String("0");
           while(l.length() < 32)
            {
                l = zero2.concat(l);
//                System.out.print(l + " "); 
//                System.out.println(l.length());
            }
           System.out.println(l + " ");
//         System.out.println(w.length() + " ");           
           x = l;
// Next Section.------------------------------------------------------------
         if(k3 < k2 && count1 == 0)
          {
             k3 = pow(11, i1);
//             System.out.println(k3 + " ");
             if(k3 > k2)
              {
                k3 = k3 % k2;
//                System.out.println(k3 + " ");
                count1++;
//                System.out.println(count1 + " ");
              }
          }
         else
          {
//              System.out.println("2");
             k3 = k3 * 11;
             k3 = k3 % k2;
//              System.out.println(k3 + " ");
          }
//----------------------------------------------------------------------------------          
          l = Integer.toBinaryString((int)k3);
          System.out.print(l + " "); 
//           System.out.println(l.length());
          String zero3 = new String("0");
          while(l.length() < 32)
            {
                l = zero3.concat(l);
//                System.out.print(l + " "); 
//                System.out.println(l.length());
            }
          System.out.println(l + " ");
//         System.out.println(l.length() + " ");            
          y = l;
            
// Next Section.------------------------------------------------------------
          if(k4 < k2 && count1 == 0)
           {
               k4 = pow(5, i1);
//               System.out.println(k4 + " ");
               if(k4 > k2)
                {
                   k4 = k4 % k2;
//                  System.out.println(k4 + " ");
                   count1++;
//                  System.out.println(count1 + " ");
                }
           }
          else
            {
//               System.out.println("2");
               k4 = k4 * 5;
               k4 = k4 % k2;
//               System.out.println(k4 + " ");
            }
//----------------------------------------------------------------------------------
           l = Integer.toBinaryString((int)k4);
           System.out.print(l + " "); 
//           System.out.println(l.length());
           String zero = new String("0");
           while(l.length() < 32)
            {
                l = zero.concat(l);
            }; 
           System.out.println(l + " "); 
//         System.out.println(l.length() + " ");
           z = l;
            
// Next Section.------------------------------------------------------------
           w = w.concat(x);
//           System.out.println(w + " ");
           w = w.concat(y);
//           System.out.println(w + " ");
           w = w.concat(z);
          System.out.println(w + " ");
//         System.out.println(w.length() + " ");
//----------------------------------------------------------------------------------
          i1++;
        }
//------------------------------------------------------------------------------------

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
           else  
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
//                  System.out.println(w);
//                  System.out.println(w.length() + "\n");
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
    int rem;
    String p1 = new String(p);
    zero = "0";
//    System.out.println(p1);
    rem = p.length % m.length();
    if(rem != 0)
    {
        for(i = 0; i < m.length() - rem - 1; i++)
        {
            zero = zero.concat("0");
        }
        p1 = p1.concat(zero); 
    }
//    System.out.println(p1);
    char[] p2 = p1.toCharArray();
    char[] A = new char[m.length()];
    System.out.print("\n");
    int k1 = 0, j1;
    for(i = k1; i < m.length(); i++)
      {
            if(p2[i] == p2[i + m.length()])
             {
                A[i] = '0';
             }
            else
            {
                A[i] = '1';
            }
       }
       for(i = 0; i < m.length(); i++)
        {
          System.out.print(A[i]);
        }
        System.out.print("\n");
    k1 = k1 + m.length();
    while(k1 < p1.length() - 31)
    {
        j1 = 0;
        for(i = k1; i < k1 + m.length(); i++)
        {
            if(A[j1] == p2[i + m.length()])
             {
                A[j1] = '0';
                j1++;
             }
            else
            {
               A[j1] = '1';
               j1++;
            }
        }
        k1 = k1 + m.length(); 
        for(i = 0; i < m.length(); i++)
        {
          System.out.print(A[i]);
        }
        System.out.print("\n");
    }
//Exclusive-OR for LeftSideKey:------------------------------------------------------------ 
for(i = 0; i < m.length(); i++)
 {
   System.out.print(o[i]);
 }
 System.out.println("");
 for(i = 0; i < m.length(); i++)
 {
     if(o[i] == A[i])
     {
         o[i] = '0'; 
     }
     else
     {
         o[i] = '1';
     }
 }
// for(i = 0; i < m.length(); i++)
  {
//   System.out.print(o[i]);
  }
   
 }
}
