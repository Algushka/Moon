import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//Moon moon = Moon.NEW_MOON;
        //Moon moon = Moon.WAXING_CRESCENT;
        // String MoonPhase = MoonPhases.printMoonPhases(moon);

        Moon moon = enterMoonPhase();
        String MoonPhase = MoonPhases.printMoonPhases(moon);

    }
    public static Moon enterMoonPhase() {
        Scanner scanner = new Scanner(System.in);
        //
        System.out.println(" Enter the necessary Moon Phase:");
        System.out.println(" 1 - New Moon \uD83C\uDF11");
        System.out.println(" 2 - Waxing Cresent \uD83C\uDF12");
        System.out.println(" 3 - First Quarter \uD83C\uDF13");
        System.out.println(" 4 - Waxing Gibbous \uD83C\uDF16");
        System.out.println(" 5 - Full Moon \uD83C\uDF15");
        System.out.println(" 6 - Waning Gibbous \uD83C\uDF16");
        System.out.println(" 7 - Last Quarter \uD83C\uDF18");
        System.out.println(" 8 - Waning Crescent \uD83C\uDF17 ");
        //System.out.println(" 10 - Hello Kristina \uD83D\uDE18 \uD83D\uDC9F");


        int i = scanner.nextInt();
        switch (i) {
            case 1:
                Moon moon1 = Moon.NEW_MOON;
                return moon1;
            //String MoonPhase = MoonPhases.printMoonPhases(moon);
            // break;
            case 2:
                Moon moon2 = Moon.WAXING_CRESCENT;
                return moon2;
//                String MoonPhase = MoonPhases.printMoonPhases(moon);
            case 3:
                Moon moon3 = Moon.FIRST_QUARTER;
                return moon3;
//                Moon moon = Moon.WAXING_CRESCENT;
//                String MoonPhase = MoonPhases.printMoonPhases(moon);
            case 4:
                Moon moon4 = Moon.WAXING_GIBBOUS;
                return moon4;
//                Moon moon = Moon.WAXING_CRESCENT;
//                String MoonPhase = MoonPhases.printMoonPhases(moon);
            case 5:
                Moon moon5 = Moon.FULL_MOON;
                return moon5;
//                Moon moon = Moon.WAXING_CRESCENT;
//                String MoonPhase = MoonPhases.printMoonPhases(moon);
            case 6:
                Moon moon6 = Moon.WANING_GIBBOUS;
                return moon6;
//                Moon moon = Moon.WAXING_CRESCENT;
//                String MoonPhase = MoonPhases.printMoonPhases(moon);
//
            case 7:
                Moon moon7 = Moon.LAST_QUARTER;
                return moon7;
//                String MoonPhase = MoonPhases.printMoonPhases(moon);
            case 8:
                Moon moon8 = Moon.WANING_CRESCENT;
                return moon8;
//                String MoonPhase = MoonPhases.printMoonPhases(moon);

            default:

                System.err.println(" Error!!! There is no such moon  phase \uD83D\uDE1F");
                return null;
        }


    }


}