package eu.ensg.projet6.classe;

import java.util.ArrayList;
import eu.ensg.projet6.interfaces.GetboundingBox;

/**
 * Classe EnvBoundingBox impelémente l'interface GetboundingBox, et permet la
 * génération du Bounding Box d'un Nuage de points
 * 
 * @author ALIOUA Salim
 */
public class EnvBoundingBox implements GetboundingBox {

	/**
	 * Méthode getBoundingBox permet le calcule des points constituant le bounding
	 * box.
	 * 
	 * @param listPoints
	 *            paramètre en entrée, représente l'ensemble des points constituant
	 *            le nuage de Points.
	 * @return Arraysliste constitué des types (Points) qui représentent le
	 *         BoundingBox résultat.
	 */

	public ArrayList<Point> getBoundingBox(ArrayList<Point> nuagePoints) {

		double xmin = Double.MAX_VALUE;
		double xmax = -Double.MAX_VALUE;
		double ymin = Double.MAX_VALUE;
		double ymax = -Double.MAX_VALUE;

		ArrayList<Point> bbx = new ArrayList<>();

		for (int i = 0; i < nuagePoints.size(); i++) {

			if (nuagePoints.get(i).getX() < xmin)
				xmin = nuagePoints.get(i).getX();
			if (nuagePoints.get(i).getX() > xmax)
				xmax = nuagePoints.get(i).getX();
			if (nuagePoints.get(i).getY() < ymin)
				ymin = nuagePoints.get(i).getY();
			if (nuagePoints.get(i).getY() > ymax)
				ymax = nuagePoints.get(i).getY();

		}
		bbx.add(new Point(xmin, ymin));
		bbx.add(new Point(xmin, ymax));
		bbx.add(new Point(xmax, ymax));
		bbx.add(new Point(xmax, ymin));
		bbx.add(new Point(xmin, ymin));

		return bbx;
	}

}
