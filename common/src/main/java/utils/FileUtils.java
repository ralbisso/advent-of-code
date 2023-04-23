package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import enums.Day;

public class FileUtils {

    private final static String RESOURCES = "src/main/resources/";

    public static List<String> getAllLines(Day day) {
        Path filePath = Paths.get(RESOURCES + day.getDay());
        List<String> lines = null;
        try {
            lines = Files.readAllLines(filePath);
        } catch (IOException e) {
            System.out.format("I/O error: %s%n", e);
        }
        return lines;
    }

    public static int[] getAllLinesAsIntArray(Day day) {
        return getAllLines(day).stream().mapToInt(Integer::parseInt).toArray();
    }

    public static String getLine(Day day) {
        return getAllLines(day).get(0);
    }

    public static char[] getLineAsCharArray(Day day) {
        return getLine(day).toCharArray();
    }
}
