package com.codyortiz.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.codyortiz.web.models.Roster;
import com.codyortiz.web.models.Team;

/**
 * Servlet implementation class Teams
 */
@WebServlet("/Teams")
public class Teams extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Teams() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		if (request.getParameter("id") == null) {
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/view/NewTeam.jsp");
		    view.forward(request, response);
		}
		else {
			int index = Integer.parseInt(request.getParameter("id"));
			System.out.println(index);
			session.setAttribute("id", index);
			
			Roster roster = (Roster) session.getAttribute("roster");
			Team t = roster.getTeam(index);
			session.setAttribute("team", t);
			
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/view/TeamInfo.jsp");
		    view.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String team = request.getParameter("team");
		session.setAttribute("team", team);
		
		Team t = new Team(team);
		//Test for team name 
		System.out.println(t.getTeamName());
		
		Roster roster = (Roster) session.getAttribute("roster");
		roster.addTeam(t);
		System.out.println("Team added");
		response.sendRedirect("/TeamRoster/Home");
	}

}
