import java.lang.Math;

/**
 * This class is the one that contains the methods that make the program work
 * as a calculator that allows to perform the operations requested by the user
 * @author: Eli Mallama
 * @version: 0.0.1
 */

public class Calculator {
    // In the result variable the results of the operations are saved
	public double result=0;
	// Conversions that cannot be operated are saved in the message variable
	public String message="";

	// constructor method without parameters
	public Calculator() {}
	
	/** The method allows to make the sum between
	 *  two real numbers
	 * @param adds refers to the addends
	 */
	public void add(double adds) 
	{
		result+=adds;
	}
	
	/** This method allows you to perform a subtraction
	 *  between two real numbers
	 * @param subtracting is the subtracting
	 */
	public void subtract(double subtracting) {
		
		result-=subtracting;
	}
	
	/** This method allows you to perform a
	 *  multiplication between two real numbers
	 *  @param multiplier 
	 */
	public void multiplication(double multiplier) {

		result*=multiplier; 
	}
	
	/** This method allows a division
	 *  between two real numbers where the divisor is
	 *  result of another operation
	 *  @param dividend whatever number
	 *  different from zero
	 */
	public void division(double dividend) {
		if(dividend!=0) {
		result/=dividend;
	}else {
		message="Error";
		
	}
		
}
	
	/** This method allows a division between
	 *  two numbers
	 * @param divider any real number
	 * @param dividend any real number other than zero
	 */
	public void divisionTwo(double divider, double dividend) {
		if(dividend!=0) {
		result=divider/dividend;
	}else {
		message="Error";}
	}
	
	/** This method allows to perform the module operation (calculate
	 *  the residue) resulting from a division between two real numbers
	 * where the divisor is the result of another operation 
	 * @param dividend any real number other than zero
	 */
	public void modulus(double dividend) {
		if(dividend!=0) {
		result%=dividend;}
	}
	
	/** This method allows to perform the module operation (calculate
	 * the residue) resulting from a division between two real numbers
	 * @param divider any real number
	 * @param dividend any real number other than zero
	 */
	public void modulusTwo(double divider, double dividend) {
	    if(dividend!=0) {
		result=divider%dividend;}
	}
	
	/** This method serves to take the square root of any
	 * real number not negative
	 * @param number any number strictly greater than zero
	 */
	public void squareRoot(double number) {
	double squareRoot=0;
	
	double h=0;
		
	squareRoot = number/2;
		    do
		    {
		        h=squareRoot;
		        squareRoot = (h + (number/h))/2;
		    }
		    while((h-squareRoot)!=0);
		    
		result=squareRoot;    
	}
	
	/** This method serves to raise a number to any exponent
	 * when the number is the result of any previous operation
	 * @param index refers to the pow
	 */
	public void pow(int index) {
		
		boolean negative=false;
		if(index<0) {
			index*=-1;
			negative=true;
		}
		
		double indexA=1;
		
		for(int i=1; i<=index; i++) {
			indexA*=result;
			
		}
		
		if(negative) {
			result=1/indexA;
		}else {
		
		result=indexA;
	}
	}
	
	/** This method serves to raise a number to any exponent
	 * @param base any real number
	 * @param index a strictly int type number
	 */
	public void powTwo(double base, int index) {
		
		boolean negative=false;
		double indexB=1;
			
		if(index<0) {
			index*=-1;
			negative=true;
		}
		for(int i=1;i<=index;i++) {
			indexB*=base;
		}
		if(negative) {
			result=1/indexB;
		}else {
		
		result=indexB;
	}
	}
	
	/** This method allows multiplication of each number that is
	 *  between one and the number that entered per parameter
	 * @param factor any number strictly greater than zero
	 */
	public void factorial(int factor) {
		
		int resultA=1;
		
		for(int i=factor;i>=1;i--) {
		
			resultA*=i;
		}
		
		result=resultA;
	}
	
	/** This method allows you to convert any non-negative number to a binary number
	 * @param number any number greater than zero
	 * @return message is the binary number String
	 */
	public String decToBin(int number) {
		int cos=number;
		int res=0;
		String cad="";
		
		
		do {
			res=cos%2;
			cos/=2;
			
		    cad+=res;
		}while(cos>0); 
		
		String inverted="";
		for (int index = cad.length() - 1; index >= 0; index--) {
			
			inverted += cad.charAt(index);
		}
		message=inverted;
		
		return message;
	}
	
	/** This method allows you to convert any decimal number to hexadecimal
	 * @param number any number greater than zero
	 * @return message is the String of hexadecimal numbers
	 */
	public String decToHex(int number) {
		String bin=decToBin(number);
		String hex=binToHex(bin);
		message=hex;
		
		return message;
		
	}
	
	/** This method allows you to convert any hexadecimal number to
	 * binary
	 * @param hex a hexadecimal number
	 * @return bim the binary number conversion String
	 */
	public String hexToBin(String hex) {
		
		String bim="";
		
		for(int i=0;i<hex.length();i++) {
			
			
			if(hex.charAt(i)=='0') {bim+="0000";}
			if(hex.charAt(i)=='1') {bim+="0001";}
			if(hex.charAt(i)=='2') {bim+="0010";}
			if(hex.charAt(i)=='3') {bim+="0011";}
			if(hex.charAt(i)=='4') {bim+="0100";}
			if(hex.charAt(i)=='5') {bim+="0101";}
			if(hex.charAt(i)=='6') {bim+="0110";}
			if(hex.charAt(i)=='7') {bim+="0111";}
			if(hex.charAt(i)=='8') {bim+="1000";}
			if(hex.charAt(i)=='9') {bim+="1001";}
			if(hex.charAt(i)=='A') {bim+="1010";}
			if(hex.charAt(i)=='B') {bim+="1011";}
			if(hex.charAt(i)=='C') {bim+="1100";}
			if(hex.charAt(i)=='D') {bim+="1101";}
			if(hex.charAt(i)=='E') {bim+="1110";}
			if(hex.charAt(i)=='F') {bim+="1111";}
		}
		
		return bim;
	}
	
	/** It is a method that serves to raise any number to any natural pow
	 * will be used in the binary to decimal conversion method
	 * @param base
	 * @param index
	 * @return indexC
	 */
public int powThree(double base, int index) {
		
		int indexC=1;
			
		for(int i=1;i<=index;i++) {
			indexC*=base;
		}
	
		return indexC;
	
	
	}
	
    /** This method allows you to convert any binary number to decimal number
     * @param bin any binary number
     * @return add decimal number int type
     */
	public int binToDec(String bin) {
		
		int add=0;
		int indexD=bin.length()-1;
		
		for(int i=0;i<bin.length();i++) {
				if(bin.charAt(i)=='1') {
					add+=powThree(2,indexD);
				}
				indexD--;
				}
		result=add;
		return add;
		}
	
	/** This method allows you to convert any hexadecimal number to decimal
	 * @param hex any hexadecimal number
	 */
	public void hexToDec(String hex) {
		String bin=hexToBin(hex);
		int dec=binToDec(bin);
		result=dec;
	}
	
	/** This method allows you to convert any binary number to hexadecimal
	 * @param bin any binary number
	 * @return message which is the coformed string by a hexadecimal number
	 */
	public String binToHex(String bin) {
		
		if(bin.length()%4==1) {
			bin="000"+bin;
		}
		if(bin.length()%4==2) {
			bin="00"+bin;
		}
		if(bin.length()%4==3) {
			bin="0"+bin;
		}
		
		String temp="";
		message="";
		
		for(int i=0;i<bin.length();i++) {
			if(temp.length()<=4) {
				temp+=bin.charAt(i);
			}
			if(temp.length()==4) {
			if(temp.equals("0000")) {message+="0";}
			if(temp.equals("0001")) {message+="1";}
			if(temp.equals("0010")) {message+="2";}
			if(temp.equals("0011")) {message+="3";}
			if(temp.equals("0100")) {message+="4";}
			if(temp.equals("0101")) {message+="5";}
			if(temp.equals("0110")) {message+="6";}
			if(temp.equals("0111")) {message+="7";}
			if(temp.equals("1000")) {message+="8";}
			if(temp.equals("1001")) {message+="9";}
			if(temp.equals("1010")) {message+="A";}
			if(temp.equals("1011")) {message+="B";}
			if(temp.equals("1100")) {message+="C";}
			if(temp.equals("1101")) {message+="D";}
			if(temp.equals("1110")) {message+="E";}
			if(temp.equals("1111")) {message+="F";}
			temp="";
			}
			
		}
		
		return message;
		
	}
	
	/** This method allows validating that the binary numbers that enter
	 * per parameter in other methods are indeed binary
	 * @param bin
	 * @return valid
	 */
	public boolean validate(String bin) {
		
		boolean valid=true;
		
		for(int i=0;i<bin.length();i++) {
			if(bin.charAt(i)=='0' || bin.charAt(i)=='1') {}
			else {
				valid=false;
			}
		}
		return valid;
	}
	
	/** This method allows validating that the hexadecimal numbers that enter
	 *  per parameter in other methods are indeed hexadecimal
	 * @param hex any hexadecimal number
	 * @return valid
	 */
	public boolean validTwo(String hex) {
		
		boolean valid=true;
		String hexUp=hex.toUpperCase();
		for(int i=0;i<hexUp.length();i++) {
			if(hexUp.charAt(i)=='A' || hexUp.charAt(i)=='B' || hexUp.charAt(i)=='C' || hexUp.charAt(i)=='D' || hexUp.charAt(i)=='E'|| hexUp.charAt(i)=='F' || hexUp.charAt(i)=='0' || hexUp.charAt(i)=='1' || hexUp.charAt(i)=='2' || hexUp.charAt(i)=='3' || hexUp.charAt(i)=='4' || hexUp.charAt(i)=='5' || hexUp.charAt(i)=='6' || hexUp.charAt(i)=='7' || hexUp.charAt(i)=='8' || hexUp.charAt(i)=='9') {
				}else {
					valid=false;
				}
		}
		
		return valid;
	}
	
	/** This method allows you to convert numbers in radians to decimals
	 * @param rad any number in radians
	 */
	public void radToGrad(double rad) {
		double res=(180*Math.PI)/(rad*Math.PI);
		
		result=res;
	}
	
	/** This method serves to find the logarithm of any number
	 * with base n
	 * @param num any real number strictly greater than zero
	 * @param base any number greater than zero of type int
	 */
	public void logN(double num, int base) {
		
		if(base!=0 && base!=0) {
		result=(Math.log10(num) / Math.log10(base));}
        
	}
	
	/** This method allows you to convert any number in degrees to radians
	 * @param grad number in degrees
	 */
	public void gradToRad(double grad) {
		result=grad*(Math.PI/180.0);
	}
	
	/** This method allows to find the root with base n of any non-negative real number
	 * @param base number strictly greater than zero
	 * @param n number strictly greater than zero of type int
	 */
	public void rootN(Double base, Double n) {
		
	        result=Math.pow(Math.E, Math.log(base)/n);
	    
	}
	
	/** This method is to rotate the variable that saves the results
	 * @return result results variable
	 */
	public double getResult() 
	{
		return result;
	}
	
	/** This method allows modifying the result variable
	 */
	public void setResult() 
	{
		result=0;
	}
	
	/** This method allows to modify the variable of results in case
	 * it is mandatory to keep them of type int
	 * @param numero
	 */
	public void setResult1(int numero) {
		result=numero;
	}
	
	/** This method allows to modify the variable of results in case
	 * it is mandatory to keep them double type
	 * @param numero
	 */
	public void setResult2(double numero) {
		result=numero;
	}
	
	/** This method is to rotate the variable that saves the messages
	 * @return result String data
	 */
	public String getMessage() {
		return message;
	}
	
	/** This method allows modifying the message variable in case
	 * data must be maintained as text strings
	 */
	public void setMessage() {
		message="";
	}
}
