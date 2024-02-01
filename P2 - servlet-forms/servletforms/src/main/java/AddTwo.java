import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/addition")
public class AddTwo extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Get the parameters from the request
        String param1 = request.getParameter("number1");
        String param2 = request.getParameter("number2");

        // Parse parameters to integers
        int num1 = Integer.parseInt(param1);
        int num2 = Integer.parseInt(param2);

        // Add the numbers
        int sum = num1 + num2;

        // Set the content type
        response.setContentType("text/html");

        // Get the PrintWriter
        PrintWriter out = response.getWriter();

        // Generate the HTML response
        out.println("<html><body>");
        out.println("<h2>Adding Two Numbers</h2>");
        out.println("<p>Number 1: " + num1 + "</p>");
        out.println("<p>Number 2: " + num2 + "</p>");
        out.println("<p>Sum: " + sum + "</p>");
        out.println("</body></html>");
    }
}
