public class mergeSortAlgorithm {
     

    static void merge(int [] arr,int s,int mid,int e){
        int n1 = mid - s + 1;
        int n2 = e - mid;
  
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
  
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[s + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
  
        // Initial index of merged subarray array
        int k = s;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }


    static void mergeSort(int [] arr, int s,int e){
        int mid;
        if(s<e){
        mid=s+(e-s)/2;
        
        mergeSort(arr, s, mid);
        mergeSort(arr, mid+1, e);
        merge(arr,s,mid,e);
        }

    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String [] args) {
		int [] arr= {7,6,10,5,9,2,1,15,44,33,77,76,9,100,23};
        int n=arr.length;

        mergeSort(arr, 0, n-1);

        System.out.println("sorted array :");
        printArray(arr);

    }
    
}
