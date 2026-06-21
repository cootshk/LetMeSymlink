package dev.cootshk.letmesymlink.forge;

import dev.cootshk.letmesymlink.LetMeSymlink;
import net.minecraftforge.fml.common.Mod;

@Mod("letmesymlink")
public class LetMeSymlinkForge {
    static {
        LetMeSymlink.allowSymlinks();
    }
}
