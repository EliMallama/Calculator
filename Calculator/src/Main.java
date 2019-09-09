import Calculator;

import java.lang.Math;

import java.util.*;

/** This class is where the interaction with the user is made
 * @author Eli Mallama
 *
 */
public class Main {
	
	//variables to save results and use as memories
	private static int operations=-1;
	private static double a=0;
	private static double b=0;
	private static double c=0;
	private static double d=0;
	private static double e=0;
	private static double f=0;
	private static double g=0;
	private static double h=0;
	private static double i=0;
    private static double j=0;	

    /** The method launch the application
     * @param args
     */
	public static void main(String[] args) {
		
		//calculator's object type that performs the operations
		Calculator calc=new Calculator();
		
		System.out.println("Estimado usuario, por favor lea con atencion los comandos e instrucciones de uso");
		System.out.println("al comenzar el programa le preguntará por la operacion que desea realizar, la cual sera automaticamente operada con cero(0)");
		System.out.println("estos son los comandos de las operaciones que puede hacer con su respectiva descripcion:");
		System.out.println("1. puede sumar tecleando el simbolo: +");
		System.out.println("2. puede restar tecleando el simbolo: -");
		System.out.println("3. puede multiplicar tecleando el simbolo: * ");
		System.out.println("4. puede dividir tecleando el simbolo: / ");
		System.out.println("5. puede realizar la operación módulo tecleando el simbolo: % ");
		System.out.println("6. puede hallar la raiz cuadrada tecleando: sqrt (en minusculas, por favor) ");
		System.out.println("7. puede elevar un numero a cualquier potencia tecleando: pow ");
		System.out.println("8. puede hallar el factorial de un numero tecleando el simbolo: ! ");
		System.out.println("9. puede convertir de decimales a binarios tecleando: db (en minusculas, por favor) ");
		System.out.println("10. puede convertir de decimales a hexadecimales tecleando: dh (en minusculas, por favor) ");
		System.out.println("11. puede convertir de binarios a decimales tecleando: bd (en minusculas, por favor ");
		System.out.println("12. puede convertir de binarios a hexadecimales tecleando: bh (en minusculas, por favor) ");
		System.out.println("13. puede convertir de hexadecimales a decimales tecleando: hd (en minusculas, por favor) ");
		System.out.println("14. puede convertir de hexadecimales a binarios tecleando: hb (en minusculas, por favor) ");
		System.out.println("15. puede convertir un numero a notacion cientifica tecleando: nc (en minusculas, por favor) ");
		System.out.println("16. puede convertir de grados a radianes tecleando: gr (en minusculas, por favor) ");
		System.out.println("17. puede convertir de radianes a grados tecleando: rd (en minusculas, porfavor) ");
		System.out.println("18. puede calcular la funcion seno tecleando: sin (en minusculas, por favor) ");
		System.out.println("19. puede calcular la funcion coseno tecleando: cos (en minusculas, por favor) ");
		System.out.println("20. puede calcular la funcion tangente tecleando: tan (en minusculas, por favor)");
		System.out.println("21. puede hallar un logaritmo base 10 tecleando: n10 (la n en minusculas, por favor) ");
		System.out.println("22. puede hallar un logaritmo de cualquier base tecleando: n (minuscula, por favor) ");
		System.out.println("23. puede hallar la raiz n-ésima de un numero tecleando: nroot (en minusculas, por favor) ");
		System.out.println("24. puede acceder a las memorias de los 10 ultimos resultados (los puede operar) tecleando: memo (en minusculas, por favor) ");
		System.out.println("le recuerdo, que si no es mucho pedir, escriba los comandos (de letras) en minusculas");
	
		//scanner class object to read keyboard inputs
		Scanner in=new Scanner(System.in);
	
		
		 System.out.println("Calculator");
        
		 //Stop condition for the while cycle
		 boolean exit=false;
		 
		 while(exit==false) 
		 {
			 
			 double temp=calc.getResult();
			 operations++;
			 if(operations==1) {a=temp;}
			 if(operations==2) {b=temp;}
			 if(operations==3) {c=temp;}
			 if(operations==4) {d=temp;}
			 if(operations==5) {e=temp;}
			 if(operations==6) {f=temp;}
			 if(operations==7) {g=temp;}
			 if(operations==8) {h=temp;}
			 if(operations==9) {i=temp;}
			 if(operations==10) {
				 j=temp; 
			 operations=0;}
			 //when operations equals zero it means that the memory is full
			 
			 
			 
			 System.out.println("Digite operación");
			 String option=in.nextLine();
			 in.nextLine();
			 
			 
			 //take the selected operation for the program to perform
			 switch(option) 
			 {
			 
			 case "+": System.out.println("Digite número");
				       double adds=in.nextDouble();
			 		   in.nextLine();
			           calc.add(adds);
			           System.out.println(calc.getResult());
			           break;
			           
			           
			 case "-":System.out.println("Digite número");
			          double subtracting=in.nextDouble();
			           in.nextLine();
			           calc.subtract(subtracting);
			           System.out.println(calc.getResult());
			           break;
			 
			 case "*":System.out.println("Digite número");
	                  double multipler=in.nextDouble();
	                  in.nextLine();
	                  calc.multiplication(multipler);
	                  System.out.println(calc.getResult());
	                  break;
	                  
			 case "/":if(calc.getResult()==0) {
				 System.out.println("Digite divisor");
                 double divider=in.nextDouble();
                 in.nextLine();
                 System.out.println("Digite dividendo");
                 double dividend=in.nextDouble();
                 calc.divisionTwo(divider, dividend);
			  
                 if(dividend==0) {
                	 System.out.println(calc.getMessage());
                	 calc.setResult();
                 }else {
                 
                 System.out.println(calc.getResult());}
			 }else {
				 
				 
				 System.out.println("Digite número");
                      double dividend=in.nextDouble();
                      in.nextLine();
             calc.division(dividend);
             if(dividend==0) {
            	 System.out.println(calc.getMessage());
            	 calc.setResult();
             }else {
             
             System.out.println(calc.getResult());}
            
			 }
             break;
             
			 case"%":if(calc.getResult()==0) {
				 System.out.println("Digite divisor"); 
                 double dividerA=in.nextDouble(); 
                 in.nextLine();
                 System.out.println("Digite dividendo");
                 double dividendB=in.nextDouble();
                 
                 
			     if(dividendB==0) {
            	 System.out.println("resultado indefinido");
            	 calc.setResult();
             }else {
            	 calc.modulusTwo(dividerA, dividendB);
            	 System.out.println(calc.getResult());
             }
			 }else {
				 System.out.println("Digite número");
                 double dividendC=in.nextDouble();
                 in.nextLine();
                 if(dividendC==0) {
                	 System.out.println("resultado indefinido");
                	 calc.setResult();
                 }else {
                	 calc.modulus(dividendC);
                	 System.out.println(calc.getResult());
                 }
			 }
            	 
             break;
             
			 case "sqrt":if(calc.getResult()==0) {
				 System.out.println("digite numero");
				  double radicand=in.nextDouble();
	               in.nextLine();
	               if(radicand > 0) {
	               calc.squareRoot(radicand);
	               System.out.println(calc.getResult());
	               }else {
	            	   System.out.println("dominio imaginario");
	               }
			 }else {
				 if(calc.getResult() > 0) {
		               calc.squareRoot(calc.getResult());
		               System.out.println(calc.getResult());
		               }else {
		            	   System.out.println("dominio imaginario");
		            	   calc.setResult();
		               }
			 }
				 
				 break;
				 
			 case "pow":if(calc.getResult()==0) {
				 System.out.println("digite una base");
				  double base=in.nextDouble();
	               in.nextLine();
                System.out.println("digite un exponente");
	  				  int indexA=in.nextInt();
	  	               in.nextLine();
	  	               calc.powTwo(base, indexA);
	  	             System.out.println(calc.getResult());
			 }else {
				 
				 System.out.println("digite exponente de tipo entero");
			  int index=in.nextInt();
              in.nextLine();
              calc.pow(index);
              System.out.println(calc.getResult());
			 } 
			 
			 break;
			 
			 case "!":if(calc.getResult()==0) {
				 System.out.println("digite numero de tipo entero");
				  int factor=in.nextInt();
	               in.nextLine();
	               if(factor!=0) {
	            	   calc.factorial(factor);
	            	   System.out.println(calc.getResult());
	               }else {
	            	   calc.setResult1(1);
	  				 System.out.println(calc.getResult());
	               }
				 
			 }else {
				 int result1=(int)calc.getResult();
				 if(result1!=0) {
	            	   calc.factorial(result1);
	            	   System.out.println(calc.getResult());
	               }else {
	            	   calc.setResult1(1);
	  				 System.out.println(calc.getResult());
	               }
			 }
				 
				 break;
				 
			 case "db": if(calc.getResult()==0) {
				 System.out.println("digite numero de tipo entero");
			  int dec=in.nextInt();
              in.nextLine();
              calc.decToBin(dec);
              System.out.println(calc.getMessage());
			 } else {
				 int result2=(int)calc.getResult();
				 if(result2!=0) {
	            	   calc.decToBin(result2);
	            	   System.out.println(calc.getMessage());
	               }
	               }
			 
              break;
              
			 case "dh": if(calc.getResult()==0) {
				 System.out.println("digite numero de tipo entero");
				  int numberA=in.nextInt();
	               in.nextLine();
	            
	            	   calc.decToHex(numberA);
	            	   System.out.println(calc.getMessage());
			 } else {
	  				 int result3=(int)calc.getResult();
					 calc.decToHex(result3);
		             System.out.println(calc.getMessage());
		               
	               }
			 
				 
				 break;
				 
			 case "bh": calc.setResult();
			 System.out.println("digite numero binario");
			  String binary=in.nextLine();
              in.nextLine();
              if(calc.validate(binary)) {
            	  calc.binToHex(binary);
            	  System.out.println(calc.getMessage());
              }else {
            	  System.out.println("no valid option");
              }
			 break;
			 
			 case "bd":calc.setResult();
			 System.out.println("digite numero binario");
			  String binarioA=in.nextLine();
             in.nextLine();
             if(calc.validate(binarioA)) {
           	  calc.binToDec(binarioA);
           	  System.out.println(calc.getResult());
             }else {
           	  System.out.println("no valid option");
             }
				 break;
				 
			 case "hd":calc.setResult();
			 System.out.println("digite numero hexadecimal");
			  String hexa=in.nextLine();
            in.nextLine();
            if(calc.validTwo(hexa)) {
          	  calc.hexToDec(hexa);
          	  System.out.println(calc.getResult());
            }else {
          	  System.out.println("no valid option");
            } 
				 break;
				 
			 case "hb": calc.setResult();
			 System.out.println("digite numero hexadecimal");
			  String hexaB=in.nextLine();
           in.nextLine();
           if(calc.validTwo(hexaB)) {
         	  
         	  System.out.println(calc.hexToBin(hexaB));
           }else {
         	  System.out.println("no valid option");
           } 
           break;
           
			 case "nc":if(calc.getResult()==0) { 
				 System.out.println("digite el numero que desea convertir a notacion cientifica");
             double not=in.nextDouble();
            System.out.println(String.format("%e",not));
			 } else {
				 System.out.println(String.format("%e",calc.getResult()));}
             
			 
			 break;
			 
			 case "rg": calc.setResult();
			 System.out.println("digite numero en radianes");
			  double rad=in.nextDouble();
              in.nextLine();
              calc.radToGrad(rad);
              System.out.println(calc.getResult());
              break;
              
			 case "gr": calc.setResult();
			 System.out.println("digite numero en grados");
			  double grad=in.nextDouble();
             in.nextLine();
             calc.gradToRad(grad);
             System.out.println(calc.getResult());
             break;
             
             //this case is to calculate the sine function
			 case "sin": if(calc.getResult()==0) {
				 System.out.println("digite numero");
			  double sin=in.nextDouble();
              in.nextLine();
              double res=Math.sin(sin);
              calc.setResult2(res);
              System.out.println(calc.getResult());
			 } else {
				 double resA=Math.sin(calc.getResult());
	              calc.setResult2(resA);
	              System.out.println(calc.getResult());
	        }
			 break;
			 
			 //This case is to calculate the cosine function
			 case "cos": if(calc.getResult()==0) {
				 System.out.println("digite numero");
			  double cos=in.nextDouble();
              in.nextLine();
              double resB=Math.cos(cos);
              calc.setResult2(resB);
              System.out.println(calc.getResult());
			 } else {
				 double resC=Math.cos(calc.getResult());
	              calc.setResult2(resC);
	              System.out.println(calc.getResult());
	        }
			 break;
			 
			 //this case is to calculate the tangent function
			 case "tan": if(calc.getResult()==0) {
				 System.out.println("digite numero");
			  double tan=in.nextDouble();
              in.nextLine();
              double resF=Math.tan(tan);
              calc.setResult2(resF);
              System.out.println(calc.getResult());
			 } else {
				 double resK=Math.tan(calc.getResult());
	              calc.setResult2(resK);
	              System.out.println(calc.getResult());
	        }
			 break;
			 
			 case "n": if(calc.getResult()==0) {
				 System.out.println("digite numero");
				  double log=in.nextDouble();
	             in.nextLine();
	             System.out.println("digite la base del logaritmo");
				  int base=in.nextInt();
	              in.nextLine();
	              calc.logN(log, base);
	              System.out.println(calc.getResult());
			 }else {
				 System.out.println("digite la base del logaritmo");
			  int baseA=in.nextInt();
              in.nextLine();
				 
			double logA=(calc.getResult());
				 calc.logN(logA, baseA);
				 System.out.println(calc.getResult());
			 }
			 break;
			 
			 //This case is for calculating the base 10 logarithm
			 case "n10":if(calc.getResult()==0) {
				 System.out.println("digite numero");
				  double logD=in.nextDouble();
	             in.nextLine();
	             if(logD!=0) {
	             double logP=Math.log10(logD);
	             calc.setResult2(logP);
	             System.out.println(calc.getResult());
	             }
			 }
	             else {
	            	double logF=Math.log10(calc.getResult());
	            	calc.setResult2(logF);
	            	System.out.println(calc.getResult());
	            	
	             }
	             	 
			 break;
			 
			 case "nroot":if(calc.getResult()==0) {
				 		  System.out.println("digite base");
				 		  double baseN=in.nextDouble();
				 		  in.nextLine();
				 		  System.out.println("digite exponente");
						  double exponenteN=in.nextDouble();
			              in.nextLine();
			              calc.rootN(baseN, exponenteN);
			              System.out.println(calc.getResult());
			 		      }else {
			 		    	 System.out.println("digite exponente");
							  double exponenteNE=in.nextDouble();
				              in.nextLine();
				              calc.rootN(calc.getResult(), exponenteNE);
				              System.out.println(calc.getResult());
			 		      }
				 break;
				 
				//  these are the last 10 memories of variable character
			 case "memo":
				 System.out.println("memorias disponibles 1="+a+" 2="+b+" 3="+c+" 4="+d+" 5="+e+" 6="+f+" 7="+g+" 8="+h+" 9="+i+" 10="+j);
				 System.out.println("digite la memoria que desea usar");
			 				int memo=in.nextInt();
			 				in.nextLine();
			 				switch(memo) 
			 				{
			 				case 1:calc.setResult2(a);break;
			 				case 2:calc.setResult2(b);break;
			 				case 3:calc.setResult2(c);break;
			 				case 4:calc.setResult2(d);break;
			 				case 5:calc.setResult2(e);break;
			 				case 6:calc.setResult2(f);break;
			 				case 7:calc.setResult2(g);break;
			 				case 8:calc.setResult2(h);break;
			 				case 9:calc.setResult2(i);break;
			 				case 10:calc.setResult2(j);break;
			 				default: System.out.println("invalid option");break;
			 				}
			 				
				 break;
			 
			 }
			
			 System.out.println(" 1. continue 2. reset ");
			 int cont=in.nextInt();
			 in.nextLine();
		     if(cont==2) {calc.setResult();}
			 //
			 
		 }
       
	}
	
	
	
	
	

	
	
}
