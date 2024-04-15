import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    
    int size = in.nextInt();
    ArrayList<Integer> nums = new ArrayList<>();
    ArrayList<Integer> count = new ArrayList<>();
    
    for (int i = 0; i< size; i++){
      Integer num = in.nextInt();
      Boolean found = true;
      for (int j = 0; j<nums.size();j++){
        if (nums.get(j) == num){
            count.set(j, count.get(j)+1) ;
            found=false;
            break;
        }
      }
      if (found){
        nums.add(num);
        count.add(1);
      }
    }   

    Integer ans = 0;
    Integer max = 0;

    for (Integer i = 0; i < count.size();i++){
      if (count.get(i) > count.get(max)){
        max = i;
      }
    }
    System.out.println(nums.get(max));
    in.close(); 

  }
}
