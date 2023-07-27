package uz.mkh.javaservletdemo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DemoServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {


        res.setContentType("text/html");//setting the content type
        PrintWriter pw = res.getWriter();//get the stream to write the data

//writing html in the stream
//        pw.println("<html><body>");
//        pw.println("Welcome to servlet");
//        pw.println("</body></html>");

        String n = req.getParameter("name");
        String p = req.getParameter("uPassword");


        if (p.equals("1111")) {
            RequestDispatcher rd = req.getRequestDispatcher("home");
            rd.forward(req, res);
        }else{
            pw.print("Sorry UserName or Password Error!");
            RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
            rd.include(req, res);

        }


        pw.close();//closing the stream
    }


}
