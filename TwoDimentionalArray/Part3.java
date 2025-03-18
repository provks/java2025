package Java.TwoDimentionalArray;

public class Part3 {
    public static void main(String[] args) {

        // =========== FOR EACH LOOP
        // int[][] arr = new int[3][3];

        // System.out.println(arr);

        // for (int[] value: arr) {    // array
        //     // System.out.println(value);
        //     // break;
        //     for(int val: value) {   // element
        //         System.out.print(val);
        //     }
        //     System.out.println();
        // }

        // ========== JAGGED ARRAYS
        // int[][] arr = new int[3][3]; 
        int[][] arr2 = new int[3][]; 

        // int[][] arr2 = {{1,2,3}, {3,4,5,6,7,8}, {9}};
        // for (int[] value: arr2) {    // array
        //     for(int val: value) {   // element
        //         System.out.print(val);
        //     }
        //     System.out.println();
        // }
        // loop with index value

        String str = "How are you?";

        String[] strArr = str.split(" ");
        
        for (int i = 0; i < arr2.length; i++) {
            // for (int j = 0; j < arr2[i].length; j++) {
            //     System.out.print(arr2[i][j]);
            // }
            // int calculatedValue
            arr2[i] = new int[strArr[i].length()];
            // arr2[i] = new int[2];
            // arr2[i] = new int[7];
            System.out.println(arr2[i]);
        }

    }
}
