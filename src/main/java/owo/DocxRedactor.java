package owo;

import java.util.ArrayList;

public class DocxRedactor extends Redactor<ArrayList<String>> {
	public DocxRedactor(Doc<ArrayList<String>> Document)
	{
		super(Document);
	}
	public void addString(String str)
	{
		Document.content.add(str);
	}
	@Override
	public String toString() {
		String contentStr = "";
		for(String str:Document.content){
			contentStr = contentStr+"\n"+str;
		}
		return  "version = "+currentIndex.toString()+"\n"+Document.name+
				"."+ Document.format+ "\n" + contentStr+"\n\n";
		
	}
}
