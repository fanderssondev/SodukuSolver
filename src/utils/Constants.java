package utils;

/**
 * @author {nanobyter}
 * 
 * created: 2022-06-28
 */
public class Constants {

	private static Constants constants = null;

	public static final int GRID_SIZE = 9;
	
	
	private Constants() {
		
	}
	
	public static Constants getInstance() {
		
		if(constants == null)
			constants = new Constants();
		
		return constants;
	}
	
}
