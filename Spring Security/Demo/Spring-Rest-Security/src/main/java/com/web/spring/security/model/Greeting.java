package com.web.spring.security.model;

public class Greeting {
	private String player;
	private String message;
	public String getPlayer() {
		return player;
	}
	public void setPlayer(String player) {
		this.player = player;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Greeting(String player, String message) {
		super();
		this.player = player;
		this.message = message;
	}
		
	public Greeting() {
		// TODO Auto-generated constructor stub
	}
	

}
