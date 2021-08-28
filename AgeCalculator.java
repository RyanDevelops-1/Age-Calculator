public class AgeCalculator {
    public static void main(String[] args) {
        String MonthName;
        Double YearsOld, YearsMonths, YearsMonthsTotal, result;
        int months = 12;
        int monthDays = 30;
        int hours = 24;
        int minutes = 60;
        int MonthBorn = 0;
        int MonthsOld;
        int CurrentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;

        // Need to use the number to the monthborn

        Scanner input = new Scanner(System.in);

        System.out.println("How old are you? ");
        YearsOld = input.nextDouble();

        System.out.println("What month were you born in? ");
        MonthName = input.next();

        switch (MonthName) {
            case ("January"):
                MonthBorn = 1;
                break;
            case ("February"):
                MonthBorn = 2;
                break;
            case ("March"):
                MonthBorn = 3;
                break;
            case ("April"):
                MonthBorn = 4;
                break;
            case ("May"):
                MonthBorn = 5;
                break;
            case ("June"):
                MonthBorn = 6;
                break;
            case ("July"):
                MonthBorn = 7;
                break;
            case ("August"):
                MonthBorn = 8;
                break;
            case ("September"):
                MonthBorn = 9;
                break;
            case ("October"):
                MonthBorn = 10;
                break;
            case ("November"):
                MonthBorn = 11;
                break;
            case ("December"):
                MonthBorn = 12;
                break;
        }

        MonthsOld = CurrentMonth - MonthBorn;
        YearsMonths = YearsOld * months;
        YearsMonthsTotal = YearsMonths + MonthsOld;

        result = YearsMonthsTotal * monthDays * hours * minutes;

        System.out.println("You are " + result + " minutes old");

        input.close();
    }
}
