import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    private String nombre;
    private int count;
    private int setValue;
    private int getValue;
    private int speed=0;
    
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Counter(String nom){
        this.nombre = nom;
    }
    public void act(){
        // Add your action code here.
    }
    public void add(int i){
        count = count + i;
    }
    public void setValue(int value){
        count = value;
    }
    public int getValue(int valor){
        count = count + speed;
        return count;
    }
}
