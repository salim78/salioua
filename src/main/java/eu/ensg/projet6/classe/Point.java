package eu.ensg.projet6.classe;

/**
 * classe Point definir une géometrie Point(doublex, double y).
 * 
 * @author Salim ALIOUA
 *
 */

public class Point {

	// declaration coordonnées X, Y de type double.

	private double x, y;

	// Constructeur par défautlt.

	public Point() {
		// TODO Auto-generated constructor stub
	}
	// Constructeur avec deux parametres X,Y

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	// getters et les setters.

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}
	
	// Comment about the method :)
	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}
