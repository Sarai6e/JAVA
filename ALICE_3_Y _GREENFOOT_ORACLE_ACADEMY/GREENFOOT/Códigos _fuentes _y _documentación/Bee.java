import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Beedddd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee
 extends Actor
{
    //Create Instance vaiables first
    
    //Create constructors next
    
    //Create all methods next
    /**
     * Act - do whatever the Beedddd wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(3);
        if(Greenfoot.isKeyDown("let"))
        {
        turn(-15);
    }//endif
    if(Greenfoot.isKeyDown("right"))
    {
        turn(15);
    }//endif
}//end method act
}
