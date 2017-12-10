/***** Generation of Random Function before XOR with the parsed other side block. *****/
/* In general, len(key) has the largest bit-length among the len(tweak), len(EncryptedSide) and so on*/
/* Max. len(PlainText) = 128 Bits. */
/* Max. len(key) = 128 Bits. */

public class function(uint64_t key, uint64_t tweak, int i, int n, uint64_t EncryptedSide, int BlockSize)
   {
      int i, padding, padding_, padding1, padding_1, padding2, padding_2;                                  
      uint64_t key1[n], key2[n];                                /* String store. */
   
      padding_ = strlen(key) / n;                              /* To know the Multiple of n for Function generation. */
      padding = strlen(key) % n;                               /* Check the length to be padded. */
      if(strlen(key) > n)
          {
             for(i = strlen(key) - padding; i < strlen(key); i++)
                {
                   static int count = 0;
                   key1[count] = key[i];                         /* Last Bits of strings stored. */
                   count++;
                }
             for(i = 0; i < n - padding; i++)
                {
                   key1 = '0' + key1;                           /* Concatenating with 0's. Now, key1 is multiple of 'n'. */
                }
          }
      else
         {
             key1 = key;
             for(i = n - padding; i < n; i++)
                {
                   key1 = '0' + key1;
                }
         }
   
      count = 0;
      padding_1 = (BlockSize - n) / n;                          /* To know the Multiple of n for Function generation. */
      padding1 = (BlockSize - n) % n;  
      if(BlockSize > n + 1)
        {
           for(i = BlockSize - n - padding1; i < BlockSize - n; i++)
              {
                  key2[count] = EncryptedSide[i];              /* Last Bits of strings stored. */
                  count++;
              }
          for(i = 0; i <= n - padding1; i++)
             {
                 key2 = '0' + 'key2';                         /* Concatenating with 0's. Now, key2 is multiple of 'n'. */
             }
       } 
      else
         {
            key1 = EncryptedSide;
            for(i = n - padding1; i < n; i++)
               {
                  key1 = '0' + key1;
               }
         }
   
      count = 0;
      padding_2 = strlen(tweak) / n;                         /* To know the Multiple of n for Function generation. */
      padding2 = strlen(tweak) % n;
   
      if(strlen(tweak) > n)
        {
           for(i = strlen(tweak) - padding2; i < strlen(tweak); i++)
              {
                  key2[count] = tweak[i];                    /* Last Bits of strings stored. */
                  count++;
              }
          for(i = 0; i < n - padding2; i++)
             {
                 key2 = '0' + key2;                         /* Concatenating with 0's. Now, key2 is multiple of 'n'. */
             }
        }
      else
         {
             key2 = tweak;
             for(i = n - padding2; i < n; i++)
                {
                    key2 = '0' + key2;
                }
        }
   
     int d1, d2;
     if(padding_1 < padding_2)                         /* tweak-multiple bigger than oe equal to EncryptedSide-multiple. */
       {
           if(padding_ > padding_2)
           {
           
           }
          else
          {
          
          }
       }
     else if(padding_1 >= padding_2)                     /* Reverse case; padding_ > padding_2.*/
       {
          
       }
   }
