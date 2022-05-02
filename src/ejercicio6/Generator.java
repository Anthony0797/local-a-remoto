package ejercicio6;

import java.util.Random;

public class Generator {

	public static int generateNumber() {
		Random rdm = new Random();
		int randomNumber = rdm.nextInt(30)+1;
		return randomNumber;
	}

	public static String generateName() {
		Random rdm = new Random();
		int randomName = rdm.nextInt(7)+1;
		if(randomName==1)
			return "lunes";
		if(randomName==2)
			return "martes";
		if(randomName==3)
			return "miercoles";
		if(randomName==4)
			return "jueves";
		if(randomName==5)
			return "viernes";
		if(randomName==6)
			return "sabado";
		else
			return "domingo";
	}

	public static int generateCelsius() {
		Random rdm = new Random();
		return rdm.nextInt(41);
	}

}