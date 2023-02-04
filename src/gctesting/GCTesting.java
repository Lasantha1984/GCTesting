
package gctesting;

/**
 *
 * @author user
 */
public class GCTesting {

     int j=12;  
    void add()  
    {  
        j=j+12;  
        System.out.println("J="+j);  
    }  
    @Override
    public void finalize()  
    {  
        System.out.println("Object is garbage collected");  
    }  
    public static void main(String[] args) {
          new GCTesting().add();  
          System.gc();  
          new GCTesting().add();  
    }
    
}
