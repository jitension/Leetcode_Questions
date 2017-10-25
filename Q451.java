/* 451. Sort Characters By Frequency
Given a string, sort it in decreasing order based on the frequency of characters.
*/
class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character, Integer> frequency = new HashMap<>();
        StringBuilder output = new StringBuilder();
        
        for(int i=0;i<s.length();i++){
           
            Character key = s.charAt(i); 
            
            if(frequency.containsKey(key)){
                frequency.put(key, frequency.get(key)+1);
            }
            else{
                  frequency.put(key , 1);
            }
        }
         for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
             System.out.print(entry.getKey()+" : "+entry.getValue() + "\t");
            }

                
        SortedSet<Map.Entry<Character, Integer>> sortedset = new TreeSet<Map.Entry<Character, Integer>>(
            new Comparator<Map.Entry<Character, Integer>>() {
                @Override
                public int compare(Map.Entry<Character, Integer> e1,
                        Map.Entry<Character, Integer> e2) {
                  
                    if(e2.getValue() == e1.getValue() && e2.getKey() == e1.getKey()){
                        return 0;
                    }
                   else if(e2.getValue() >= e1.getValue() && e2.getKey() != e1.getKey()){
                     return 1;  
                    } 
                    return -1;
                }
            });

        sortedset.addAll(frequency.entrySet());
//         for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
//     System.out.print(entry.getKey()+" : "+entry.getValue() + "\t");
// }

        System.out.println();
        System.out.println(sortedset);
        
        for(Map.Entry<Character, Integer> object:sortedset ){
            int count = object.getValue();
            char key = object.getKey();
            while(count > 0){
                output.append(key);
                count--;
            }
        }
        return output.toString();
    }
}
