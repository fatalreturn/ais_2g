package command;

import dao.DbDummy;
import dto.Product;
import servlet.RequestContext;
import servlet.ResponseContext;

//import dao.AbstractDaoFactory;
//import dao.ProductsDao;
public class AddProductCommand extends AbstractCommand{
	public ResponseContext execute(ResponseContext resc){
		RequestContext reqc=getRequestContext();//RequestContext縺ｫ縺ゅｋ繝ｪ繧ｯ繧ｨ繧ｹ繝域ュ蝣ｱ(繝代Λ繝｡繝ｼ繧ｿ)繧貞叙蠕�

		String[]pids=reqc.getParameter("pid");//map縺ｫ縺ゅｋ繝代Λ繝｡繝ｼ繧ｿ驟榊�励↓險ｭ螳�
		String pid = pids[0];//驟榊�励�ｮ繝代Λ繝｡繝ｼ繧ｿ繧呈歓蜃ｺ

		String[] names=reqc.getParameter("name");
		String name= names[0];

		String[] prices=reqc.getParameter("price");
		String price= prices[0];

		Product p = new Product();
		p.setPid(pid);
		p.setName(name);
		p.setPrice(price);

		DbDummy db = new DbDummy();
		db.addProduct(p);
		resc.setResult(db.getDatabase());//ResponseContext縺ｫ邨先棡繧定ｨｭ螳�
		resc.setTarget("view");//ResponseContext縺ｫ螳帛�医ｒ險ｭ螳�
		return resc;
	}
}
		//AbstractDaoFactory factory=AbstractDaoFactory.getFactory();
		//ProductsDao dao=factory.getProductsDao();
		//dao.addProduct(p);
		//resc.setResult(dao.getAllProducts());