package MST;

import java.awt.Toolkit;
import javax.swing.ImageIcon;
/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *<pre>
 * Class        GraphsDisplay.java
 * Description  JDialog for seeing a visualization of the current graph.
 * Project      Project 3--Kruskal's Algorithm for MST.
 * Platform     jdk 1.8.0_241; NetBeans IDE 18; PC Windows 10
 * Course       CS 143
 * Hourse       20 minutes
 * Date         11/21/2023
 * Histoly log  11/21/2023
 * @author	<i>Robert Zimmerman</i>
 * @version 	%1%
 * @see     	javax.swing.JDialog
 *</pre>
*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class GraphsDisplay extends javax.swing.JDialog {
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Constructor  GraphsDisplay() - default Constructor
     * Description  Create an instance of the GraphsDisplay JDialog.
     * Date         11/20/2023
     * History Log  11/20/2023
     * @author      <i>Robert Zimmerman</i>
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public GraphsDisplay() {
        initComponents();
        this.setModal(true); //Set modal property
        this.setLocationRelativeTo(null); //Center the form
        //set icon
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/Images/Cities_tiny.png"));
        this.setResizable(false);   //Set resizable property
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Constructor  GraphsDisplay() - overidden Constructor
     * Description  Create an instance of the GraphsDisplay JDialog adding an 
     *              image to the label.
     * Date         11/20/2023
     * History Log  11/20/2023
     * @author      <i>Robert Zimmerman</i>
     * @param       imagePath String
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public GraphsDisplay(String imagePath)
    {
        this();
        ImageIcon img = new ImageIcon(imagePath);
        graphJLabel.setSize(img.getIconWidth() + 20, img.getIconHeight() + 50);
        this.setSize(graphJLabel.getWidth(), graphJLabel.getHeight());
        graphJLabel.setIcon(img);
        this.setLocationRelativeTo(null);   //Center the form
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        graphJLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Display of Cities Graph");
        setSize(new java.awt.Dimension(1241, 716));

        graphJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        graphJLabel.setAlignmentY(0.0F);
        graphJLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        graphJLabel.setIconTextGap(0);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(graphJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1253, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(graphJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel graphJLabel;
    // End of variables declaration//GEN-END:variables
}
