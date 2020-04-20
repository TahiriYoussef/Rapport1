package presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import dao.IDao;
import metier.IMetier;

public class PresAvecSpring {     
	public static void main(String[] args ) {
	ApplicationContext ctx=
			new ClassPathXmlApplicationContext("config.xml");
	IDao dao=(IDao) ctx.getBean("d");
	System.out.println(dao.getData());
	//IMetier metier=(IMetier) ctx.getBean("metier");
	IMetier metier= ctx.getBean(IMetier.class);

	System.out.println(metier.calculer());
	}
}