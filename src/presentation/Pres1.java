package presentation;

import dao.DaoImplementation;
import metier.MetierImplementation;

public class Pres1 {

	public static void main(String[] args) {
		DaoImplementation dao=new DaoImplementation();
		MetierImplementation metier=new MetierImplementation();
		metier.setDao(dao);
		System.out.println(metier.calculer());
		
	}

}
