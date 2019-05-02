package CodeWars;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class RevRotTest {

@Test
    public void shouldReverseString(){
    assertEquals("piliF", RevRot.reverseString("Filip") );
}

@Test
    public void shouldRotateString(){
    assertEquals("ilipF", RevRot.rotateString("Filip"));
}

@Test
    public void shouldFullfillCondition(){
    assertEquals(true, RevRot.conditionFullFilled("123"));
}

@Test
    public void shouldCutToChunks(){
    assertEquals(Arrays.asList("123","456"), RevRot.cutToChunks("123456",3));
    assertEquals(Arrays.asList("1234"), RevRot.cutToChunks("123456",4));
    assertEquals(Arrays.asList(), RevRot.cutToChunks("123456",7));
}

@Test
    public void shouldRevRot(){
    assertEquals("234561876549", RevRot.revRot("123456987654", 6));
    assertEquals("234561356789", RevRot.revRot("123456987653", 6));
    assertEquals("44668753", RevRot.revRot("66443875", 4));
    assertEquals("", RevRot.revRot("123456779", 0));
}

}