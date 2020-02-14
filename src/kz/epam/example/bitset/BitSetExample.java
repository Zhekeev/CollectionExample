package kz.epam.example.bitset;

import java.util.BitSet;

public class BitSetExample {
    public static void main(String[] args) {
        BitSet firstBitSet = new BitSet();
        BitSet secondBitSet = new BitSet();
        firstBitSet.set(2);
        firstBitSet.set(6);
        firstBitSet.set(4);
        System.out.println("Length = " + firstBitSet.length() + " size = " + firstBitSet.size());
        System.out.println(firstBitSet);
        secondBitSet.set(1);
        secondBitSet.set(2);
        firstBitSet.and(secondBitSet);
        System.out.println(firstBitSet);
    }
}
