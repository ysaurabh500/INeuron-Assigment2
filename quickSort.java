//WAP to sort an array using Quick Sort Algorithm.

public class quickSort {

    static int partition(int[] arr,int low,int high){
            
        int pivot=arr[low];
        int start=low;
        int end= high;

        while(start<end){
            while(arr[start]<=pivot && start<end){
                start++;
            }
            while(arr[end]>pivot  && (end!=0)){
                end--;
            }
            if(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[end];
        arr[end]=temp;
        return end;
    }

      static void quickSortMethod(int[] arr,int low,int high){
        if(low<high){
        int loc =partition(arr, low, high);
        quickSortMethod(arr,low, loc-1);
        quickSortMethod(arr,loc+1, high);

        }
    }

    /* A utility function to print array of size n */
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

        quickSortMethod(arr,0,n-1);

        System.out.println("sorted array :");
        printArray(arr);

    }

}

