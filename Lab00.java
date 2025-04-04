public class Lab00
{
   public static void main(String[] args) {
      /* declaring and initializing some variables */
      int x = 5;
      String y = "hello";
      double z = 9.8;
      System.out.println("x: " + x + ", y: " + y + ", z: " + z);

      /*  a list (make an array in java) */
      int[] nums = {3, 6, -1, 2};
      for (int j : nums) {
         System.out.print(j + "\t"); //\t for tab
      }

      /*  call a function */
      int numFound = char_counts(y, 'l');
      System.out.println("Found: " + numFound);

      /*  a counting for loop */
      for (int i = 1; i < 11; i++) {
         System.out.print(i + "\t");
      }
   }

      /*  make a function */
      public static int char_counts(String s, char c){
         int count = 0;
         int i = 0;
         for(int ch = 0; ch< s.length(); ch++){
            if(s.charAt(ch) == c){
               count += 1;
            }
         }
         return count;
      }

}
