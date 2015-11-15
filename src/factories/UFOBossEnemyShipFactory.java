package factories;

import ships.*;

public class UFOBossEnemyShipFactory implements EnemyShipFactory {

	@Override
	public ESWeapon addESGun() {
		return new ESUFOBossGun(); //Specific to regular UFO
	}

	@Override
	public ESEngine addESEngine() {
		return new ESUFOBossEngine(); //Specific to regular UFO
	}

}