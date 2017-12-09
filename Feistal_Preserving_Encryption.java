/***** This is the time for Java .  ******/

class Simple
{
   public class function(uint64_t key[], uint64_t tweak[], int m)
   {
   
   }
   
    public static void EncryptedNumber(int A[], int n, uint64_t key[], uint64_t tweak[])             /* A[] is input bit-string.*/
   {                                                                   
      int i;
      int m;                                                                                        /* Nos. of rounding to be done. */
      System.Stdln.Input(m);
      for(i = 0; i < m; i++)
      {
        function(key, tweak, m);
      }     
   }
   
   public static void main(String[] args)                                                 /* Argc and Argv[] will lead to uint64_t functioning. */
   {
     int A[16];
     int n;                                                                               /* n is length at which string to be broken. */
     System.in.println(n);
     uint64_t key[128]; 
     uint64_t tweak[128];
     EncryptedNumber(A, n, key, tweak);
   }
  
}
