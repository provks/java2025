package Java.oops3.generics;

import Java.oops3.abstractInJava.Vehicle;

public class PairUse {
    public static void main(String[] args) {
        // Pair p = new Pair(10, 20);
        // p.getFirst();
        // p.setFirst(11);

        // PairString ps = new PairString("aa", "bb");
        Pair<String> ps = new Pair<String>("aa", "bb");
        System.out.println(ps.getFirst());
        
        // PairDouble pd = new PairDouble(1.1, 2.2);
        Pair<Double> pd = new Pair<Double>(1.1, 2.2);
        System.out.println(pd.getFirst());
        
        Pair<Integer> pi = new Pair<Integer>(10, 20);
        System.out.println(pi.getSecond());
        
        Pair<Character> pc = new Pair<Character>('c', 'd');
        System.out.println(pc.getSecond());

        // Pair<Vehicle> pv = new Pair<Vehicle>(new Vehicle(), new Vehicle());

    }
}
