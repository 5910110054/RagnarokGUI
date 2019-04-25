/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ragnarok;

/**
 *
 * @author KEEM
 */
public class Novice  {
    protected String name;
    protected int hp;
    protected int sp;
    protected int base;
    protected int job;
    protected int zeny;
    
    int kill = 0;

    
    public Novice(int inputValue,String inputname,int inputatk){
        this.hp = hp;
        this.sp = sp;
        this.base = base;
        this.job = job;
        this.zeny = zeny;
        this.name = inputname;
    }
    
    public int getHp(){
        return this.hp;
    }
    
    public int getSp(){
        return this.sp;
    }
    
    public int getBase(){
        return this.base;
    }
    
    public int getJob(){
        return this.job;
    }
    
    public int getZeny(){
        return this.zeny;
    }
    public String getName(){
        return this.name;
    }
    public void BAttack(Monsters monster){
            this.base = monster.getBase();
            
	}
}