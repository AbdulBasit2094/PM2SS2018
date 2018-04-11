

import java.util.List;

import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

/**
 * Ein MedienDetailAnzeigerWerkzeug ist ein Werkzeug um die Details von Medien
 * anzuzeigen.
 * 
 * @author SE2-Team, PM2-Team
 * @version SoSe 2018
 */
class MedienDetailAnzeigerWerkzeug
{
    private MedienDetailAnzeigerUI _ui;

    /**
     * Initialisiert ein neues MedienDetailAnzeigerWerkzeug.
     */
    public MedienDetailAnzeigerWerkzeug()
    {
        _ui = new MedienDetailAnzeigerUI();
    }

    /**
     * Setzt die Liste der Medien deren Details angezeigt werden sollen.
     * 
     * @param medien Eine Liste von Medien.
     * 
     * @require (medien != null)
     */
    public void setMedien(List<Medium> medien)
    {
        assert medien != null : "Vorbedingung verletzt: (medien != null)";
        TextArea selectedMedienTextArea = _ui.getMedienAnzeigerTextArea();
       
        
//        String s = "";
        
//        for(Medium m : medien)
//        {
//        	if(m instanceof CD)
//        	{
//        		CD c = (CD)m;
//        		s = s +c.getTitel() +"\n"+ c.getInterpret() +"\n"+ c.getSpiellaenge() +"\n"+ c.getSpiellaenge();
//        	}
//        	else if( m instanceof DVD)
//        	{
//        		DVD d = (DVD)m;
//        		s = s + d.getTitel() + "\n" + d.getLaufzeit()+"\n" + d.getKommentar() +"\n"+ d.getRegisseur();
//     	}
//        	else if(m instanceof Videospiel)
//        	{
//        		Videospiel v = (Videospiel)m;
//        		s = s + v.getTitel()+"\n" + v.getKommentar();
//        	}
//        	
//        }
//        
//        selectedMedienTextArea.setText(s);
        for(Medium m : medien)
        {
        selectedMedienTextArea.setText(m.getFormartiertenString());
        }
    }

    /**
     * Gibt das Panel dieses Subwerkzeugs zurück.
     * 
     * @ensure result != null
     */
    public Pane getUIPane()
    {
        return _ui.getUIPane();
    }
}
