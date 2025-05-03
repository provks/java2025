package Java.linkedlist;

public class DynamicArray {
    private int arr[];
    private int index;

    DynamicArray() {
        arr = new int[2];  // default length
    }
    
    DynamicArray(int length) {
        arr = new int[length];
    }

    // add element to the array
    public void add(int value) {
        // check index/count against length
        if (index == arr.length) {
            // create a new array of double length
            int doubleSizedArr[] = new int[2*index];

            // copy elements to the new array
            for (int i = 0; i < arr.length; i++) {
                doubleSizedArr[i] = arr[i];
            }

            // update my array
            arr = doubleSizedArr;

        }
        arr[index] = value;
        index++;
    }

    // print the array
    public void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    // update an element at a particular index

    // remove an element from a particular index


    public static void main(String[] args) {
        DynamicArray dArr = new DynamicArray();
        dArr.add(10);
        dArr.add(20);
        dArr.add(30);   // new array of double size would have been created

        dArr.print();
    }
}
