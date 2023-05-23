import java.util.Objects;

public class Person {
    public String imie, nazwisko;
    public Person (String im, String na){
        this.imie = im;
        this.nazwisko = na;
    }
	@Override
	public int hashCode() {
		return Objects.hash(imie, nazwisko);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(imie, other.imie) && Objects.equals(nazwisko, other.nazwisko);
	}


    
    
    

}
