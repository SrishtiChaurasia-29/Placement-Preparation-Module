class Solution
{
    static int[] topoSort(int v, ArrayList<ArrayList<Integer>> adj) 
    {
        int k = 0;
        Stack<Integer> s = new Stack<>();
        boolean vis[] = new boolean[v];
        int[] ans = new int[v];
        for(int i=0; i<v; i++)
        helper(i, adj, s, vis);

        while(!s.isEmpty())
        ans[k++] = s.pop();
        return ans;
    }
    static void helper(int i, ArrayList<ArrayList<Integer>> adj, Stack<Integer> s, boolean vis[])
    {
        if(vis[i])
        return;

        for(int num: adj.get(i))
            helper(num, adj, s, vis);
    
        s.push(i);
        vis[i] = true;
    }
}