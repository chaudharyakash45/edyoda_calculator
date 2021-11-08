import java.text.DecimalFormat;

public class EnglishNumberToWords {

  private static final String[] tensNames = {
    "",
    " ten",
    " twenty",
    " thirty",
    " forty",
    " fifty",
    " sixty",
    " seventy",
    " eighty",
    " ninety"
  };

  private static final String[] numNames = {
    "",
    " one",
    " two",
    " three",
    " four",
    " five",
    " six",
    " seven",
    " eight",
    " nine",
    " ten",
    " eleven",
    " twelve",
    " thirteen",
    " fourteen",
    " fifteen",
    " sixteen",
    " seventeen",
    " eighteen",
    " nineteen"
  };

  private EnglishNumberToWords() {}

  private static String convertLessThanOneThousand(int number) {
    String akash;

    if (number % 100 < 20){
      akash = numNames[number % 100];
      number /= 100;
    }
    else {
      akash = numNames[number % 10];
      number /= 10;

      akash = tensNames[number % 10] + akash;
      number /= 10;
    }
    if (number == 0) return akash;
    return numNames[number] + " hundred" + akash;
  }


  public static String convert(long number) {
    
    if (number == 0)
    { 
    return "zero"; 
    }

    String snumber = Long.toString(number);

    
    String mask = "000000000000";
    DecimalFormat df = new DecimalFormat(mask);
    snumber = df.format(number);

    
    int billions = Integer.parseInt(snumber.substring(0,3));
   
    int millions  = Integer.parseInt(snumber.substring(3,6));
    
    int hundredThousands = Integer.parseInt(snumber.substring(6,9));
    
    int thousands = Integer.parseInt(snumber.substring(9,12));

    String tradBillions;
    switch (billions) {
    case 0:
      tradBillions = "";
      break;
    case 1 :
      tradBillions = convertLessThanOneThousand(billions)
      + " billion ";
      break;
    default :
      tradBillions = convertLessThanOneThousand(billions)
      + " billion ";
    }
    String result =  tradBillions;

    String tradMillions;
    switch (millions) {
    case 0:
      tradMillions = "";
      break;
    case 1 :
      tradMillions = convertLessThanOneThousand(millions)
         + " million ";
      break;
    default :
      tradMillions = convertLessThanOneThousand(millions)
         + " million ";
    }
    result =  result + tradMillions;

    String tradHundredThousands;
    switch (hundredThousands) {
    case 0:
      tradHundredThousands = "";
      break;
    case 1 :
      tradHundredThousands = "one thousand ";
      break;
    default :
      tradHundredThousands = convertLessThanOneThousand(hundredThousands)
         + " thousand ";
    }
    result =  result + tradHundredThousands;

    String tradThousand;
    tradThousand = convertLessThanOneThousand(thousands);
    result =  result + tradThousand;

   
    return result.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ");
  }

 
  public static void main(String[] args) {
    System.out.println(" " + EnglishNumberToWords.convert(0));
    System.out.println(" " + EnglishNumberToWords.convert(2));
    System.out.println(" " + EnglishNumberToWords.convert(19));
    System.out.println(" " + EnglishNumberToWords.convert(100));
    System.out.println(" " + EnglishNumberToWords.convert(168));
    System.out.println(" " + EnglishNumberToWords.convert(200));
    System.out.println(" " + EnglishNumberToWords.convert(279));
    System.out.println(" " + EnglishNumberToWords.convert(800));
    System.out.println(" " + EnglishNumberToWords.convert(851));
    System.out.println(" " + EnglishNumberToWords.convert(13146));
    System.out.println(" " + EnglishNumberToWords.convert(1000000));
    System.out.println(" " + EnglishNumberToWords.convert(2000000));
    System.out.println(" " + EnglishNumberToWords.convert(3000200));
    System.out.println(" " + EnglishNumberToWords.convert(700000));
    System.out.println(" " + EnglishNumberToWords.convert(9000000));
    System.out.println(" " + EnglishNumberToWords.convert(9001000));
    System.out.println(" " + EnglishNumberToWords.convert(123456789));
    System.out.println(" " + EnglishNumberToWords.convert(2147483647));
    System.out.println(" " + EnglishNumberToWords.convert(3000000010L));

    
  }
}