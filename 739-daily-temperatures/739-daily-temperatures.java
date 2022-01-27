class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<Integer> st = new Stack<Integer>();
        
        for (int i=0; i<n; i++) {
            int count = 1;
            while (!st.isEmpty() && temperatures[i] > temperatures[st.peek()]) {
                int indx = st.pop();
                result[indx] = i -indx;
            }
            st.push(i);
        }
        return result;
    }
}