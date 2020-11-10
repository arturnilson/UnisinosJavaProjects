package ProgII.TesteGA;

public class Ex10 {
    public static int f(int x) {

        int res;
        if (x < 4) {
            res = 3 * x;
        } else {
            res = 2 * f(x - 4) + 5;
        }

        return res;
    }
}