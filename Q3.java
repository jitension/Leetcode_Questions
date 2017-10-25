/*3. Longest Substring Without Repeating Characters
Given a string, find the length of the longest substring without repeating characters.
*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0, tempMax = 0;
        HashSet<Character> temp = new HashSet<Character>();
        for(int i=0;i<s.length();i++){
            temp.clear();
            temp.add(s.charAt(i));
            tempMax = 1;
            for(int j=i+1;j<s.length();j++){
                if(!temp.contains(s.charAt(j))){
                    temp.add(s.charAt(j));
                    tempMax++;
                }
                else{
                    break;
                }
            }
            if (max < tempMax){
                max = tempMax;
            } 
        }
        return max;        
    }
}
