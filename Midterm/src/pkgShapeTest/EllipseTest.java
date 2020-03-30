package pkgShapeTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgShape.Circle;
import pkgShape.Ellipse;

public class EllipseTest {

	@Test
	public void EllipseTest() throws Exception {
		Ellipse a=new Ellipse(10,20);
		assertEquals(628.32,a.area(),0.01);
	}

}
