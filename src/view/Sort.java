package view;

import br.edu.fateczl.thiago.bubblesort.BubbleSort;
import br.edu.fateczl.thiago.mergesort.MergeSort;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] vetor = new int[] {5, 21, 215, 41, 14, 13, 19};

        System.out.println(Arrays.toString(BubbleSort.bubbleSort(vetor)));
        System.out.println(Arrays.toString(MergeSort.sort(vetor, 0, vetor.length - 1)));

    }
}
