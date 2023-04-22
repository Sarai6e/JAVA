import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class spider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class spider extends Actor
{
    /**
     * Act - do whatever the spider wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
             move(3);
        if(Greenfoot.isKeyDown("let"))
        {
        turn(-15);
    }//endif
    turn(15);
    if(Greenfoot.isKeyDown("right"))
    {
        turn(-15);
    }//endif
}//end method act
    }

