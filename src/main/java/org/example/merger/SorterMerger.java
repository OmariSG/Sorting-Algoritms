package org.example.merger;

import org.example.sorter.BubbleSort;

public class SorterMerger {
    private int[] input1;
    private int[] input2;
    private int[] result;

    public SorterMerger(int[] input1, int[] input2) {
        this.input1 = input1;
        this.input2 = input2;
    }
    public SorterMerger(BubbleSort input1, BubbleSort input2) {
        this.input1 = input1.getArrayOfInts();
        this.input2 = input2.getArrayOfInts();
    }

    private boolean isInput1LargerThan2(){
        if(this.input1[0] >= this.input2[0])
        {
            return true;
        }

        return false;
    }

    public void merge(){

//        check which array should go first

        int[] temp1 = {};
        int[] temp2 = {};

        if (isInput1LargerThan2()){
            temp1 = input2;
            temp2 = input1;
        } else {

            temp1 = input1;
            temp2 = input2;
        }
//        initialise array

        this.result = new int[temp1.length + temp2.length];
        int count = 0;


        for (int i = 0; i <= temp1.length-1; i++) {
            this.result[count] = temp1[i];
            count = count +1;

        }

//        count = count +1;

        for (int i = 0; i <= temp2.length-1; i++) {
            this.result[count] = temp2[i];
            count = count +1;
        }

    }

    public int[] getResult() {
        return result;
    }

}
