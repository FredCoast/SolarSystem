public class solarObject {
    //Protected so that all the classes that inherit from it can access the variabels
    protected double distance;
    protected double angleMult;
    protected double diameter;
    protected String colour;
    protected SolarSystem solar;
    /**
     * Creates a new solar object that can be inherited by other classes
     * Returns nothing
     * @param distance
     * @param angleMult
     * @param diameter
     * @param colour
     * @param solar
     */
    public solarObject(double distance, double angleMult, double diameter, String colour, SolarSystem solar) {
        this.distance = distance;
        this.angleMult = angleMult;
        this.diameter = diameter;
        this.colour = colour;
        this.solar = solar;
    }
}
