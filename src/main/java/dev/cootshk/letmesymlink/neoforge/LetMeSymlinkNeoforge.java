package dev.cootshk.letmesymlink.neoforge;

import dev.cootshk.letmesymlink.LetMeSymlink;

import net.neoforged.fml.common.Mod;

@Mod("letmesymlink") // NF 1.20-1.20.1 use Forge's
public class LetMeSymlinkNeoforge {
    static {
        LetMeSymlink.allowSymlinks();
    }
}
