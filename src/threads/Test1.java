package threads;

public class Test1 {
    public static void main(String[] args) {
        int noOfType = 3;
        int red = 2;
        int blue = 4;
        int green = 4;
        int noOfPair = 5;
        int total = red + blue + green;
        int result = 0;
        if (noOfPair * 2 < (total - (noOfType - 1))) {
            result = (noOfType - 1) + (noOfPair * 2);
        } else {
            int j = (total - (noOfType - 1)) / 2 - 1;
            result = (noOfType - 1) + (j * 2) + (noOfPair - j);
        }
        System.out.println("Result : " + result);
    }
}
