/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cartoon.battle;

/**
 *
 * @author User
 */
public abstract class Troops {
    protected int BaseHP, BaseAtk;
    protected int HP, Atk;

    public Troops(int BaseHP, int BaseAtk) {
        this.BaseHP = BaseHP;
        this.BaseAtk = BaseAtk;
        HP = BaseHP;
        Atk = BaseAtk;
    }

//    public Troops() {
//        HP = BaseHP;
//        Atk = BaseAtk;
//    }

    public int getBaseHP() {
        return BaseHP;
    }

    public void setBaseHP(int BaseHP) {
        this.BaseHP = BaseHP;
    }

    public int getBaseAtk() {
        return BaseAtk;
    }

    public void setBaseAtk(int BaseAtk) {
        this.BaseAtk = BaseAtk;
    }
    
    

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getAtk() {
        return Atk;
    }

    public void setAtk(int Atk) {
        this.Atk = Atk;
    }

    
    
    
}
