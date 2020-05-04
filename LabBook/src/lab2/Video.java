package lab2;
public class Video extends MediaItem 
{
    String director;
    String genre;
    int yearOfRelease;
    public Video(){}
	public Video(String director, String genre, int yearOfRelease) {
		super();
		this.director = director;
		this.genre = genre;
		this.yearOfRelease = yearOfRelease;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYearOfRelease() {
		return yearOfRelease;
	}
	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}
    
}
