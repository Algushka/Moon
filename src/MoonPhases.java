public class MoonPhases {

    public static String printMoonPhases(Moon moon) {
        if (moon == null) return "Big mistake";
        switch (moon) {

            case NEW_MOON:
                System.out.println(moon.getIllumination());
                return moon.getIllumination();
            case WAXING_CRESCENT:
                System.out.println(moon.getIllumination());
                return moon.getIllumination();
            case FIRST_QUARTER:
                System.out.println(moon.getIllumination());
                return moon.getIllumination();
            case WAXING_GIBBOUS:
                System.out.println(moon.getIllumination());
                return moon.getIllumination();
            case FULL_MOON:
                System.out.println(moon.getIllumination());
                return moon.getIllumination();
            case WANING_GIBBOUS:
                System.out.println(moon.getIllumination());
                return moon.getIllumination();
            case LAST_QUARTER:
                System.out.println(moon.getIllumination());
                return moon.getIllumination();
            case WANING_CRESCENT:
                System.out.println(moon.getIllumination());
                return moon.getIllumination();

            default:
                System.err.println("Mistake!!!!");
                return "Nonspecified moon phase";
        }
    }
}
