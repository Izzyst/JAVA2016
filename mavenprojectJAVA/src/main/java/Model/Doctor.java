package Model;

/**
 *
 * @author Izabela
 */
public class Doctor extends Player implements Strategy{
    
    public Doctor()
    {
        health =100;
        strength = 50;
        score =0;
    }

    
    public void actionForDoctor()
    {
        
        //Doctor ob = new Doctor();
        int x = getHealth();
        setHealth(x+cube());
        //return ob;
        
    }

    @Override
    public void action() {
      actionForDoctor();
      }
    
    
    
    
    
}
