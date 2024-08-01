import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Brick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Brick extends Actor
{
    /**
     * Act - do whatever the Brick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
    
    public Brick(){
        GreenfootImage image = new GreenfootImage(50,20);
        image.setColor(Color.RED);
        image.fillRect(0,0,50,20);
        setImage(image);
    }
}
