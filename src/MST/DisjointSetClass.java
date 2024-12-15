package MST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * <pre>~
 Class        DisjointSetClass
 File         DisjointSetClass.java
 Description  Defines a disjoint set data structure.
 Course       CS 143
 Hours        45 minutes
 * @author      <i>Robert Zimmerman</i>
 * Environment  PC, Windows 10 Home, jdk 1.8.0_241, NetBeans 18
 * Date         10/30/2023
 * History log  10/30/2023
 * Version      1.0
 * @see         java.util.Objects
 * </pre>
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class DisjointSetClass {
    private static double totalWeight;
    private Map<Integer, Integer> parents = new HashMap<>();  //<Vertex, Parent Vertex>
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>~
     * Constructor  DisjointSet()  - Default Constructor
     * Description  Sets the default constructor for DisjointSetClass
     * @author      <i>Robert Zimmerman</i>
     * Date         10/30/2023
     * History log  10/30/2023
     * @param       totalWeight double
     * @param       parents HashMap
     * @see         java.util.Objects
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public DisjointSetClass(double totalWeight, HashMap parents) 
    {
        this.totalWeight = totalWeight;
        this.parents = parents;
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>~
     * Constructor  DisjointSet()  - Override Constructor
     * Description  Sets the overridden constructor for DisjointSet class
     * @author      <i>Robert Zimmerman</i>
     * Date         10/30/2023
     * History log  10/30/2023
     * @see         java.util.Objects
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public DisjointSetClass()
    {
        this(0, new HashMap<Integer, Integer>());
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>~
     * Constructor  DisjointSet()  - Copy Constructor
     * Description  Sets the copy constructor for DisjointSet class
     * @author      <i>Robert Zimmerman</i>
     * Date         10/30/2023
     * History log  10/30/2023
     * @param       other DisjointSet
     * @see         java.util.Objects
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public DisjointSetClass(DisjointSetClass other)
    {
        this.totalWeight = other.totalWeight;
        this.parents = other.parents;
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       getTotalWeight
     * Description  Return the sets total weight
     * Date         11/11/2023
     * History Log  11/11/2023
     * @author      <i>Robert Zimmerman</i>
     * @return      double
     *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/  
    public double getTotalWeight()
    {
        return totalWeight;
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       makeSet
     * Description  Creates numberOfVertices DisjointSets
     * Date         11/11/2023
     * History Log  11/11/2023
     * @author      <i>Robert Zimmerman</i>
     * @param       numberOfVertices int
     *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/  
    public void makeSet(int numberOfVertices)
    {
        for(int i = 0; i < numberOfVertices; i++)
        {
            parents.put(i, i);
        }
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       find
     * Description  Recursively find the root of the set in which every element k
     *              belongs.
     * Date         11/11/2023
     * History Log  11/11/2023
     * @author      <i>Robert Zimmerman</i>
     * @param       k int
     * @return      int
     *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/ 
    private int find(int k)
    {
        //Check if the parent of k is k, if so you found teh root
        if(parents.get(k) == k)
        {
            return k;
        }
        //Else recursivley search parents until you have found the root
        return find(parents.get(k));
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       union
     * Description  Union two subsets.
     * Date         11/11/2023
     * History Log  11/11/2023
     * @author      <i>Robert Zimmerman</i>
     * @param       a int
     * @param       b int
     *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/ 
    private void union(int a, int b)
    {
        int u = find(a);
        int v = find(b);
        
        parents.put(u, v);
        
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       KruskalAlgorithm
     * Description  Creates MST using Kruskal's method
     * Date         11/11/2023
     * History Log  11/11/2023
     * @author      <i>Robert Zimmerman</i>
     * @param       edges List
     * @param       numberOfVertices int
     * @return      List
     *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/ 
    public static List<WeightedEdge> kruskalAlgorithm(List<WeightedEdge> 
            edges, int numberOfVertices)
    {
        //Reset the totalWeight field
        totalWeight = 0;
        //List to hold the paths of the mst
        List<WeightedEdge> mst = new ArrayList<>();
        //Create new DisjointSetClass
        DisjointSetClass dsc = new DisjointSetClass();
        dsc.makeSet(numberOfVertices);
        
        int index = 0;
        //Sort edges by weight in ascending order
        Collections.sort(edges, Comparator.comparingDouble(e -> e.weight));
        
        System.out.println("MST Proccess started");
        //Iterator through and compare each edge.
        while (mst.size() != numberOfVertices - 1)
        {
            //Current edge
            WeightedEdge edge = edges.get(index);
            //Find flipped edge
            WeightedEdge flipped = new WeightedEdge(edge.v, edge.u, edge.weight);
            int root1 = dsc.find(edge.u);
            int root2 = dsc.find(edge.v);
            //Will the edge create a cycle? Does the mst contain the reverse edge?
            if((root1 != root2)  && !(mst.contains(flipped)))
            {
                dsc.union(root1, root2);
                mst.add(edge);
                totalWeight = totalWeight + edge.weight;
            }
            //Move to next edge in list
            index++;
        }
//        for(WeightedEdge edge: mst)
//        {
//                System.out.println(edge.u + ", " + edge.v + ", " + edge.weight);
//        }
//        System.out.println(totalWeight);
        return mst;
    }
}
