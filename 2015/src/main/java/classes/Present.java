package aoc2015.classes;

public class Present {

    private final int length;
    private final int width;
    private final int height;

    public Present(String present) {
        String[] split = present.split("x");
        length = Integer.parseInt(split[0]);
        width = Integer.parseInt(split[1]);
        height = Integer.parseInt(split[2]);
    }

    public int getWrappingPaperArea() {
        int area1 = length * width;
        int area2 = width * height;
        int area3 = height * length;
        int boxSurfaceArea = 2 * (area1 + area2 + area3);
        int smallestSideArea = getMin(area1, area2, area3);
        return boxSurfaceArea + smallestSideArea;
    }

    public int getRibbonLength() {
        int perimeter1 = 2 * (length + width);
        int perimeter2 = 2 * (width + height);
        int perimeter3 = 2 * (height + length);
        int smallestPerimeter = getMin(perimeter1, perimeter2, perimeter3);
        int cubicFeetVolume = length * width * height;
        return smallestPerimeter + cubicFeetVolume;
    }

    private int getMin(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
}
