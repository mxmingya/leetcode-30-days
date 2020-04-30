class FirstUnique {
    Map<Integer, Integer> map = new HashMap<>();
    Stack<Integer> s = new Stack<>();
    public FirstUnique(int[] nums) {
       for (int num : nums) {
           if (map.containsKey(num)) {
               if (map.get(num) == 1) {
                   Stack<Integer> holder = new Stack<>();
                   while (!s.isEmpty()) {
                        if (s.peek() == num) {
                            s.pop();
                            break;
                        } else {
                            holder.push(num);
                        }
                    }
                   while (!holder.isEmpty()) {
                       s.push(holder.pop());
                   }
               }
               map.put(num, map.get(num)+1);
           } else {
               map.put(num, 1);
               s.push(num);
           }
       }
    }
    
    public int showFirstUnique() {
         return s.peek();
    }
    
    public void add(int num) {
       if (map.containsKey(num)) {
           if (map.get(num) == 1) {
               Stack<Integer> holder = new Stack<>();
               while (!s.isEmpty()) {
                    if (s.peek() == num) {
                        s.pop();
                        break;
                    } else {
                        holder.push(num);
                    }
                }
               while (!holder.isEmpty()) {
                   s.push(holder.pop());
               }
           }
           map.put(num, map.get(num)+1);
           } else {
               map.put(num, 1);
               s.push(num);
           }
    }
}

/**
 * Your FirstUnique object will be instantiated and called as such:
 * FirstUnique obj = new FirstUnique(nums);
 * int param_1 = obj.showFirstUnique();
 * obj.add(value);
 */
