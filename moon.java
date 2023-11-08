public class moon extends solarObject{
    //Declares the variables
    protected int moonDistance;
    protected double moonAngleMult;
    //Stores the values that the moon is using
    public moon(int moonDistance, double moonAngleMult, int moonDiameter, String moonColour, double distance, double angleMult, SolarSystem solar){
        super(distance, angleMult, moonDiameter, moonColour, solar);
        this.moonDistance = moonDistance;
        this.moonAngleMult = moonAngleMult;
    }
    //Draws a moon relative to the planet it is attatched to aswell as the parameters
    public void drawMoon(double ang){
        solar.drawSolarObjectAbout(moonDistance, ang*moonAngleMult, diameter, colour, distance, ang*angleMult);
        
    }
}
