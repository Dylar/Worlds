package de.lbl.controller;

public interface ControlHandler
{
	
	public void scheduleAction(ControlAction ca);
	public ControlAction getNewAction();

}
