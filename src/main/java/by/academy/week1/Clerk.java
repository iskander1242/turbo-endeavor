package by.academy.week1;

public class Clerk {

    public static boolean isGiveChange(int[] banknotes) {
        int rest = 0;
        for (int i : banknotes) {
            if (i == 25) {
                rest += 25;
            } else if ((i == 50) && (rest >= 25)) {
                rest += 25;
            } else if ((i == 100) && (rest >= 75)) {
                rest += 75;
            } else {
                return  false;
            }
        }
        return true;
    }
}
