public class addMoon extends sun{
    //Declares the variables
    private int moonDistance;
    private double moonAngleMult;
    private int moonDiameter;
    private String moonColour;
    private double distance;
    private double angleMult;

    private SolarSystem solar;
    //Stores the values that the moon is using
    public addMoon(int moonDistance, double moonAngleMult, int moonDiameter, String moonColour, double distance, double angleMult, SolarSystem solar){
        super(distance, angleMult, moonDiameter, moonColour, solar);
        this.distance = distance;
        this.angleMult = angleMult;
    }
    //Draws a moon relative to the planet it is attatched to aswell as the parameters
    public void drawMoon(double ang){
        solar.drawSolarObjectAbout(moonDistance, ang*moonAngleMult, moonDiameter, moonColour, distance, ang*angleMult);
    }
}
