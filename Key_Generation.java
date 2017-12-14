/***** Generation of a set with combination of bit-string with each of 128-bit. *****/ 
/* Total nos. of key-generated is equivalent to pow(m, n). */
/* 'm' is the total nos. of variable to be used. */
/* 'n' is the length of the string of the key that to be generated. */
/* For the given set, n = 128 and m = 2. A[m] = {0, 1}. */

public class KeyGeneration
{
    static void pow(int a, int b)
    {
      double num = 1;
        for(int i = 0; i <= b; i++)
        {
          num = num * a;
        }
        return num;
    }
    public static void main(String args[])
    {
       static int i = 2;
       String Key_Generated[] = new String[pow(2, 128)];
       Key_Generated[0] = '0';
       Key_Generated[1] = '1';
       for(static int j = 0; j < Key_Generated.length; j++)
        {
           if(Key_Generated.length < pow(2, 128))
             {
                Key_Generated[i] = concate(Key_Generated[j], Key_Generated[0]);
                i++;
                Key_Generated[i] = concate(Key_Generated[j], Key_Generated[0]);
                i++;
             }
           else
             {
               break;
             }
        }
 }



