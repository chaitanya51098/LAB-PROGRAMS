package lab2;
public class Item 
{
    int id;
    String title;
    int noOfCopies;
    public Item(){}
    public Item(int id, String title, int noOfCopies) {
		super();
		this.id = id;
		this.title = title;
		this.noOfCopies = noOfCopies;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNoOfCopies() {
		return noOfCopies;
	}
	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
    public void getInfo(int a)
    {
    	System.out.println("Enter Your ID");   	
    }
}


