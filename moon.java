public class moon extends solarObject{
    //Declares the variables
    protected int moonDistance;
    protected double moonAngleMult;
    /**
     * Creates a new moon a certain distance away from a planet
     * Returns nothing 
     * @param moonDistance How far away the moon is from the planet
     * @param moonAngleMult How fast the moon rotates around the planet
     * @param moonDiameter How large the moon is
     * @param moonColour Sets the colour of the moon
     * @param distance The distance the planet that the moon orbits is from the sun
     * @param angleMult The speed at which the planet the moon orbits is from the sun
     * @param solar The solarSystem that the moon is drawn onto
     */
    //Stores the values that the moon is using
    public moon(int moonDistance, double moonAngleMult, int moonDiameter, String moonColour, double distance, double angleMult, SolarSystem solar){
        super(distance, angleMult, moonDiameter, moonColour, solar);
        this.moonDistance = moonDistance;
        this.moonAngleMult = moonAngleMult;
    }
    /** 
     * Draws the moon onto the solar system
     * Returns nothing
     */
    //Draws a moon relative to the planet it is attatched to aswell as the parameters
    public void drawMoon(double ang){
        solar.drawSolarObjectAbout(moonDistance, ang*moonAngleMult, diameter, colour, distance, ang*angleMult);
        
    }
}
