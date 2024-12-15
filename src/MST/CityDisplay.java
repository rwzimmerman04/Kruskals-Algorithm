package MST;

import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *<pre>
 * Class        CityDisplay.java
 * Description  JDialog used for viewing information of a city.
 * Project      Project 3--Kruskal's Algorithm for MST.
 * Platform     jdk 1.8.0_241; NetBeans IDE 18; PC Windows 10
 * Course       CS 143
 * Hourse       30 minutes
 * Date         11/21/2023
 * Histoly log  11/21/2023
 * @author	<i>Robert Zimmerman</i>
 * @version 	%1%
 * @see     	javax.swing.JDialog
 *</pre>
*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class CityDisplay extends javax.swing.JDialog {

   private City myCity;
    
   /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Constructor  CityDisplay() - default Constructor
     * Description  Create an instance of the CityDisplay JDialog.
     * Date         11/18/2023
     * History Log  11/18/2023
     * @author      <i>Robert Zimmerman</i>
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
   public CityDisplay() {
        initComponents();
        this.getRootPane().setDefaultButton(closeJButton); //Set default button
        //Set Icon
        this.setIconImage(Toolkit.getDefaultToolkit().  
                getImage("src/Images/Cities_Small.png"));   //Set icon
        this.setLocationRelativeTo(null);   //Center the dialog
        this.setResizable(false);   //Set the dialog non-resizable
        this.setModal(true);    //Set modal true
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Constructor  CityDisplay() - overidden Constructor
     * Description  Create an instance of the CityDisplay JDialog with given City.
     * Date         11/18/2023
     * History Log  11/18/2023
     * @author      <i>Robert Zimmerman</i>
     * @param       city City
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
   public CityDisplay(City city)
   {
       this();
       myCity = city;
       this.setTitle("Details of " + myCity.getName());
       this.setModal(true);
       setPicture(cityImageJLabel, "src/Images/", myCity.getName());
       displayInfo();
   }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       setPicture()
     * Description  Sets the city picture to the cityImageJLabel
     * Date         11/18/2023
     * History log  11/18/2023
     * @author      <i>Robert Zimmerman</i>
     * @param       labelIn JLabel
     * @param       folderIn String
     * @param       nameIn String
     *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setPicture(JLabel labelIn, String folderIn, String nameIn)
    {
        String imagePath = folderIn + nameIn + ".jpg";
        labelIn.setIcon(new ImageIcon(imagePath));
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       displayInfo()
     * Description  Appends City info to StringBuffer then adds to 
     *              infoJTextArea.
     * Date         11/18/2023
     * History log  11/18/2023
     * @author      <i>Robert Zimmerman</i>
     *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void displayInfo()
    {
        infoJTextArea.setText("");
        StringBuffer output = new StringBuffer();
        output.append("City Id(Vertex): " + myCity.getId());
        output.append("\nName: " + myCity.getName());
        output.append("\nState: " + myCity.getState());
        output.append("\nPopulation: " + myCity.getPopulation() + " people");
        output.append("\nArea: " + myCity.getArea() + " square miles");
        infoJTextArea.setText(output.toString());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        infoJTextArea = new javax.swing.JTextArea();
        closeJButton = new javax.swing.JButton();
        cityImageJLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        infoJTextArea.setEditable(false);
        infoJTextArea.setColumns(20);
        infoJTextArea.setLineWrap(true);
        infoJTextArea.setRows(5);
        infoJTextArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(infoJTextArea);

        closeJButton.setText("Close");
        closeJButton.setToolTipText("Close the about form");
        closeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(cityImageJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(closeJButton)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(cityImageJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       closeJButtonActionPerformed()
     * Description  Closes the dialog.
     * Date         11/18/2023
     * History log  11/18/2023
     * @author      <i>Robert Zimmerman</i>
     * @param       evt java.awt.event.ActionEvent
     *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void closeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeJButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeJButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cityImageJLabel;
    private javax.swing.JButton closeJButton;
    private javax.swing.JTextArea infoJTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
