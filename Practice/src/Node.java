public interface Node<K,V> {
	public Object getKey();
	public Object getValue();
	public void setKey(K key);
	public void setValue(V value);
}
