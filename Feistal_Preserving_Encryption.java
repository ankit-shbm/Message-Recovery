/***** This is the time for Java .  ******/

class Simple
{
    static void pow(int a, int b)
    {
      double num = 1;                                                            /* Double for more than 32 bits. */
        for(int i = 0; i < b; i++)
        {
          num = num * a;                                                         /* Multiplication of 2 with each round. */
        }
        return num;
    }
   
   static String function(String key, String tweak, int k, int n, String EncryptedSide, int BlockSize)
   {   
                                                                           /* Function-Key generation. */
     String FunctionOut;
     int padding, padding_;
     key = key * k;
     EncryptedSide = EncryptedSide * k;
     EncryptedSide = ("\0", key, EncryptedSide); 
     FunctionOut = BinaryConversion(EncryptedSide);
     FunctionOut = strcat(FunctionOut, tweak);
     padding_ = length(FunctionOut);
     padding = padding_ % n;
   
     if(padding_ > n)
      {
          for(i = 0; i < n - padding; i++)
             {
                 FunctionOut = FunctionOut +  '0';                         /* Concatenating with 0's. Now, key2 is multiple of 'n'. */
             }
      }   
   
     int l, count = 0, m;
     padding_ = length(FunctionOut);
     String Function;
     m = 2 * n;
    /* Parsing the Bit-String into multiple of n-length. */
     for(i = 0; i < n; i++)
     {
        Function[i] = XOR(FunctionOut[i], FunctionOut[m + i]);
     }
    while(i < padding_)
    {
      int j = 0;
      for(i = m; i < m + n; i++)
      {
        Function[j] = XOR(Function[j], FunctionOut[i]);
        j++;
      }
      m = m + n;
    }
 }
    
   /*****  Key Permutation with each i-th round before Function call. *****/
/* 'a' is a large number. */
/* 'b' is equal to Array_Size. */
/* main function is ignored. Just function for KeyPermutation is shown. */

   public static power                                                               /* object creation as power. */
    {
      double number;
    } 
   static void modulus(double a, int Round, double b, power s1)
   {
     double num = 1;    
     for(i = 0; i < Round; i++)
     {
       num = num * a;                                                                /* Calculation of power of 'a'. */
     }
     s1.number = num % b;                                                            /* Mod with respect to Array_Size. */
   }
   static void Key_Permutation(String[] Key_Generated, int Round, double a, double b, )
     {
        modulus(a, Round, b, s1);
        s1.number = Key_Generated[s1.number];                                       /* s1.number is the Returned KeyPermuted value.*/
     }

//  public static void main(String args[])
//    {
//       power s1 = new power();                                                     /* s1 assigned as object named power. */
//       Key_Permutation(Key_Generated, Round, a, b, s1);                            /* Permutation call; all the types provided are considered to be defined. */
//    }    

    
   static String EncryptedNumber(int A[], int n, uint64_t key[], uint64_t tweak[])             /* A[] is input bit-string.*/
   {                                                                   
      int i;
      int m;                                                                                        /* Nos. of rounding to be done. */
      System.Stdln.Input(m);

      / *** String Parsing in Right Encrypted and LeftEncrypted. ***/
      
      for(i = 0; i < m; i++)
      {                                                                         
        if(i%2 == 0)
        {
          LeftEncrypted[i + 1] = XOR(LeftEncrypted[i], function(key, tweak, i, n, RightEncrypted[i]));               /* Each Round new function Generation with respect to RightEncrypted. */
          RightEncrypted[i + 1] = RightEncrypted[i];
        }
        else
        {
          RightEncrypted[i + 1] = XOR(RightEncrypted[i], function(key, tweak, i, n, LeftEncrypted[i]));               /* Each Round new function Generation with respect to LeftEncrypted.. */                                        
          LeftEncrypted[i + 1] = LeftEncrypted[i];
        }
      }     
   }
   
   public static void main(String[] args)                                              /* Argc and Argv[] will lead to uint64_t functioning. */
   {
     int A[16];
     int n;                                                                            /* n is length at which string to be broken. */
     System.in.println(n);
     uint64_t key[128];                                                                /* An unique random key from the Generated set. */
     uint64_t tweak[128];                                                              /* An unique random tweak from the Generated set. */
     EncryptedNumber(A, n, key, tweak);
      int i = 2;
       String Key_Generated[] = new String[pow(2, 128)];                         /* Max. size allocation of Array.*/
       Key_Generated[0] = '0';
       Key_Generated[1] = '1';
       for(double j = 1; j < Key_Generated.length; j++)                      /* Dynamic allocation of sizeof Key_Generated Array */
        {
           if(Key_Generated.length < pow(2, 128))
             {
                Key_Generated[i] = cate(Key_Generated[j], Key_Generated[0]);  /* String concatenation with 0's. */
                i++;
                Key_Generated[i] = cate(Key_Generated[j], Key_Generated[1]);  /* String concatenation with 1's. */
                i++;
             }
           else
             {
               break;
             }
        }
      for(i = 0; i < Key_Generated.length; i++)
        {
           while(length(Key_Generated[i] < 128))
             {
                 cate( '0', Key_Generated[i]);                                 /* Conversion into 128 bits-string. */
             }
        }    
   }
  
}
