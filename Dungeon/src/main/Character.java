package main;

public class Character implements IAttack, IDamageable {
	protected String name;
	protected HP hp;
	protected int attack, defense;
	
	public Character(String name, HP hp, int attack, int defense) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HP getHp() {
		return hp;
	}

	public void setHp(HP hp) {
		this.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	@Override
	public int takeDamage(int damage, int defense) {
		int trueDamage = (damage > this.defense) ? damage - this.defense : 0;
		hp.setHealthPoint(hp.getHealthPoint() - trueDamage);
		return trueDamage;
	}

	@Override
	public void attack(IDamageable damageable) {
		System.out.println(name+" attacking "+((Enemy) damageable).getName());
		System.out.println(((Enemy) damageable).getName() + " is taking damage for "+attack+" point(s)");
		damageable.takeDamage(attack, defense);
	}
	
	
}
