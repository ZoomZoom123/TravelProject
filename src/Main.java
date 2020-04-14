import java.util.Scanner;

public class Main {

    private static String destination;
    private static boolean japan;
    private static boolean korea;
    private static boolean usa;

    public static void main(String[] args){
            // Part 1 - Greeting
        greeting();
        travelDestination();
            // Part 2 - Travel Time and Budget
        travelTime();
            // Part 3 - Time Difference
        timeDifference();
            // Part 4 - Country Area
        areaOfDestination();
    }

    public static void greeting() {
        // Part 1 - Greeting
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to your VACATION PLANNER!");
        System.out.print("Who will be going on this trip? ");
        String names = input.nextLine();
        System.out.println(names.toUpperCase() + " let's get started!");
        System.out.print("Where you travelling to? ");
        destination = input.next();
    }

    public static void travelDestination() {
        Scanner input = new Scanner(System.in);

        if (japan = destination.contains("Japan") || destination.contains("Tokyo") || destination.contains("Osaka") || destination.contains("Kyoto")){
            // Traveling to Japan
            System.out.println("Great! " + destination.toUpperCase() + " sounds like a great trip. There are lots to do in the Land of the Rising Sun");
        } else if (korea = destination.contains("Korea") || destination.contains("Seoul") || destination.contains("Busan")){
            //Traveling to Korea
            System.out.print("Great! " + destination.toUpperCase() + " sounds like a great trip. There are lots to do in the Land of the Morning Calm");
        } else if (usa = destination.contains("US") || destination.contains("USA") || destination.contains("NYC") || destination.contains("LA") || destination.contains("Seattle") || destination.contains("Chicago")){
            // Traveling within the US
            System.out.print("Great! " + destination.toUpperCase() + " sounds like a great trip. There are lots to do in America.");
        } else{
            System.out.print("Destination not recognized. Please try again later");
            System.exit(0);
        }
    }


    public static void travelTime() {
        Scanner input = new Scanner(System.in);
        // Part 2 - Travel Time
        System.out.print("\nHow many days are they going to spend at your destination? ");
        int daysOfTrip = input.nextInt();
        int hoursOfTrip = daysOfTrip * 24;
        System.out.print("If you are traveling to " + destination + " for " + daysOfTrip + " days, that is the same as " + hoursOfTrip + " hours.");
        // Part 2 - Budget
        System.out.print("\nWhat is your total budget for the trip in USD? $");

        int tripBudgetUsd = input.nextInt();
        int tripBudgetKrw = tripBudgetUsd * 1000;
        int tripBudgetJpy = tripBudgetUsd * 100;
        int usBudgetPerDay = tripBudgetUsd / daysOfTrip;
        int jpBudgetPerDay = tripBudgetJpy / daysOfTrip;
        int krBudgetPerDay = tripBudgetKrw / daysOfTrip;

        if (korea) {
            System.out.println("Your budget is $" + tripBudgetUsd + ". The exchange rate is ₩" + tripBudgetKrw + ".");
            System.out.println("Your budget is ₩" + tripBudgetKrw + ". You can spend ₩" + krBudgetPerDay + " on a daily basis.");
        } else if (japan) {
            System.out.println("Your budget is $" + tripBudgetUsd + ". The exchange rate is ¥" + tripBudgetJpy + ".");
            System.out.println("Your budget is ¥" + tripBudgetJpy + ". You can spend ¥" + jpBudgetPerDay + " on a daily basis.");
        } else {
            System.out.println("Your budget is $" + tripBudgetUsd + ".");
            System.out.println("Your budget is $" + tripBudgetUsd + ". You can spend $" + usBudgetPerDay + " on a daily basis.");
        }
    }

    public static void timeDifference() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the time zone difference of your home to your destination? ");
        int timeDifference = input.nextInt();
        int timeDifferenceFromDestination = timeDifference % 24;
        System.out.println("The time will be " + timeDifferenceFromDestination + ":00, when it is midnight local time.");
    }

    public static void areaOfDestination() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the area of your destination in km^2? ");
        double areaOfDestinationInKm = input.nextDouble();
        int  areaMath = (int) (areaOfDestinationInKm * 0.62137);
        double areaOfDestinationInMiles = areaMath / 100.0;
        System.out.println("The area of " + destination + " in miles is " + areaOfDestinationInMiles + ".");
    }
}
