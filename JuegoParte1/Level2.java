import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level2 extends World
{
    static Counter puntaje = new Counter("Puntaje : ");
    static Counter vida = new Counter("Vida : ");
    public Level2()
    {    
        super(950, 550, 1); 
        prepare();
    }
    public void act()
    {
        if(Greenfoot.getRandomNumber(160)<3){
            addObject(new Fish1(),948, Greenfoot.getRandomNumber(360));
        }
        if(Greenfoot.getRandomNumber(90)<3){
            addObject(new Fish2(),948, Greenfoot.getRandomNumber(360));
        }
        if(Greenfoot.getRandomNumber(120)<3){
            addObject(new Fish3(),948, Greenfoot.getRandomNumber(360));
        }
        if(Greenfoot.getRandomNumber(300)<3){
            addObject(new Predator1(),948, Greenfoot.getRandomNumber(360));
        }
        if(Greenfoot.getRandomNumber(300)<3){
            addObject(new Predator2(),948, Greenfoot.getRandomNumber(360));
        }
    }    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        MainFish mainFish = new MainFish();
        addObject(mainFish,60,289);
        Fish1 fish1 = new Fish1();
        addObject(fish1,712,67);
        Fish1 fish12 = new Fish1();
        addObject(fish12,858,456);
        Predator1 predator1 = new Predator1();
        addObject(predator1,551,53);
        Predator1 predator12 = new Predator1();
        addObject(predator12,806,104);
        Predator2 predator2 = new Predator2();
        addObject(predator2,646,415);
        predator2.setLocation(596,411);
        Fish2 fish2 = new Fish2();
        addObject(fish2,787,493);
        predator12.setLocation(928,398);
        predator12.setLocation(925,460);
        fish12.setLocation(785,449);
        fish2.setLocation(624,510);
        Fish1 fish13 = new Fish1();
        addObject(fish13,455,397);
        Fish3 fish3 = new Fish3();
        addObject(fish3,409,474);
        Fish3 fish32 = new Fish3();
        addObject(fish32,369,16);
        predator1.setLocation(574,102);
        Fish1 fish14 = new Fish1();
        addObject(fish14,434,142);
        Fish2 fish22 = new Fish2();
        addObject(fish22,827,62);
        
        addObject(puntaje,80,45);
        puntaje.setValue(0);
        addObject(vida, 870,45);
        vida.setValue(3);
        
        Greenfoot.playSound("water.wav");
    }
}
