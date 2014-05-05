package de.lbl.controller;



public interface ControlListener
{
	public ControlAction getNewAction();
	public void tryAction(ControlAction ca);
}
