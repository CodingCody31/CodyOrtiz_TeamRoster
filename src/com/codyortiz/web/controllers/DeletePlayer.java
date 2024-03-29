package com.codyortiz.web.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.codyortiz.web.models.Player;
import com.codyortiz.web.models.Team;

/**
 * Servlet implementation class DeletePlayer
 */
@WebServlet("/DeletePlayer")
public class DeletePlayer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeletePlayer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		int index = Integer.parseInt(request.getParameter("teamid"));
		int index2 = Integer.parseInt(request.getParameter("playerid"));
		
		System.out.println("Show team index " + index);
		System.out.println("Show player index " + index2);
		
		Team t = (Team) session.getAttribute("team");
		Player p = t.getPlayer(index2);
		System.out.println(t.getPlayer(index2).getFirstName());
		
		t.deletePlayer(p);
		response.sendRedirect("/TeamRoster/teams?id=" + index);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
