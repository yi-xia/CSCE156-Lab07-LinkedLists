package unl.cse.trucks;

public class TruckList {
	
	//TODO: add the head of your list here

	/**
	 * This function returns the size of the list, the number of
	 * elements currently stored in it.
	 * @return
	 */
	public int getSize() { 
    	throw new UnsupportedOperationException("Not yet implemented.");
	}

	/**
	 * This function clears out the contents of the list, making it an
	 * empty list.
	 */
    public void clear() {
    	throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    /**
     * This method gets the first {@link TruckListNode} instance 
     * of the list.
     */
    public TruckListNode getFirst(){
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    /**
     * This method gets the last {@link TruckListNode} instance 
     * of the list.
     */
    public TruckListNode getLast(){
        throw new UnsupportedOperationException("Not yet implemented.");
    }

    /**
     * This method adds the given {@link Truck} instance to the specific
     * <code>position</code> of the list.
     * @param t
     * @param position
     */
    public void add(Truck t, int position){
        throw new UnsupportedOperationException("Not yet implemented.");
    }

    /**
     * This method adds the given {@link Truck} instance to the beginning
     * of the list.
     * @param t
     */
    public void addToStart(Truck t) {
    	throw new UnsupportedOperationException("Not yet implemented.");
    }

    /**
     * This method adds the given {@link Truck} instance to the end of
     * the list.
     * @param t
     */
    public void addToEnd(Truck t) {
    	throw new UnsupportedOperationException("Not yet implemented.");
    }

    /**
     * This method removes the {@link Truck} from the given 
     * <code>position</code>, indices start at 0.  Implicitly, the 
     * remaining elements' indices are reduced.
     * @param position
     */
    public void remove(int position) {
    	throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    /**
     * This is a private helper method that returns a {@link TruckListNode}
     * corresponding to the given position.  Implementing this method
     * is optional but may help you with other methods.
     * @param position
     * @return
     */
    private TruckListNode getTruckListNode(int position) {
    	throw new UnsupportedOperationException("Not yet implemented.");
    }

    /**
     * Returns the {@link Truck} element stored at the given 
     * <code>position</code>.
     * @param position
     * @return
     */
    public Truck getTruck(int position) {
    	throw new UnsupportedOperationException("Not yet implemented.");    	
    }
    
    /**
     * Returns the {@link Truck} element with specific <code>license</code>.
     * @param license
     * @return
     */
    public Truck getTruck(String license) {
    	throw new UnsupportedOperationException("Not yet implemented.");    
    }
    
    /**
     * Replace the {@link Truck} element at stored at the given 
     * <code>position</code> with a new {@link Truck} element.  
     * @param t
     * @param position
     */
    public void replace(Truck t, int position) {
    	throw new UnsupportedOperationException("Not yet implemented.");    
    }

    /**
     * Prints this list to the standard output.
     */
    public void print() {
    	throw new UnsupportedOperationException("Not yet implemented.");
    }

}

