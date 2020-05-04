package lab2;
public class Book extends WrittenItem 
{
    int yearOfPublish;
    public Book(){}
    public Book(int yearOfPublish)
    {
    	super();
    	this.yearOfPublish = yearOfPublish;
    }
	public int getYearOfPublish() {
		return yearOfPublish;
	}
	public void setYearOfPublish(int yearOfPublish) {
		this.yearOfPublish = yearOfPublish;
	}
    
}
