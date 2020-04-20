package ext;

import dao.IDao;

public class DaoImplementationV2 implements IDao{

	@Override
	public double getData() {
	/*
	 *Version WS
	 */
		System.out.println("version WS");
		double d=12;
		return d;
	}

}
