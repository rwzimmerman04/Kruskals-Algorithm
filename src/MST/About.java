package MST;
/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *<pre>
 * Class        About.java
 * Description  About form for Address Book Application.
 * Project      Project 3--Kruskal's Algorithm for MST.
 * Platform     jdk 1.8.0_241; NetBeans IDE 18; PC Windows 10
 * Course       CS 143
 * Hourse       20 minutes
 * Date         11/14/2023
 * Histoly log  11/14/2023, 11/16/2023
 * @author	<i>Robert Zimmerman</i>
 * @version 	%1%
 * @see     	javax.swing.JDialog
 *</pre>
*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class About extends javax.swing.JDialog
{
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre> 
     * Constructor  JDialog to allow to select modal or modeless form
     * Description  Create the form as designed, center it, set the icon, 
     *              closeJButton as default.
     * Date         4/5/2021
     * History log  5/7//2020
     * @author      <i>Niko Culevski</i>
     * @param       parent java.awt.Frame
     * @param       modal boolean
     * @see         javax.swing.JDialog
     *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public About(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        //set closeJButton as default
        this.getRootPane().setDefaultButton(closeJButton); 
        this.setLocationRelativeTo(null);       //center form
        infoJTextArea.setCaretPosition(0);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleJLabel = new javax.swing.JLabel();
        closeJButton = new javax.swing.JButton();
        authorJLabel = new javax.swing.JLabel();
        versionJLabel = new javax.swing.JLabel();
        copyrightJLabel1 = new javax.swing.JLabel();
        dateJLabel = new javax.swing.JLabel();
        infoJScrollPane = new javax.swing.JScrollPane();
        infoJTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Kruskal's Algorithm For MSTs about");
        setResizable(false);

        titleJLabel.setFont(new java.awt.Font("Tempus Sans ITC", 2, 36)); // NOI18N
        titleJLabel.setForeground(new java.awt.Color(0, 102, 102));
        titleJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cities_small.png"))); // NOI18N
        titleJLabel.setText("Kruskal's Algorithm for MST");

        closeJButton.setBackground(new java.awt.Color(204, 255, 204));
        closeJButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        closeJButton.setMnemonic('C');
        closeJButton.setText("Close");
        closeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeJButtonActionPerformed(evt);
            }
        });

        authorJLabel.setText("Author:  Robert Zimmerman");

        versionJLabel.setText("Version 1.2.3");

        copyrightJLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        copyrightJLabel1.setText("Copyright: Freeware");

        dateJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dateJLabel.setText("Date:  11/17/2023");

        infoJScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        infoJTextArea.setEditable(false);
        infoJTextArea.setColumns(20);
        infoJTextArea.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        infoJTextArea.setLineWrap(true);
        infoJTextArea.setRows(5);
        infoJTextArea.setText("This program calculates an MST for a given undirected, weighted and connected graph using Kruskal's algorithm. Using the graph interface and AbstractGraph class this program creates a list of weighted edges and a hashmap of city names found in the given corresponding files. The user may enter more text files and can request the shortest path to all vertices in a connected graph by selecting the Shortest Path menu item and entering a source vertex to start at. The MST resulting from graph should have a number of edges equal to the number of vertices - 1, having the smallest number of edges possible and the least amount of weight throughout the entire tree. The user can save the current graphs information into a text file, the save menu item will not be able to be used until the Go button has been pressed, the clear menu item will make the save menu item unable to be pressed until the Go button is pressed once again.");
        infoJTextArea.setWrapStyleWord(true);
        infoJScrollPane.setViewportView(infoJTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(versionJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(authorJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addComponent(closeJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(copyrightJLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dateJLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(infoJScrollPane)
                    .addComponent(titleJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoJScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(versionJLabel))
                        .addComponent(authorJLabel))
                    .addComponent(closeJButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(copyrightJLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dateJLabel)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       closeJButtonActionPerformed
     * Description  Closes the About form only.
     * Date         11/17/2023
     * History log  11/17/2023
     * @author      <i>Robert Zimmerman</i>
     * @param       evt java.awt.event.ActionEvent
     *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void closeJButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_closeJButtonActionPerformed
    {//GEN-HEADEREND:event_closeJButtonActionPerformed
        setVisible(false);
    
}//GEN-LAST:event_closeJButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authorJLabel;
    private javax.swing.JButton closeJButton;
    private javax.swing.JLabel copyrightJLabel1;
    private javax.swing.JLabel dateJLabel;
    private javax.swing.JScrollPane infoJScrollPane;
    private javax.swing.JTextArea infoJTextArea;
    private javax.swing.JLabel titleJLabel;
    private javax.swing.JLabel versionJLabel;
    // End of variables declaration//GEN-END:variables
}
