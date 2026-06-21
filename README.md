# LetMeSymlink

A mod that disables the **The world folder contains symbolic links** warning.
![The warning, in Minecraft.](warning.png)

Upon startup, this mod just writes `[regex].*` to `.minecraft/allowed_symlinks.txt`, which disables the warning.

# Windows
Windows uses shortcuts, which are not symlinks and are not supported by Minecraft.

# Removing
Removing the mod will not remove the `allowed_symlinks.txt` file, you have to manually delete that file after removing the mod if you would like to see the warning again for whatever reason.

&copy; Cootshk 2026, Licensed under the GPL-3.0 or later.