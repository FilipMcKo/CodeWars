package CodeWars;

public class UniqueNumber {
    public static double findUniq(double arr[]) {

        double standardNr;
        if(arr[0]==arr[1]||arr[0]==arr[2]) standardNr=arr[0];
        else standardNr=arr[1];
        for (double v : arr) {
            if(v!=standardNr) return v;
        }
        return 0;
    }


    public static void main(String[] args) {
        double[] arr = { 0, 0, 0.55, 0, 0 };
        System.out.println(findUniq(arr));
    }
}
