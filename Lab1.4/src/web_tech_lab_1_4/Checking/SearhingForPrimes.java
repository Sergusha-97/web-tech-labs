package web_tech_lab_1_4.Checking;

import java.util.ArrayList;
/**
 * Created by Сергей on 16.09.2016.
 */
public class SearhingForPrimes {
    private ArrayList<Integer> numbers = new ArrayList<Integer>();
    private boolean isPrime(int N) {
        if (N < 2) return false;
        for (int i = 2; i*i <= N; i++)
            if (N % i == 0) return false;
        return true;
    }
    private boolean IsPrimesInArray(int[] array) {
        for (int i =0; i<array.length;i++){
            if (isPrime(array[i])){
                numbers.add(i);
            }
        }
        if (numbers.isEmpty())
            return false;
        else
            return true;
    }
    public void PrintResult(int[] array){
        if(IsPrimesInArray(array)) {
            for (int i : numbers)
                System.out.println(i);
        }
        else
            System.out.println("There are no primes in the array");

    }

}
