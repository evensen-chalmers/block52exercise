package DIT953.polygons.polygon;

import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JComponent;

/**
 * Created by Niklas on 2016-01-19.
 */
abstract class Polygon extends JComponent implements IPolygon {
	public Point centerPoint;

	Polygon(Point center) {
		this.centerPoint = center;
	}

	Polygon(int x, int y) {
		this(new Point(x, y));
	}

	@Override
	public void updateCenter(int x, int y) {
		this.centerPoint = new Point(x, y);
	}

	@Override
	public Point getCenter() {
		return this.centerPoint;
	}

	@Override
	public abstract void paint(Graphics g)// paint
	;
}
