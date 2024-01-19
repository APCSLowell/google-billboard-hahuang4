

public class GoogleBillboard {
	public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
	public static void main(final String[] args) {
		for (int i = 0; i <= e.length() - 10; i++) {
    String digits = e.substring(i, i + 10);
    double dNum = Double.parseDouble(digits);

    // Check if the number is prime and display it if it is
    if (isPrime(dNum)) {
      System.out.println("First 10-digit prime found: " + digits);
      break;  // Stop the loop once the first prime is found
    }
  }
	}
	

	//Finish this function
	public boolean isPrime(double dNum){
		if (dNum < 2)
    return false;
  for (int i = 2; i <= Math.sqrt((int) dNum); i++) {
    if ((int) dNum % i == 0)
      return false;
  }
  return true;
	}

}
