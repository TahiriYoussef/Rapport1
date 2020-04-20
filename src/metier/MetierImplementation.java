package metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dao.IDao;
@Component("metier")

public class MetierImplementation implements IMetier{

	/*
	 * Couplage faible
	  */
	@Autowired
	
	private IDao dao;
	
	public void setDao(IDao dao) {
		this.dao = dao;
		System.out.println("Injection des dépendances");
	}

	@Override
	public double calculer() {
		
		double d =dao.getData();
		double res=d*23;
		return res;
	
		
	}
	public void init()
	{
		System.out.println("Instanciation de metierImplementation");
	}
	

}
