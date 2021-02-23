import javax.swing.JOptionPane;

public class IMC {

    public static void calcularIMC(Double imc) {
        if (imc < 17) {
            JOptionPane.showMessageDialog(null, "Muito abaixo do peso");
        } else if (imc >= 17 && imc <= 18.4) {
            JOptionPane.showMessageDialog(null, "Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            JOptionPane.showMessageDialog(null, "Peso normal");
        } else if (imc >= 25 && imc <= 29.9) {
            JOptionPane.showMessageDialog(null, "Acima do peso");
        } else if (imc >= 30 && imc <= 34.9) {
            JOptionPane.showMessageDialog(null, "Obesidade Grau I");
        } else if (imc >= 35 && imc <= 40) {
            JOptionPane.showMessageDialog(null, "Obesidade Grau II");
        } else if (imc > 40) {
            JOptionPane.showMessageDialog(null, "Obesidade Grau III");
        }
    }

    public static void main(String[] args) {
        Double peso, altura, imc;

        peso = Double.parseDouble(JOptionPane.showInputDialog("Peso: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("altura: "));

        imc = peso / (altura * altura);
        calcularIMC(imc);
    }
}
