package kr.ac.shinhan.csp;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class GAETestServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().println("<html>"
				+ "<body>"
				+ "<h1>�ȳ�, world</h1>"
				+ "</body>"
				+ "</html>");
	}
}
