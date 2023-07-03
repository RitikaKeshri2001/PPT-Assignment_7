public class Q8_CheckStraightLine {
    public static boolean checkStraightLine(int[][] coordinates) {
        // s : slope
        // calculate the slope of two coordinates
        double s;
        if (coordinates[1][0] - coordinates[0][0] == 0) {
            s = Double.MAX_VALUE;
        } else {
            s = (double)(coordinates[1][1] - coordinates[0][1]) / (coordinates[1][0] - coordinates[0][0]);
        }

        // calculate and check the slope with first coordinate and rest of coordinates are equal or not
        for (int i = 2; i < coordinates.length; i++) {
            double slope = Double.MAX_VALUE;
            if (coordinates[i][0] - coordinates[i-1][0] != 0) {
                slope = (double)(coordinates[i][1] - coordinates[i-1][1]) / (coordinates[i][0] - coordinates[i-1][0]);
            }
            // if not equal return false
            if (slope != s) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] coordinates = {{1,2}, {2,3}, {3,4}, {4,5}, {5,6}, {6,7}};
        System.out.println(checkStraightLine(coordinates));
    }
}
