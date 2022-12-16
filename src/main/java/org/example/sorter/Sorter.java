package org.example.sorter;

import org.example.merger.SorterMerger;

public class Sorter {
    public void run(){

        int[] input = {4,2,1,8};
        BubbleSort bubbleSort = new BubbleSort(input);
        bubbleSort.sort();

        SorterMerger sorterMerger = new SorterMerger(input, input);
        sorterMerger.merge();
    }
}
