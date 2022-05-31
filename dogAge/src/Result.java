

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Result
 */
@WebServlet("/Result")
public class Result extends HttpServlet{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name=request.getParameter("name");
		String age=request.getParameter("age");

		String errorMsg="";
		String msg="";
		if(name == null||name.length()==0) {
			errorMsg +="名前が入力されていません<br>";
		}
		if(age == null||age.length()==0) {
			errorMsg +="年齢が入力されていません<br>";
		}
		else {
			int ageI = Integer.parseInt(age);
			msg=name+"("+ageI+"歳)は人間に換算すると"+ageI*7+"歳です。";
		}
		if(errorMsg.length()!=0) {
			msg=errorMsg;
		}
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out =response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>お犬様</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>"+msg+"</p>");
		out.println("<a href=\"/dogAge/index.jsp\">戻る</a>");
		out.println("</body>");
		out.println("</html>");

	}
}
