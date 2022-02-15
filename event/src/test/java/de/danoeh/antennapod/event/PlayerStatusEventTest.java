package de.danoeh.antennapod.event;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlayerStatusEventTest {

    @Test
    public void testUpdatedActionEvent() throws Exception {

        assertEquals("Wrong Updated action", PlayerStatusEvent.updated().action, PlayerStatusEvent.Action.UPDATED);
    }


    @Test
    public void testResetedActionEvent() throws Exception {

        assertEquals("Wrong reset action", PlayerStatusEvent.resetedToDefault().action, PlayerStatusEvent.Action.RESET);
    }
}
