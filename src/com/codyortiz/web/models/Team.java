package com.codyortiz.web.models;
import java.util.*;

public class Team {
	private String team_name;
	
	private ArrayList<Player> players = new ArrayList<Player>();
	
	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}
	

	public String getTeamName() {
		return team_name;
	}

	public void setTeamName(String team_name) {
		this.team_name = team_name;
	}
	
	public Team(String team_name) {
		this.team_name = team_name;
	}
	
	public Player getPlayer(int index) {
		return players.get(index);
	}
	
	public void addplayer (Player p) {
		players.add(p);
	}
	
	public void deletePlayer(Player p) {
		int index = players.indexOf(p);
		players.remove(index);
	}
	
}
