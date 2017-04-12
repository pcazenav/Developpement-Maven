package pc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import com.opencsv.CSVReader;


/**
 * Hello world!
 *
 */
public class App 
{
	public int max(int a,int b)
    {
    	return a>b ? a:b;
		//return a;
    }
	
    public static void main( String[] args )
    {       
        
        App a = new App();
        int c = a.max(4,5);
        
        System.out.println( "Hello !" );
        System.out.println( "Max entre 4 et 5 :" );
        System.out.println( c );  
        
        int monmax=0;
        try {
        	CSVReader reader = new CSVReader(new FileReader("data.csv"));
        	List<String[]> myEntries = reader.readAll();
        	Vector<String> out = new Vector<String>();
        	  for (String[] ligne : myEntries){
              	for (String element : ligne){
              		List<String> liste = Arrays.asList(element.split(","));
                    CollectionUtils.select(liste, new MonPredicat(),out);
              	}
        	  }
        	 }
        catch(FileNotFoundException e){
        	
        }
        catch(IOException e){
        	
        }
        System.out.println( "Out :" +out );

        
        
    }
   }

