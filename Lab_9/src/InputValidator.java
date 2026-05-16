public class InputValidator {

    private InputValidator() {
    }

    public static double parsePositiveDouble(String value, String fieldName) {
        String preparedValue = value.trim().replace(',', '.');

        if (preparedValue.isEmpty()) {
            throw new IllegalArgumentException("Поле \"" + fieldName + "\" не може бути порожнім.");
        }

        try {
            double number = Double.parseDouble(preparedValue);

            if (number <= 0) {
                throw new IllegalArgumentException("У полі \"" + fieldName + "\" потрібно ввести число більше нуля.");
            }

            return number;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("У полі \"" + fieldName + "\" потрібно ввести число, а не літери.");
        }
    }

    public static boolean isFilled(String value) {
        return value != null && !value.trim().isEmpty();
    }
}
