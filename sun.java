public class sun extends solarObject{
    public sun(double dia, String col, SolarSystem sol){
        super(0, 0, dia, col, sol);

    }

    public void drawSun(double angle){
        solar.drawSolarObject(0, angle, diameter, colour);
    }

}
