import javax.swing.JOptionPane;
public class Lab6_2 {
	public static void main(String [] args) {
		String statusSting = JOptionPane.showInputDialog("Enter the filing status:\n 1-Addition\n "
				+ "2-Subtraction\n 3-Multiplication\n 4-Division");
		int status = Integer.parseInt(statusSting);
		String xString = JOptionPane.showInputDialog("Enter x ");
		String yString = JOptionPane.showInputDialog("Enter y ");
		double x = Integer.parseDouble(xString);
		double y = Integer.parseDouble(yString);
		double z;
		if(status == 1) {
			z = x + y;
			JOptionPane.showMessageDialog(null, "Answer is " + z);
		}
		else if(status == 2) {
			z = x - y;
			JOptionPane.showMessageDialog(null, "Answer is " + z);
		}
		else if(status == 3) {
			z = x * y;
			JOptionPane.showMessageDialog(null, "Answer is " + z);
		}
		else if(status == 4) {
			z = x/y;
			JOptionPane.showMessageDialog(null, "Answer is " + z);
		}
	}
}
