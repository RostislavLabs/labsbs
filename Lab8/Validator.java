public class Validator {

    public static boolean validateArgs(String[] args) {
        if (args.length != 4) return false;

        try {
            Integer.parseInt(args[1]);
            Integer.parseInt(args[2]);
            Integer.parseInt(args[3]);
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }
}