import javax.swing.JOptionPane;

public class Calculadora {

    public static Integer soma(Integer x, Integer y) {
        return x + y;
    }

    public static Double divisao(Double x, Double y) {
        return x / y;
    }

    public static void main(String[] args) {
        int x, y;
        Double w, z;

        x = Integer.parseInt(JOptionPane.showInputDialog("Soma: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Soma: "));

        w = Double.parseDouble(JOptionPane.showInputDialog("Divisao: "));
        z = Double.parseDouble(JOptionPane.showInputDialog("Divisao: "));
        JOptionPane.showMessageDialog(null,"Soma: " + soma(x, y) 
        + "\nDivisão" + divisao(w, z));
    }
}