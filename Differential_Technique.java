/***** Vertical Analysis(Differential Methods.) in Keys Generated with each Round. *****/

import java.io.*;

class ExclusiveOR
{
	public static void main (String[] args) 
	{
	    int i, count = 0;
		String A = new String();
		String B = new String();
		A = "01100001100011111000101101011011001000111110000111001011011001010110100000101000111100000011110100001100011100111011110101100000";
		B = "00100101000010110000101010111000001010011011001010001010110001010000100101111000000101011101011101101000111000111111001010101100";								
		char[] A1 = A.toCharArray();
		char[] B1 = B.toCharArray();
		for(i = 0; i < 128; i++)
		{
		   System.out.print(A1[i]);
		}
		System.out.println("");
		for(i = 0; i < 128; i++)
		{
		   System.out.print(B1[i]);
		}
	    System.out.println("");
		for(i = 0; i < 128; i++)
		{
		    if(A1[i] == B1[i])
		    {
		        A1[i] = '0';
		        count ++;
		    }
		    else
		    {
		        A1[i] = '1';
		    }
		    System.out.print(A1[i]);
		}
        System.out.print(" " + count);
	}
}
