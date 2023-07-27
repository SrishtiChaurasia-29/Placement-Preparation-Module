class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
         ArrayList<Integer> list = new ArrayList<>();
        solution(0, arr, 0, list, N);
        Collections.sort(list);
        return list;
    }
    
      public void solution(int i, ArrayList<Integer> nums, int sum, ArrayList<Integer> list,  int n){
       if(i==n)
       {
           list.add(sum);
          return;
       }

       sum= sum+nums.get(i);
       solution(i+1, nums, sum, list, n);
       sum = sum-nums.get(i);
       solution(i+1, nums, sum,list,  n);

  }
}