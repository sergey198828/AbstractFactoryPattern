package factories;

import ships.ESEngine;
import ships.ESWeapon;

public interface EnemyShipFactory {
	
	public ESWeapon addESGun();
	public ESEngine addESEngine();

}
