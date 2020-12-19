package io.github.townyadvanced.flagwar;

import java.util.TimerTask;

public class CellAttackThread extends TimerTask {

	CellUnderAttack cell;

	public CellAttackThread(CellUnderAttack cellUnderAttack) {

		this.cell = cellUnderAttack;
	}

	@Override
	public void run() {

		cell.changeFlag();
		if (cell.hasEnded())
			FlagWar.attackWon(cell);
	}
}
