import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Formulario extends JFrame
{
	
private JPanel contentPane;
private Semaforo semaforo1;


public static void main(String[] args)
{
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Formulario frame = new Formulario();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}


public Formulario()
{
	
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 777, 582);
contentPane = new JPanel();
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
setContentPane(contentPane);
contentPane.setLayout(null);

semaforo1=new Semaforo();
semaforo1.setBounds(273,26,178,457);
contentPane.add(semaforo1);

JButton btnCambiar = new JButton("Cambiar");
btnCambiar.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0)
{
semaforo1.cambiar();
}
});
btnCambiar.setBounds(314, 509, 89, 23);
contentPane.add(btnCambiar);

}


}