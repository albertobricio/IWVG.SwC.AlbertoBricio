package miw;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {

	private User usr;
	
	@Before
	public void before()
	{
		usr = new User(23,"Alberto","Bricio");
	}
	
	@Test
	public void testNombreCompleto() {
		assertEquals("Alberto Bricio", usr.fullName());
	}
	
	@Test
	public void testComprobarUsuarioYNumero() {
		assertEquals(23,usr.getNumber());
		assertEquals("Alberto", usr.getName());
		assertEquals("Bricio", usr.getFamilyName());
	}
	
	@Test
	public void testInicialesNombre() {
		assertEquals("A.", usr.initials());
	}
	
	@Test
	 public void upperNameTest() {
		assertEquals("ALBERTO",usr.upperName());
    }

}
