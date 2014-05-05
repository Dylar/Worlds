package de.lbl.controller;

import java.util.HashMap;
import java.util.Map;

public class ControlAction
{
	public static final String			KEY_FROM	= "from";

	public ControlHandler.GameAction	action;

	private Map<String, String>		stringValues;
	private Map<String, Double>		doubleValues;


	public ControlAction()
	{
		this.stringValues = new HashMap<String, String>();
		this.doubleValues = new HashMap<String, Double>();
	}


	public void setAction(ControlHandler.GameAction action)
	{
		this.action = action;
	}


	public ControlHandler.GameAction getAction()
	{
		return this.action;
	}


	public double getDoubleValue(String key)
	{
		return (double) this.doubleValues.get(key);
	}


	public String getStringValue(String key)
	{
		return (String) this.stringValues.get(key);
	}


	public void putDoubleValue(String key, double value)
	{
		this.doubleValues.put(key, value);
	}


	public void putStringValue(String key, String value)
	{
		this.stringValues.put(key, value);
	}


	public ControlAction reset()
	{
		action = null;
		stringValues.clear();
		doubleValues.clear();
		return this;
	}
}
