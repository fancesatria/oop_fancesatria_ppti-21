/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package player;

import dungeon.IAttack;
import dungeon.IDamageable;

/**
 *
 * @author fance
 */
public class Enemy extends Actor implements IAttack, IDamageable {

    public Enemy(String name, HP hp, int attack, int defense) {
        super(name, hp, attack, defense);
    }
    
    public void updateHP(int damage){
        hp.setHealthPoint(hp.getHealthPoint() - damage);
    }

    @Override
    public void attack(IDamageable damageable) {
        System.out.println(name + " attacking "+((Enemy) damageable).getName());
        System.out.println(((Enemy) damageable).getName() + " is taking damage for "+ attack + " points");
        damageable.takeDamage(attack, defense);
    }

    public void showHP() {
        System.out.println(name + " current HP is "+hp.getHealthPoint());
    }

    @Override
    public int takeDamage(int damage, int defense) {
        int trueDamage = 0;
        if(damage > this.defense) trueDamage = defense - this.defense;
        updateHP(trueDamage);
        return trueDamage;
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
    
    
    
}
