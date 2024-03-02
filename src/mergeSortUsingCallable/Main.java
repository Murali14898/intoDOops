package mergeSortUsingCallable;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws InterruptedException, java.util.concurrent.ExecutionException{
        List<Integer> intialArray=List.of(9,1,10,8,7,3,15,12);
        System.out.println("Unsorted Array is");
        for(Integer i:intialArray){

            System.out.print(i+" ");
        }

        System.out.println();
        ExecutorService es= Executors.newFixedThreadPool(10);
        Sorter s=new Sorter(intialArray,es);
        Future<List<Integer>> intialArrayGiven=es.submit(s);
        List<Integer> sortedAnsArray=intialArrayGiven.get();
        System.out.println("Sorted Array is");
        for(Integer i:sortedAnsArray){

            System.out.print(i+" ");
        }
    }
}
