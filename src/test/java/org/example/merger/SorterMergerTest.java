package org.example.merger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SorterMergerTest {

    @Test
    void merge() {
        int[] input1 = {1,2,3};
        int[] input2 = {4,5,6};
        int[] expected = {1,2,3,4,5,6};

        SorterMerger sorterMerger = new SorterMerger(input1, input2);
        sorterMerger.merge();

        assertArrayEquals(expected, sorterMerger.getResult());
    }

    @Test
    void checkArrayLength(){

        int[] input1 = {1,2,3};
        int[] input2 = {4,5,6};
        int[] expected = {1,2,3,4,5,6};

        SorterMerger sorterMerger = new SorterMerger(input1, input2);
        sorterMerger.merge();

        assertEquals(expected.length, sorterMerger.getResult().length);
    }

    @Test
    void check2ndArrayGivenAsFirstParameter(){

        int[] input1 = {1,2,3};
        int[] input2 = {4,5,6};
        int[] expected = {1,2,3,4,5,6};

        SorterMerger sorterMerger = new SorterMerger(input2, input1);
        sorterMerger.merge();

        assertArrayEquals(expected, sorterMerger.getResult());
    }

    @Test
    void checkBubbleSorterResults(){

        int[] input1 = {1,2,3};
        int[] input2 = {4,5,6};
        int[] expected = {1,2,3,4,5,6};

        SorterMerger sorterMerger = new SorterMerger(input2, input1);
        sorterMerger.merge();

        assertArrayEquals(expected, sorterMerger.getResult());
    }
}