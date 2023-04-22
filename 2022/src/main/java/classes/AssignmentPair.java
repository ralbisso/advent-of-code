package classes;

public record AssignmentPair(Assignment assignment1, Assignment assignment2) {

    public AssignmentPair(String input) {
        this(getAssignments(input));
    }

    public AssignmentPair(Assignment[] assignments) {
        this(assignments[0], assignments[1]);
    }

    private static Assignment[] getAssignments(String input) {
        String[] split = input.split(",");
        Assignment assignment1 = new Assignment(split[0]);
        Assignment assignment2 = new Assignment(split[1]);
        return new Assignment[] { assignment1, assignment2 };
    }

    public boolean hasFullyContainedAssignment() {
        return assignment1.isFullyContainedIn(assignment2)
                || assignment2.isFullyContainedIn(assignment1);
    }

    public boolean hasOverlappingAssignment() {
        return assignment1.isOverlapping(assignment2)
                || assignment2.isOverlapping(assignment1);
    }

    private record Assignment(int start, int end) {

        private Assignment(String input) {
            this(getAssignment(input));
        }

        private Assignment(int[] assignment) {
            this(assignment[0], assignment[1]);
        }

        private static int[] getAssignment(String assignment) {
            String[] split = assignment.split("-");
            return new int[] { Integer.parseInt(split[0]), Integer.parseInt(split[1]) };
        }

        private boolean isFullyContainedIn(Assignment assignment) {
            return start >= assignment.start && end <= assignment.end;
        }

        private boolean isOverlapping(Assignment assignment) {
            return isOverlappingAfter(assignment) || isOverlappingBefore(assignment);
        }

        private boolean isOverlappingAfter(Assignment assignment) {
            return start >= assignment.start && start <= assignment.end;
        }

        private boolean isOverlappingBefore(Assignment assignment) {
            return end >= assignment.start && end <= assignment.end;
        }
    }
}
