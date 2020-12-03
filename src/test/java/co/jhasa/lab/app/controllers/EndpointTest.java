package co.jhasa.lab.app.controllers;


import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

public class EndpointTest extends TestCase {
	
	
	@Test
	public String endpoint() {
		assertEquals("Hola mundo", "Hola mundo");
		return "Hola mundo";
	}
	
	public String PostEndpoint() {
		return "Hola mundo";
	}

}
