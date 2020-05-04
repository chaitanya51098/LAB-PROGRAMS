package lab2;
public class JournalPaper extends WrittenItem 
{
    int yearOfPublish;
    public JournalPaper(){}
    public JournalPaper(int yearOfPublish)
    {
    	super();
    	this.yearOfPublish = yearOfPublish;
    }
    public void setYearOfPublish(int yearOfPublish)
    {
    	this.yearOfPublish = yearOfPublish;
    }
    public int getYearOfPublish()
    {
    	return yearOfPublish;
    }
    
}
