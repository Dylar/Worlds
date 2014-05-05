package de.lbl.controller;

public interface ControlHandler
{
	public enum GameAction
	{
		ATTACK
	}
	
	
	public void scheduleAction(ControlAction ca);
	public ControlAction getNewAction();

}
