
public void bubbleSort(intarr[])
 {
        int n = arr.length;
        int i = 0;

        while(i < n-1) {
             int j = 0;
             while(j < n-i-1){
                if(arr[j] >arr[j+1])
                 {
                     // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                j++;
            }
            i++;
        }
}
