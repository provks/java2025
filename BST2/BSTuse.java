package Java.BST2;

public class BSTuse {
    public static void main(String[] args) {
        BST b = new BST();

        b.insert(5);
        b.insert(2);
        b.insert(7);
        b.insert(3);

        b.print();
        System.out.println();

        System.out.println("is 3 present: " + b.isPresent(3));
        System.out.println("is 5 present: " + b.isPresent(5));

    }
}
