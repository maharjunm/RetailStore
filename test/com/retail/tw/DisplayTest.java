package com.retail.tw;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class DisplayTest {
    
    @Test
    public void shouldDisplayTheOutput() {
        String output = "Hello World";

        Display display = mock(Display.class);
        display.print(output);
        verify(display, times(1)).print(output);
    }
}
