public class Calculadora {
  public static void main(String[] args) {
    int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de valor inteiro: "));
    int b = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número de valor inteiro: "));
    JOptionPane.showMessageDialog(null, "O valor da soma dos dois números é" + (a+b) );
    double c = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de valor double: "));
    double d = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número de valor double: "));
    JOptionPane.showMessageDialog(null, "O valor da divisão dos dois números é" + (c/d) );

  }
}
