package matrix;
import orion.matrix.Matrix;

import org.junit.jupiter.api.Test;

class MatrixTest {
	
	@Test
	public void contructionTest() {
		Matrix m = new Matrix(3, 4, i->i*2);
		
		System.out.println(m);
	}

}
