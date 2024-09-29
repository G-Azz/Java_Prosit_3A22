public class Produit {
    private int id=0;
    private String libelle,mark;
    private float prix;
    Produit(int id,String libelle,String mark,float prix)
    {
        this.id=id;
        this.libelle=libelle;
        this.mark=mark;
        this.prix=prix;
    }
   Produit()
    {
        this.id=0;
        this.libelle="";
        this.mark="";
        this.prix=0;
    }
    public void Afficher()
    {
        System.out.println("ID:" + id);
        System.out.println("Libelle:" + libelle);
        System.out.println("mark:" + mark);
        System.out.println("Prix:" + prix);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
        
    }

}
