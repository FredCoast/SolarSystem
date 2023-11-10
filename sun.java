public class sun extends solarObject{
    /**
     * Creates the sun in the centre of the solar system
     * 
     * @param diameter Sets the diameter of the sun
     * @param colour Sets the colour of the sun
     * @param solarSystem Sets the window the planet should be drawn on
     */

    public sun(double diameter, String colour, SolarSystem solarSystem){
        super(0, 0, diameter, colour, solarSystem);

    }
    /**
     * Draws the sun onto the solar system window and returns nothing
     * 
     * @param angle The angle which the earth is at
     */
    public void drawSun(double angle){
        solar.drawSolarObject(0, angle, diameter, colour);
    }

}
