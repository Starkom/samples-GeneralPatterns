package sample_enum;

import java.util.EnumSet;
import java.util.Set;

public enum EnumWithOverrides {
    STARTED {
        @Override
        public Set<EnumWithOverrides> followUps() {
            return EnumSet.of(
                    READY
            );
        }
    },

    READY {
        @Override
        public Set<EnumWithOverrides> followUps() {
            return EnumSet.of(
                    STOPPED,
                    REMOVED
            );
        }
    },

    STOPPED {
        @Override
        public Set<EnumWithOverrides> followUps() {
            return EnumSet.of(
                    REMOVED
            );
        }
    },

    REMOVED;


    public Set<EnumWithOverrides> followUps() {
        return EnumSet.noneOf(EnumWithOverrides.class);
    }

    public boolean isFinal() {
        return followUps().isEmpty();
    }
}
