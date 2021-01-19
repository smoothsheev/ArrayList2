import java.util.ArrayList;

class goldbachConjecture {
    
    public static ArrayList<Integer> sieve( ArrayList<Integer> nums ) {
        
    int p = 2;
        
      for (int z = 0; z <= nums.size()-1;z++) {
         p = nums.get(z);
      for (int k = z+1; k <= nums.size()-1; k++) {
        if (nums.get(k) % p == 0) {
        nums.remove(k); 
        k--;
        }
        }
        
    }
    return nums;
}
  

public static String gold( ArrayList<Integer> nums, int orig ) { 
    for (int i = nums.size() - 1; i >= 0; i--) {
     int x = nums.get(i);
     for (int k = nums.size() - 1; k >= 0; k--) {
     int y = nums.get(k);
     if (x + y == orig) {
       return x + "+" + y;
        }
     }
    }
     return "ERROR";
} 
    public static void main (String[] args) {
         int orig = 1000;
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 2; i <= orig; i++) {
        nums.add(i);
    }
        sieve(nums);
        System.out.println("Original Number: " + orig);
        System.out.println("The prime numbers " + gold(nums, orig) + " equal " + orig);       
  
    }   
}
