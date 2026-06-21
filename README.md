# LetMeSymlink

[![Discord](https://img.shields.io/discord/1422675823009202248?style=for-the-badge&logo=discord&label=Discord&color=rgb(88%2C%20101%2C%20242)%20)](https://cootshk.dev/discord)
[![Modrinth](https://img.shields.io/modrinth/dt/letmesymlink?style=for-the-badge&logo=modrinth&label=Downloads&color=rgb(00%2CAF%2C5C)%20)](https://modrinth.com/mod/letmesymlink)


A mod that disables the **The world folder contains symbolic links** warning.
![The warning, in Minecraft.](warning.png)

Upon startup, this mod just writes `[regex].*` to `.minecraft/allowed_symlinks.txt`, which disables the warning.

# Windows
Windows uses shortcuts, which are not symlinks and are not supported by Minecraft.

# Removing
Removing the mod will not remove the `allowed_symlinks.txt` file, you have to manually delete that file after removing the mod if you would like to see the warning again for whatever reason.

&copy; Cootshk 2026, Licensed under the GPL-3.0 or later.