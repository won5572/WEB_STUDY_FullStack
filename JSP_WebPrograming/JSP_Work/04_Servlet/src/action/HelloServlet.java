package action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/hello.serv")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//넘어온 파라미터 : greet.do?m_name=재휘&nation=eng
		//1. request객체를 통해 서블릿으로 넘어온 parameter 값을 받음.
		String nation = request.getParameter("nation");	
		String name = request.getParameter("m_name");
		
		/* 잘못된 파라미터의 예시
		   1) greet.do?m_name=&nation=eng
		   m_name이 ""인 상태
		   2) greet.do?nation=eng
		   m_name이 null인 상태 */
		//2. 파라미터 유효성 체크
		if(name == null || name.isEmpty()) {
			name = "unknown";
		}
		
		String msg = "";
		switch(nation) {
		case "kor" :
			msg = "안녕하세요";
			break;
		case "eng" :
			msg = "Hello";
			break;
		case "jpn" :
			msg = "곤니찌와";
			break;
		case "chn" :
			msg = "니하오";
			break;
		default :
			break;
		}
		
		//3. 응답
		response.setContentType("text/html; charset=utf-8"); //html문서 속성설정
		
		PrintWriter out = response.getWriter();	//출력 스트림 생성
		
		//HTML문서형태로 출력
		//직접 HTML문서를 정의해야 하는 것이 단점.
		out.println("<html>");
		out.println("<head>");
		out.println("<style> h1{color : blue;} </style>");
		out.println("</head>");
		out.println("<body>");
		out.print("<h1>" + msg);
		out.printf(" %s</h1>", name);
		out.println("</body>");
		out.println("</html>");
	}

}
