public class SwitchExpression {
    public static void main(String[] args) {
        String day = "Monday";

        boolean isWeekday = switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> true;
            default -> false;
        };

        System.out.println(isWeekday ? "Today is a weekday" : "Today is a weekend");
    }
}
