import greenfoot.*;  

public class Counter extends Actor
{
   private String nombre;
   private int value=0;
    
    public Counter(String nom){
        this.nombre = nom;
    }
    public void act(){
        
    }
    public void add(int i){
        this.value = value + i;
    }
    public void setValue(int value){
        this.value = value;
    }
    public int getValue(int valor){
        return this.value;
    } 
}
