package presentation;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

import dao.DaoImplementation;
import dao.IDao;
import metier.IMetier;
import metier.MetierImplementation;

public class Pres2 {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, SecurityException, NoSuchMethodException {
		{
			/*DaoImplementation dao=new DaoImplementation();
	 		MetierImplementation metier=new MetierImplementation();
			metier.setDao(dao);
			System.out.println(metier.calculer());*/
         Scanner scanner=new Scanner(new File("config.txt"));
        String daoClassName=scanner.nextLine();//lire la première ligne du fichier texte
         //System.out.println(daoClassName);
         Class cDao=Class.forName(daoClassName);
         IDao dao= (IDao) cDao.newInstance(); //new instance fait appel au constructeur par défaut
         System.out.println(dao.getData());
        
        
        /*
         * 
         */
        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.newInstance();
        java.lang.reflect.Method method=cMetier.getMethod("setDao",IDao.class);
        method.invoke(metier, dao);
       System.out.println(metier.calculer());
		}
		
	}
}

