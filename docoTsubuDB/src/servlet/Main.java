package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.GetMutterListLogic;
import model.Mutter;
import model.PostMutterLogic;
import model.User;

/**
 * Servlet implementation class Main
 */
@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Main() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		GetMutterListLogic gmll = new GetMutterListLogic();
		List<Mutter> ml =gmll.execute();
		request.setAttribute("mutterList",ml);



		HttpSession session= request.getSession();
		User loginUser=(User) session.getAttribute("loginUser");

		if(loginUser==null) {
			response.sendRedirect("/docoTsubuDB/");
		}else {

		RequestDispatcher rd=request.getRequestDispatcher("WEB-INF/jsp/main.jsp");
		rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String text =request.getParameter("text");

		if(text !=null && text.length() !=0) {

		HttpSession session= request.getSession();
		User loginUser=(User) session.getAttribute("loginUser");

		Mutter mutter =new Mutter(loginUser.getName(),text);
		PostMutterLogic pml=new PostMutterLogic();
		pml.execute(mutter);

		}else {
			request.setAttribute("errorMsg", "つぶやきが入力されていません");
		}

		GetMutterListLogic gmll=new GetMutterListLogic();
		List<Mutter> ml =gmll.execute();
		request.setAttribute("mutterList",ml);


		RequestDispatcher rd=request.getRequestDispatcher("WEB-INF/jsp/main.jsp");
		rd.forward(request, response);

	}

}
