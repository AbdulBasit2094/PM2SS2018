import java.util.ArrayList;
import java.util.List;

/**
 * Ein Medienbestand enthält alle zur Verfügung stehenden Medien. Diese können
 * in den Bestand eingepflegt, gelöscht und verändert werden. Zu einem
 * bestimmten Titel kann es mehrere Medien-Objekte im Bestand geben. So kann
 * z.B. die gleiche CD mehrfach vorhanden sein.
 * 
 * @author SE2-Team, PM2-Team
 * @version SoSe 2018
 */
class MedienbestandServiceImpl extends AbstractObservableService
        implements MedienbestandService
{

    /**
     * Eine Liste aller Medien
     */
    private List<Medium> _medienbestand;

    /**
     * Initialisiert einen neuen Medienbestand.
     * 
     * @param medien Der initiale Medienbestand.
     */
    public MedienbestandServiceImpl(List<Medium> medien)
    {
        _medienbestand = new ArrayList<Medium>(medien);
    }

    

    /**
     * Entfernt ein Medium aus dem Medienbestand, z.B. wenn es verloren gegangen
     * ist oder so veraltet, dass es von den Mediathek-Kunden nicht mehr
     * nachgefragt wird.
     * 
     * @require enthaeltMedium(medium)
     * @require medium != null
     * 
     * @ensure !enthaletMedium(medium)
     * 
     * @param medium Ein zu entfernendes Medium
     */
    @Override
    public void entferneMedium(Medium medium)
    {
    	assert medium != null: "Vorbedingung verletzt: medium != null";
    	assert enthaeltMedium(medium) : "Vorbedingung verletzt enthaeltMedium(medium)";
    	
        _medienbestand.remove(medium);

        informiereUeberAenderung();
    
       //  assert !enthaeltMedium(medium):"Nachbedingung verletzt: !enthaeltMedium(medium)";
    }

    /**
     * Gibt Auskunft, ob ein Medium im Medienbestand enthalten ist.
     * 
     * @param medium Ein Medium
     * 
     * @require medium != null;
     * 
     * @return true, wenn Medium im Medienbestand enthalten ist, andernfalls
     *         false.
     */
    @Override
    public boolean enthaeltMedium(Medium medium)
    {
    	assert medium != null; 
    	
    	
        return _medienbestand.contains(medium);
    }

    /**
     * Fügt ein weiteres, neu angeschafftes Medium in den Bestand ein. Ist ein
     * Medium mehrfach angeschafft worden, so kann es auch mehrfach eingepflegt
     * werden. Jedes Exemplar im Bestand repräsentiert ein real existierendes
     * Medium.
     * 
     * @require neuesMedium != null
     * 
     * 
     * @ensure enthaeltMedium(medium)
     * 
     * 
     * @param neuesMedium Ein neues Medium
     */
    @Override
    public void fuegeMediumEin(Medium neuesMedium)
    {
    	assert neuesMedium != null: "Vorbedingung verletzt: medium!= null";
        _medienbestand.add(neuesMedium);

        informiereUeberAenderung();
    }

    /**
     * Liefert alle vorhandenen Medien.
     * 
     * 
     * 
     * 
     * @return Eine Kopie der Liste mit allen vorhandenen Medien.
     */
    @Override
    public List<Medium> getMedien()
    {
        return new ArrayList<Medium>(_medienbestand);
    }
    /**
     * Informiert diesen Service darüber, dass Medien von einem Werkzeug
     * geändert wurden. Eine Implementation wird daraufhin wahrscheinlich alle
     * ServiceBeobachter darüber informieren.
     * 
     */
    @Override
    public void medienWurdenGeaendert()
    {
        informiereUeberAenderung();
    }

}
