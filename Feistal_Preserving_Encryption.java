/***** This is the time for Java .  ******/

class Simple
{
   public class function(uint64_t key[], uint64_t tweak[], int i)
   {
     
   }
   
   public static void EncryptedNumber(int A[], int n, uint64_t key[], uint64_t tweak[])             /* A[] is input bit-string.*/
   {                                                                   
      int i;
      int m;                                                                                        /* Nos. of rounding to be done. */
      System.Stdln.Input(m);
      for(i = 0; i < m; i++)
      {                                                                         
        if(i%2 == 0)
        {
          function(key, tweak, i, RightEncrypted);                                     /* Each Round new function Generation. */
        }
        else
        {
          function(key, tweak, i, LeftEncrypted);                                      /* Each Round new function Generation. */                                        
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
