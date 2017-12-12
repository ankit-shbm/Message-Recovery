/***** Generation of Random Function before XOR with the parsed other side block. *****/
/* In general, len(key) has the largest bit-length among the len(tweak), len(EncryptedSide) and so on*/
/* Max. len(PlainText) = 128 Bits. */
/* Max. len(key) = 128 Bits. */

public class String function(String key, String tweak, int k, int n, String EncryptedSide, int BlockSize)
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
     int j = 0;
     padding_ = length(FunctionOut);
     l = padding_ / n;
     String Function;
     m = n;
    /* Parsing the Bit-String into multiple of n-length. */
   while(i < padding_ - m)
   {
     for(i = j; i < m; i++)
     {
        Function[i] = FunctionOut[m + i];
        
     }
      count = count + 2;
      j = (count - 1) * n;
      m = count * n;
   }
   
 }



