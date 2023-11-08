public class solarObject {
    protected double distance;
    protected double angleMult;
    protected double diameter;
    protected String colour;
    protected SolarSystem solar;

    public solarObject(double distance, double angleMult, double diameter, String colour, SolarSystem solar) {
        this.distance = distance;
        this.angleMult = angleMult;
        this.diameter = diameter;
        this.colour = colour;
        this.solar = solar;
    }
}
