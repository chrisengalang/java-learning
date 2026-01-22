public class SwitchExpression {
    public static void main(String[] args) {
        String day = "Sat";

        boolean isWeekday = switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> true;
            default -> {
                System.out.println("Either a weekend or input is invalid.");
                yield false;
            }
        };

        System.out.println(isWeekday ? "Today is a weekday" : "Today is a weekend");
    }
}
