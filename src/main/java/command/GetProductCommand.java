package command;

import dao.DbDummy;
import servlet.ResponseContext;

//import dao.AbstractDaoFactory;
//import dao.ProductsDao;

public class GetProductCommand extends AbstractCommand{
	public ResponseContext execute(ResponseContext resc){
		DbDummy db = new DbDummy();

		/*AbstractDaoFactory factory=AbstractDaoFactory.getFactory();
		ProductsDao dao=factory.getProductsDao();

		List products=dao.getAllProducts();
		*/
		resc.setResult(db.getDatabase());
		resc.setTarget("view");
		return resc;
	}
}
