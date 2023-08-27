/**
 * The Item class represents a generic item that can hold a value of any type.
 * @param <T> The type of value held by the item.
 */
public class Item<T>{
	//private variable e of type T
private T e;
	
/**
     * @return The value held by the item.
     */
public T getE() {
	return e;
}//end getE
	/**
     * @param e The value to be set for the item.
     */
public void setE(T e) {
	this.e = e;
}//end setE

}//end Item
