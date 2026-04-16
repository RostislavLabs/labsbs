import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorFrame extends JFrame implements ActionListener {

    private JTextField massField;
    private JTextField specificHeatField;
    private JTextField heatField;
    private JButton calculateButton;

    public CalculatorFrame() {
        setTitle("Обчислення кількості теплоти");
        setSize(420, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("Маса m (кг):"));
        massField = new JTextField();
        add(massField);

        add(new JLabel("Питома теплота q (Дж/кг):"));
        specificHeatField = new JTextField();
        add(specificHeatField);

        add(new JLabel("Кількість теплоти Q (Дж):"));
        heatField = new JTextField();
        add(heatField);

        calculateButton = new JButton("Обчислити");
        calculateButton.addActionListener(this);
        add(calculateButton);

        add(new JLabel(""));

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String mText = massField.getText().trim();
            String qText = specificHeatField.getText().trim();
            String QText = heatField.getText().trim();

            int filledFields = 0;
            if (!mText.isEmpty()) filledFields++;
            if (!qText.isEmpty()) filledFields++;
            if (!QText.isEmpty()) filledFields++;

            if (filledFields != 2) {
                JOptionPane.showMessageDialog(this,
                        "Потрібно ввести рівно 2 значення!",
                        "Помилка",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (QText.isEmpty()) {
                double m = Double.parseDouble(mText);
                double q = Double.parseDouble(qText);
                double Q = HeatCalculator.calculateQ(m, q);
                heatField.setText(String.valueOf(Q));
            }
            else if (mText.isEmpty()) {
                double Q = Double.parseDouble(QText);
                double q = Double.parseDouble(qText);
                double m = HeatCalculator.calculateM(Q, q);
                massField.setText(String.valueOf(m));
            }
            else if (qText.isEmpty()) {
                double Q = Double.parseDouble(QText);
                double m = Double.parseDouble(mText);
                double q = HeatCalculator.calculateq(Q, m);
                specificHeatField.setText(String.valueOf(q));
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Введіть правильні числа!",
                    "Помилка",
                    JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(this,
                    "Ділення на нуль неможливе!",
                    "Помилка",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}