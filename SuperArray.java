//Joel Ye
//APCS1 pd10
//HW39 -- Array of Steel
//2015 - 12 - 01

/*****************************
 * SKELETON for
 * class SuperArray --  A wrapper class for an array. 
 * Maintains functionality:
 *  access value at index
 *  overwrite value at index
 * Adds functionality to std Java array:
 *  resizability
 *  ability to print meaningfully
 *****************************/

public class SuperArray {

    //~~~~~INSTANCE VARS~~~~~
    //underlying container, or "core" of this data structure:
    private int[] _data;

    //position of last meaningful value
    private int _lastPos;

    //size of this instance of SuperArray
    private int _size;

		
    //~~~~~METHODS~~~~~
    //default constructor – initializes 10-item array
    public SuperArray() {
	_data = new int[10];
	_lastPos = 9;
	_size = 10;
    }

		
    //output array in [a,b,c] format, eg
    // {1,2,3}.toString() -> "[1,2,3]"
    public String toString() {
	String s = "[";
	for (int i = 0; i < _lastPos; i++){
	    s += _data[i];
	    s += ",";
	}
	s = s.substring(0,s.length() - 1);
	s += "]";
	return s;
    }

		
    //double capacity of this SuperArray
    private void expand() { 
	_size *= 2;
	int[] newArr = new int[_size];
	for (int i = 0; i < _lastPos; i++)
	    newArr[i] = _data[i];
	_data = newArr;
    }

		
    //accessor -- return value at specified index
    public int get( int index ) { 
	if (index > _lastPos || index < 0){
		System.out.println("Nope!");
		return 0;
		//throw new RuntimeException();
	}
	else
		return _data[index];
	
	}

		
    //mutator -- set value at index to newVal, 
    //           return old value at index
    public int set( int index, int newVal ) { 
	if (index > _lastPos || index < 0){
		System.out.println("Nope!");
		return 0;
		//throw new RuntimeException();
	}
	else{
		int temp = _data[index];
		_data[index] = newVal;
		return temp;
	}
	}


    //main method for testing
    public static void main( String[] args ) {
	//*****INSERT ADEQUATE TEST CALLS HERE*****
		SuperArray a = new SuperArray();
		System.out.println(a.get(5));
		System.out.println(a.set(5,6));
		System.out.println(a.get(5));
		System.out.println(a.get(10));
    }//end main
		
}//end class
