package stringwork;

public class Enum2String {
	
	/*
	 * multiple ways to convert an Enum into String in Java
	 * use toString() method - return exact same String used to declare Enum from toString() method of Enum
	 * static name() method to convert an Enum into String.
	 */
	
	
	private enum LOAN {
        HOME_LOAN {
            
            public String toString() {
                return "Always look for cheaper Home loan";

            }
        },
        AUTO_LOAN {
            
            public String toString() {
                return "Cheaper Auto Loan is better";
            }
        },
        PERSONAL_LOAN{
            
            public String toString() {
                return "Personal loan is not cheaper any more";
            }
        }
    }
	
	/*
	 * Enum classes by default provide static name() method to convert an Enum into String.
	 * returns exactly same text which is used to declare enum in Java file.
	 */

	public static void main(String[] args) {
		
		// Java example to convert Enum to String in Java
        String homeLoan = LOAN.HOME_LOAN.name();
       System.out.println(homeLoan);

       String autoLoan = LOAN.AUTO_LOAN.name();
       System.out.println(autoLoan);

       String personalLoan = LOAN.PERSONAL_LOAN.name();
       System.out.println(personalLoan);
		
		
		
	}

}
