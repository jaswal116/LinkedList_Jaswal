package stringwork;

public class String2Enum {
	
	/*
	 * Enum classes by default provide valueOf (String value) method 
	 * which takes a String parameter and converts it into an enum.
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

	
	
	public static void main(String[] args) {
		
		// Exmaple of Converting String to Enum in Java
        LOAN homeLoan = LOAN.valueOf("HOME_LOAN");
        System.out.println(homeLoan);

        LOAN autoLoan = LOAN.valueOf("AUTO_LOAN");
        System.out.println(autoLoan);

        LOAN personalLoan = LOAN.valueOf("PERSONAL_LOAN");
        System.out.println(personalLoan);

	}

}
/*
 *Output:
 * Always look for cheaper Home loan
 * Cheaper Auto Loan is better
 * Personal loan is not cheaper anymore
 * 
 */




