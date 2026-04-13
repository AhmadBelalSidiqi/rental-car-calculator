public class RentalCarCalculator {
    public static void main(String[] args) {
        String date = "4/13/2026";
        double numberDays = 10;
        boolean electronicTollTag = true;
        double tollTagPrice = 3.95;
        boolean isGps = true;
        double gpsPrice = 2.95;
        boolean roadsideAssistance = true;
        double roadAssitPrice = 3.95;
        int age = 24;
        double carRentalPrice = 29.99;
        double surcharge = 0.3;
        double totalsupercharge = 0;
        double optionsCost = 0;
        double effectiveRate = 0;

        //displaying date and basic car rate
        System.out.println("Today is : " + date);
        System.out.println("basic Car rental is " + carRentalPrice);
       // Calcuting the total rental
        effectiveRate += numberDays * carRentalPrice;

        // Calculating Option cost
        if (electronicTollTag) {
            // Option Cost to Display it separately
            optionsCost += tollTagPrice * numberDays;
            effectiveRate += tollTagPrice * numberDays;

        }
        if (roadsideAssistance) {
            optionsCost += roadAssitPrice * numberDays;
            effectiveRate += roadAssitPrice * numberDays;
        }
        if (isGps) {
            optionsCost += gpsPrice * numberDays;
            effectiveRate += gpsPrice * numberDays;
        }
        System.out.printf("Your options cost is :%.2f \n", optionsCost);


        // Underage supercharge on total
        if (age < 25) {
            System.out.println("There is 30% super charge on your total ");
            totalsupercharge = effectiveRate * surcharge;
            System.out.printf("your total supercharge: %.2f \n ",totalsupercharge);
        }

        effectiveRate += effectiveRate + totalsupercharge;
        System.out.printf("Number of days %f \n Your total is: %.2f", numberDays, effectiveRate);


    }
}
