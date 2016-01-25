package com.david.s;
public class MinK {  
  
    /** 
     *  
     * @param krr 
     * @param k 
     * @return 
     */  
    public static int[] minK(int krr[],int k){  
        int arr[] = new int[k];  
        for(int i = 0;i<k;i++)  
            arr[i] = krr[i];  
        buildHeap(arr);  
        for(int j = k;j<krr.length;j++){  
            if(krr[j]<arr[0]){  
                arr[0] = krr[j];  
                maxHeap(arr,1,k);  
            }  
        }  
        return arr;  
    }  
    /** 
     * 建最大堆 
     * @param arr 
     */  
    public static void buildHeap(int arr[]){  
        int heapsize = arr.length;  
        for(int i=arr.length/2;i>0;i--)  
            maxHeap(arr,i,heapsize);  
    }  
    /** 
     * 调整为最大堆 
     * @param arr 
     * @param i 
     * @param heapsize 
     */  
    public static void maxHeap(int arr[],int i,int heapsize){  
        int largest = i;  
        int left = 2*i;  
        int right = 2*i+1;  
        if(left<=heapsize&&arr[i-1]<arr[left-1])  
            largest = left;  
        if(right<=heapsize&&arr[largest-1]<arr[right-1])  
            largest = right;  
        if(largest!=i){  
            int temp = arr[i-1];  
            arr[i-1] = arr[largest-1];  
            arr[largest-1] = temp;  
            maxHeap(arr,largest,heapsize);  
        }  
    }  
    public static void main(String[] args) {  
        int krr[] = {1,3,4,2,7,8,9,10,14,16};  
        int arr[] = minK(krr,4);  
        for(int i =0;i<arr.length;i++)  
            System.out.println(arr[i]);  
  
    }  
  
}  