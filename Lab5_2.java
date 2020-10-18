import javax.swing.JOptionPane;
public class Lab5_2 {
	public static void main(String [] args) {
		String num1String = JOptionPane.showInputDialog("Enter first number.");
		String num2String = JOptionPane.showInputDialog("Enter second number");
		String num3String = JOptionPane.showInputDialog("Enter third number");
		
		int num1 = Integer.parseInt(num1String);
		int num2 = Integer.parseInt(num2String);
		int num3 = Integer.parseInt(num3String);
		
		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;}
		
		if (num2 > num3) {
			int temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		if (num1 > num2 ) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		JOptionPane.showMessageDialog(null, num1 + " " + num2 + " " + num3);
	}

}
//Tatpiya Jirasakrojn 5907101005
