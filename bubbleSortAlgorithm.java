// WAP to sort an array using Bubble Sort Algorithm.

public class bubbleSortAlgorithm {
    public static void main(String [] args){
        int [] arr= {7,6,10,5,9,2,1,15,44,33,77,76,9,100,23};
        int count=1;
        int n=arr.length;
        while(count<n){
            for(int i=0; i<n-count; i++)
            {
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
                
            }
            count++;
        }

        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
