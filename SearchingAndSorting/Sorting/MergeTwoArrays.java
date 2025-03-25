package Java.SearchingAndSorting.Sorting;

public class MergeTwoArrays {

    public static int[] mergeArrays(int A[], int B[]) {
    	//Your code goes here
        // merged array
        int C[] = new int[A.length + B.length];
        int i = 0, j = 0, k=0;

        // loop over A and B
        while (i < A.length && j < B.length) {
            // comparision for smaller element and put it in arr C
            if (A[i] < B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }
        // loop over arr A and copy remaining elements
        while (i < A.length) {
            // copy the element to arr C
            C[k++] = A[i++];
        }
        // loop over arr B and copy remaining elements
        while (j < B.length) {
            // copy the element to arr C
            C[k++] = B[j++];
        }

        return C;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,5,6, 8};
        int b[] = {4,7,9};
        int[] mergedArr = mergeArrays(a, b);

        for (int i : mergedArr) {
            System.out.print(i + " ");
        }
    }
}
