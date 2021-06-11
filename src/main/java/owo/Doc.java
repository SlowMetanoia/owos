package owo;

public class Doc<ContentType> implements Cloneable{
	protected String name;
	protected String format;
	ContentType content;

	
	public Doc(String name,String format,ContentType content) {
		this.name = name;
		this.format = format;
		this.content = content;
	}
	public Doc(Doc<ContentType> doc)
	{
		this.content = doc.content;
		this.name = doc.name;
		this.format = doc.format;
	}
	void setContent(ContentType content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "\n\n"+name+"."+format+"\n"+content.toString();
	}
	@Override
	protected Doc<ContentType> clone()
	{
		return new Doc(this);
	}
}


