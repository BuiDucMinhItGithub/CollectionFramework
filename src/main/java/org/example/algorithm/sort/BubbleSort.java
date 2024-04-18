package org.example.algorithm.sort;

public class BubbleSort {
    // So sanh lan lua tung phan tu
    // Do phuc tap la O(n^2) vi phai chay 2 lan for va n la so luong phan tu

    // Hàm sắp xếp nổi bọt
    void myBubble(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // In các phần tử của arr
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        BubbleSort ob = new BubbleSort();
        int arr[] = { 5, 1, 4, 2, 8 };
        System.out.println("Mảng ban đầu:");
        ob.printArray(arr);
        ob.myBubble(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        ob.printArray(arr);
    }
}
