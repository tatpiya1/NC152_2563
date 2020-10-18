import javax.swing.JOptionPane;

public class Lab5_1 {
	public static void main(String [] args) {
		String num1String = JOptionPane.showInputDialog("Enter first number.");
		String num2String = JOptionPane.showInputDialog("Enter second number.");
		String num3String = JOptionPane.showInputDialog("Enter thirt number.");
		
		int num1 = Integer.parseInt(num1String);
		int num2 = Integer.parseInt(num2String);
		int num3 = Integer.parseInt(num3String);
		
		if (num1 < num2 && num2<=num3)
			JOptionPane.showMessageDialog(null, num1 + "<" + num2 + "<" + num3);
		else if (num2 <= num3 && num1 <= num3)
			JOptionPane.showMessageDialog(null, num2 + "<" + num1 + "<" + num3);
		else if (num2 <= num1 && num3 <= num1 && num3 <= num2)
			JOptionPane.showMessageDialog(null, num3 + "<" + num2 + "<" + num1);
		else if (num2 <= num1 && num3 <= num1 && num2 <= num3)
			JOptionPane.showMessageDialog(null, num2 + "<" + num3 + "<" + num1);
		else if (num1 <= num2 && num3 <= num2 && num3 <= num1)
			JOptionPane.showMessageDialog(null, num3 + "<" + num1 + "<" + num2);
		
	}

}
