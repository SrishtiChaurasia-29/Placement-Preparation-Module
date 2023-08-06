class solve {
    public boolean graphColoring(boolean graph[][], int m, int n) {
        
        int [] color= new int [n];
        
        if(dfs(graph, n, 0, color, m)){
            return true;
        }
        
        return false;
    }
    
    
    private boolean dfs(boolean graph[][], int n, int node, int [] color, int m){
        
        if(node==n) return true;
        
        for(int i=1; i<=m; i++){
            if(isSafe(graph, n, node, color, i)){
                color[node]=i;
                if(dfs(graph, n, node+1, color, m)){
                    return true;
                }
                color[node]=0;
            }
        }
        return false;
    }
    
    
    private boolean isSafe(boolean graph[][] , int n, int node, int [] color, int c){

        /*
        Inside the loop, the if statement if(graph[node][i] && color[i]==c) 
        checks if there is an edge between the current node node and node i 
        in the graph, and if the color of node i is the same as the color c
        that we want to assign to node.
        */
        
        for(int i=0; i<n; i++){
            if(graph[node][i] && color[i]==c){
                return false;
            }
        }
        return true;
    }
}