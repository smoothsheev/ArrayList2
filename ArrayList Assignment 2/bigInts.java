import java.util.ArrayList;

class bigInts {
    
    public static ArrayList<Integer> sum( ArrayList<Integer> nums1, ArrayList<Integer> nums2 ) {
        ArrayList<Integer> sum = new ArrayList<Integer>();
        int largest = 1;
   
    if (nums2.size() > nums1.size()) {
    largest = nums2.size();  
    } else
    largest = nums1.size();
    int carry = 0;
    for (int z = largest-1; z >= 0; z--) {   
     int a = nums1.get(z) + nums2.get(z) + carry;
     int r = a % 10;
     carry = a / 10;
     sum.add(0, r);  
    }
    if (carry == 1) {
     sum.add(0, 1);   
    }
    return sum;
}
    
    
    
    public static void main (String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<Integer>();
        ArrayList<Integer> nums2 = new ArrayList<Integer>();
        nums1.add(5);
        nums1.add(0);
        nums2.add(7);
        nums2.add(0);
        System.out.println("Original BigInts: " + nums1 + ", " + nums2);
        System.out.println("Sum of BigInts: " + sum(nums1, nums2));
        
  
    }   
}
