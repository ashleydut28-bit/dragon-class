public class Dragon 
{
    // Instance variables
    private String name;
    private int level;
    private boolean canBreatheFire;
    
    // Constructor
    public Dragon(String dragonName, int dragonLevel)
    {
        name = dragonName;
        level = dragonLevel;
        
        
        if (dragonLevel>=70)
        {
            canBreatheFire = true;
        }
        else
        {
            canBreatheFire = false;
        }
    }
    
    // Accessor methods
    public String getName()
    {
        return name;
    }
    
    public int getLevel()
    {
        return level;
    }
    
    public boolean isFireBreather()
    {
        return canBreatheFire;
    }
    
    
    // Mutator methods
    public void setName (String dragonName)
    {
        name = dragonName;
    }
    
    public void setLevel(int dragonLevel)
    {
        level = dragonLevel;
        
         if (dragonLevel>=70)
        {
            canBreatheFire = true;
        }
        else
        {
            canBreatheFire = false;
        }
    }

    // String representation of the object
    public String toString()
    {
        return "Dragon " + name + " is at level " + level;
    }
}