package ships;

public abstract class EnemyShip {

	private String name;
	ESWeapon weapon;
	ESEngine engine;
	
	public String getName(){
		return name;
	}
	public void setName(String newName){
		this.name = newName;
	}
	public abstract void makeShip();
	public String toString(){
		return "The " + name + "has a top speed of " + engine + "and an attack power of " + weapon;
	}
	public void displayEnemyShip(){
	System.out.println(this);	
	}
	public void followHeroShip(){
		System.out.println(this.engine);
	}
	public void enemyShipShoots(){
		System.out.println(this.weapon);
	}
	
}
