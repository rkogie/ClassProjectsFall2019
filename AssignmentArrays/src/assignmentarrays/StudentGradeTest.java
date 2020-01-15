package assignmentarrays;

public class StudentGradeTest {

    public static void main(String[] args) {
        /*
        String[] name = new String[]{"Robin", "Jo", "Kelly", "Jaimie"};
        int[] midtermScore = new int[]{28, 78, 92, 83};
        int[] finalScore = new int[]{58, 75, 96, 79};
        int[] assignGrade = new int[]{33, 80, 90, 83};
        
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i] + "\t");
        }
        System.out.print("\n");
        for (int i = 0; i < midtermScore.length; i++) {
            System.out.print(midtermScore[i] + "\t");
        }
        System.out.print("\n");
        for (int i = 0; i < finalScore.length; i++) {
            System.out.print(finalScore[i] + "\t");
        }
        System.out.print("\n");
        for (int i = 0; i < assignGrade.length; i++) {
            System.out.print(assignGrade[i] + "\t");
        }
        
        double sum = 0, avg;
        double finalGrade[] = Assignment04Methods.getFinalGrades(midtermScore, finalScore, assignGrade);
        System.out.println("\n");
        for (int i = 0; i < finalGrade.length; i++) {
            System.out.printf("%.2f \t", finalGrade[i]);
            sum += finalGrade[i];
        }
        avg = sum / finalGrade.length;
        System.out.println("Average: " + (double) Math.round((avg) * 100d) / 100d+"\n");
         */
        
        //Declared arrays and initialize with values
        String[] newName = new String[]{"Robin", "Jo", "Kelly", "Jaimie", "Terry", "Kerry"};
        int[] newMidtermScore = new int[]{28, 78, 92, 83, 86, 71};
        int[] newFinalScore = new int[]{58, 75, 96, 79, 76, 75};
        int[] newAssignGrade = new int[]{33, 80, 90, 83, 91, 78};

        //Formatted and output arrays to console
        System.out.print("\nName: \t\t");
        for (int i = 0; i < newName.length; i++) {
            System.out.print(newName[i] + "\t");
        }
        System.out.print("\nMidterm: \t");
        for (int i = 0; i < newMidtermScore.length; i++) {
            System.out.print(newMidtermScore[i] +"\t");
        }
        System.out.print("\nFinal: \t\t");
        for (int i = 0; i < newFinalScore.length; i++) {
            System.out.print(newFinalScore[i] + "\t");
        }
        System.out.print("\nAssignment: \t");
        for (int i = 0; i < newAssignGrade.length; i++) {
            System.out.print(newAssignGrade[i] +"\t");
        }
        
        //Create new array and intialize with method in methods class
        double newsum = 0, newavg;
        double newFinalGrade[] = Assignment04Methods.getFinalGrades(newMidtermScore, newFinalScore, newAssignGrade);
        System.out.print("\nStudent Avg:    ");
        for (int i = 0; i < newFinalGrade.length; i++) {
            System.out.printf("%.2f\t",(double) Math.round((newFinalGrade[i]) * 100d) / 100d);
            newsum += newFinalGrade[i];
        }
        newavg = newsum / newFinalGrade.length;
        System.out.println("\nClass Average:  " + (double) Math.round((newavg) * 100d) / 100d);

        //Finding highest, lowest score and the index where that score was found to get the name
        double smallest = newFinalGrade[0],highest = newFinalGrade[0];
        String lowStuName = newName[0], hiStuName = newName[0];
        for (int i = 0; i < newFinalGrade.length; i++) {
            if (smallest > newFinalGrade[i]) {
                smallest = newFinalGrade[i];
                lowStuName = newName[i];
            }
        }
        for (int j = 0; j < newFinalGrade.length; j++) {
            if (highest < newFinalGrade[j]) {
                highest = newFinalGrade[j];
                hiStuName = newName[j];
            }
        }
        System.out.println("\nLowest scoring student: " + lowStuName + 
                ",\tScore: " + (double) Math.round((smallest) * 100d) / 100d);
        System.out.println("Highest scoring student: " + hiStuName + 
                ",\tScore: " + (double) Math.round((highest) * 100d) / 100d);
        
        //Condition that calls method to count values that are above conditional value
        int value = 60;
        int stuAboveSixty = Assignment04Methods.findFrequency(newFinalGrade,value);
        System.out.println("\nNo of students who scored above 60%: "+stuAboveSixty); 
    }
}
