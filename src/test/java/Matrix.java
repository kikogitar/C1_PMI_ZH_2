import java.util.ArrayList;

public class Matrix {
    public  static int sumOfEvenNumbers(int m[][]) {
        int ossz=0;
        for (int  i=0; i<m.length; i++ ) {
            for (int j=0; j < m.length; j++) {
                if (m[i][j]%2==0) {
                    ossz += m[i][j];
                }
            }
        }
        return ossz;
    }
    public static ArrayList rowsWithZero(int m[][]) {
        ArrayList<Integer> veg = new ArrayList<>();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j] == 0) {
                    veg.add(i);
                }
            }
        }
        return veg;
    }
}
