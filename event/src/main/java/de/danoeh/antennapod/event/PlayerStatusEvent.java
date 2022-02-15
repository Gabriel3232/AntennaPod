package de.danoeh.antennapod.event;

import androidx.annotation.Nullable;

public class PlayerStatusEvent {


    public enum Action {
        UPDATED, RESET
    }

    @Nullable
    public final Action action;

    public PlayerStatusEvent() {
        this.action = null;
    }

    private PlayerStatusEvent(Action event) {
        this.action = event;
    }

    public static PlayerStatusEvent updated() {
        return new PlayerStatusEvent(Action.UPDATED);
    }

    public static PlayerStatusEvent resetedToDefault() {
        return new PlayerStatusEvent(Action.RESET);
    }
}
