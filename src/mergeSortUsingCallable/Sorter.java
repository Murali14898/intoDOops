package mergeSortUsingCallable;

import java.util.concurrent.Callable;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.*;

public class Sorter implements Callable<List<Integer>> {
    private List<Integer> arrayToSort;
    ExecutorService es;
    Sorter(List<Integer> arrayToSort, ExecutorService es){
        this.arrayToSort=arrayToSort;
        this.es=es;
    }
    public List<Integer> call() throws InterruptedException, java.util.concurrent.ExecutionException{
        if(arrayToSort.size()==1) return arrayToSort;
        int size=arrayToSort.size();
        int mid=size/2;
        List<Integer> leftArray=new ArrayList<>();
        List<Integer> rightArray=new ArrayList<>();
        for(int i=0;i<mid;i++){
            leftArray.add(arrayToSort.get(i));
        }
        for(int i=mid;i<arrayToSort.size();i++){
            rightArray.add(arrayToSort.get(i));
        }
        Sorter s =new Sorter(leftArray,es);
        Sorter s1=new Sorter(rightArray,es);

        Future<List<Integer>> sortedLeftArray=es.submit(s);
        Future<List<Integer>> sortedRightArray=es.submit(s1);

        List<Integer> leftSortedArray=sortedLeftArray.get();
        List<Integer> rightSortedArray=sortedRightArray.get();

        List<Integer> finalSortedArray=new ArrayList<>();

        int i=0;
        int j=0;
        while(i<leftSortedArray.size() && j<rightSortedArray.size()){
            if(leftSortedArray.get(i)>=rightSortedArray.get(j)){
                finalSortedArray.add(rightSortedArray.get(j));
                j++;
            }
            else if(leftSortedArray.get(i)<rightSortedArray.get(j)){
                finalSortedArray.add(leftSortedArray.get(i));
                i++;
            }
        }
        while(i<leftSortedArray.size()){
            finalSortedArray.add(leftSortedArray.get(i));
            i++;
        }
        while(j<rightSortedArray.size()){
            finalSortedArray.add(rightSortedArray.get(j));
            j++;
        }
        return finalSortedArray;
    }
}
