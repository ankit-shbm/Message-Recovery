/***** Generation of Random Function before XOR with the parsed other side block. *****/

   public class function(uint64_t key, uint64_t tweak, int i, int n, uint64_t EncryptedSide)
   {
      int i, padding;                                  /* Max. len(key) = 128 Bits. */
      uint64_t key1[n];                                /* String store. */
      padding = key % n;                               /* Check the length to be padded. */
      for(i = n - padding; i < '\0'; i++)
      {
        static int count = 0;
        key1[count] = key[i];
      }
      for(i = 0; i <= padding; i++)
      {
        key1 = '0' + 'key1';                           /* Concatenating with 0's. */
      }
      
   }
