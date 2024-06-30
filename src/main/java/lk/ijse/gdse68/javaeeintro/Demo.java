package lk.ijse.gdse68.javaeeintro;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(urlPatterns = "/demo",loadOnStartup = 2)
public class Demo extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("Hello init");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Hello Get Method");
    }

    @Override
    public void destroy() {
        System.out.println("Bye");
    }
}
