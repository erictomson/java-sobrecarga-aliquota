import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class ValidaImpostos {

    public static void main(String[] args) {
        double aliquota=0;
        aliquota=calculaImpostos("INSS");
        JOptionPane.showMessageDialog(null,"INSS. Aliquota: " + aliquota + " %");
        aliquota=calculaImpostos(100,"IR");
        JOptionPane.showMessageDialog(null,"IR. Aliquota: " + aliquota + " %");
    }

    public static double calculaImpostos(double valor, String imposto) {
        double aliquota=0;
        if(imposto.equals("INSS")) {
            JOptionPane.showMessageDialog(null,"Valor do INSS: " + NumberFormat.getCurrencyInstance().format(valor*0.08));
            aliquota=8.0;
        } else if(imposto.equals("IR")) {
            JOptionPane.showMessageDialog(null,"Valor do IR: " + NumberFormat.getCurrencyInstance().format(valor*0.2));
            aliquota=20.0;
        }
        return aliquota;
    };
    public static double calculaImpostos(String imposto) {
        double aliquota=0;
        if(imposto.equals("INSS")) {
            aliquota=8.0;
        } else if(imposto.equals("IR")) {
            aliquota=20.0;
        }
        return aliquota;
    };

}
