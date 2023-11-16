package uk.co.dpmatheson.conditionals;

import java.time.DayOfWeek;

public class Conditionals {

    public static void main(String[] args) {
        System.out.println("=============================== If Statements ===============================");
        ifStatements(true);
        ifStatements(false);
        ifStatements(Integer.MAX_VALUE);
        ifStatements(Integer.MIN_VALUE);
        ifStatements(0);

        System.out.println("=============================== Ternary Operator ===============================");
        System.out.println(ternaryOperator("This is a valid string"));
        System.out.println(ternaryOperator(null));

        System.out.println("=============================== Traditional Switch Statements ===============================");
        switchStatements(DayOfWeek.MONDAY);
        switchStatements(DayOfWeek.TUESDAY);
        switchStatements(DayOfWeek.WEDNESDAY);
        switchStatements(DayOfWeek.THURSDAY);
        switchStatements(DayOfWeek.FRIDAY);
        switchStatements(DayOfWeek.SATURDAY);
        switchStatements(DayOfWeek.SUNDAY);
        switchStatements(null);

        System.out.println("=============================== Enhanced Switch Statements ===============================");
        switchStatementsEnhanced(DayOfWeek.MONDAY);
        switchStatementsEnhanced(DayOfWeek.TUESDAY);
        switchStatementsEnhanced(DayOfWeek.WEDNESDAY);
        switchStatementsEnhanced(DayOfWeek.THURSDAY);
        switchStatementsEnhanced(DayOfWeek.FRIDAY);
        switchStatementsEnhanced(DayOfWeek.SATURDAY);
        switchStatementsEnhanced(DayOfWeek.SUNDAY);
        switchStatementsEnhanced(null);

        System.out.println("=============================== String Switch Statements ===============================");
        switchStatementsStrings("switch");
        switchStatementsStrings("SWITCH");
        switchStatementsStrings("swITch");
        switchStatementsStrings(null);

        System.out.println("=============================== Conditional Switch Statements ===============================");
        switchStatementsConditional(null);
        switchStatementsConditional(0);
        switchStatementsConditional(Integer.MIN_VALUE);
        switchStatementsConditional(Integer.MAX_VALUE);

        System.out.println("=============================== Pattern Matching Switch Statements ===============================");
        switchStatementPatternMatching("This is a test string");
        switchStatementPatternMatching(10);
        switchStatementPatternMatching(true);
        switchStatementPatternMatching(null);
        switchStatementPatternMatching(Long.MAX_VALUE);

        System.out.println("=============================== Switch Statements with Yield ===============================");
        System.out.println(switchStatementYield(DayOfWeek.MONDAY));
        System.out.println(switchStatementYield(DayOfWeek.TUESDAY));
        System.out.println(switchStatementYield(DayOfWeek.WEDNESDAY));
        System.out.println(switchStatementYield(DayOfWeek.THURSDAY));
        System.out.println(switchStatementYield(DayOfWeek.FRIDAY));
        System.out.println(switchStatementYield(DayOfWeek.SATURDAY));
        System.out.println(switchStatementYield(DayOfWeek.SUNDAY));
        System.out.println(switchStatementYield(null));

    }


    private static void ifStatements(boolean condition){
        if (condition){
            System.out.println("This is true");
        }else{
            System.out.println("This is false");
        }
    }

    private static void ifStatements(int i){
        if (i > 0){
            System.out.println("i is positive");
        }

        if (i < 0){
            System.out.println("i is negative");
        }

        if (i == 0){
            System.out.println("i is zero");
        }
    }

    private static String ternaryOperator(String s){
        return s != null ? s.toUpperCase() : "null";
    }

    private static void switchStatements(DayOfWeek dayOfWeek){
        //Traditional
        switch (dayOfWeek){
            case null: //add a null case to support null value, otherwise a NullPointerException will be thrown.
                System.out.println("null");
                break;
            case MONDAY:
                System.out.println("Monday");
                break;
            case TUESDAY:
                System.out.println("Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Wednesday");
                break;
            case THURSDAY:
                System.out.println("Thursday");
                break;
            case FRIDAY:
                System.out.println("Friday");
                break;
            case SATURDAY:
                System.out.println("Saturday");
                break;
            case SUNDAY:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day of week");
        }

        //Fall through
        switch (dayOfWeek){
            case null: //add a null case to support null value, otherwise a NullPointerException will be thrown.
                System.out.println("null");
                break;
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Weekday");
                break;
            default:
                System.out.println("Weekend");
        }
    }

    private static void switchStatementsEnhanced(DayOfWeek dayOfWeek){
        //Can be used as traditional switch, but without need for break statement
        switch (dayOfWeek){
            case null -> System.out.println ("null"); //add a null case to support null value, otherwise a NullPointerException will be thrown.
            case MONDAY -> System.out.println ("Monday");
            case TUESDAY -> System.out.println ("Tuesday");
            case WEDNESDAY -> System.out.println ("Wednesday");
            case THURSDAY -> System.out.println ("Thursday");
            case FRIDAY -> System.out.println ("Friday");
            case SATURDAY -> System.out.println ("Saturday");
            case SUNDAY -> System.out.println ("Sunday");

        };

        switch (dayOfWeek){
            case null -> System.out.println ("null"); //add a null case to support null value, otherwise a NullPointerException will be thrown.
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println ("Weekday");
            default -> System.out.println ("Weekend");
        };
    }

    private static void switchStatementsStrings(String value){
        switch (value){
            case "SWITCH" -> System.out.println("Uppercase");
            case "switch" -> System.out.println("Lowercase");
            case null, default -> System.out.println("Invalid case"); // case null can be combined with default
        }
    }

    private static void switchStatementsConditional(Integer value){
        switch (value){
            case null -> System.out.println("value is invalid");
            case 0 -> System.out.println("value is zero");
            case Integer i when  i > 0 -> System.out.println("value is positive");
            case Integer i when  i < 0 -> System.out.println("value is negative");
            default -> throw new IllegalStateException("Unexpected value: " + value);
        }
    }

    private static void switchStatementPatternMatching(Object obj){
        switch (obj){
            case String s -> System.out.println("String of length = " + s.length());
            case Integer i -> System.out.println("Integer multiplied by 2 = " + (i * 2));
            case Boolean b -> System.out.println("Boolean inverted to " + !b);
            case null, default -> System.out.println("Unsupported type");
        }
    }

    private static String switchStatementYield(DayOfWeek dayOfWeek){
        return switch (dayOfWeek) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                yield "Weekday";
            case SATURDAY:
            case SUNDAY:
                yield "Weekend";
            case null, default:
                yield "null";
        };

//        Functional style means yield keyword isn't required.
//        return switch (dayOfWeek){
//            case null -> "null";
//            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Weekday";
//            default -> "Weekend";
//        };
    }
}
