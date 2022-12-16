package org.example.sorter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @org.junit.jupiter.api.Test
    @DisplayName("Given random ints return confirmed sorted array")
    void sort() {
        int[] input = {4,2,1,8};
        int[] expected = {1,2,4,8};

        BubbleSort bubbleSort = new BubbleSort(input);

        assertArrayEquals(expected, bubbleSort.sort());
    }

    @Test
    @DisplayName("Given 1 to 10 in random order, return true if sorted")
    void given1To10Random_Sort(){

        int[] input = {4,2,6,7,1,5,9,8,3};
        int[] expected = {1,2,3,4,5,6,7,8,9};

        BubbleSort bubbleSort = new BubbleSort(input);

        assertArrayEquals(expected, bubbleSort.sort());
    }

    @Test
    @DisplayName("Given up to 1000 number, return true if sorted")
    void givenBulkRandom_Sort(){
        int random = new Random().nextInt(100, 1000);

        int[] input = new int[random-1];

//        generate random array
        for (int i = 0; i < random-1; i++) {
            input[i] = new Random().nextInt(1, 1000);
        }

        Arrays.sort(input);

        BubbleSort bubbleSort = new BubbleSort(input);
        bubbleSort.sort();
        assertArrayEquals(input, bubbleSort.getArrayOfInts());
    }
}