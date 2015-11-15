package ships;

import factories.*;

public class UFOEnemyShip extends EnemyShip {

	EnemyShipFactory shipFactory;
	
	public UFOEnemyShip(EnemyShipFactory shipFactory){
		this.shipFactory=shipFactory;
	}
	@Override
	public void makeShip() {
		System.out.println("Making enemy ship " + getName());
		this.weapon = shipFactory.addESGun();
		this.engine = shipFactory.addESEngine();

	}

}
