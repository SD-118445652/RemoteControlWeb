package com.sdoyle.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import com.sdoyle.POJOs.User;
import com.sdoyle.DAO.UserDAO;
public class LoginServlet extends HttpServlet {
        private UserDAO dao;
    @Override
    protected void doPost(HttpServletRequest request, 
                          HttpServletResponse response) 
                          throws ServletException, IOException {

        String url = "/index.html";

        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }

        // perform action and set URL to appropriate page
        if (action.equals("join")) {
            url = "/index.html";    // the "join" page
        }
        else if (action.equals("add")) {                
            // get parameters from the request
            String email = request.getParameter("email");
            String password = request.getParameter("password");

            // store data in User object and save User object in database
           // User user = new User(firstName, lastName, email);
           // UserDB.insert(user);
           User user = dao.getUserByUsername(email);
            
            // set User object in request object and set URL
            request.setAttribute("user", user);
            url = "/Shopping.jsp";   // the "thanks" page
        }
        
        // forward request and response objects to specified URL
        getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
    }    
    
    @Override
    protected void doGet(HttpServletRequest request, 
                          HttpServletResponse response) 
                          throws ServletException, IOException {
        doPost(request, response);
    }    
}