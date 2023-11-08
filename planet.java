public class planet extends solarObject{
    public planet(double dist, double angleM, double dia, String col, SolarSystem sol){
        super(dist, angleM, dia, col, sol);
    }
    
    public void drawPlanet(double angle){
        solar.drawSolarObject(distance,angle*angleMult,diameter,colour);
    }

    public double getDistance(){
        return distance;
    }

    public double getAngleMult(){
        return angleMult;
    }
}
