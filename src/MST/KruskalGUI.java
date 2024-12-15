package MST;

import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *<pre>
 * Class        KruskalGUI.java
 * Description  Main form for running the application of finding an MST with
 *              Kruskal's Algorithm.
 * Project      Project 3--Kruskal's Algorithm for MST.
 * Platform     jdk 1.8.0_241; NetBeans IDE 18; PC Windows 10
 * Course       CS 143
 * Hourse       3 hours 45 minutes
 * Date         10/30/2023
 * Histoly log  10/30/2023, 11/16/2023, 11/21/2023
 * @author	<i>Robert Zimmerman</i>
 * @version 	%1%
 * @see     	javax.swing.JDialog
 *</pre>
*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class KruskalGUI extends javax.swing.JFrame {

    private String edgesFile = "src/Data/Edges1.txt";
    private String citiesFile = "src/Data/Cities1.txt";
    private final String infoFile = "src/Data/CityObjects.txt";
    private String graphImagePath = "";
    private StringBuffer output = new StringBuffer();
    private List<WeightedEdge> edges; 
    private List<WeightedEdge> kruskalTree;
    private WeightedGraph<Integer> graph;   
    private Map<Integer, String> citiesHashMap = new HashMap<Integer, String>();
    private List<String> cityNames;
    private ArrayList<City> cityObjectsList = new ArrayList<>();
    private int numberOfVertices = 0, index = 0;
    private boolean isConnected = false;
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Constructor  KruskalGUI - Default Constructor
     * Description  Defualt constructor for the KruskalGUI class
     * Date:        11/13/2023
     * @author      <i>Robert Zimmerman</i>
     *</pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public KruskalGUI() {
        initComponents();
        //set image
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/Images/Cities_tiny.png"));
        //set default button
        this.getRootPane().setDefaultButton(goJButton);    
        this.setResizable(false);
        this.setLocationRelativeTo(null);       //center form
        
        edges = new ArrayList<WeightedEdge>();  
        graph = new WeightedGraph<Integer>(edges, numberOfVertices);  
        
        cityNames = new ArrayList<>();
        
        int i = filesJComboBox.getSelectedIndex();
        citiesFile = "src/Data/Cities" + i + ".txt";
        edgesFile = "src/Data/WeightedEdges" + i + ".txt";
        graphImagePath = "src/Images/Cities" + i + ".png";
        
        readFromFile(edgesFile, citiesFile);
        readCityInfo(infoFile);
        saveJMenuItem.setEnabled(false);
        
        //Update the info for displaying a graph image
        if((new File(graphImagePath).exists()))
        {
           graphDisplayJMenuItem.setText("Display Graph " + i); 
           graphDisplayJMenuItem.setEnabled(true);
        }
        else
        {
           graphDisplayJMenuItem.setText("Display Graph"); 
           graphDisplayJMenuItem.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resultsScrollPane = new javax.swing.JScrollPane();
        resultsJTextArea = new javax.swing.JTextArea();
        titleJLabel = new javax.swing.JLabel();
        fileJLabel = new javax.swing.JLabel();
        filesJComboBox = new javax.swing.JComboBox<>();
        goJButton = new javax.swing.JButton();
        quitJButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileJMenu = new javax.swing.JMenu();
        newJMenuItem = new javax.swing.JMenuItem();
        saveJMenuItem = new javax.swing.JMenuItem();
        clearJMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        printJMenuItem = new javax.swing.JMenuItem();
        quitJMenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        cityDetailJMenuItem = new javax.swing.JMenuItem();
        shortestPathJMenuItem = new javax.swing.JMenuItem();
        graphDisplayJMenuItem = new javax.swing.JMenuItem();
        helpJMenu = new javax.swing.JMenu();
        aboutJMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kruskal's Algorithm for MST");

        resultsJTextArea.setEditable(false);
        resultsJTextArea.setBackground(new java.awt.Color(240, 240, 240));
        resultsJTextArea.setColumns(20);
        resultsJTextArea.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        resultsJTextArea.setLineWrap(true);
        resultsJTextArea.setRows(5);
        resultsJTextArea.setWrapStyleWord(true);
        resultsScrollPane.setViewportView(resultsJTextArea);

        titleJLabel.setFont(new java.awt.Font("Sitka Text", 2, 36)); // NOI18N
        titleJLabel.setForeground(new java.awt.Color(102, 51, 255));
        titleJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cities_Small.png"))); // NOI18N
        titleJLabel.setText("Kruskals Algorithm for MST");

        fileJLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fileJLabel.setText("Select File:");

        filesJComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        filesJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "WeightedEdges0.txt", "WeightedEdges1.txt", "WeightedEdges2.txt", "WeightedEdges3.txt", "WeightedEdges4.txt", "WeightedEdges5.txt" }));
        filesJComboBox.setToolTipText("");
        filesJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filesJComboBoxActionPerformed(evt);
            }
        });

        goJButton.setBackground(new java.awt.Color(255, 255, 204));
        goJButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        goJButton.setMnemonic('g');
        goJButton.setText("Go");
        goJButton.setToolTipText("Show results");
        goJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goJButtonActionPerformed(evt);
            }
        });

        quitJButton.setBackground(new java.awt.Color(255, 255, 204));
        quitJButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        quitJButton.setMnemonic('Q');
        quitJButton.setText("Quit");
        quitJButton.setToolTipText("End the Application");
        quitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitJButtonActionPerformed(evt);
            }
        });

        fileJMenu.setText("File");

        newJMenuItem.setText("New");
        newJMenuItem.setToolTipText("Load a new graph");
        newJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(newJMenuItem);

        saveJMenuItem.setText("Save");
        saveJMenuItem.setToolTipText("Save the information of the current graph.");
        saveJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(saveJMenuItem);

        clearJMenuItem.setText("Clear");
        clearJMenuItem.setToolTipText("Clear the form");
        clearJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(clearJMenuItem);
        fileJMenu.add(jSeparator1);

        printJMenuItem.setText("Print Form");
        printJMenuItem.setToolTipText("Print the form");
        printJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(printJMenuItem);

        quitJMenuItem.setText("Quit");
        quitJMenuItem.setToolTipText("End the Application");
        quitJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(quitJMenuItem);

        jMenuBar1.add(fileJMenu);

        jMenu1.setText("Graph Information");

        cityDetailJMenuItem.setText("City Details");
        cityDetailJMenuItem.setToolTipText("Review information of cities");
        cityDetailJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityDetailJMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(cityDetailJMenuItem);

        shortestPathJMenuItem.setText("Shortest Path");
        shortestPathJMenuItem.setToolTipText("Get all shortest paths");
        shortestPathJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shortestPathJMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(shortestPathJMenuItem);

        graphDisplayJMenuItem.setText("Display Graph");
        graphDisplayJMenuItem.setToolTipText("Display current graph");
        graphDisplayJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphDisplayJMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(graphDisplayJMenuItem);

        jMenuBar1.add(jMenu1);

        helpJMenu.setText("Help");

        aboutJMenuItem.setText("About");
        aboutJMenuItem.setToolTipText("Open teh about form");
        aboutJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutJMenuItemActionPerformed(evt);
            }
        });
        helpJMenu.add(aboutJMenuItem);

        jMenuBar1.add(helpJMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(resultsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titleJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(filesJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fileJLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 286, Short.MAX_VALUE)
                        .addComponent(goJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(titleJLabel)
                .addGap(18, 18, 18)
                .addComponent(fileJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(goJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(quitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(filesJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(resultsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       readFromFile()
     * Description  Read text files and create ArrayLists of vertices and edges.
     * Date         11/15/2023
     * History      11/15/2023
     * @author      <i>Robert Zimmerman</i>
     * @param       textFile String
     *</pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void readFromFile(String edgesFile, String citiesFile)
    {    
        int count = 0, index = 0;
        cityNames.clear(); edges.clear(); 
        try
        {
            File file = new File(edgesFile);
            Scanner input = new Scanner(file);
            
            //Read the number of vertices in the first linne
            String line = input.nextLine();
            numberOfVertices = Integer.parseInt(line);
            
            while(input.hasNext())
            {
                //Set line to next line an split it into the array of string tokens
                line = input.nextLine();
                String[] tokens = line.split("[\\|+]");
                
                for(int i = 0; i < tokens.length; i++)
                {
                    line = tokens[i].trim();
                    String[] commaTokens = line.split("[\\,+]"); //Split at ,s
                    
                    int u = Integer.parseInt(commaTokens[0].trim());
                    int v = Integer.parseInt(commaTokens[1].trim());
                    double w = Double.parseDouble(commaTokens[2].trim());
                    
                    //Add the edge and the reverse of teh edge, text file does not
                    //contain both of them so we must add the reverse ourselves.
                    edges.add(new WeightedEdge(u, v, w));
                    edges.add(new WeightedEdge(v, u, w));
                }
            }
            input.close();
            //Read the cities (vertices)
            file = new File(citiesFile);
            input = new Scanner(file);
            while(input.hasNext())
            {
                line = input.nextLine();
                cityNames.add(line);
                citiesHashMap.put(count, line);
                count++;
            }
            input.close();
        }
        catch(FileNotFoundException exp)
        {
            JOptionPane.showMessageDialog(null, "Input Error - File not found",
                    "File not found error", JOptionPane.ERROR_MESSAGE);
        }
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       readCityInfo()
     * Description  Read city objects text file t0 create list of city objects.
     * Date         11/15/2023
     * History      11/15/2023
     * @author      <i>Robert Zimmerman</i>
     * @param       infoFile String
     *</pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void readCityInfo(String infoFile)
    {
        cityObjectsList.clear();
        try
        {
            File file = new File(infoFile);
            Scanner input = new Scanner(file);
            String line = "";
            int id = 0; 
            String name = ""; String state = "";
            double population = 0; double area = 0;
            City newCity = new City();
            
            while(input.hasNext() && (cityObjectsList.size() != numberOfVertices))
            {
                line = input.nextLine();
                StringTokenizer tokenizer = new StringTokenizer(line, ",");
                while(tokenizer.hasMoreElements())
                {
                    //Get id of city
                    id = Integer.parseInt(tokenizer.nextElement().toString());
                    //Get name of city
                    name = tokenizer.nextElement().toString().trim();
                    //Get state of city
                    state = tokenizer.nextElement().toString().trim();
                    //Get population of city
                    population = Double.parseDouble(
                            tokenizer.nextElement().toString());
                    //Get area of city
                    area = Double.parseDouble(
                            tokenizer.nextElement().toString());
                    newCity = new City(id, name, state, population, area);
                }
                cityObjectsList.add(newCity);
            }
        }
        catch(FileNotFoundException fnfex)
        {
            JOptionPane.showMessageDialog(null, "Input Error - File not found",
                    "File not found error", JOptionPane.ERROR_MESSAGE);
        }
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       createGraph()
     * Description  Create the graph and print graph info to textArea.
     * Date         11/14/2023
     * History      11/14/2023
     * @author      <i>Robert Zimmerman</i>
     *</pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void createGraph()
    {
        resultsJTextArea.setText("");
        output = new StringBuffer();
        //Make the graph
        graph = new WeightedGraph(edges, numberOfVertices);
        DisjointSetClass dsc = new DisjointSetClass();
        kruskalTree = dsc.kruskalAlgorithm(edges, numberOfVertices);
        
        output.append("The number of vertices is " + numberOfVertices + "\n");
        
        AbstractGraph<Integer>.Tree tree = graph.dfs(0);
        output.append(graph.displayWeightedEdges() + "\n");

        output.append("Weighted edges comprising the Kruskal MST:\n");
        for(int i = 0; i < kruskalTree.size(); i++)
        {
            output.append("(" + kruskalTree.get(i).u + ", " 
                        + kruskalTree.get(i).v + ")");
            if(i != (kruskalTree.size() - 1))
            {
                output.append(", ");
            }   
        }
        output.append("\n\nCities comprising the Kruskal MST:\n");
        for(int i = 0; i < kruskalTree.size(); i++)
        {
            output.append("(" + citiesHashMap.get(kruskalTree.get(i).u) + ", " 
                        + citiesHashMap.get(kruskalTree.get(i).v) + ")");
            if(i != (kruskalTree.size() - 1))
            {
                output.append(", ");
            }   
        }
        output.append("\n\nTotal weight of Kruskal MST is " + dsc.getTotalWeight());
        
        if(tree.getNumberOfVerticesFound() == numberOfVertices)
        {
            isConnected = true;
        }
        else
        {
            isConnected = false;
        }
        resultsJTextArea.setText(output.toString());
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       goButtonActionPerformed()
     * Description  Handles the go button being pressed.
     * Date         11/14/2023
     * History      11/14/2023
     * @author      <i>Robert Zimmerman</i>
     * @param       evt java.awt.event.ActionEvent
     *</pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void goJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goJButtonActionPerformed
        saveJMenuItem.setEnabled(true);
        resultsJTextArea.setText("");
        output = new StringBuffer();
        int i = filesJComboBox.getSelectedIndex();
        citiesFile = "src/Data/Cities" + i + ".txt";
        edgesFile = "src/Data/WeightedEdges" + i + ".txt";
        readFromFile(edgesFile, citiesFile);
        createGraph();
    }//GEN-LAST:event_goJButtonActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       quitButtonActionPerformed()
     * Description  Close the program.
     * Date         11/15/2023
     * History      11/15/2023
     * @author      <i>Robert Zimmerman</i>
     * @param       evt java.awt.event.ActionEvent
     *</pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void quitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitJButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitJButtonActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       newJMenuItemActionPerformed()
     * Description  User can select a txt file of edges from the data folder.
     * Date         11/15/2023
     * History      11/15/2023
     * @author      <i>Robert Zimmerman</i>
     * @param       evt java.awt.event.ActionEvent
     *</pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void newJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newJMenuItemActionPerformed
        try
        {
            JFileChooser chooser = new JFileChooser("src/Data");
            FileNameExtensionFilter filter = new FileNameExtensionFilter(
            "Txt Files", "txt");
            chooser.setFileFilter(filter);
            int choice = chooser.showOpenDialog(null);
            if(choice == JFileChooser.APPROVE_OPTION)
            {
                File chosen = chooser.getSelectedFile();
                edgesFile = "src/Data/" + chosen.getName();
                filesJComboBox.setSelectedItem(chosen.getName());
                
                readFromFile(edgesFile, citiesFile);
                createGraph();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Cannot find file",
                        "File Input Error", JOptionPane.WARNING_MESSAGE);
            }
        }
        catch(IllegalArgumentException exp)
        {
            JOptionPane.showMessageDialog(null, "File is not in correct format.",
                "File Input Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_newJMenuItemActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       quitJMenuItemActionPerformed()
     * Description  Closes the program.
     * Date         11/15/2023
     * History      11/15/2023
     * @author      <i>Robert Zimmerman</i>
     * @param       evt java.awt.event.ActionEvent
     *</pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void quitJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitJMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitJMenuItemActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       printJMenuActionPerformed()
     * Description  Prints the form.
     * Date         11/15/2023
     * History      11/15/2023
     * @author      <i>Robert Zimmerman</i>
     * @param       args String
     *</pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void printJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printJMenuItemActionPerformed
        PrintUtilities.printComponent(this);
    }//GEN-LAST:event_printJMenuItemActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       clearJMenuActionPerformed()
     * Description  Clear the form.
     * Date         11/15/2023
     * History      11/15/2023
     * @author      <i>Robert Zimmerman</i>
     * @param       args String
     *</pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void clearJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearJMenuItemActionPerformed
        saveJMenuItem.setEnabled(false);
        resultsJTextArea.setText("");
        output = new StringBuffer();
    }//GEN-LAST:event_clearJMenuItemActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       saveJMenuItemActionPerformed()
     * Description  Save the infomation in the reusltsJTextField to a new text file.
     * Date         11/17/2023
     * History      11/17/2023
     * @author      <i>Robert Zimmerman</i>
     * @param       args String
     *</pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void saveJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJMenuItemActionPerformed
        int index = filesJComboBox.getSelectedIndex();
        String filePath = "src/Data/WeightedEdges" + index + "Info.txt";
        try
        {
            File file = new File(filePath);
            FileWriter fw = new FileWriter(file, false);
            BufferedWriter writer = new BufferedWriter(fw);
            file.createNewFile();
            if(file.exists())
            {
                System.out.println("Output: " + output.toString());
                writer.write(output.toString());
            }
            writer.close();
        }
        catch(IOException ex)
        {
            JOptionPane.showMessageDialog(null, "File not created.",
                "File Creation Error", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_saveJMenuItemActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       shortestPathJMenuItemActionPerformed()
     * Description  Get the shortest path of a selected source vertex to all other
     *              vertices in the current graph.
     * Date         11/17/2023
     * History      11/17/2023
     * @author      <i>Robert Zimmerman</i>
     * @param       args String
     *</pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void shortestPathJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shortestPathJMenuItemActionPerformed
        try
        {
            goJButtonActionPerformed(evt);
            if(!isConnected)
            {
                resultsJTextArea.setText("\n\nGraph is not connected");
            }
            else
            {
                int index = Integer.parseInt(JOptionPane.showInputDialog(
                        "Enter the source vertex. (0 - " + (numberOfVertices - 1) + ")"));
                goJButton.doClick();
                WeightedGraph<String> nameGraph = new WeightedGraph<>(cityNames, edges);
                WeightedGraph<String>.ShortestPathTree shortestTree = 
                        nameGraph.getShortestPath(index);
                
                output.append("\n\nThe graph is connected.\n");
                output.append(shortestTree.displayAllPaths(index));
                
                resultsJTextArea.setText(output.toString());
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Could not connect path."
            , "Path Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_shortestPathJMenuItemActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       aboutJMenuItemActionPerformed()
     * Description  Opens About JDialog to inform user of programs usages.
     * Date         11/19/2023
     * History      11/19/2023
     * @author      <i>Robert Zimmerman</i>
     * @param       args String
     *</pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void aboutJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutJMenuItemActionPerformed
       About aboutWindow = new About(null, true);
       aboutWindow.setVisible(true);
    }//GEN-LAST:event_aboutJMenuItemActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       cityDetailJMenuItemActionPerformed()
     * Description  Opens an input dialog with combobox of all vertexs for choice
     *              of city info.
     * Date         11/15/2023
     * History      11/15/2023
     * @author      <i>Robert Zimmerman</i>
     * @param       args String
     *</pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void cityDetailJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityDetailJMenuItemActionPerformed
        String[] cities = new String[numberOfVertices];
        String cityName = "";
        for(int i = 0; i < numberOfVertices; i++)
        {
            cities[i] = citiesHashMap.get(i);
        }
        JComboBox citiesJComboBox = new JComboBox(cities);
        
        int input;
        input = JOptionPane.showConfirmDialog(null, citiesJComboBox, 
                "Select a city", JOptionPane.DEFAULT_OPTION);
        if(input == JOptionPane.OK_OPTION)
        {
            cityName = (String)citiesJComboBox.getSelectedItem();
        }
        for(int i = 0; i < numberOfVertices; i++)
        {
            if(cityObjectsList.get(i).getName().equals(cityName))
            {
                City city = cityObjectsList.get(i);
                CityDisplay cDisplay = new CityDisplay(city);
                cDisplay.setVisible(true);
            }
        }
        
    }//GEN-LAST:event_cityDetailJMenuItemActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       filesJMenuItemActionPerformed()
     * Description  Changes the selected graph to be used in the programs uses.
     * Date         11/21/2023
     * History      11/21/2023
     * @author      <i>Robert Zimmerman</i>
     * @param       args String
     *</pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void filesJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filesJComboBoxActionPerformed
        int i = filesJComboBox.getSelectedIndex();
        citiesFile = "src/Data/Cities" + i + ".txt";
        edgesFile = "src/Data/WeightedEdges" + i + ".txt";
        graphImagePath = "src/Images/Cities" + i + ".png";
        readFromFile(edgesFile, citiesFile);
        readCityInfo(infoFile);
        if((new File(graphImagePath).exists()))
        {
           graphDisplayJMenuItem.setText("Display Graph " + i); 
           graphDisplayJMenuItem.setEnabled(true);
        }
        else
        {
           graphDisplayJMenuItem.setText("Display Graph"); 
           graphDisplayJMenuItem.setEnabled(false);
        }
    }//GEN-LAST:event_filesJComboBoxActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       graphDisplayJMenuItemActionPerformed()
     * Description  Displays the graph in a GraphsDisplay JDialog of the currently
     *              selected graph.
     * Date         11/22/2023
     * History      11/22/2023
     * @author      <i>Robert Zimmerman</i>
     * @param       args String
     *</pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void graphDisplayJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphDisplayJMenuItemActionPerformed
        int i = filesJComboBox.getSelectedIndex();
        citiesFile = "src/Data/Cities" + i + ".txt";
        edgesFile = "src/Data/WeightedEdges" + i + ".txt";
        graphImagePath = "src/Images/Cities" + i + ".png";
        if((new File(graphImagePath).exists()))
        {
           GraphsDisplay gDisplay = new GraphsDisplay(graphImagePath);
           gDisplay.setVisible(true);
        }
    }//GEN-LAST:event_graphDisplayJMenuItemActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       main()
     * Description  Runs the arguments of the program.
     * Date:        11/14/2023
     * @author      <i>Robert Zimmerman</i>
     * @param       args String
     *</pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static void main(String args[]) {
        Splash splash = new Splash(4000);   //Set splash timer
        splash.showSplash();    //Show the splash
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KruskalGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutJMenuItem;
    private javax.swing.JMenuItem cityDetailJMenuItem;
    private javax.swing.JMenuItem clearJMenuItem;
    private javax.swing.JLabel fileJLabel;
    private javax.swing.JMenu fileJMenu;
    private javax.swing.JComboBox<String> filesJComboBox;
    private javax.swing.JButton goJButton;
    private javax.swing.JMenuItem graphDisplayJMenuItem;
    private javax.swing.JMenu helpJMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem newJMenuItem;
    private javax.swing.JMenuItem printJMenuItem;
    private javax.swing.JButton quitJButton;
    private javax.swing.JMenuItem quitJMenuItem;
    private javax.swing.JTextArea resultsJTextArea;
    private javax.swing.JScrollPane resultsScrollPane;
    private javax.swing.JMenuItem saveJMenuItem;
    private javax.swing.JMenuItem shortestPathJMenuItem;
    private javax.swing.JLabel titleJLabel;
    // End of variables declaration//GEN-END:variables
}
