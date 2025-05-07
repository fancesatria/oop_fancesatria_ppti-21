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
public class Player extends Actor implements IAttack, IDamageable {

    public Player(String name, HP hp, int attack, int defense) {
        super(name, hp, attack, defense);
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
    
    public void updateHP(int damage){
        hp.setHealthPoint(hp.getHealthPoint() - damage);
    }

    @Override
    public void attack(IDamageable damageable) {
        damageable.takeDamage(attack, defense);
        System.out.println(name + " attacking " + ((Enemy) damageable).getName());
        System.out.println(((Enemy) damageable).getName() + " is taking damage for "+ attack + " points");
    }

    @Override
    public int takeDamage(int damage, int defense) {
        int trueDamage = 0;
        if(damage > this.defense) trueDamage = damage - this.defense;
        updateHP(trueDamage);
        return trueDamage;
    }
}
