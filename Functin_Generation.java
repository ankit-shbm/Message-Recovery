/***** Generation of Random Function before XOR with the parsed other side block. *****/
/* Max. len(PlainText) = 128 Bits. */
/* Max. len(key) = 128 Bits. */

public class function(uint64_t key, uint64_t tweak, int i, int n, uint64_t EncryptedSide, int BlockSize)
   {
      int i, padding;                                  
      uint64_t key1[n];                                /* String store. */
      padding = key % n;                               /* Check the length to be padded. */
      for(i = n - padding; i < '\0'; i++)
      {
        static int count = 0;
        key1[count] = key[i];                         /* Last Bits of strings stored. */
      }
      for(i = 0; i <= padding; i++)
      {
        key1 = '0' + 'key1';                          /* Concatenating with 0's. Now, key1 is multiple of 'n'. */
      }
      count = 0;
      padding = (BlockSize - n) % n;
      for(i = n - padding; i < '\0'; i++)
      {
        static int count;
        key2[count] = EncryptedSide[i];
      }
      for(i = 0; i <= padding; i++)
      {
        key1 = '0' + 'key1';                          /* Concatenating with 0's. Now, key1 is multiple of 'n'. */
      }
   }
