class MedianFinder {



 PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
    public MedianFinder() {
        
    }
    public void addNum(int num) {
        if(maxHeap.size() == 0 || maxHeap.peek() >= num){
            maxHeap.add(num);
        }
        else{
            minHeap.add(num);
        }
        if(maxHeap.size() > minHeap.size() + 1){
            minHeap.add(maxHeap.poll());
        }
        if(minHeap.size() > maxHeap.size() + 1){
            maxHeap.add(minHeap.poll());
        }
    }
    
    public double findMedian() {
       double median = 0.0;
       if(minHeap.size() > maxHeap.size()){
           median = minHeap.peek();
       }else if(maxHeap.size() > minHeap.size()){
           median = maxHeap.peek();
       }else{
           median = (minHeap.peek() + maxHeap.peek())/2.0;
       }
      return median;
    }
}
