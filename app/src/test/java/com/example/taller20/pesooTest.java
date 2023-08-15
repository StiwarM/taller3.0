package com.example.taller20;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

public class pesooTest extends TestCase {

    private Operacion mOperacion;

    @Before
    public void setUp(){
        mOperacion = new Operacion();
    }

    @Test
    public void operacionNotNull(){
        assertNotNull(mOperacion);
    }

    public void testImc()throws Exception {
        assertEquals("sobre peso",mOperacion.pesoo("50","45","31"));
    }
    public void testImc()throws Exception {
        assertEquals("sobre peso",mOperacion.pesoo("50","45","31"));
    }
    public void testImc()throws Exception {
        assertEquals("sobre peso",mOperacion.pesoo("50","45","31"));
    }
}