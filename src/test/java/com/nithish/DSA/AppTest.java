package com.nithish.DSA;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class AppTest 
{   
    @Test
	public void testApp()
    {        
		App app=mock(App.class);
		
		when(app.checkForPalindrome("mam")).thenReturn(true);
        assertEquals(true,app.checkForPalindrome("mam"));
        assertEquals(false,app.checkForPalindrome("Raina"));        
    }
}
