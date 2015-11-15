package factories;

import ships.*;

public class UFOEnemyShipFactory implements EnemyShipFactory {

	@Override
	public ESWeapon addESGun() {
		return new ESUFOGun(); //Specific to regular UFO
	}

	@Override
	public ESEngine addESEngine() {
		return new ESUFOEngine(); //Specific to regular UFO
	}

}
