class Solution {
    public boolean containsDuplicate(int[] nums) {

        //create hashset to store integers 
        Set<Integer> intSet = new HashSet<>();

        //iterate over each element
        for(int num : nums){

            //chech the number in the hashset
            if(intSet.contains (num))
            return true;

            //add the number to hashset
            intSet.add(num);
        }
        return false;
        


    }
}