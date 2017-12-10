/***** Generation of Random Function before XOR with the parsed other side block. *****/
/* Max. len(PlainText) = 128 Bits. */
/* Max. len(key) = 128 Bits. */

public class function(uint64_t key, uint64_t tweak, int i, int n, uint64_t EncryptedSide, int BlockSize)
   {
      int i, padding, padding1, padding2;                                  
      uint64_t key1[n], key2[n];                                /* String store. */
   
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
                   key1 = '0' + key1;                          /* Concatenating with 0's. Now, key1 is multiple of 'n'. */
                }
          }
      else
         {
             for(i = n - padding; i < n; i++)
                {
                   key1 = '0' + key;
                }
         }
   
      count = 0;
      padding1 = (BlockSize - n) % n;
      if(strlen(BlockSize - n) > n)
      {
      for(i = n - padding1; i < '\0'; i++)
      {
        key2[count] = EncryptedSide[i];              /* Last Bits of strings stored. */
        count++;
      }
      for(i = 0; i <= padding1; i++)
      {
        key2 = '0' + 'key2';                         /* Concatenating with 0's. Now, key2 is multiple of 'n'. */
      }
      } 
      else
      {
        for(i = n - padding1; i < n; i++)
        {
          key1 = '0' + key;
        }
      }
   
      count = 0;
      padding2 = strlen(tweak) % n;
      if(strlen(tweak) > n)
      {
      for(i = n - padding1; i < '\0'; i++)
      {
        key2[count] = EncryptedSide[i];              /* Last Bits of strings stored. */
        count++;
      }
      for(i = 0; i <= padding1; i++)
      {
        key2 = '0' + key2;                         /* Concatenating with 0's. Now, key2 is multiple of 'n'. */
      }
      }
      else
      {
        for(i = n - padding2; i < n; i++)
        {
          key2 = '0' + ;
        }
      }
   }
