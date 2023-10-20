public class addPlanet {
    //Declares the variables
    private int distance;
    private double angleMult;
    private int diameter;
    private String colour;
    private double angle;
    //Stores the values that the planet is using
    public addPlanet(int distance, double angleMult, int diameter, String colour){
        this.distance = distance;
        this.angleMult = angleMult;
        this.diameter = diameter;
        this.colour = colour; 
    }
    //Draws the planet based off the class parameters
    public void drawPlanet(){
        solar.solar.drawSolarObject(distance,solar.angle*angleMult, diameter, colour);
    }
    public double returnDistance(){
        return distance;
    }
    public double returnMult(){
        return angleMult;
    }
}
