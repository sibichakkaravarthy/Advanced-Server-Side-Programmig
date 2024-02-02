import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addition")
public class AddTwoReqDispatch extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Get the parameters from the request
        String param1 = request.getParameter("number1");
        String param2 = request.getParameter("number2");

        // Parse parameters to integers
        int num1 = Integer.parseInt(param1);
        int num2 = Integer.parseInt(param2);

        // Add the numbers
        int sum = num1 + num2;

        // Set the sum in request attribute
        request.setAttribute("sum", sum);

        // Forward the request to another JSP page
        RequestDispatcher dispatcher = request.getRequestDispatcher("/result.jsp");
        dispatcher.forward(request, response);
    }
}
