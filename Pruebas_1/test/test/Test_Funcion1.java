package test;
import org.junit.*;

import codigo.App;

public class Test_Funcion1 {

@Test
public void test_funcion1_1() {
	Assert.assertEquals(3,App.funcion(1));
	Assert.assertEquals(101,App.funcion(99));
	Assert.assertEquals(52,App.funcion(50));
}

@Test
public void test_funcion1_2() {
	Assert.assertEquals(-2,App.funcion(0));
	Assert.assertEquals(-4,App.funcion(-2));
}
	
}
