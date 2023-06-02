package hello.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="helloServlet", urlPatterns = "/hello")  // 중복안됨
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("HelloServlet.service");         // soutm
        System.out.println("request = " + request);         // soutv
        System.out.println("response = " + response);

        String username = request.getParameter("username");
        System.out.println("username = " + username);

        response.setContentType("text/plain");            // 헤더정보에 들어감
        response.setCharacterEncoding("utf-8");           // 헤더정보에 들어감
        response.getWriter().write("hello "+username);  // 메세지 바디에 데이터가 들어간다
    }
}
