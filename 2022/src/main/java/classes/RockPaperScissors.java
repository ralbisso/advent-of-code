package classes;

public record RockPaperScissors(char opponent, char you) {

    public RockPaperScissors(String input) {
        this(input.charAt(0), input.charAt(2));
    }

    public int getScorePart1() {
        return getShape() + guessOutcome();
    }

    public int getScorePart2() {
        return guessShape() + getOutcome();
    }

    private int getOutcome() {
        return switch (you) {
        case 'X' -> 0; // Loss
        case 'Y' -> 3; // Draw
        case 'Z' -> 6; // Win
        default -> -1;
        };
    }
    
    private int getShape() {
        return switch (you) {
        case 'X' -> 1; // Rock
        case 'Y' -> 2; // Paper
        case 'Z' -> 3; // Scissors
        default -> -1;
        };
    }

    private int guessOutcome() {
        return isLoss() ? 0 : isDraw() ? 3 : 6;
    }
    
    private int guessShape() {
        return isRock() ? 1 : isPaper() ? 2 : 3;
    }

    private boolean isLoss() {
        return opponent == 'A' && you == 'Z' 
                || opponent == 'B' && you == 'X'
                || opponent == 'C' && you == 'Y';
    }

    private boolean isDraw() {
        return opponent == 'A' && you == 'X' 
                || opponent == 'B' && you == 'Y'
                || opponent == 'C' && you == 'Z';
    }
    
    private boolean isRock() {
        return opponent == 'B' && you == 'X' 
                || opponent == 'A' && you == 'Y'
                || opponent == 'C' && you == 'Z';
    }
    
    private boolean isPaper() {
        return opponent == 'C' && you == 'X' 
                || opponent == 'B' && you == 'Y'
                || opponent == 'A' && you == 'Z';
    }
}
