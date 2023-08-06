class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        if(k > arr1.length + arr2.length)
        {
            return 0;
        }
        int i=0;int j=0;
        int count =0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i] < arr2[j])
            {
                count++;
                if(count == k)
                {
                    return arr1[i];
                }
                i++;
            }
            else
            {
                count++;
                if(count == k)
                {
                    return arr2[j];
                }
                j++;
            }
        }
        while(j<arr2.length)
        {
            count++;
            if(count == k)
            {
                return arr2[j];
            }
            j++;
        }
        while(i < arr1.length)
        {
            count++;
            if(count == k)
            {
                return arr1[i];
            }
            i++;
        }
        return 0;
    }
}