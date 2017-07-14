public boolean sameFirstLast(int[] nums)
 {
  int arrayLength = nums.length-1;
  
 
 if (arrayLength > 0 && nums[0] == nums[arrayLength])
 
 {return true;
    }
  
   else if (arrayLength == 0) {
     
 return true;
     }
   
else return false;
}
