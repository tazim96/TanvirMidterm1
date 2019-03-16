package algorithm;

import org.testng.Assert;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int [] unSortedArray = {2,5,3,6,7,8,1};
        int [] sortedArray =   {1,2,3,5,6,7,8};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.
        sort.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }
        System.out.println("Selection Sort Pass");

        //Now implement Unit test for rest of the soring algorithm...................below

        //insertion sort
        unSortedArray = new int[]{2,5,3,6,7,8,1};
        sort.insertionSort(unSortedArray);
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }
        System.out.println("Insertion Sort Pass");

        //bubble sort
        unSortedArray = new int[]{2,5,3,6,7,8,1};
        sort.bubbleSort(unSortedArray);
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }
        System.out.println("Bubble Sort Pass");

        //merge sort
        unSortedArray = new int[]{2,5,3,6,7,8,1};
        sort.mergeSort(unSortedArray,0,unSortedArray.length-1);
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }
        System.out.println("Merge Sort Pass");

        //quick sort
        unSortedArray = new int[]{2,5,3,6,7,8,1};
        sort.quickSort(unSortedArray,0,unSortedArray.length-1);
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }
        System.out.println("Quick Sort Pass");

        //heap sort
        unSortedArray = new int[]{2,5,3,6,7,8,1};
        sort.heapSort(unSortedArray);
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }
        System.out.println("Heap Sort Pass");

        //bucket sort
        unSortedArray = new int[]{2,5,3,6,7,8,1};
        sort.bucketSort(unSortedArray, 8);
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }
        System.out.println("Bucket Sort Pass");

        //shell sort
        unSortedArray = new int[]{2,5,3,6,7,8,1};
        sort.shellSort(unSortedArray);
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }
        System.out.println("Shell Sort Pass");


    }}