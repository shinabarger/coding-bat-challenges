public boolean firstLast6(int[] nums) 
{
  int lengthOfNums = nums.length -1 ;
  

  if (nums[0] == 6) {
  
  return true;
  } 
else if (nums[lengthOfNums] == 6) {

    return true;
  }
  
else return false;
}
