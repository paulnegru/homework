package ObjectConstructor;

public class Airplane {

    /*
    Constructor = are ca rol sa initializeze variabilele unei clase
    Recunoastem un constructor dupa numele clasei
    Intr-o clasa putem avea n constructori care se diferentiaza dupa numarul sau tipul de parametrii
    Exista 2 tipuri de constructori: cu parametri sau fara parametri
    Intr-o clasa avem tot timpul un constructor defaul(fara parametri)
    Constructorul trebuie sa fie Public

    Obiect = instanta unei clase
    Dintr-o clasa putem sa facem mai multe obiecte
    Ca sa initializam un obiect ne folosim de cuvantul "new"
    Cand se initializeaza un obiect se apeleaza constructorul clasei
     */

    public String tip;
    public String marca;
    public String model;
    public Integer capacitatePasageri;
    public String tipCombustibil;
    public Integer nrBagaje;

    public Airplane(String tip, String marca, String model, Integer capacitatePasageri, String tipCombustibil) {
        this.tip = tip;
        this.marca = marca;
        this.model = model;
        this.capacitatePasageri = capacitatePasageri;
        this.tipCombustibil = tipCombustibil;
    }

    public Airplane(String tip, String marca, String model, Integer capacitatePasageri, String tipCombustibil, Integer nrBagaje) {
        this.tip = tip;
        this.marca = marca;
        this.model = model;
        this.capacitatePasageri = capacitatePasageri;
        this.tipCombustibil = tipCombustibil;
        this.nrBagaje = nrBagaje;
    }

    public void prezentAirplane(){
        System.out.println("Tipul avionului este: " + tip);
        System.out.println("Marca avionului este: " + marca);
        System.out.println("Modelul avionului este: " + model);
        System.out.println("Capacitate pasageri: " + capacitatePasageri);
        System.out.println("Tipul combustibilului avionului: " + tipCombustibil);
        if (nrBagaje!=null){
            System.out.println("Numar bagaje: " + nrBagaje);
        } else {
            System.out.println("Avionul nu are bagaje");
        }

    }

}
