package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImplementation implements IDao {

	@Override
	public double getData() {
		/*
		 *!je me connecte à la bdd 
		 */
		double res=98;
		return res;
		
	}
	public void init() {
		System.out.println("Instanciation de daoImplementation");
	}

}
