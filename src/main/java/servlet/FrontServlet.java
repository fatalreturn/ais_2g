package servlet;
import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;



public class FrontServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException{
			doPost(req, res);
		}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)
        throws IOException, ServletException{
        	req.setCharacterEncoding("Windows-31J");

			ApplicationController app =new WebApplicationController();

			RequestContext reqc =app.getRequest(req);//繝ｪ繧ｯ繧ｨ繧ｹ繝域ュ蝣ｱ險ｭ螳�

			ResponseContext resc = app.handleRequest(reqc);//蜃ｦ逅�

			resc.setResponse(res);

			app.handleResponse(reqc, resc);
    }
}