package lab2;
public class WrittenItem extends Item 
{
    String author;
    public WrittenItem(){}
    public WrittenItem(String author)
    {
    	super();
    	this.author = author;
    }
    public void setAuthor(String author)
    {
    	this.author = author;
    }
    public String getAuthor()
    {
    	return author;
    }
    
}
