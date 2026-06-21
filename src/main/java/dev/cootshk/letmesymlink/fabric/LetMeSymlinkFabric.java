package dev.cootshk.letmesymlink.fabric;

import dev.cootshk.letmesymlink.LetMeSymlink;
import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;

public class LetMeSymlinkFabric implements PreLaunchEntrypoint {
    @Override
    public void onPreLaunch() {
        LetMeSymlink.allowSymlinks();
    }
}
