package org.purejava;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.keepassxc.KeePassXCType;
import org.keepassxc.KindOfKeePassXC;

import static org.junit.jupiter.api.Assertions.*;

/**
 * For this test, KeePassXC - installed via Flatpak - should be started.
 */
public class FlatpakTest {
    @Test
    @Order(4)
    @DisplayName("Testing KeePassXC installation type")
    @EnabledOnOs(OS.LINUX)
    public void shouldHaveNoErrors() {
        var type = KindOfKeePassXC.determineType();
        assertTrue(type.isPresent() && type.get().equals(KeePassXCType.Flatpak));
    }
}
