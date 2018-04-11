import static org.junit.Assert.*;

import org.junit.Test;

public class VideospielTest {
	 	private static final String KOMMENTAR = "Kommentar";
	    private static final String TITEL = "Titel";
	    private static final String KONSOLE = "PS4";
	    private Videospiel _spiel1;
	    	

	    
	public VideospielTest()
	{
		_spiel1 = getMedium();
	}
	    
	@Test
	public void VideospielKonstruktorTest()
	{
		
		assertEquals(_spiel1.getTitel(), "Titel");
		assertEquals(_spiel1.getKommentar(), "Kommentar");
		assertEquals(_spiel1.getSystem(),"PS4");
	}
	@Test
	public void testGetTitel()
	{
		assertEquals(_spiel1.getTitel() , "Titel");
	}
	
	@Test
	public void testGetKommentar()
	{
		assertEquals(_spiel1.getKommentar() , "Kommentar");
	}
	
	
	
	
	@Test 
	public void testGetMedienbezeichnung()
	{
		assertEquals(_spiel1.getMedienBezeichnung(),"Videospiel");
		
	}
	
	@Test
	public void testGetKonsole()
	{
		assertEquals(_spiel1.getSystem(), "PS4");
	}
	
	
	private Videospiel getMedium()
	{
		return new Videospiel(TITEL, KOMMENTAR,KONSOLE);
		
	}
}
