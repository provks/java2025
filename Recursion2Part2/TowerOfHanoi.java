package Java.Recursion2Part2;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
		// Write your code here
		// base case
		if (disks == 0) {
			return;
		}

		// Move n-1 disks from the source to the aux/helper
		towerOfHanoi(disks-1, source, destination, auxiliary);

		// move the last/nth disk from source to destination
		System.out.println(source + " " + destination);

		// Move n-1 disks from the aux/helper to the destination
		towerOfHanoi(disks-1, auxiliary, source, destination);
	}
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		towerOfHanoi(n, 'a', 'b', 'c');
    }
}
