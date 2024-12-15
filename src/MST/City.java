package MST;

import java.util.Objects;

/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *<pre>
 * Class        City.java
 * Description  Creates the city class for holding city information.
 * Project      Project 3--Kruskal's Algorithm for MST.
 * Platform     jdk 1.8.0_241; NetBeans IDE 18; PC Windows 10
 * Course       CS 143
 * Hourse       45 minutes
 * Date         10/30/2023
 * Histoly log  10/30/2023
 * @author	<i>Robert Zimmerman</i>
 * @version 	%1%
 * @see     	javax.swing.JDialog
 *</pre>
*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class City {
    private int id;             //City id
    private String name;        //City name
    private String state;       //City state
    private double population;  //City population
    private double area;        //City area
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>~
     * Constructor  City()
     * Description  Sets the default constructor for City class
     * @author      <i>Robert Zimmerman</i>
     * Date         10/30/2023
     * History log  10/30/2023
     * @param       id int
     * @param       name String
     * @param       population double
     * @param       state String
     * @param       area double
     * @see         java.util.Objects
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public City(int id, String name, String state, double population,
            double area)
    {
        this.id = id;
        this.name = name;
        this.state = state;
        this.population = population;
        this.area = area;
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>~
     * Constructor  City()  - Override Constructor
     * Description  Sets the overridden constructor for City class
     * @author      <i>Robert Zimmerman</i>
     * Date         10/30/2023
     * History log  10/30/2023
     * @see         java.util.Objects
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public City() 
    {
        this(0,"", "", 0, 0);
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>~
     * Constructor  City()  - Copy Constructor
     * Description  Sets the copy constructor for City class
     * @author      <i>Robert Zimmerman</i>
     * Date         10/30/2023
     * History log  10/30/2023
     * @param       other City
     * @see         java.util.Objects
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public City(City other)
    {
        this.id = other.id;
        this.name = other.name;
        this.state = other.state;
        this.population = other.population;
        this.area = other.area;
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>~
     * Method       getId
     * Description  Return the city ID.
     * @author      <i>Robert Zimmerman</i>
     * Date         10/30/2023
     * History log  10/30/2023
     * @return      int
     * @see         java.util.Objects
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public int getId() {
        return id;
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>~
     * Method       getName
     * Description  Return the city name.
     * @author      <i>Robert Zimmerman</i>
     * Date         10/30/2023
     * History log  10/30/2023
     * @return      String
     * @see         java.util.Objects
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public String getName() {
        return name;
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>~
     * Method       getState
     * Description  Return the city state.
     * @author      <i>Robert Zimmerman</i>
     * Date         10/30/2023
     * History log  10/30/2023
     * @return      String
     * @see         java.util.Objects
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public String getState() {
        return state;
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>~
     * Method       getPopulation
     * Description  Return the city population.
     * @author      <i>Robert Zimmerman</i>
     * Date         10/30/2023
     * History log  10/30/2023
     * @return      double
     * @see         java.util.Objects
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public double getPopulation() {
        return population;
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>~
     * Method       getArea
     * Description  Return the city area.
     * @author      <i>Robert Zimmerman</i>
     * Date         10/30/2023
     * History log  10/30/2023
     * @return      double
     * @see         java.util.Objects
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public double getArea() {
        return area;
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>~
     * Method       setId
     * Description  Set the City objects id.
     * @author      <i>Robert Zimmerman</i>
     * Date         10/30/2023
     * History log  10/30/2023
     * @param       id int
     * @see         java.util.Objects
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setId(int id) {
        this.id = id;
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>~
     * Method       setName
     * Description  Set the City objects name.
     * @author      <i>Robert Zimmerman</i>
     * Date         10/30/2023
     * History log  10/30/2023
     * @param       name String
     * @see         java.util.Objects
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setName(String name) {
        this.name = name;
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>~
     * Method       setState
     * Description  Set the City objects state.
     * @author      <i>Robert Zimmerman</i>
     * Date         10/30/2023
     * History log  10/30/2023
     * @param       state String
     * @see         java.util.Objects
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setState(String state) {
        this.state = state;
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>~
     * Method       setPopulation
     * Description  Set the City objects population.
     * @author      <i>Robert Zimmerman</i>
     * Date         10/30/2023
     * History log  10/30/2023
     * @param       population Double
     * @see         java.util.Objects
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setPopulation(double population) {
        this.population = population;
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>~
     * Method       setArea
     * Description  Set the City objects population.
     * @author      <i>Robert Zimmerman</i>
     * Date         10/30/2023
     * History log  10/30/2023
     * @param       area Double
     * @see         java.util.Objects
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setArea(double area) {
        this.area = area;
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>~
     * Method       toString
     * Description  Return a string of City objects fields.
     * @author      <i>Robert Zimmerman</i>
     * Date         10/30/2023
     * History log  10/30/2023
     * @return      String
     * @see         java.util.Objects
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    @Override
    public String toString() {
        return "id: " + id + ", name: " + name + ", state: " + state + 
                ", population: " + population + ", area: " + area + '}';
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>~
     * Method       equals
     * Description  Return if two objects are equal.
     * @author      <i>Robert Zimmerman</i>
     * Date         10/30/2023
     * History log  10/30/2023
     * @return      boolean
     * @param       obj Object
     * @see         java.util.Objects
     * </pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final City other = (City) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.state, other.state) && 
                Objects.equals(this.name, other.name);
    }
}
