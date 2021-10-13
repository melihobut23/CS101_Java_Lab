public class enumerator{
   public static void even_number(int num, int ending_number, int no_of_digits)
      
   {
      
      /*
       * 
       * If the number is greater than or equal to ending number return.
       * 
       * Used as a condition to terminate recursive functionality
       * 
       */
      
      if (num >= ending_number)
         
         return;
      
      /* Check if the number is even or not */
      
      if ((num % 2) == 0) {
         
         int n = num;
         
         /* Initialize the two digits to -1 which are used to compare */
         
         int cur_digit = -1;
         
         int prev_digit = -1;
         
         do {
            
            /* If first time checking */
            
            if ((cur_digit == -1) && (prev_digit == -1)) {
               
               /* Get the Most significant digit */
               
               prev_digit = n % 10;
               
               n = n / 10;
               
               /* Get the digit which is before Most significant digit */
               
               cur_digit = n % 10;
               
               n = n / 10;
               
            } else {
               
               /* Get the remaining digits to compare */
               
               prev_digit = cur_digit;
               
               cur_digit = n % 10;
               
               n = n / 10;
               
            }
            
            /*
             * 
             * Compare each digit with its previous one.
             * 
             * If the previous one is less than the current
             * 
             * one stop processing that number
             * 
             * Eg: for 120, In first iteration prev_digit = 0 and
             * 
             * cur_digit = 2;
             * 
             */
            
            if (prev_digit <= cur_digit)
               
               break;
            
         } while (n == num);
         
         /* Print the number that met all the conditions */
         
         if ( (n % 2) != 0 && (prev_digit > cur_digit))
            
            System.out.println( num);
         
      }
      
      /* Call the function recursively */
      
      even_number(num + 1, ending_number, no_of_digits);
      
   }
   
   public static void main(String[] args) {
      //   ( int argc, char argv)
      
      
      int no_of_digits = 0;
      
      int starting_num = 1;
      
      int ending_num = 1;
      
      int i = 0;
      
      if (argc != 2) {
         
         System.out.println("Usage: ./a.out no_of_digits\n");
         
         System.out.println("Eg: ./a.out 3\n");
         
         return -1;
         
      }
      
      /* convert command line argument from string to integer */
      
      no_of_digits = atoi(argv[1]);
      
      /* Get starting number */
      
      /* Eg: if no_of_digits is 3, starting number should be 10*10*10 */
      
      for (i = 0; i < no_of_digits - 1; i++)
         
         starting_num *= 10;
      
      System.out.println("Starting Number : %d\n", starting_num);
      
      /* Find ending_number */
      
      /* Eg: If strating number is 100 ending number should be ((100 * 10) - 1 = 999) */
      
      ending_num = (starting_num * 10) - 1;
      
      /* Call even_number recursively to calculate and print the numbers */
      
      even_number(starting_num, ending_num, no_of_digits);
      
      System.out.println("\n");
      
      return 0;
      
   }
}
