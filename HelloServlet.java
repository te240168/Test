import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(urlPatterns={"/test_servlet_3/HelloServlet"})

public class HelloServlet extends HttpServlet {
        public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
            PrintWriter out = res.getWriter();
            out.println(“Hello”);
    }
}