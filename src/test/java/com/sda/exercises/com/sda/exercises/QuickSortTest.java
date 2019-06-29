package com.sda.exercises.com.sda.exercises;

import com.sda.exercises.quickSort.QuickSort;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSortTest {

    @Test
    public void sortTest(){

        //given
        ArrayList<Integer> unsortedList = new ArrayList<>(Arrays.asList(2, 5, 6, 1, 8, 9));
        QuickSort quickSort = new QuickSort();

        //when
        quickSort.sort(unsortedList, 0, unsortedList.size()-1);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 5, 6, 8, 9));

        //then
        Assert.assertEquals(unsortedList, expected);

    }
}
