package de.lbl.controller;

import java.util.LinkedList;
import java.util.Queue;

import de.lbl.basic.Game;
import de.lbl.gui.Gui;

public class GameController implements ControlHandler
{

	private static ControlHandler	CC	= new GameController();

	private Gui							gui;
	private Game			game;

	private Queue<ControlAction>	pool;


	private GameController()
	{
		this.gui = new Gui();
		this.game = new Game();

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
			case ATTACK:
				break;
			default:
				break;

		}
	}


	private void canDo(question Question)
	{}

}
