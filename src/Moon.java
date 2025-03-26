public enum Moon {
    NEW_MOON("0%"),
    WAXING_CRESCENT("75%"),
    FIRST_QUARTER("50%"),
    WAXING_GIBBOUS("51-99%"),
    FULL_MOON("100%"),
    WANING_GIBBOUS("99-51%"),
    LAST_QUARTER("50%"),
    WANING_CRESCENT("45-1%");

//
    private String illumination;

    Moon(String percentOfIllumination) {
        this.illumination = percentOfIllumination;
    }

    public String getIllumination() {
        return illumination;
    }

    @Override
    public String toString() {
        return "Moon{" +
                "illumination='" + illumination + '\'' +
                '}';
    }
}




