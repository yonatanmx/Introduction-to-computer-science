import java.util.*;

class Temperature {
	public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Please enter K,F or C and the temperature: ");
        String variable = reader.nextLine();
		double finalC, finalK, finalF;
		double CurrentTemp;

		switch (variable.charAt(0)) {
			case 'C':
				variable = variable.substring(2);
				CurrentTemp = Double.parseDouble(variable);
				finalC = CurrentTemp;
				finalK= finalC + 273.15;
				finalF = ((1.8) * (finalK - 273.15)) + 32;
				System.out.println(finalC + " C" + "\n" + finalF + " F" + "\n" + finalK + " K");
				break;
			case 'F':
				variable = variable.substring(2);
				CurrentTemp = Double.parseDouble(variable);
				finalF = CurrentTemp;
				finalC = (0.555) * (CurrentTemp - 32);
				finalK=finalC + 273.15;
				System.out.println(finalC + " C" + "\n" + finalF + " F" + "\n" + finalK + " K");
				break;
			case 'K':
				variable = variable.substring(2);
				CurrentTemp = Double.parseDouble(variable);
				finalK = CurrentTemp;
				finalC = CurrentTemp - 273.15;
				finalF = ((1.8) * (CurrentTemp - 273.15)) + 32;
				System.out.println(finalC + " C" + "\n" + finalF + " F" + "\n" + finalK + " K");
				break;
		
			default:
				break;
		}

        reader.close();
    }
}