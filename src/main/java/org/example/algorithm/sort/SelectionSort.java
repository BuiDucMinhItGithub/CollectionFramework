package org.example.algorithm.sort;

public class SelectionSort {

    // Do phuc tap la O(n^2) voi n la so luong phan tu, ^2 vi phai su dung 2 vong for

    void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // Tim phan tu be nhat trong mang chua duoc sap xep
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min_idx] > arr[j]) {
                    min_idx = j;
                }
            }

            // Hoan doi vi tri cua phan tu nho nhat cho phan tu dau tien cua mang khi chay for
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
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
        SelectionSort ob = new SelectionSort();
        int arr[] = { 64, 25, 12, 22, 11 };
        System.out.println("Mảng ban đầu:");
        ob.printArray(arr);
        ob.selectionSort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        ob.printArray(arr);
    }
}
