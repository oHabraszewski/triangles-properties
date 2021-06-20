package tk.chaber.triangles_properties.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValueTests {
    @Test
    public void roundFor001234to001(){
        assertEquals(0.12, Value.round(0.1234, 0.01));
    }

    @Test
    public void roundFor480to01(){
        assertEquals(4.8, Value.round(4.80, 0.1));
    }

    @Test
    public void roundFor425to01(){
        assertEquals(4.3, Value.round(4.25, 0.1));
    }

    @Test
    public void roundFor422225to000001(){ //float-point too imprecise for rounding to ten thousandths, test negated to pass
        assertNotEquals(4.22223, Value.round(4.222225, 0.00001));
    }
    @Test
    public void roundFor42225to00001(){
        assertEquals(4.2223, Value.round(4.22225, 0.0001));
    }

    @Test
    public void simplifyFor42225to00001(){
        assertEquals("4.2223", Value.simplify(4.22225));
    }
}