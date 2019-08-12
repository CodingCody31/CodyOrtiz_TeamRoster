package com.codyortiz.web.models;
import java.util.*;

public class Roster {
	
	private ArrayList<Team> teams = new ArrayList<Team>();
	
	public ArrayList<Team> getTeams(){
		return teams;
	}
	
	public void setTeams(ArrayList<Team> teams) {
		this.teams = teams;
	}
	
	public void addTeam (Team team_name) {
		getTeams().add(team_name);
	}
	
	public Team getTeam(int index) {
		return teams.get(index);
	}
	
	public void deleteTeam(Team team) {
		int index = teams.indexOf(team);
		teams.remove(index);
	}

}
