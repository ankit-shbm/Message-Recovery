/***** This is the time for Java .  ******/

class Simple
{
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
   }
  
}
