package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import utils.enums.Day;
import utils.enums.Year;

public class FileUtils {

    private final static String RESOURCES = "src/main/resources/";

    public static List<String> getAllLines(Year year, Day day) {
        Path filePath = Paths.get(RESOURCES + year.getYear() + "/" + day.getDay());
        List<String> lines = null;
        try {
            lines = Files.readAllLines(filePath);
        } catch (IOException e) {
            System.out.format("I/O error: %s%n", e);
        }
        return lines;
    }

    public static String getLine(Year year, Day day) {
        return getAllLines(year, day).get(0);
    }
}
