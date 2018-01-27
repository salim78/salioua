package eu.ensg.projet6.salioua;

import java.util.ArrayList;

import org.junit.Assert;
//import org.junit.Test;
import org.junit.Test;

import eu.ensg.projet6.classe.EnvBoundingBox;
import eu.ensg.projet6.classe.Point;
import junit.framework.TestCase;

/**
 * Classe Test BoundingBoxTest pour la classe EnvBoundingBox.
 * 
 * @author ALIOUA Salim
 *
 */

public class BoundingBoxTest extends TestCase {

	@Test
	public void testGetBoundingBox() {

		EnvBoundingBox bbx = new EnvBoundingBox();
		ArrayList<Point> nuagePoints = new ArrayList<>();
		ArrayList<Point> resCalcule = new ArrayList<>();
		ArrayList<Point> bbxPoint = new ArrayList<>();

		// test tous les point ont des coordonnées Positives.

		Point p1 = new Point(0, 0);
		Point p2 = new Point(2, 8);
		Point p3 = new Point(1, 6);
		Point p4 = new Point(6, 7);
		Point p5 = new Point(3, 4);
		Point p6 = new Point(4, 6);

		nuagePoints.add(p1);
		nuagePoints.add(p2);
		nuagePoints.add(p3);
		nuagePoints.add(p4);
		nuagePoints.add(p5);
		nuagePoints.add(p6);

		// résultat atendu
		Point bbxMinMin = new Point(0, 0);
		Point bbxMaxMin = new Point(6, 0);
		Point bbxMaxMax = new Point(6, 8);
		Point bbxMinMax = new Point(0, 8);

		bbxPoint.add(bbxMinMin);
		bbxPoint.add(bbxMinMax);
		bbxPoint.add(bbxMaxMax);
		bbxPoint.add(bbxMaxMin);

		resCalcule = bbx.getBoundingBox(nuagePoints);

		for (int i = 0; i < resCalcule.size() - 1; i++) {
			assertEquals(resCalcule.get(i).getX(), bbxPoint.get(i).getX());
		}

		// test tous les point ont des coordonnées nigatives.

		ArrayList<Point> nuagePoints1 = new ArrayList<>();
		ArrayList<Point> resCalcule1 = new ArrayList<>();
		ArrayList<Point> bbxPoint1 = new ArrayList<>();

		Point p11 = new Point(0, 0);
		Point p21 = new Point(-2, -8);
		Point p31 = new Point(-1, -6);
		Point p41 = new Point(-6, -7);
		Point p51 = new Point(-3, -4);
		Point p61 = new Point(-4, -6);

		nuagePoints1.add(p11);
		nuagePoints1.add(p21);
		nuagePoints1.add(p31);
		nuagePoints1.add(p41);
		nuagePoints1.add(p51);
		nuagePoints1.add(p61);

		// résultat atendu
		Point bbxMinMin1 = new Point(-6, -8);
		Point bbxMaxMin1 = new Point(0, -8);
		Point bbxMaxMax1 = new Point(0, 0);
		Point bbxMinMax1 = new Point(-6, 0);
		bbxPoint1.add(bbxMinMin1);
		bbxPoint1.add(bbxMinMax1);
		bbxPoint1.add(bbxMaxMax1);
		bbxPoint1.add(bbxMaxMin1);

		resCalcule1 = bbx.getBoundingBox(nuagePoints1);

		for (int i = 0; i < resCalcule1.size() - 1; i++) {
			assertEquals(resCalcule1.get(i).getX(), bbxPoint1.get(i).getX());
		}

		// test tous les point ont des coordonnées nigatives et positives.

		ArrayList<Point> nuagePoints2 = new ArrayList<>();
		ArrayList<Point> resCalcule2 = new ArrayList<>();
		ArrayList<Point> bbxPoint2 = new ArrayList<>();

		Point p12 = new Point(0, 0);
		Point p22 = new Point(-2, -8);
		Point p32 = new Point(-1, -6);
		Point p42 = new Point(6, -7);
		Point p52 = new Point(-3, 4);
		Point p62 = new Point(4, -6);

		nuagePoints2.add(p12);
		nuagePoints2.add(p22);
		nuagePoints2.add(p32);
		nuagePoints2.add(p42);
		nuagePoints2.add(p52);
		nuagePoints2.add(p62);

		// résultat atendu
		Point bbxMinMin2 = new Point(-3, -8);
		Point bbxMaxMin2 = new Point(6, -8);
		Point bbxMaxMax2 = new Point(6, 4);
		Point bbxMinMax2 = new Point(-3, 4);
		bbxPoint2.add(bbxMinMin2);
		bbxPoint2.add(bbxMinMax2);
		bbxPoint2.add(bbxMaxMax2);
		bbxPoint2.add(bbxMaxMin2);

		resCalcule2 = bbx.getBoundingBox(nuagePoints2);

		for (int i = 0; i < resCalcule2.size() - 1; i++) {
			assertEquals(resCalcule2.get(i).getX(), bbxPoint2.get(i).getX());
		}

		assertFalse(resCalcule2.size() < 3);

	}

}
