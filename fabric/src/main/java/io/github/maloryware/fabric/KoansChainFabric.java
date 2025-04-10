package io.github.maloryware.fabric;

import net.fabricmc.api.ModInitializer;

import io.github.maloryware.KoansChain;

public final class KoansChainFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        KoansChain.init();
    }
}
