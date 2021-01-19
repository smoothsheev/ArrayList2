import java.util.ArrayList;

class sieveOfEratosthenes {
    
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
    
    
    
    public static void main (String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 2; i <= 100; i++) {
        nums.add(i);
    }
        System.out.println("Original List: " + nums);
        sieve(nums);
        System.out.println("Prime List: " + nums);
        
  
    }   
}
