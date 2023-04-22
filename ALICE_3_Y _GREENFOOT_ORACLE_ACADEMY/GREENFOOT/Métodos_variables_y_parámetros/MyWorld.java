import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Bee bee = new Bee();
        addObject(bee,196,196);
        fly fly = new fly();
        addObject(fly,433,328);
        spider spider = new spider();
        addObject(spider,28,85);
        fly fly2 = new fly();
        addObject(fly2,383,144);
        Bee bee2 = new Bee();
        addObject(bee2,326,66);
        Bee bee3 = new Bee();
        addObject(bee3,268,278);
        bee.setLocation(85,162);
        bee3.setLocation(193,245);
        Bee bee4 = new Bee();
        addObject(bee4,235,329);
        bee3.setLocation(185,245);
        bee.setLocation(107,163);
        fly.setLocation(388,282);
        fly2.setLocation(455,143);
        fly fly3 = new fly();
        addObject(fly3,329,193);
        fly fly4 = new fly();
        addObject(fly4,144,39);
        fly2.setLocation(529,149);
        fly.setLocation(484,268);
        fly.setLocation(456,271);
        spider spider2 = new spider();
        addObject(spider2,498,100);
        spider2.setLocation(504,66);
        spider spider3 = new spider();
        addObject(spider3,335,382);
        spider3.setLocation(343,368);
        spider spider4 = new spider();
        addObject(spider4,213,153);
        fly fly5 = new fly();
        addObject(fly5,45,331);
        bee2.act();
    }
}
