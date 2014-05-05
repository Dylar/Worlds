package de.lbl.controller;

import java.util.LinkedList;
import java.util.Queue;

import de.lbl.actionmanager.ActionManager;
import de.lbl.gui.Gui;

public class GameController implements ControlHandler
{

	private static ControlHandler	CC	= new GameController();

	private Gui							gui;
	private ActionManager			am;

	private Queue<ControlAction>	pool;


	private GameController()
	{}


	public void initController(Gui gui, ActionManager sm)
	{
		this.gui = gui;
		this.am = sm;

		this.pool = new LinkedList<ControlAction>();
	}


	public static ControlHandler getInstance()
	{
		return GameController.CC;
	}


	@Override
	public void scheduleAction(ControlAction ca)
	{
		// TODO hier dann gucken wie wir das mit der Queue machen
		tryAction(ca);
		addToPool(ca);
	}


	@Override
	public ControlAction getNewAction()
	{
		if (this.pool.isEmpty())
			return new ControlAction();
		return this.pool.poll().reset();
	}


	private void addToPool(ControlAction ca)
	{
		this.pool.add(ca);
	}


	private synchronized void tryAction(ControlAction ca)
	{
		switch (ca.action)
		{

		}
	}

}
