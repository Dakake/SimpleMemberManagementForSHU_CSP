package kr.ac.shinhan.csp;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class AddMemberServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
	
		String name = req.getParameter("name");
		String socialNumber = req.getParameter("socialNumber");
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/plain");
		
		Member m = MemberManager.addMember(name, socialNumber);
		
		resp.getWriter().println("<html>");
		resp.getWriter().println("<body>");
		resp.getWriter().println("�̸� : "+m.getName() +"<br>");
		resp.getWriter().println("�ֹι�ȣ : "+m.getSocialNumber() +"<br>");
		resp.getWriter().println("��ü Ű : "+m.getId() +"<br>");
		
		resp.getWriter().println("</body>");
		resp.getWriter().println("</html>");
	}
}
