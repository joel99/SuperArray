//Joel Ye and Bayle Smith-Salzberg
//APCS1 pd10
//HW40 -- Array of Grade 316
//2015 - 12 - 02

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

public class SuperArray implements ListInt {

    //~~~~~INSTANCE VARS~~~~~
    //underlying container, or "core" of this data structure:
    protected int[] _data;

    //position of last meaningful value
    protected int _lastPos;

    //size of this instance of SuperArray
    protected int _size;

		
    //~~~~~METHODS~~~~~
    //default constructor – initializes 10-item array
    public SuperArray() {
	_data = new int[10];
	_lastPos = -1;
	_size = 0;
    }

		
    //output array in [a,b,c] format, eg
    // {1,2,3}.toString() -> "[1,2,3]"
    public String toString() {
	String s = "[";
	for (int i = 0; i < _size; i++){
	    s += _data[i];
	    s += ",";
	}
	if (_size > 0){
	    s = s.substring(0,s.length() - 1);
	}
	s += "]";
	return s;
    }

		
    //double capacity of this SuperArray
    private void expand() { 
	int[] newArr = new int[2 * _data.length];
	for (int i = 0; i < _lastPos; i++){
	    newArr[i] = _data[i];
	}
	_data = newArr;
    }


		
    //accessor -- return value at specified index
    public int get( int index ) { 
	return _data[index];	
	}

    //accessor -- return _data length
    public int get_dataLength() {
	return _data.length;
    }
		
    //mutator -- set value at index to newVal, 
    //           return old value at index
    public int set( int index, int newVal ) { 
	int temp = _data[index];
	_data[index] = newVal;
	return temp;
	
    }

  // ~~~~~~~~~~~~~~ PHASE II ~~~~~~~~~~~~~~
    //adds an item after the last item
    public void add( int newVal ) {
	if (_size == _data.length)
		expand();
	_data[_size] = newVal;
	_size +=1;
	_lastPos += 1;
    }


    //inserts an item at index
    //shifts existing elements to the right
    public void add( int index, int newVal ) {
	if (index >= _size){
		//Let's throw an error!
	}
	if (_size == _data.length)
		expand();
	for (int i = _size; i > index + 1; i--){
	    _data[i] = _data[i - 1];
	}
	_data[index] = newVal;
	_lastPos += 1;
	_size +=1;
    }


    //removes the item at index
    //shifts elements left to fill in newly-emptied slot
    public void remove( int index ) {
	for (int i = index; i < _lastPos; i++)
		_data[i] = _data[i + 1];
	_lastPos -= 1;
	_size -= 1;
	}


    //return number of meaningful items in _data
    public int size() {
		return _size;
    }


    //main method for testing
    public static void main( String[] args ) 
    {
	/*
	//testing SuperJava methods
	SuperArray curtis = new SuperArray();
	System.out.println("Printing empty SuperArray curtis...");
	System.out.println(curtis);

	for( int i = 0; i < curtis._data.length; i++ ) {
	    curtis.add(i,i*2);
	}

	System.out.println("Printing populated SuperArray curtis...");
	System.out.println(curtis);

	System.out.println("testing get()...");
	for( int i = 0; i < curtis._size; i++ ) {
	    System.out.print( "item at index " + i + ":\t" );
	    System.out.println( curtis.get(i) );
	}
	SuperArray bayle = new SuperArray();
	System.out.println("Printing empty bayle");
	System.out.println(bayle);
	for (int i = 0; i < bayle._data.length; i++){
	    bayle.add(i * 3);
	}
	System.out.println("Printing numberified bayle...");
	System.out.println(bayle);
	System.out.println("Removing 5th element");
	bayle.remove(4);
	System.out.println(bayle);
	System.out.println(bayle.size());
	*/

	//testing for interface over implementation
	ListInt daemon = new SuperArray();

	System.out.println("Printing empty daemon");
	System.out.println(daemon);
	for (int i = 0; i < 10; i++){ //error with daemon._data.length
	    daemon.add(i);
	}
	System.out.println("Printing numberified daemon...");
	System.out.println(daemon);
	System.out.println("Removing 9th element");
	daemon.remove(8);
	System.out.println(daemon);
	System.out.println(daemon.size());


    }
}
