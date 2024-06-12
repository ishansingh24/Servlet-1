/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.GenericServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author gauta
 */
public class firstServlet extends HttpServlet{

//    private ServletConfig conf;
//    @Override
//    public void init(ServletConfig config) throws ServletException {
//        this.conf = config;
//        System.out.println("creating object");
//    }

//    @Override
//    public ServletConfig getServletConfig() {
//        return conf;
//    }

//    @Override
//    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//        System.out.println("servicing ------- ");
//        // Set the content type of the response
//        res.setContentType("text/html");
//        
//        String fname = req.getParameter("firstName");
//        String lname = req.getParameter("lastName");
//        String email = req.getParameter("email");
//        // Get the PrintWriter object to write the response
//        PrintWriter out = res.getWriter();
//        
//        // Write the HTML content to the response
//        out.println("<html>");
//        out.println("<head><title>Sample Servlet Response</title></head>");
//        out.println("<body>");
//        out.println("<h1>Hello, Servlet!</h1>");
//        out.println("<p>This is a sample servlet response.</p>");
//        out.println("<h1>firstName: " + fname + "</h1>");
//        out.println("<h1>lastName : " + lname + "</h1>");
//        out.println("<h1>Email    : " + email + "</h1>");
//        out.println("</body>");
//        out.println("</html>");
//
//        // Close the PrintWriter
//        out.close();
//    }

//    @Override
//    public String getServletInfo() {
//        return "this is created by ishan";
//    }
//
//    @Override
//    public void destroy() {
//        System.out.println("object destroyed");
//    }

    /**
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        
        PrintWriter out = resp.getWriter();
        
        String fname = req.getParameter("firstName");
        String lname = req.getParameter("lastName");
        String email = req.getParameter("email");
        
        // Write the HTML content to the response
        out.println("<html>");
        out.println("<head><title>Sample Servlet Response</title></head>");
        out.println("<body>");
        out.println("<h1>Hello, Servlet!</h1>");
        out.println("<p>This is a sample servlet response.</p>");
        out.println("<h1>firstName: " + fname + "</h1>");
        out.println("<h1>lastName : " + lname + "</h1>");
        out.println("<h1>Email    : " + email + "</h1>");
        out.println("</body>");
        out.println("</html>");

        // Close the PrintWriter
        out.close();
    }
    
}
