import java.util.*;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Calculator
 * 
 * @author jadele
 */
public class GUI extends JFrame {
	private String num1, num2;
	private int n1, n2;
	private double temp1, temp2;
	private boolean opChoosen, equalsClicked, isDouble;
	private char op = ' ';

	private JFrame frame;
	private JPanel contentPanel;
	private JButton zero, one, two, three, four, five, six, seven, eight, nine;
	private JButton add, sub, mul, div, clear, clearAll, percent, point, equal, shift;
	private JTextField tf;

	public GUI() {
		frame = new JFrame("Calculator");
		contentPanel = new JPanel();
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBackground(Color.YELLOW);
		tf = new JTextField(null);
		tf.setEditable(false);
		contentPanel.add(tf, BorderLayout.NORTH);

		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		zero = new JButton("0");
		add = new JButton("+");
		sub = new JButton("-");
		mul = new JButton("x");
		div = new JButton("/");
		point = new JButton(".");
		clear = new JButton("C");
		clearAll = new JButton("AC");
		equal = new JButton("=");
		shift = new JButton("+/-");
		percent = new JButton("%");

		contentPanel.add(clear);
		contentPanel.add(clearAll);
		contentPanel.add(shift);
		contentPanel.add(div);
		contentPanel.add(nine);
		contentPanel.add(eight);
		contentPanel.add(seven);
		contentPanel.add(mul);
		contentPanel.add(four);
		contentPanel.add(five);
		contentPanel.add(six);
		contentPanel.add(add);
		contentPanel.add(one);
		contentPanel.add(two);
		contentPanel.add(three);
		contentPanel.add(sub);
		contentPanel.add(zero);
		contentPanel.add(point);
		contentPanel.add(percent);
		contentPanel.add(equal);

		Dimension dm = new Dimension(55, 50);
		one.setPreferredSize(dm);
		two.setPreferredSize(dm);
		three.setPreferredSize(dm);
		four.setPreferredSize(dm);
		five.setPreferredSize(dm);
		six.setPreferredSize(dm);
		seven.setPreferredSize(dm);
		eight.setPreferredSize(dm);
		nine.setPreferredSize(dm);
		add.setPreferredSize(dm);
		sub.setPreferredSize(dm);
		mul.setPreferredSize(dm);
		div.setPreferredSize(dm);
		point.setPreferredSize(dm);
		percent.setPreferredSize(dm);
		shift.setPreferredSize(dm);
		clear.setPreferredSize(dm);
		equal.setPreferredSize(dm);
		zero.setPreferredSize(dm);
		clearAll.setPreferredSize(dm);
		percent.setPreferredSize(dm);
		tf.setPreferredSize(new Dimension(225, 70));

		Numbers nums = new Numbers();
		Calculation cal = new Calculation();

		one.addActionListener(nums);
		two.addActionListener(nums);
		three.addActionListener(nums);
		four.addActionListener(nums);
		five.addActionListener(nums);
		six.addActionListener(nums);
		seven.addActionListener(nums);
		eight.addActionListener(nums);
		nine.addActionListener(nums);
		zero.addActionListener(nums);
		add.addActionListener(cal);
		sub.addActionListener(cal);
		mul.addActionListener(cal);
		div.addActionListener(cal);
		point.addActionListener(nums);
		percent.addActionListener(cal);
		shift.addActionListener(cal);
		clear.addActionListener(cal);
		clearAll.addActionListener(cal);
		equal.addActionListener(cal);

		frame.setVisible(true);
		this.setContentPane(contentPanel);
	}

	private class Numbers implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton src = (JButton) e.getSource();

			if (src.equals(one)) {
				if (opChoosen == false) {
					if (num1 == null)
						num1 = "1";
					else
						num1 += "1";
				} else {
					if (num2 == null)
						num2 = "1";
					else
						num2 += "1";

				}
			}

			if (src.equals(two)) {
				if (opChoosen == false) {
					if (num1 == null)
						num1 = "2";
					else
						num1 += "2";
				} else {
					if (num2 == null)
						num2 = "2";
					else
						num2 += "2";

				}
			}

			if (src.equals(three)) {
				if (opChoosen == false) {
					if (num1 == null)
						num1 = "3";
					else
						num1 += "3";
				} else {
					if (num2 == null)
						num2 = "3";
					else
						num2 += "3";
				}
			}

			if (src.equals(four)) {
				if (opChoosen == false) {
					if (num1 == null)
						num1 = "4";
					else
						num1 += "4";
				} else {
					if (num2 == null)
						num2 = "4";
					else
						num2 += "4";
				}
			}

			if (src.equals(five)) {
				if (opChoosen == false) {
					if (num1 == null)
						num1 = "5";
					else
						num1 += "5";
				} else {
					if (num2 == null)
						num2 = "5";
					else
						num2 += "5";
				}
			}

			if (src.equals(six)) {
				if (opChoosen == false) {
					if (num1 == null)
						num1 = "6";
					else
						num1 += "6";
				} else {
					if (num2 == null)
						num2 = "6";
					else
						num2 += "6";
				}
			}

			if (src.equals(seven)) {
				if (opChoosen == false) {
					if (num1 == null)
						num1 = "7";
					else
						num1 += "7";
				} else {
					if (num2 == null)
						num2 = "7";
					else
						num2 += "7";
				}
			}

			if (src.equals(nine)) {
				if (opChoosen == false) {
					if (num1 == null)
						num1 = "9";
					else
						num1 += "9";
				} else {
					if (num2 == null)
						num2 = "9";
					else
						num2 += "9";
				}
			}

			if (src.equals(eight)) {
				if (opChoosen == false) {
					if (num1 == null)
						num1 = "8";
					else
						num1 += "8";
				} else {
					if (num2 == null)
						num2 = "8";
					else
						num2 += "8";
				}
			}

			if (src.equals(zero)) {
				if (opChoosen == false) {
					if (num1 == null)
						num1 = "0";
					else
						num1 += "0";
				} else {
					if (num2 == null)
						num2 = "0";
					else
						num2 += "0";
				}
			}

			if (src.equals(point)) {
				isDouble = true;
				if (opChoosen == false) {
					if (num1 == null)
						num1 = "0.";
					else
						num1 += ".";
				} else {
					if (num2 == null)
						num2 = "0.";
					else
						num2 += ".";
				}
			}

			if (equalsClicked == false) {
				if (opChoosen == false)
					tf.setText(num1);
				else {
					tf.setText("");
					tf.setText(num2);
				}
			}
		}
	}

	private class Calculation implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton src = (JButton) e.getSource();

			if (src.equals(clear)) {
				if (equalsClicked == false) {
					if (tf.getText().length() > 0) {
						StringBuilder sb = new StringBuilder(tf.getText());
						sb.deleteCharAt(tf.getText().length() - 1);
						tf.setText(sb.toString());
					}
				}
			}

			if (src.equals(clearAll)) {
				tf.setText(null);
				num1 = null;
				num2 = null;
				opChoosen = false;
				equalsClicked = false;

			}
			if (src.equals(add)) {
				op = '+';
				opChoosen = true;
			}

			if (src.equals(sub)) {
				op = '-';
				opChoosen = true;
			}

			if (src.equals(mul)) {
				op = '*';
				opChoosen = true;
			}

			if (src.equals(div)) {
				op = '/';
				opChoosen = true;
			}

			if (src.equals(percent)) {
				isDouble = true;
				temp1 = Double.parseDouble(tf.getText());
				temp1 = (temp1 / 100);
				if (opChoosen == false) {
					num1 = Double.toString(temp1);
					tf.setText(num1);
				} else {
					num2 = Double.toString(temp1);
					tf.setText(num2);
				}

			}
			if (src.equals(shift)) {
				equalsClicked = false;
				if (isDouble == false) {
					n1 = Integer.parseInt(tf.getText());
					n1 = n1 * (-1);
					if (opChoosen == false) {
						num1 = Integer.toString(n1);
						tf.setText(num1);
					} else {
						num2 = Integer.toString(n1);
						tf.setText(num2);
					}
				}

				else {
					temp1 = Double.parseDouble(tf.getText());
					temp1 = temp1 * (-1);
					if (opChoosen == false) {
						num1 = Double.toString(temp1);
						tf.setText(num1);
					} else {
						num2 = Double.toString(temp1);
						tf.setText(num2);
					}
				}
			}

			if (src.equals(equal)) {
				int result = 0;

				if (isDouble == true) {
					temp1 = Double.parseDouble(num1);
					temp2 = Double.parseDouble(num2);
				} else {
					n1 = Integer.parseInt(num1);
					n2 = Integer.parseInt(num2);
				}

				equalsClicked = true;
				switch (op) {
				case '+': {
					if (isDouble == true) {
						tf.setText(Double.toString(temp1 + temp2));
					} else {
						result = n1 + n2;
						tf.setText(Integer.toString(result));
					}
					break;
				}
				case '-': {
					if (isDouble == true) {
						tf.setText(Double.toString(temp1 - temp2));
					} else {
						result = n1 - n2;
						tf.setText(Integer.toString(result));
					}
					break;
				}
				case '*': {
					if (isDouble == true) {
						tf.setText(Double.toString(temp1 * temp2));
					} else {
						result = n1 * n2;
						tf.setText(Integer.toString(result));
					}
					break;
				}

				case '/': {
					try {
						if (isDouble == true) {
							tf.setText(Double.toString(temp1 / temp2));
						} else if (n1 < n2 || n1 % n2 != 0) {
							temp1 = (double) n1;
							temp2 = (double) n2;
							tf.setText(Double.toString(temp1 / temp2));
						} else {
							result = n1 / n2;
							tf.setText(Integer.toString(result));
						}
					} catch (ArithmeticException ar) {
						tf.setText("Cannot proceed this");
						System.out.println("Divided by zero");
					}
					break;
				}
				}

			}
		}
	}
}
