import javax.swing.*;
import java.awt.event.*;

public class SimpleCalculator implements ActionListener {
    //Swing Components Declaration
    JTextField operandOne = new JTextField();
    JTextField operandTwo = new JTextField();
    JLabel resultLabel = new JLabel();
    JButton addButton = new JButton("+");
    JButton subtractButton = new JButton("-");
    JButton multiplyButton = new JButton("*");
    JButton divisionButton = new JButton("/");
    
    //Set Frame Components Properties
    private void setFrameComponents() {
        operandOne.setBounds(100, 100, 300, 50);
        operandTwo.setBounds(100, 200, 300, 50);
        resultLabel.setBounds(100, 350, 300, 50);
        resultLabel.setText("Results");
    }
    //Set Button Properties
    private void setButton() {
        addButton.setBounds(100, 400, 50, 50);
        addButton.addActionListener(this);
        subtractButton.setBounds(185, 400, 50, 50);
        subtractButton.addActionListener(this);
        multiplyButton.setBounds(265, 400, 50, 50);
        multiplyButton.addActionListener(this);
        divisionButton.setBounds(350, 400, 50, 50);
        divisionButton.addActionListener(this);
    }

    //Build Frame and Add Components
    public void createCalculatorInterface() {
        JFrame calculatorFrame = new JFrame();
        calculatorFrame.setSize(500, 700);
        calculatorFrame.setLayout(null);
        calculatorFrame.setVisible(true);
        
        calculatorFrame.add(operandOne);
        calculatorFrame.add(operandTwo);
        calculatorFrame.add(resultLabel);
        calculatorFrame.add(addButton);
        calculatorFrame.add(subtractButton);
        calculatorFrame.add(multiplyButton);
        calculatorFrame.add(divisionButton);

        setFrameComponents();
        setButton();
    }
    
    //ActionEvent to Calculate Two Operands upon Clicking Respective Buttons
    public void actionPerformed(ActionEvent e) {   
        int operandOneNumber = Integer.parseInt(this.operandOne.getText());
        int operandTwoNumber = Integer.parseInt(this.operandTwo.getText());
        int resultNumber = 0;
        
        if (e.getSource() == addButton) {
            resultNumber = operandOneNumber + operandTwoNumber;
            resultLabel.setText(Integer.toString(operandOneNumber) + "+" + Integer.toString(operandTwoNumber) + "=" + Integer.toString(resultNumber));
        }
        else if (e.getSource() == subtractButton) {
            resultNumber = operandOneNumber - operandTwoNumber;
            resultLabel.setText(Integer.toString(operandOneNumber) + "-" + Integer.toString(operandTwoNumber) + "=" + Integer.toString(resultNumber));
        }
        else if (e.getSource() == multiplyButton) {
            resultNumber = operandOneNumber * operandTwoNumber;
            resultLabel.setText(Integer.toString(operandOneNumber) + "*" + Integer.toString(operandTwoNumber) + "=" + Integer.toString(resultNumber));
        }
        else if (e.getSource() == divisionButton) {
            resultNumber = operandOneNumber / operandTwoNumber;
            resultLabel.setText(Integer.toString(operandOneNumber) + "/" + Integer.toString(operandTwoNumber) + "=" + Integer.toString(resultNumber));
        }

        resultNumber = 0; //Resets Value of resultNumber to 0 upon Calculation Conclusion
    }
}
