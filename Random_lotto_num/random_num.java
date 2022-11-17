import java.io.IOException;
import java.util.*;  

public class random_num {
    public static void main (String[] args) throws IOException {
        Random randomGen = new Random();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int random = 0; 

        //Calculate 7 numbers 1-35 
        for(int i = 0; i < 7; i++) {
            random = randomGen.nextInt(35-1) + 1;
            if (!numbers.contains(random)){
                numbers.add(random);
            }
            else {
                i--;
            }
        };

        //Calculate Powerball 
        random = randomGen.nextInt(20-1) + 1;
        numbers.add(random);

        System.out.print(numbers.toString());
    }
}
