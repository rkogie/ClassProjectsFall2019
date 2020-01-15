package lab02;

public class Lab02BonusNestedLoopFour {

    public static void main(String[] args) {

        int i = 1, j = 1, k = 1, max = 7, max2 = 8, tmp = 0;

        while (i < max) {
            k = 1;
            while (k < max - (max - i)) {
                System.out.print(' ');
                ++k;
            }
            tmp = max2 - i;
            j = 1;
            while (j < tmp) {
                System.out.print(max - (max - j));
                ++j;
            }
            ++i;
            System.out.println("");
        }
    }

}
