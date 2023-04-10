// WAP to sort an array using Selection Sort Algorithm.

public class selectionSortAlgorithm {

public static void main(String[] args){
    int [] arr= {7,6,10,5,9,2,1,15,44,33,77,76,9,100,23};
    
        int n=arr.length;
       
            for(int i=0; i<n-1; i++)
            {
                int indexOfMin=i;
                for(int j=i+1;j<n;j++){
                    if(arr[j]<arr[indexOfMin]){
                        indexOfMin=j;
                    }
                    int temp=arr[i];
                    arr[i]=arr[indexOfMin];
                    arr[indexOfMin]=temp;
                }
                
            }

        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}