package lk.ijse.gdse68.javaeeintro;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/customer")
public class Customer extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Method Name: "+req.getMethod());
        System.out.println("Context Path: "+req.getContextPath());
        System.out.println("Servlet Path: "+req.getServletPath());
        System.out.println("Path info: "+req.getPathInfo());
        System.out.println("Query String: "+req.getQueryString());
        System.out.println("Protocol: "+req.getProtocol());
        System.out.println("Scheme: "+req.getScheme());
        System.out.println("URL: "+req.getRequestURL());
        System.out.println("URI: "+req.getRequestURI());
        System.out.println("Path Translated: "+req.getPathTranslated());
    }
}
