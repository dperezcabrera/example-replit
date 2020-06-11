import javax.swing.JFrame;

public class Main {

  public static void main(String[] args){
    JFrame frame = new JFrame("Example");
    frame.setSize(800, 600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setContentPane(new GraphPanel());
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}