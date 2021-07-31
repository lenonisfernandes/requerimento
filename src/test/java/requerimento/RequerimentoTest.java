package requerimento;

import static org.junit.Assert.*;

import org.junit.Test;

public class RequerimentoTest {

	@Test
	public void test() {
		Requerimento req = new Requerimento();
		req.setId(1);
		req.setNome("req1");
		assertEquals(req.getNome(), "req1"); 
		assertEquals(req.getId(), new Integer(1));
	}

}
