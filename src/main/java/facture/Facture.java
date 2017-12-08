package facture;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Facture {
    
    private Client destinataire;
    private Date emission;
    private int numero;
    
    List<LigneFacture> CatalogueFacture = new ArrayList<>();
    
    public Facture(Client destinataire, Date emission, int numero) {
        this.destinataire=destinataire;
        this.emission=emission;
        this.numero=numero;
    }

    /**
     * Get the value of numero
     *
     * @return the value of numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Get the value of emission
     *
     * @return the value of emission
     */
    public Date getEmission() {
        return emission;
    }

    /**
     * Get the value of destinataire
     *
     * @return the value of destinataire
     */
    public Client getDestinataire() {
        return destinataire;
    }

    
    public void ajouteLigne(Article a, int nombre, float remise ) {
        LigneFacture l = new LigneFacture (nombre, this, a, remise);
        CatalogueFacture.add(l);
   }
    
   public float montantTTC(float tauxTVA) {
        float total=0;
        for (int i=0; i<CatalogueFacture.size(); i++){
            total+= CatalogueFacture.get(i).montantLigne()*(1+tauxTVA);
        }
        return total;
   }
   
   public void print(PrintStream out, float tva) {
        CatalogueFacture.toString();
   }
   
}
