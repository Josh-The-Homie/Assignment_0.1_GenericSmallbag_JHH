/**
 * @param <T> The type of items that the bag can hold.
 */
public class SmallBag<T>{
private T item;
/**
     * @return The item held by the bag.
     */
public T getItem() {
	return item;
}//end getItem
  /**
     * @param item The item to be placed in the bag.
     */
public void setItem(T item) {
	this.item = item;
}//end SetItem

}//end SmallBag
