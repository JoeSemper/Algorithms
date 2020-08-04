package hw5;

public class Exponentiation {


    public static int RecExp (int a, int in)  {

        if (in < 0) {
            throw new IllegalArgumentException("a in:" + in);
        }

        if (in == 0){
            return 1;
        }

        return a * RecExp(a, in-1);
    }
}
