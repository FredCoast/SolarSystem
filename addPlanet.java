public class addPlanet {
    //Declares the variables
    private int distance;
    private double angleMult;
    private int diameter;
    private String colour;
    private SolarSystem solar;
    //Stores the values that the planet is using
    public addPlanet(int distance, double angleMult, int diameter, String colour, SolarSystem solar){
        this.distance = distance;
        this.angleMult = angleMult;
        this.diameter = diameter;
        this.colour = colour;
        this.solar = solar;
    }
    //Draws the planet based off the class parameters
    public void drawPlanet(double ang){
        solar.drawSolarObject(distance,ang*angleMult, diameter, colour);
    }
    public double returnDistance(){
        return distance;
    }
    public double returnMult(){
        return angleMult;
    }
}
