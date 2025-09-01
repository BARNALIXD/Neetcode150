class Solution {
    public boolean containsDuplicate(int[] nums) {

        //create a hashset to store the elements checked from the array
        HashSet<Integer> seenNumbers = new HashSet<>();

        //iterate through each element present in the array
        for (int num : nums){
            //check if the number is already there in the hashset
            if(seenNumbers.contains(num)){
                return true;
            }

            seenNumbers.add(num);
        }
        return false;
        
    }
}