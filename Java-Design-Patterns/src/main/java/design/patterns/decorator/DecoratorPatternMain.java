/**
 * 
 */
package design.patterns.decorator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/**
 * @author nagendra
 *
 *         Structural pattern
 *
 *
 *         dynamically adds/overrides behaviour in an existing method of an
 *         object.
 * 
 *         Provide a wrapper to original class keeping the existing
 *         functionalities and of course adding the enhancement.
 * 
 *         Java i/o model is based on the decorator pattern. The layering of
 *         this reader on top of that reader on top of...is a really real world
 *         example of decorator.
 * 
 *         Quiet interesting article
 *         https://blog.ismaelvelten.com/2017/05/13/decorator-pattern-and-logging/
 * 
 * 
 *         This is a simple example of adding new behavior to an existing object
 *         dynamically, or the Decorator pattern. Due to the nature of dynamic
 *         languages such as Javascript, this pattern becomes part of the
 *         language itself.
 * 
 *         // create a message object <br>
 *         var message = { text: "Lorem ipsum dolor sit amet, consectetur
 *         adipisicing elit..." };
 * 
 *         // add logging behavior to the message object dynamically <br>
 *         message.log = function() { console.log(this.text); };
 * 
 *         // use the newly added behavior to log text<br>
 *         ​message.log();​ // Loren ipsum...​​​​​​​​​​​​​​​
 */
public class DecoratorPatternMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File toWriteTo = new File("/tmp/myfile1.txt");
		OutputStream outputStream = new FileOutputStream(toWriteTo);

		outputStream.write("Sample text".getBytes());

		outputStream.close();
		
		// Now let's add in GZIP format (This is like adding a new behaviour for File output stream!! :)

		File toWriteTo1 = new File("/tmp/myfile2.txt");
		OutputStream outputStream1 = new GZIPOutputStream(new FileOutputStream(toWriteTo1));

		outputStream1.write("Sample text".getBytes());
		outputStream1.close();

	}

}
