/* 690. Employee Importance
You are given a data structure of employee information, which includes the employee's unique id, his importance value and his direct subordinates' id.
*/

/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
class Solution {
     HashMap<Integer,Integer> importance = new HashMap<>();
     HashMap<Integer, List<Integer>> subordinates = new HashMap<>();
     int max = 0;
     Queue<Integer> temp = new LinkedList<Integer>();
    
    public int calMax(Queue<Integer> child){
   
        while(!child.isEmpty()){
            int key = child.remove();
            max += importance.get(key);
            
            List<Integer> tempSub = subordinates.get(key);
             for(Integer sub: tempSub){
                    child.add(sub);
             }
            calMax(child);
        }
                return max;
        }
    
    
    public int getImportance(List<Employee> employees, int id) {            
        for(Employee emp : employees){
            importance.put(emp.id,emp.importance);
            subordinates.put(emp.id, emp.subordinates);
        }
      
        temp.add(id);
        return calMax(temp);
        
    }
}
