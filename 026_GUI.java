import java.awt.*;
import java.awt.event.*;

public class testButton extends Frame{
    int lebar = 300;
    int tinggi = 100;
    private WindowListener PenangananKejadian;
    
    public testButton(){
        setSize(lebar, tinggi);
        setTitle("test Button");
        
        Button tombolPerbesar = new Button("Perbesar");
        Button tombolSelesai = new Button("Selesai"); 
        
        Panel panelTombol = new Panel();
        panelTombol.add(tombolPerbesar);
        panelTombol.add(tombolSelesai);
        
        add(panelTombol);
        
        tombolPerbesar.addActionListener(new testButton.PenanangananTombol());
        tombolSelesai.addActionListener(new testButton.PenanangananTombol());
        
        addWindowListener(new testButton.PenangananKejadian());
        
        show();
    }
    public static void main(String[] args) {
        testButton apl = new testButton();
    }

    class PenangananKejadian extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }
    }

    class PenanangananTombol implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            String s = ae.getActionCommand();
            if(s.equals("Perbesar")){
                lebar += 20;
                tinggi += 10;
                setSize(lebar,tinggi);
            }else if(s.equals("Selesai")){
                System.exit(0);
            }
        }
    }
}
