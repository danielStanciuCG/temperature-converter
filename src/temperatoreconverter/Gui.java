package temperatoreconverter;

import javax.swing.*;
import java.awt.*;

class Gui extends JFrame {
    private static Double userInput;
    private JTextField userInputField;
    private JComboBox dropdown;
    private JTextArea outputArea;
    private Celsius cel = new Celsius();
    private Fahrenheit fah = new Fahrenheit();
    private Kelvin kel = new Kelvin();
    private Rankine ran = new Rankine();
    private Delisle del = new Delisle();
    private Newton newt = new Newton();
    private Réaumur réa = new Réaumur();
    private Rømer røm = new Rømer();


    Gui() {
        super("Temperature Converter");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(800, 200);
        setResizable(false);

        ImageIcon image = new ImageIcon(getClass().getResource("/temperatoreconverter/images/temperature-controlled.jpg"), "Thermometer");
        JLabel welcome = new JLabel(
                "     Enter temperature and choose its measurement unit: ",
                image,
                SwingConstants.CENTER);
        add(welcome);

        //User input field
        userInputField = new JTextField(5);
        add(userInputField);

        String[] dropdownOptions = {
                "----select----",
                "Celsius",
                "Fahrenheit",
                "Kelvin",
                "Rankine",
                "Delisle",
                "Newton",
                "Réaumur",
                "Rømer"
        };
        dropdown = new JComboBox(dropdownOptions);
        add(dropdown);

        JButton convert = new JButton("CONVERT");
        add(convert);

        outputArea = new JTextArea(6, 70);
        add(outputArea);

        //Adding an action listener to the convert button
        convert.addActionListener(e -> {
                    try {
                        userInput = Double.parseDouble(userInputField.getText());
                    } catch (NumberFormatException ee) {
                        JOptionPane.showMessageDialog(
                                Gui.this,
                                "INPUT ERROR: Please insert a number",
                                "INVALID INPUT",
                                JOptionPane.ERROR_MESSAGE);
                    }
                    String unit = (String) dropdown.getSelectedItem();
                    switch (unit) {
                        case "Celsius":
                            outputArea.setText(cel.toString());
                            break;
                        case "Fahrenheit":
                            outputArea.setText(fah.toString());
                            break;
                        case "Kelvin":
                            outputArea.setText(kel.toString());
                            break;
                        case "Rankine":
                            outputArea.setText(ran.toString());
                            break;
                        case "Delisle":
                            outputArea.setText(del.toString());
                            break;
                        case "Newton":
                            outputArea.setText(newt.toString());
                            break;
                        case "Réaumur":
                            outputArea.setText(réa.toString());
                            break;
                        case "Rømer":
                            outputArea.setText(røm.toString());
                    }
                }
        );
    }

    static Double getUserInput() {
        return userInput;
    }
}