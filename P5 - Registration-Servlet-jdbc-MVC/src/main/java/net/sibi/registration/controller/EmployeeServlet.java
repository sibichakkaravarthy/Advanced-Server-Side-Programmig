package net.sibi.registration.controller;

import jakarta.servlet.ServletException;

import jakarta.*;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import jakarta.servlet.RequestDispatcher;

import net.sibi.registration.dao.EmployeeDao;
import net.sibi.registration.model.Employee;

/**
 * Servlet implementation class EmployeeServlet
 */

@WebServlet("/register")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    private EmployeeDao employeeDao = new EmployeeDao();

    public void init() {
        employeeDao = new EmployeeDao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().append("served at the URL:").append(request.getContextPath());
        RequestDispatcher reqdispatch = request.getRequestDispatcher("/WEB-INF/views/Employee.jsp");
        reqdispatch.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        String contact = request.getParameter("contact");

        Employee employee = new Employee();
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setUsername(username);
        employee.setPassword(password);
        employee.setContact(contact);
        employee.setAddress(address);

        try {
            employeeDao.registerEmployee(employee);
        } catch (Exception e) {
            e.printStackTrace();
            // request.setAttribute("error", "An error occurred during employee
            // registration. Please try again.");

            // request.getRequestDispatcher("errorPage.jsp").forward(request, response);
        }
        RequestDispatcher reqdispatch = request.getRequestDispatcher("/WEB-INF/views/employeedetails.jsp");
        reqdispatch.forward(request, response);

        // response.sendRedirect("employeedetails.jsp");
    }

}
