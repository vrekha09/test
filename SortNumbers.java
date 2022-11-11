import java.util.stream.Stream;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
* Classs to sort numbers in decending order and remove duplicates
**/
public class SortNumbers {
    public static void main(String args[]) {
      if (args.length != 10) {//Assumed that user should enter 10 numbers
            System.out.println("Please enter 10 numbers");
            return;
        }
        
        try{
            //Below method sorts the numbers in ascending order and ignores any numbers less than 1 and greater than 100
            TreeSet<Integer> sortedNumbers = Stream.of(args).map(Integer::parseInt).filter(number -> number > 0 && number <=100).collect(Collectors.toCollection(TreeSet::new));
            //Prints the sorted numbers in decending order
            System.out.println("Sorted Numbers in descending with no duplicates : " + sortedNumbers.descendingSet());
        } catch(NumberFormatException nfe) {
            //Prints message if user enters anything other than numbers
            System.out.println("Please enter only numbers");
        }
    }
}
