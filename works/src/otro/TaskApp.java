package otro;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TaskApp {

    public static void main(String[] args) {
        String nameFile = "randomNumbers.txt";
        FileWriter file_W = null;
        PrintWriter pw;
        int number;
        File file_r;
        FileReader fr = null;
        BufferedReader br;
        String line;
        ArrayList<Integer> numbersArray = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        char symbol = '»';
        int result;
        long startTime, estimatedTime;
        double estimatedMicroSecondsTime, estimatedMilliSecondsTime, estimatedSecondsTime;


        System.out.print("a) Generate, randomly, a list of 999 real numbers in the range from 0 to 2000 and store them in a file.\n");
        try
        {
            file_W = new FileWriter(nameFile);
            pw = new PrintWriter(file_W);
            for (int i=0 ; i<999; i++) {
                number = (int) (Math.random() * 2000);
                pw.println(number);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != file_W)
                    file_W.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        System.out.println(symbol+" Generate Completed.");
        System.out.println("------------------------------------------------------");

        System.out.print("b) Store the random numbers of the file in an array (ArrayList).\n");
        try {
            file_r = new File (nameFile);
            fr = new FileReader (file_r);
            br = new BufferedReader(fr);
            while((line=br.readLine()) != null)
                numbersArray.add(Integer.parseInt(line));
        }
        catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if( null != fr ){
                    fr.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
        System.out.println(Arrays.toString(numbersArray.toArray()));
        System.out.println(symbol+" Store Completed.");
        System.out.println("------------------------------------------------------");


        System.out.print("c) Sort in increasing mode by the QuickSort method. (in the arrangement)\n");
        QuickSort qs = new QuickSort();

        startTime = System.nanoTime();
        qs.sort(numbersArray, 0, numbersArray.size()-1);
        estimatedTime = System.nanoTime() - startTime;
        estimatedMilliSecondsTime = (double) estimatedTime / 1000000;
        System.out.println(Arrays.toString(numbersArray.toArray()));
        System.out.println(symbol+" QuickSort Completed in "+estimatedMilliSecondsTime+" milliseconds");

        startTime = System.nanoTime();
        qs.sort(numbersArray, 0, numbersArray.size()-1);
        estimatedTime = System.nanoTime() - startTime;
        estimatedMilliSecondsTime = (double) estimatedTime / 1000000;
        System.out.println("Time that would be used to order the list already ordered: "+estimatedMilliSecondsTime+" milliseconds");

        qs.reverse(numbersArray);

        startTime = System.nanoTime();
        qs.sort(numbersArray, 0, numbersArray.size()-1);
        estimatedTime = System.nanoTime() - startTime;
        estimatedMilliSecondsTime = (double) estimatedTime / 1000000;
        System.out.println("Time spent ordering the ordered list in reverse order: "+estimatedMilliSecondsTime+" milliseconds");

        System.out.println("------------------------------------------------------");


        System.out.print("d) Sort in increasing mode by the Natural Merge method. (in the File)\n");
        System.out.println("Wait... this may take a minutes...");
        NaturalMerge nm = new NaturalMerge(nameFile);

        startTime = System.nanoTime();
         nm.naturalMerge(0, nm.getNumLines()-1);
        estimatedTime = System.nanoTime() - startTime;
        estimatedSecondsTime = (double) estimatedTime / 1000000000;
        System.out.println(symbol+" Natural Merge Completed in "+estimatedSecondsTime+" seconds");

        startTime = System.nanoTime();
         nm.naturalMerge(0, nm.getNumLines()-1);
        estimatedTime = System.nanoTime() - startTime;
        estimatedSecondsTime = (double) estimatedTime / 1000000000;
        System.out.println("Time that would be used to order the list already ordered: "+estimatedSecondsTime+" seconds");

        // t3. Time spent ordering the ordered list in reverse order.

        System.out.println("------------------------------------------------------");


        System.out.print("e) Find if the number x (read from the keyboard) exists in the array. Using sequential search.\n");
        System.out.println("Enter a number:");
        number = sc.nextInt();
        SequentialSearch ss = new SequentialSearch();

        startTime = System.nanoTime();
         result = ss.search(numbersArray, number);
        estimatedTime = System.nanoTime() - startTime;
        estimatedMicroSecondsTime = (double) estimatedTime / 1000;
        if(result != -1) {
            System.out.println("Number found.");
        } else {
            System.out.println("Number NO found.");
        }
        System.out.println(symbol+" Sequential Search Completed in "+estimatedMicroSecondsTime+" microseconds");
        System.out.println("------------------------------------------------------");


        System.out.print("f) Look for the number x (read from the keyboard) in the array. The search must be binary.");
        System.out.println("Enter a number:");
        number = sc.nextInt();
        BinarySearch bs = new BinarySearch();

        startTime = System.nanoTime();
         result = bs.search(numbersArray, 0, numbersArray.size()-1, number);
        estimatedTime = System.nanoTime() - startTime;
        estimatedMicroSecondsTime = (double) estimatedTime / 1000;
        if(result != -1) {
            System.out.println("Number found.");
        } else {
            System.out.println("Number NO found.");
        }
        System.out.println(symbol+" Binary Search Completed in "+estimatedMicroSecondsTime+" microseconds");
    }
}
