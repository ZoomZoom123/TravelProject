import java.util.Scanner;

public class Main {
    String travelingTo;

    public Main() {
        travelingTo = destination;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean korea = destination.equals("Japan") || destination.contains("Tokyo") || destination.contains("Osaka") || destination.contains("Kyoto");
        boolean japan = destination.equals("Korea") || destination.contains("Seoul") || destination.contains("Busan");
        boolean usa = destination.equals("US") || destination.contains("USA") || destination.contains("NYC") || destination.contains("LA") || destination.contains("Seattle") || destination.contains("Chicago");
            // Part 1 - Greeting
        greeting(input);

            // Part 2 - Travel Time and Budget
        travelTime(input);
            // Part 3 - Time Difference
        timeDifference(input);
            // Part 4 - Country Area
        areaOfDestination(input);
    }

    public static void greeting(Scanner input) {
        // Part 1 - Greeting
        System.out.println("Welcome to your VACATION PLANNER!");
        System.out.print("How many people will be going on this trip? ");
        int numberOfTravelers = input.nextInt();
        System.out.print("\nPreparing trip for "+ numberOfTravelers + ".");
        System.out.print("\nWhere you travelling to? ");
        String destination = input.next();

        if (japan){
            // Traveling to Japan
            System.out.println("Great! " + destination.toUpperCase() + " sounds like a great trip. There are lots to do in the Land of the Rising Sun");

        } else if (korea){
            //Traveling to Korea
            System.out.print("Great! " + destination.toUpperCase() + " sounds like a great trip. There are lots to do in the Land of the Morning Calm");
        } else if (usa){
            // Traveling within the US
            System.out.print("Great! " + destination.toUpperCase() + " sounds like a great trip. There are lots to do in America.");
        } else{
            System.out.print("Destination not recognized. Please try again later");
            System.exit(0);
        }
    }
    public static void travelTime(Scanner input) {
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
            System.out.print("Your budget is $" + tripBudgetUsd + ". The exchange rate is ₩" + tripBudgetKrw + ".");
            System.out.print("Your budget is ₩" + tripBudgetUsd + ". You can spend ₩" + krBudgetPerDay + " on a daily basis.");
        } else if (japan) {
            System.out.print("Your budget is $" + tripBudgetUsd + ". The exchange rate is ¥" + tripBudgetJpy + ".");
            System.out.print("Your budget is ¥" + tripBudgetJpy + ". You can spend ¥" + jpBudgetPerDay + " on a daily basis.");
        } else {
            System.out.print("Your budget is $" + tripBudgetUsd + ".");
            System.out.print("Your budget is $" + tripBudgetUsd + ". You can spend $" + usBudgetPerDay + " on a daily basis.");
        }
    }


    public static void timeDifference(Scanner input) {
        System.out.println("What is the time zone difference of your home to your destination? ");
        int timeDifference = input.nextInt();
        int timeDifferenceFromDestination = timeDifference % 24;

        System.out.println("The time will be " + timeDifferenceFromDestination + ", when it is midnight local time.");
    }

    public static void areaOfDestination(Scanner input) {
        System.out.print("What is the area of your destination in km^2? ");
        int areaOfDestination = input.nextInt();
    }
}
