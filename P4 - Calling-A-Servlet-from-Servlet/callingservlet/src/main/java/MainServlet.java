import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/addition")

public class MainServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

        // Get the parameters from the request
        String param1 = req.getParameter("number1");
        String param2 = req.getParameter("number2");

        // Parse parameters to integers
        int num1 = Integer.parseInt(param1);
        int num2 = Integer.parseInt(param2);
        int sum;

        // Add the numbers
        sum = num1 + num2;

        int prod = sum * sum;

        // Printing the data
        PrintWriter out = res.getWriter();
        out.println("The sum of two is" + sum + "\n" + "The product is" + prod);

        // Printing the data in another Servlet using RequestDispatcher

        req.setAttribute("product", prod);
        // req.setAttribute("sum", sum);

        RequestDispatcher Reqdis = req.getRequestDispatcher("/callingservlet");
        Reqdis.forward(req, res);

    }
}
