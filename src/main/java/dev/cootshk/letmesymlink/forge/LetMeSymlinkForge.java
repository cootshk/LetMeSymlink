package dev.cootshk.letmesymlink.forge;

import dev.cootshk.letmesymlink.LetMeSymlink;
import net.minecraftforge.fml.common.Mod;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("letmesymlink")
public class LetMeSymlinkForge {
    static {
        LetMeSymlink.allowSymlinks();
    }
}
