/**********************
 * ListInt interface:
 * Interface indicating standards for a 'list' holding ints.
 * - Can get, set value at index.
 * - Can return size of list.
 * - Can remove/add given index.
 * - Can append value to end of list.
 **********************/


public interface ListInt{

    /***
     * Pre: Index > 0; Index < Size;
     * Post: Int value at given index of list.
     ***/
    public int get(int index);

    /***
     * Pre: Index > 0; Index < Size; 
     * Post: Int value at given index of list.
     * Desc: Overwrites item at list index with newVal.
     ***/
    public int set(int index, int newVal);

    /***
     * Pre:
     * Post: Size of list.
     * Desc: Returns size of list.
     ***/
    public int size();

    /***
     * Pre: Index > 0; Index < Size;
     * Post:
     * Desc: Removes index from list. Indices past given shift down.
     *       Size is changed.
     ***/
    public void remove(int index);

    /***
     * Pre: Index > 0; Index < Size;
     * Post:
     * Desc: Appends val at end of list
     *       Size is changed.
     ***/
    public void add(int val);

    /***
     * Pre: Index > 0; Index < Size;
     * Post:
     * Desc: Adds index with value newVal into list.
     *       Indices past are bumped up an index.
     *       Size is changed.
     ***/
    public void add(int index, int newVal);
}
