package owo;

import java.util.ArrayList;

import org.springframework.stereotype.Component;


public class Redactor <ContentType>{
	public Doc<ContentType> Document;
	public ArrayList<Doc<ContentType>> Saves;
	Integer currentIndex = 0;
	
	Redactor(Doc<ContentType> Document)
	{
		this.Document=Document;
		Saves = new ArrayList<Doc<ContentType>>();
	}
	
	public void save() {
		if(Saves == null)
		{
			Saves = new ArrayList<Doc<ContentType>>();
		}
		Saves.add(Document.clone());
		currentIndex = Saves.size()-1;
	}
	public void undo() {
		if(currentIndex<1)
		{
			System.out.println("U can`t UNDO from the first saved state!");
		}
		else
		{
			currentIndex--;
			Document = Saves.get(currentIndex);
		}
	}
	public void redo() {
		if(currentIndex>Saves.size()-2)
		{
			System.out.println("U can`t REDO from the last saved state!");
		}
		else
		{
			currentIndex++;
			Document = Saves.get(currentIndex);
		}
	}
	void goState(int index)
	{
		if((index<Saves.size()-1)&&(index>=0))
		{
			currentIndex = index;
			Document = Saves.get(currentIndex);
		}
	}
	@Override
	public String toString() {
		return "version = "+currentIndex.toString()+"\n"+Document.toString()+"\n\n";
	}
}
