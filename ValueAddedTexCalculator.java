import java.util.Scanner;
public class ValueAddedTexCalculator {
    public static void main(String[] args) {
        /* bu program ile
        + kullanıcının menü üzerinden yapmak istediği işlemi seçmesini sağlayarak
        + ürünün kdv'siz fiyatını girerek kdv'yi ve kdv'li toplam fiyatını hesap etmesini
        + ürünün toplam fiyatını girerek kdv'siz fiyatını ve kdv oranını görmesini sağlayacağız
         */

        Scanner input = new Scanner(System.in);
        Scanner price = new Scanner(System.in);

        String menuEnteryMessage = "Please select the action you want the perform";
        String option1 = "(Click on 1)" + " Calculate Vat"  ;
        String option2 = "(Click on 2)" + " Find the normal price from the prive with Vat"  ;

        System.out.println(menuEnteryMessage + "\n" + option1 + "\n" + option2);

        System.out.println(" ");
        System.out.print("Which action do you want to take ? : ");
        int menuSelectionResult;
        menuSelectionResult = input.nextInt();
        System.out.print("");

        String query1 = "Enter price : ";
        System.out.print(query1);
        double priceToBeCalculated, vatRate1 = 20, vatRate2 = 10;
        priceToBeCalculated = price.nextDouble();

        String vehicleMessage1 = "Your transaction is being processed";
        System.out.println(vehicleMessage1);

        double vatDetector = (priceToBeCalculated > 1000) ? vatRate2:vatRate1;
        String vatDetectorMessage1 = "Vat rate has been reduced to 10% because the price to be calculated is greater then 1000";
        String vatDetectorMessage2 = " Since the price for which the vat rate will be calculated is less then 1000, the vat rate will be calculated as 20%";
        String vatDetectorMessage = (priceToBeCalculated > 1000) ? vatDetectorMessage1:vatDetectorMessage2;

        System.out.println(vatDetectorMessage);

        double vatCalculator = priceToBeCalculated * (1 + vatDetector/100);
        double priceCalculatorWithoutVat = priceToBeCalculated / (1 + vatDetector/100);
        double menuSelectionScreen = (menuSelectionResult == 1) ? vatCalculator:priceCalculatorWithoutVat;

        double additionalInfoElements1 = vatCalculator - priceToBeCalculated;
        double additionalInfoElements2 = priceToBeCalculated - priceCalculatorWithoutVat  ;
        double additionalInfo = (menuSelectionResult == 1 ) ? additionalInfoElements1:additionalInfoElements2;

        String resultScreenMessage0 = "Entered amount : ";
        String resultScreenMessage = "Total : ";
        String resultScreenMessage2 = "Vat rate : ";
        System.out.println(resultScreenMessage0 + priceToBeCalculated + "\n" + resultScreenMessage2 + additionalInfo + "\n" + resultScreenMessage + menuSelectionScreen);



    }
}
