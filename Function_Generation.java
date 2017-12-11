/***** Generation of Random Function before XOR with the parsed other side block. *****/
/* In general, len(key) has the largest bit-length among the len(tweak), len(EncryptedSide) and so on*/
/* Max. len(PlainText) = 128 Bits. */
/* Max. len(key) = 128 Bits. */

public class function(uint64_t key, uint64_t tweak, int k, int n, uint64_t EncryptedSide, int BlockSize)
   {   
                                                          /* Function-Key generation. */
     uint64_t FunctionOut;
     int padding, padding_;
     key = key * k;
     EncryptedSide = EncryptedSide * k;
     EncryptedSide = strcat(key, EncryptedSide); 
     FunctionOut = BinaryConversion(EncryptedSide);
     FunctionOut = strcat(FunctionOut, tweak);
     padding_ = strlen(FunctionOut);
     padding = padding_ % n;
   
     if(padding_ > n)
      {
          for(i = 0; i < n - padding; i++)
             {
                 FunctionOut = FunctionOut +  '0';                         /* Concatenating with 0's. Now, key2 is multiple of 'n'. */
             }
      }   
   
     int l;
     padding_ = strlen(FunctionOut);
     l = padding_ / n;
     uint64_t Function[l];
     FunctionOut = 
   }



