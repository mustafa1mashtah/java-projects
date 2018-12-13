package week6java.ex1;

public class HotAirBalloonApplication {
    public static void main(String[] args) {
        SmallHotAirBalloon smallBalloon = new SmallHotAirBalloon();
        System.out.println("smallBalloon --");
        smallBalloon.liftUp();
        smallBalloon.land();

        BigHotAirBalloon bigBalloon = new BigHotAirBalloon();
        System.out.println("bigBalloon --");
        bigBalloon.liftUp();
        bigBalloon.land();

        HotAirBalloon small = bigBalloon;
        HotAirBalloon big = smallBalloon;

        System.out.println("small --");
        small.liftUp();
        small.land();
        System.out.println("big --");
        big.liftUp();
        big.land();


    }
}
