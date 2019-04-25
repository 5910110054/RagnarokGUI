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
public class Monsters {
    private String name;
    private int base;
    private int job;
    private int zeny;
    private int select;
    
    public Monsters(int select){
        this.select = select;
        switch(select){
            case 0 : this.name = "Poring";
                       this.base = 50;
                       this.job = 100;
                       this.zeny = 111;
                       break;
            case 1 : this.name = "Angelling";
                    this.base = 70;
                    this.job = 120;
                    this.zeny = 199;
              
        }
        
    }
    public String getName(){
        return this.name;
    }
    public int getBase(){
        return this.base;
    }
    public void setBase(int a){
        this.base = a;
    }
    public int getJob(){
        return this.job;
    }
    public void setJob(int b){
        this.job = b;
    }
    public int getZeny(){
        return this.zeny;
    }
    public void setZeny(int c){
        this.zeny = c;
    }
    
     
}
