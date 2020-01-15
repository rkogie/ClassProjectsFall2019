package lab04;

import java.util.Arrays;

public class SurveyArray {

    public static void main(String[] args) {

        //Declared array variables and initialized 
        int[] sample1 = new int[]{1, 2, 2, 1, 1, 3, 3, 2, 2, 1};
        int[] sample2 = new int[]{3, 1, 1, 2, 2, 2, 2, 1, 1, 1, 1, 2, 3, 3, 2, 2, 2, 3};
        int[] sample3 = new int[]{1, 1, 1, 2, 2, 1, 3, 2, 1, 1, 1, 2};

        //Create new array that has the lengths of array declared above
        int[] results = new int[sample1.length + sample2.length + sample3.length];
        
        //Use inbuilt method to copy elements from each child array(sampleX) into parent array(results)
        System.arraycopy(sample1, 0, results, 0, sample1.length);
        System.arraycopy(sample2, 0, results, sample1.length, sample2.length);
        System.arraycopy(sample3, 0, results, (sample1.length + sample2.length), sample3.length);

        //Output using inbuilt method toString
        System.out.println("Survey Responses(raw data): ");
        System.out.println(Arrays.toString(results));
        //Inbuilt method to sort array into ascending order (smallest to largest)
        Arrays.sort(results);

        //Loop to count frequency of recurring elements 
        int[] freq = new int[results.length];
        int visited = -1;
        for (int i = 0; i < results.length; i++) {
            int count = 1;
            for (int j = i + 1; j < results.length; j++) {
                if (results[i] == results[j]) {
                    count++;
                    freq[j] = visited;
                }
            }
            if (freq[i] != visited) {
                freq[i] = count;
            }
        }
        System.out.println("Choice | Frequency | Percentage %");   
        
        //Ouput counts as percentage
        for (int i = 0; i < freq.length; i++) {
            double percent = (double)freq[i]/results.length*100;
            if (freq[i] != visited) {
               System.out.format("%-11d%-11d%-50.2f\n", results[i], freq[i], percent);
            }
        
        }
    }
}
