public class Libro <T>{

    private T isbn;
    private String titolo;


    public Libro (String titolo, T isbn){
        this.titolo=titolo;
        this.isbn=isbn;}



    public void setTitolo (){
        this.titolo= titolo;}

    public String getTitolo() {
        return titolo;
    }

    public void setIsbn() {
        this.isbn = isbn;
    }

    public T getIsbn() {
        return isbn;
    }

    }



