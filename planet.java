public class planet extends solarObject{

    /**
     * Creates a planet a set distance away from the sun
     * The speed of which the planet moves can be customised as well as the colour and diameter of the planet
     * Returns nothing
     * 
     * @param dist
     * @param angleM
     * @param dia
     * @param col
     * @param sol
     */
    
    public planet(double dist, double angleM, double dia, String col, SolarSystem sol){
        super(dist, angleM, dia, col, sol);
    }
    /**
     * Draws the planet onto the solar system, returns nothing
     * @param angle The angle which the earth is at
     */
    public void drawPlanet(double angle){
        solar.drawSolarObject(distance,angle*angleMult,diameter,colour);
    }
    /**
     * Returns how far away the planet is from the sun
     * @return Returns how far away the planet is from the sun
     */
    public double getDistance(){
        return distance;
    }
    /**
     * Returns the angleMultiplier of the planet
     * @return Returns the angleMultiplier of the planet
     */
    public double getAngleMult(){
        return angleMult;
    }
}
