import mayflower.*;

public class gumba extends AnimatedActor
{
    private Animation walkRight, walkLeft;
    private String direction;
    /**
     * Constructor for objects of class gumba
     */
    public gumba()
    {
        String[] walkFiles = new String[2];
        for (int i = 0; i<walkFiles.length; i++)
        {
           walkFiles[i] = new String("characters/gumba/gumbaWalk(" + (i) + ").png"); 
        }
        walkRight = new Animation(50, walkFiles);
        
        walkLeft = new Animation(50, walkFiles);
        walkLeft.mirrorHorizontally();
        
        
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void act()
    {
       
    }
}
