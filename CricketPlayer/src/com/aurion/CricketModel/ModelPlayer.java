package com.aurion.CricketModel;

public class ModelPlayer {
	private int PlayerId;
	 private String name;
	 private int match;
	 private int runs;
	 private int wickets;
	 
	 
	 public ModelPlayer( int PlayerId, String name, int match,int runs, int wickets) {
	  this.PlayerId=PlayerId;
	  this.name=name;
	  this.match=match;
	  this.runs=runs;
	  this.wickets=wickets;
	 }
	 
	 public int getPlayerId() {
	  return PlayerId;
	 }

	 public void setPlayerId(int playerId) {
	  PlayerId = playerId;
	 }

	 public String getName() {
	  return name;
	 }

	 public void setName(String name) {
	  this.name = name;
	 }

	 public int getMatch() {
	  return match;
	 }

	 public void setMatch(int match) {
	  this.match = match;
	 }

	 public int getRuns() {
	  return runs;
	 }

	 public void setRuns(int runs) {
	  this.runs = runs;
	 }
	 
	 
	 

	 public int getWickets() {
	  return wickets;
	 }

	 public void setWickets(int wickets) {
	  this.wickets = wickets;
	 }
	 public double average() {
	  return this.runs/this.match;
	 }
	 public void display() {
	  System.out.println(this.PlayerId);
	  System.out.println(this.name);
	  System.out.println(this.match);
	  System.out.println(this.runs);
	  System.out.println(this.wickets);
	  System.out.println(average());
	 }
	}


