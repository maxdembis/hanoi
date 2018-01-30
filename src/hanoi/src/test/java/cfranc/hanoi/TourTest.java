package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {

    @Test
    public void testEmpilerTrueTrue() {
        Tour instance = new Tour(); 
        Disque d1 = new Disque(3);
        instance.empiler(d1);
        Disque d2 = new Disque(2);
        instance.empiler(d2);       //hauteur 3, taille() = 2
        Disque d3 = new Disque(1);  //d.d = diam() - 1
        boolean expectedResult = true;
        boolean result = instance.empiler(d3);
        assertEquals(expectedResult, result);
    }
    public void testEmpilerTrueFalse() {
        Tour instance = new Tour(); 
        Disque d1 = new Disque(3);
        instance.empiler(d1);
        Disque d2 = new Disque(2);
        instance.empiler(d2);       ////hauteur 3, taille() = 2
        Disque d3 = new Disque(2);  //d.d = diam()
        boolean expectedResult = false;
        boolean result = instance.empiler(d3);
        assertEquals(expectedResult, result);
    }
    
    public void testEmpilerFalseTrue() {
        Tour instance = new Tour();
        Disque d1 = new Disque(4);
        instance.empiler(d1);
        Disque d2 = new Disque(3);
        instance.empiler(d2);
        Disque d3 = new Disque(2);
        instance.empiler(d3);       //hauteur 3, taille() = 3
        Disque d4 = new Disque(1);  //d.d = diam() - 1
        boolean expectedResult = false;
        boolean result = instance.empiler(d4); //On empile plus de disques que la hauteurMax
        assertEquals(expectedResult, result);
    }
    
    public void testEmpilerFalseFalse() {
        Tour instance = new Tour(); 
        Disque d1 = new Disque(4);
        instance.empiler(d1);
        Disque d2 = new Disque(3);
        instance.empiler(d2);
        Disque d3 = new Disque(2);
        instance.empiler(d3);       //hauteur 3, taille() = 3
        Disque d4 = new Disque(2);  //d.d = diam()
        boolean expectedResult = false;
        boolean result = instance.empiler(d4);
        assertEquals(expectedResult, result);
    }
    
}