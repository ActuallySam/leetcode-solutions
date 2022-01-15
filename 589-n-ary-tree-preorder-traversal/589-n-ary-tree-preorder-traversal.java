/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<Integer> preorder_list = new ArrayList<Integer>();
    public List<Integer> preorder(Node root) {
        
        if (root == null)
            return preorder_list;
        
        preorder_list.add(root.val);
        
        for (int i=0; i<root.children.size(); i++) 
            preorder(root.children.get(i));
        
        return preorder_list;
    }
//     public void dfs(Node root, List<Integer> postorder) {
//         if (root == null)
//             return;
        
//         postorder.add(root.val);
//         for (int i=0; i<root.children.size(); i++) 
//             dfs(root.children.get(i), postorder);
//     }
}