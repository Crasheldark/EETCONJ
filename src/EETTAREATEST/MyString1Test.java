package EETTAREATEST;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import EETEjercicio.MyString1;

class MyString1Test {

	@Test
	void testcontarpalabras (){
	
	assertEquals (2, MyString1.contarPalabras("hola mundo"));
	
	assertTrue (MyString1.contarPalabras("Me gusta jugar a la play")== 6);
	
	assertFalse (MyString1.contarPalabras("Me gusta jugar a la play")== 24);
	
		
	
	}
	
	@Test
	void testcontarletrasdiferentes () {
		
		
	assertEquals (8, MyString1.contarLetrasDiferentes("Hola Mundo"));
	
	assertTrue (MyString1.contarLetrasDiferentes("bonito dia")== 7);
	
	assertFalse (MyString1.contarLetrasDiferentes("que pereza")== 9);
	
	}
	
	@Test
	void testcontarFrecuenciaPalabras () {
		
	
	Map <String, Integer > botella = new HashMap<>();
	botella.put("hola", 1);
	botella.put("mundo", 2);
	assertEquals (botella, MyString1.contarFrecuenciaPalabras("hola mundo mundo"));
	
	assertTrue (MyString1.contarFrecuenciaPalabras("hola mundo mundo").equals(botella));
	
	assertFalse (MyString1.contarFrecuenciaPalabras("hola mundo").equals(botella));
		
	}
	
	@Test

	void testcontarFrecuenciaLetras() {
	Map<Character, Integer> refresco = new HashMap<>();
	refresco.put('o', 3);
	refresco.put('h', 1);
	refresco.put('l', 1);
	refresco.put('a', 1);
	refresco.put('s', 2);
	    
	assertEquals  (refresco, MyString1.contarFrecuenciaLetras("hola osos"));
	    
	assertTrue (MyString1.contarFrecuenciaLetras("hola osos").equals(refresco));
	    
	assertFalse (MyString1.contarFrecuenciaLetras("hola ososo").equals(refresco));
	    
	}
	
	@Test
	void testesPalíndroma() {
	assertTrue (MyString1.esPalindroma("Anna"));
	
	assertFalse (MyString1.esPalindroma("donete"));
		
		
	}

		
}
