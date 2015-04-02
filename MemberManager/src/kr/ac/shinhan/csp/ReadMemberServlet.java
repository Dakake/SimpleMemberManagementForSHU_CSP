package kr.ac.shinhan.csp;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.*;

public class ReadMemberServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		String name = req.getParameter("name");
		
		List<Member> namedMemberList = MemberManager.getMemberByName(name);
		Member m = namedMemberList.get(0);
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/plain"); 
		
		resp.getWriter().println("<html>");
		resp.getWriter().println("<body>");
		resp.getWriter().println("�̸� : "+m.getName() +"<br>");
		resp.getWriter().println("�ֹι�ȣ : "+m.getSocialNumber() +"<br>");
		resp.getWriter().println("��ü Ű : "+m.getId() +"<br>");
		
		resp.getWriter().println("</body>");
		resp.getWriter().println("</html>");
		
	}

}
