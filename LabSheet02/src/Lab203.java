
import java.text.DecimalFormat;
import javax.swing.*;

public class Lab203 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	    DecimalFormat frm = new DecimalFormat("###.#");
	    double weight = Double.parseDouble(JOptionPane.showInputDialog(null, "Input Weight:","Input",JOptionPane.QUESTION_MESSAGE));
	    double inputHeight = Double.parseDouble(JOptionPane.showInputDialog(null, "Input Height:","Input",JOptionPane.QUESTION_MESSAGE));
	 
	    //calculate
	    double heightInMeter = inputHeight /100;
	    double bmi = weight / (heightInMeter*heightInMeter);
	 
	    //Condition
	    String bmiMeanings;
	    if (bmi >= 30.0) {
	        bmiMeanings = "Obesity";
	    }
	    else if (bmi >= 25.0 && bmi <= 29.9) {
	        bmiMeanings = "Over-weight";
	    }
	    else if (bmi >= 18.5 && bmi <= 24.9) {
	        bmiMeanings = "Normal-weight";
	    }
	    else {
	        bmiMeanings = "Underweight";
	    }
	   
	    //output
	    JOptionPane.showMessageDialog(null, "BMI = "+frm.format(bmi)+"\nYou're "+bmiMeanings, "BMI", JOptionPane.WARNING_MESSAGE);

	}

}
