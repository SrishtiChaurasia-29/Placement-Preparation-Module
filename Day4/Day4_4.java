int maxLen(int arr[], int n)
    {
        HashMap<Integer, Integer> h = new HashMap<>();
        int cursum = 0;
        int len = 0;
        for(int i=0; i<n; i++){
            cursum+=arr[i];
            if(cursum==0) len = i+1;
            
            if(!h.containsKey(cursum)){ //if sum repeats don't add
                h.put(cursum, i);
            }
            if(h.containsKey(cursum)){  
                len = Math.max(len, i-h.get(cursum));
            }
        }
        return len;
    }