package org.example.sorter;

public class BubbleSort {

    private int[] arrayOfInts;

    public BubbleSort(int[] arrayOfInts) {
        this.arrayOfInts = arrayOfInts;
    }

    public int[] sort(){
//        set a boolean to check if anything changed.
        boolean check = false;
//        loop array and replace the ints if the previous value is more than the current iteration
        for (int i = 1; i <= this.arrayOfInts.length-1; i++) {
            if (this.arrayOfInts[i-1] > this.arrayOfInts[i]){
                check = true;

                int val1 = this.arrayOfInts[i-1];
                int val2 = this.arrayOfInts[i];

                this.arrayOfInts[i-1] = val2;
                this.arrayOfInts[i] = val1;
            }
        }
        if (check){
            this.sort();
        }
        return this.arrayOfInts;
    }

    public int[] getArrayOfInts() {
        return arrayOfInts;
    }

}
