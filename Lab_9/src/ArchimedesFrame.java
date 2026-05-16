import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArchimedesFrame extends JFrame {
    private static final long serialVersionUID = 1L;

    private final JTextField massField;
    private final JTextField volumeField;
    private final JTextField densityField;
    private final JTextField buoyantForceField;
    private final JTextField bodyWeightField;
    private final JTextArea resultArea;

    private final ArchimedesCalculator calculator;
    private boolean internalChange;

    public ArchimedesFrame() {
        calculator = new ArchimedesCalculator();

        setTitle("Лабораторна робота 9. Варіант 4. Закон Архімеда");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 650, 430);
        setResizable(false);

        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        contentPane.setLayout(null);
        setContentPane(contentPane);

        JLabel titleLabel = new JLabel("Умова плавання тіла за законом Архімеда");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        titleLabel.setBounds(120, 10, 430, 25);
        contentPane.add(titleLabel);

        JLabel massLabel = new JLabel("Маса тіла m, кг:");
        massLabel.setBounds(35, 55, 190, 25);
        contentPane.add(massLabel);

        massField = new JTextField();
        massField.setBounds(230, 55, 140, 25);
        contentPane.add(massField);

        JLabel volumeLabel = new JLabel("Об'єм тіла V, м^3:");
        volumeLabel.setBounds(35, 90, 190, 25);
        contentPane.add(volumeLabel);

        volumeField = new JTextField();
        volumeField.setBounds(230, 90, 140, 25);
        contentPane.add(volumeField);

        JLabel densityLabel = new JLabel("Густина рідини ρ, кг/м^3:");
        densityLabel.setBounds(35, 125, 190, 25);
        contentPane.add(densityLabel);

        densityField = new JTextField();
        densityField.setBounds(230, 125, 140, 25);
        contentPane.add(densityField);

        JLabel forceLabel = new JLabel("Сила Архімеда F_A, Н:");
        forceLabel.setBounds(35, 170, 190, 25);
        contentPane.add(forceLabel);

        buoyantForceField = new JTextField();
        buoyantForceField.setBounds(230, 170, 140, 25);
        buoyantForceField.setEditable(false);
        contentPane.add(buoyantForceField);

        JLabel weightLabel = new JLabel("Вага тіла P, Н:");
        weightLabel.setBounds(35, 205, 190, 25);
        contentPane.add(weightLabel);

        bodyWeightField = new JTextField();
        bodyWeightField.setBounds(230, 205, 140, 25);
        bodyWeightField.setEditable(false);
        contentPane.add(bodyWeightField);

        JButton calculateButton = new JButton("Обчислити");
        calculateButton.setBounds(410, 55, 160, 30);
        contentPane.add(calculateButton);

        JButton clearButton = new JButton("Очистити");
        clearButton.setBounds(410, 95, 160, 30);
        contentPane.add(clearButton);

        JLabel hintLabel = new JLabel("Якщо заповнити тільки два з трьох полів m, V, ρ — третє буде обчислено для рівноваги плавання.");
        hintLabel.setBounds(35, 245, 570, 25);
        contentPane.add(hintLabel);

        resultArea = new JTextArea();
        resultArea.setEditable(false);
        resultArea.setLineWrap(true);
        resultArea.setWrapStyleWord(true);
        resultArea.setFont(new Font("Arial", Font.PLAIN, 13));

        JScrollPane scrollPane = new JScrollPane(resultArea);
        scrollPane.setBounds(35, 275, 560, 80);
        contentPane.add(scrollPane);

        JLabel formulaLabel = new JLabel("Формули: F_A = ρ · g · V; P = m · g; умова плавання визначається порівнянням F_A і P.");
        formulaLabel.setBounds(35, 360, 570, 25);
        contentPane.add(formulaLabel);

        addDocumentListeners();

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });
    }

    private void calculate() {
        try {
            boolean hasMass = InputValidator.isFilled(massField.getText());
            boolean hasVolume = InputValidator.isFilled(volumeField.getText());
            boolean hasDensity = InputValidator.isFilled(densityField.getText());
            int filledCount = countFilledFields(hasMass, hasVolume, hasDensity);

            if (filledCount < 2) {
                JOptionPane.showMessageDialog(this,
                        "Введіть мінімум два значення: m, V або ρ.",
                        "Недостатньо даних",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (filledCount == 3) {
                calculateDirectTask();
            } else {
                calculateInverseTask(hasMass, hasVolume, hasDensity);
            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this,
                    e.getMessage(),
                    "Помилка введення",
                    JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Сталася непередбачена помилка: " + e.getMessage(),
                    "Помилка",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void calculateDirectTask() {
        double mass = InputValidator.parsePositiveDouble(massField.getText(), "маса тіла m");
        double volume = InputValidator.parsePositiveDouble(volumeField.getText(), "об'єм тіла V");
        double density = InputValidator.parsePositiveDouble(densityField.getText(), "густина рідини ρ");

        double buoyantForce = calculator.calculateBuoyantForce(density, volume);
        double bodyWeight = calculator.calculateBodyWeight(mass);
        String condition = calculator.defineFloatingCondition(mass, volume, density);

        buoyantForceField.setText(formatDouble(buoyantForce));
        bodyWeightField.setText(formatDouble(bodyWeight));
        resultArea.setText("Пряма задача:\n" + condition);
    }

    private void calculateInverseTask(boolean hasMass, boolean hasVolume, boolean hasDensity) {
        internalChange = true;

        if (!hasMass) {
            double volume = InputValidator.parsePositiveDouble(volumeField.getText(), "об'єм тіла V");
            double density = InputValidator.parsePositiveDouble(densityField.getText(), "густина рідини ρ");
            double mass = calculator.calculateNeutralMass(density, volume);
            massField.setText(formatDouble(mass));
            resultArea.setText("Обернена задача:\nОбчислено масу тіла для умови рівноваги плавання: m = ρ · V.");
        } else if (!hasVolume) {
            double mass = InputValidator.parsePositiveDouble(massField.getText(), "маса тіла m");
            double density = InputValidator.parsePositiveDouble(densityField.getText(), "густина рідини ρ");
            double volume = calculator.calculateNeutralVolume(mass, density);
            volumeField.setText(formatDouble(volume));
            resultArea.setText("Обернена задача:\nОбчислено об'єм тіла для умови рівноваги плавання: V = m / ρ.");
        } else {
            double mass = InputValidator.parsePositiveDouble(massField.getText(), "маса тіла m");
            double volume = InputValidator.parsePositiveDouble(volumeField.getText(), "об'єм тіла V");
            double density = calculator.calculateNeutralDensity(mass, volume);
            densityField.setText(formatDouble(density));
            resultArea.setText("Обернена задача:\nОбчислено густину рідини для умови рівноваги плавання: ρ = m / V.");
        }

        internalChange = false;
        makeAllInputFieldsEditable();
        calculateDirectTask();
    }

    private int countFilledFields(boolean hasMass, boolean hasVolume, boolean hasDensity) {
        int count = 0;
        if (hasMass) count++;
        if (hasVolume) count++;
        if (hasDensity) count++;
        return count;
    }

    private void addDocumentListeners() {
        DocumentListener listener = new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateInputFieldStates();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateInputFieldStates();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateInputFieldStates();
            }
        };

        massField.getDocument().addDocumentListener(listener);
        volumeField.getDocument().addDocumentListener(listener);
        densityField.getDocument().addDocumentListener(listener);
    }

    private void updateInputFieldStates() {
        if (internalChange) {
            return;
        }

        boolean hasMass = InputValidator.isFilled(massField.getText());
        boolean hasVolume = InputValidator.isFilled(volumeField.getText());
        boolean hasDensity = InputValidator.isFilled(densityField.getText());
        int filledCount = countFilledFields(hasMass, hasVolume, hasDensity);

        makeAllInputFieldsEditable();

        if (filledCount == 2) {
            if (!hasMass) {
                makeFieldCalculated(massField);
            } else if (!hasVolume) {
                makeFieldCalculated(volumeField);
            } else if (!hasDensity) {
                makeFieldCalculated(densityField);
            }
        }
    }

    private void makeFieldCalculated(JTextField field) {
        field.setEditable(false);
        field.setBackground(new Color(230, 230, 230));
    }

    private void makeAllInputFieldsEditable() {
        makeFieldEditable(massField);
        makeFieldEditable(volumeField);
        makeFieldEditable(densityField);
    }

    private void makeFieldEditable(JTextField field) {
        field.setEditable(true);
        field.setBackground(Color.WHITE);
    }

    private void clearFields() {
        internalChange = true;
        massField.setText("");
        volumeField.setText("");
        densityField.setText("");
        buoyantForceField.setText("");
        bodyWeightField.setText("");
        resultArea.setText("");
        internalChange = false;
        makeAllInputFieldsEditable();
    }

    private String formatDouble(double value) {
        return String.format("%.4f", value).replace(',', '.');
    }
}
