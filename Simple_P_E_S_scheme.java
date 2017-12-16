/***** This is the time for Java .  ******/

class Simple
{
    static double pow(int a, int b)
    {
      double num = 1;                                                            /* Double for more than 32 bits. */
        for(int i = 0; i < b; i++)
        {
          num = num * a;                                                         /* Multiplication of 2 with each round. */
        }
        return num;
    }
   
   static int XOR(int a, int b)
   {
       if(a == b)
        {
            return 0;
        }
       else 
        {
            return 1;
        }
   }
   
   static String function(String key, String tweak, int k, int n, double EncryptedSide)
   {   
                                                                           /* Function-Key generation. */
     String FunctionOut = new String();
     int padding, padding_;
     EncryptedSide = EncryptedSide * k;
     EncryptedSide = BinaryConversion(EncryptedSide);
     String EncryptedSide1 = new String(EncryptedSide);
     key = key.concat(EncryptedSide1); 
     FunctionOut = key.concat(tweak);
     padding_ = FunctionOut.length;
     padding = padding_ % n;
   
     for(int i = 0; i = n - padding; i++)
       {
             FunctionOut = FunctionOut.concat("0");                         /* Concatenating with 0's. Now, key2 is multiple of 'n'. */ 
       }  
   
     int l, count = 0, m;
     int[] Function = new int[128];
     m = 2 * n;
     
    /* Parsing the Bit-String into multiple of n-length. */
    
     if(padding > 0)
      {
        for(i = 0; i < n; i++)
          {
             int FunctionOut1 = new int[1];
             int FunctionOut2 = new int[1];
             FunctionOut1 = new int(FunctionOut[i]);
             FunctionOut2 = new int(FunctionOut[m + i]);
             Function[i] = XOR(FunctionOut1, FunctionOut2);
          }
      }
    while(i < padding_)
    {
      int j = 0;
      for(i = m; i < m + n; i++)
      {
        int FunctionOut1 = new int[1];
        FunctionOut1 = new int(FunctionOut[i]);
        Function[j] = XOR(Function[j], FunctionOut1);
        j++;
      }
      m = m + n;
    }
 }
    
/*****  Key Permutation with each i-th round before Function call. *****/
/* 'a' is a large number. */
/* 'b' is equal to Array_Size. */
/* main function is ignored. Just function for KeyPermutation is shown. */

    static class power                                                               /* object creation as power. */
    {
      double number;
    } 
   static void modulus(double a, int Round, double b, power s1)
   {
     double num = 1;    
     for(int i = 0; i < Round; i++)
     {
       num = num * a;                                                                /* Calculation of power of 'a'. */
     }
     s1.number = num % b;                                                            /* Mod with respect to Array_Size. */
   }
   static void Key_Permutation(String[] Key_Generated, int Round, double a, double b )
     {
        modulus(a, Round, b, s1);
        s1.number = Key_Generated[s1.number];                                       /* s1.number is the Returned KeyPermuted value.*/
     }

//  public static void main(String args[])
//    {
//       power s1 = new power();                                                     /* s1 assigned as object named power. */
//       Key_Permutation(Key_Generated, Round, a, b, s1);                            /* Permutation call; all the types provided are considered to be defined. */
//    }    

    
   static String EncryptedNumber(double A[], int n, int i, double key[], double tweak[])             /* A[] is input bit-string.*/
   {                                                                   
      int m;                                     /* nos. of rounds. */                                                                                        /* Nos. of rounding to be done. */
      int[] LeftEncrypted1 = new int[n];
      int[] RightEncrypted1 = new int[64 - n];
      for(int j = 0; j < n; j++)
        {
           LeftEncrypted1[j] = A[j];
        }
      for(int j = 0; j < 64 - n; j++)
        {
           RightEncrypted1[j] = A[j + n];
        }
      String LeftEncrypted = new String(LeftEncrypted1);
      String RightEncrypted = new String(RightEncrypted1);
      for(i = 0; i < m; i++)
      {                                                                         
        if(i%2 == 0)
        {
          LeftEncrypted = XOR(LeftEncrypted, function(key, tweak, i, n, RightEncrypted));               /* Each Round new function Generation with respect to RightEncrypted. */
        }
        else
        {
          RightEncrypted = XOR(RightEncrypted, function(key, tweak, i, n, LeftEncrypted));               /* Each Round new function Generation with respect to LeftEncrypted.. */                                        
        }
      }     
   }
   
   public static void main(String[] args)                                              /* Argc and Argv[] will lead to uint64_t functioning. */
   {
     int A[] = new int[16];                                                            /* */
     int n;                                                                            /* n is length at which string to be broken. */
     String key = new String();                                                                /* An unique random key from the Generated set. */
     String tweak = new String();                                                    /* An unique random tweak from the Generated set. */
     power s1 = new power();                                                     /* s1 assigned as object named power. */
     EncryptedNumber(A, n, key, tweak);
      int i = 2;
       char Key_Generated[] = new char[pow(2, 128)];                         /* Max. size allocation of Array.*/
       Key_Generated[0] = '0';
       Key_Generated[1] = '1';
       for(double j = 1; j < Key_Generated.length; j++)                      /* Dynamic allocation of sizeof Key_Generated Array */
        {
           if(Key_Generated.length < pow(2, 128))
             {
                String k1 = new String();
                k1 = Key_Generated[j];
                k1 = k1.concat(Key_Generated[0]);
                Key_Generated[i] = k1;  /* String concatenation with 0's. */
                i++;
                k1 = Key_Generated[j];
                k1 = k1.concat(Key_Generated[1]);
                Key_Generated[i] = k1;  /* String concatenation with 1's. */
                i++;
             }
           else
             {
               break;
             }
        }
       for(i = 0; i < Key_Generated.length; i++)
        {
           k1 = Key_Generated[i];
           if(k1.length < 128)
             {
                 String zero = new String();
                 zero = "0";
                 for(j = 1; j < 128 - k1.length; j++)
                 {
                     zero = zero.concat("0");
                 }
                 Key_Generated[i] = zero.concat(k1);                                 /* Conversion into 128 bits-string. */
             }
        }    
   }
}
