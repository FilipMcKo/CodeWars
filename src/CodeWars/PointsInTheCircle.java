package CodeWars;

public class PointsInTheCircle {

    public static int pointsNumber(int radius)
    {
        int sum = 1 + 4*radius;
        for(double x=1; x<radius; x++){
            for(double y = 1; y<radius; y++){
                if(Math.sqrt(x*x+y*y)<=radius) sum+=4;
            }
        }
        return sum;
    }
}
