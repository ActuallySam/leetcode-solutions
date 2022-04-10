class Solution {
    public int calPoints(String[] ops) {
        List<Integer> list = new ArrayList<Integer>();
        int n = ops.length;
        
        for (int i=0; i<n; i++) {
            if (ops[i].equals("C"))
                list.remove(list.size() - 1);
            else if (ops[i].equals("D")) {
                int num = 2 * list.get(list.size() - 1);
                list.add(num);
            }
            else if (ops[i].equals("+")) {
                int num = list.get(list.size() - 1) + list.get(list.size() - 2);
                list.add(num);
            }
            else
                list.add(Integer.valueOf(ops[i]));
        }
        
        int sum = 0;
        for (int i=0; i<list.size(); i++) 
            sum += list.get(i);
        
        return sum;
    }
}