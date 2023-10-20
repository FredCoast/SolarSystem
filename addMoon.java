public class addMoon{
    //Declares the variables
    private int moonDistance;
    private double moonAngleMult;
    private int moonDiameter;
    private String moonColour;
    private double distance;
    private double angleMult;
    //Stores the values that the moon is using
    public addMoon(int moonDistance, double moonAngleMult, int moonDiameter, String moonColour, double distance, double angleMult){
        this.moonDistance = moonDistance;
        this.moonAngleMult = moonAngleMult;
        this.moonDiameter = moonDiameter;
        this.moonColour = moonColour;
        this.distance = distance;
        this.angleMult = angleMult;
    }
    //Draws a moon relative to the planet it is attatched to aswell as the parameters
    public void drawMoon(){
        solar.solar.drawSolarObjectAbout(moonDistance, solar.angle*moonAngleMult, moonDiameter, moonColour, distance, solar.angle*angleMult);
    }
}
