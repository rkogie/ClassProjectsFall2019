package lab02;

public class Lab02BonusNestedLoopThree {

    public static void main(String[] args) {

        int i = 1, j = 1, k = 1, max = 7;

        while (i < max) {
            k = 1;
            while (k < max - i) {
                System.out.print(' ');
                ++k;
            }
            while (j > 0) {
                System.out.print(max - (max - j));
                --j;
            }
            ++i;
            j += i;
            System.out.println("  ");
        }
        System.out.println("  ");
    }

}
