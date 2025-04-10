package io.github.maloryware.neoforge;

import net.neoforged.fml.common.Mod;

import io.github.maloryware.KoansChain;

@Mod(KoansChain.MOD_ID)
public final class KoansChainNeoForge {
    public KoansChainNeoForge() {
        // Run our common setup.
        KoansChain.init();
    }
}
