package L2;

public class SwEx {
    public static void main(String[] args) {


    }

     static String convertSeason (int seasonNumber) {
        if (seasonNumber == 1) return "Winter";
        if (seasonNumber == 2) return "Spring";
        if (seasonNumber == 3) return "Summer";
        if (seasonNumber == 4) return "Fall";
        return "unknown season";
    }

    static String convertSwitchSeason (int seasonNumber) {

        switch (seasonNumber) {
            case 1:
                return "Winter";
            case 2:
                return "Spring";
            case 3:
                return "Summer";
            case 4:
                return "Fall";
            default:
                return "Unknown season";
        }
    }
}
