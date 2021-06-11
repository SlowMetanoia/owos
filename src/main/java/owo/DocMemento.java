package owo;

import java.util.ArrayList;

public class DocMemento<T> {
	
	DocMemento() {PrevStates = new ArrayList<Doc<T>>();}
	
	ArrayList<Doc<T>> PrevStates;
	void addSave(Doc<T> state) {
		PrevStates.add(state);
		}
	Integer getIndex(Doc<T> doc) {
		return PrevStates.indexOf(doc);
	}
	Doc<T> getByIndex(Integer index){
		return PrevStates.get(index);
	}
	Integer length() {
		return PrevStates.size();
	}
}
