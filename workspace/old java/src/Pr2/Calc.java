package Pr2;

public class Calc {

	public Calc(){
			
	}
	
	public double EuDist(Point pt1, Point pt2){
		
		double xdist = (pt1.x - pt2.x)*(pt1.x - pt2.x);
		double ydist = (pt1.y - pt2.y)*(pt1.y - pt2.y);
		double dist  = Math.sqrt(xdist + ydist);
		return dist;
	}
}
