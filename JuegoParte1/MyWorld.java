import greenfoot.*;  


public class MyWorld extends World
{
    static Counter puntaje = new Counter("Puntaje : ");
    static Counter vida = new Counter("Vida : ");
    
    public MyWorld()
    {    
        super(950, 550, 1); 
        prepare();
    }
    public void act()
    {
        if (Greenfoot.getRandomNumber(90)<3){
            addObject(new Fish1(),948, Greenfoot.getRandomNumber(360));
        }
        if (Greenfoot.getRandomNumber(150)<3){
            addObject(new Fish2(),948, Greenfoot.getRandomNumber(360));
        }
        if (Greenfoot.getRandomNumber(200)<3){
            addObject(new Predator1(),948, Greenfoot.getRandomNumber(360));
        }
        if (MyWorld.puntaje.getValue()>=50)
        {
         Greenfoot.delay(5);
         Greenfoot.setWorld(new Level2());
        }
    }
    private void prepare()
    {
        addObject(puntaje,80,45);
        puntaje.setValue(0);
        addObject(vida, 870,45);
        vida.setValue(3);
        
        MainFish mainFish = new MainFish();
        addObject(mainFish,86,281);
        Fish1 fish1 = new Fish1();
        addObject(fish1,652,58);
        Fish1 fish12 = new Fish1();
        addObject(fish12,468,500);
        Fish1 fish13 = new Fish1();
        addObject(fish13,823,211);
        Fish1 fish14 = new Fish1();
        addObject(fish14,477,140);
        fish12.setLocation(466,402);
        Fish1 fish15 = new Fish1();
        addObject(fish15,823,473);
        Fish2 fish2 = new Fish2();
        addObject(fish2,674,470);
        Fish2 fish22 = new Fish2();
        addObject(fish22,494,310);
        Fish2 fish23 = new Fish2();
        addObject(fish23,792,144);
        Predator1 predator1 = new Predator1();
        addObject(predator1,475,44);
        Predator1 predator12 = new Predator1();
        addObject(predator12,521,492);
        
        Greenfoot.playSound("water.wav");
    }
    
}
