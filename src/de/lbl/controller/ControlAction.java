package de.lbl.controller;

import java.util.HashMap;
import java.util.Map;

public class ControlAction
{
	public static final String		KEY_FROM				= "from";
	public static final String		KEY_MESSAGE			= "message";
	public static final String		KEY_SERVERHISTORY	= "server_history";
	public static final String		KEY_TIME				= "time";

	public static final String		KEY_IP				= "ip";
	public static final String		KEY_ID				= "id";
	public static final String		KEY_GESTURENAME	= "gesture_name";
	public static final String		KEY_JSON				= "json";
	public static final String		KEY_GESTURE			= "gesture";

	public static final String		KEY_SERVERSTATE	= "server_state";
	public static final String		KEY_TRAININGMODUS	= "trainingmodus";

	public static final String		KEY_ADD_TRAINER	= "add_trainer";
	public static final String		KEY_TRAINER			= "trainer";
	public static final String		KEY_PORT				= "port";

	public int							action;

	private Map<String, String>	stringValues;
	private Map<String, Double>	doubleValues;


	public ControlAction()
	{
		this.stringValues = new HashMap<String, String>();
		this.doubleValues = new HashMap<String, Double>();
	}


	public void setAction(int action)
	{
		this.action = action;
	}


	public int getAction()
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
		action = 0;
		stringValues.clear();
		doubleValues.clear();
		return this;
	}
}
