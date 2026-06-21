package dev.cootshk.letmesymlink;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class LetMeSymlink {
    public static void allowSymlinks() {
        Path p = Path.of("allowed_symlinks.txt");
        File f = p.toFile();
        if (f.exists()) return;
        System.out.println("[LetMeSymlink] Writing to path " + p.toAbsolutePath());
        try(FileWriter fw = new FileWriter(f)) {
            String s = "[regex].*";
            fw.write(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
