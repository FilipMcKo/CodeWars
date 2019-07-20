package CodeWars;

import java.util.Arrays;
import java.util.List;

public class PrimeStreaming {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList();
        //list.stream().forEach();


        boolean isPrime = true;
        for (int i = 2; i<20; i++) {
            for (int j = 2; j < i; j++)
                if (i % j == 0) isPrime = false;

            if(isPrime)System.out.print(i + ", ");
            isPrime=true;
        }

    }

}
