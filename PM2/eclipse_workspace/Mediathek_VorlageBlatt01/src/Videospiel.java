
public class Videospiel implements Medium {

	private String _titel;
	private String _kommentar;
	private String _system;
	public Videospiel(String titel, String kommentar,String system)
	{
		_titel = titel;
		_kommentar = kommentar;
		_system = system;
	}
	
	@Override
	public String getKommentar() {
		
		return _kommentar;
	}

	@Override
	public String getMedienBezeichnung() {
		// TODO Auto-generated method stub
		return "Videospiel";
	}

	@Override
	public String getTitel() {
		// TODO Auto-generated method stub
		return _titel;
	}

	public String getSystem()
	{
		return _system;
	}

	@Override
	public String getFormartiertenString() {
		String result = "Titel: " + _titel + "\nSystem:" + _system + "\n" + _kommentar; 
		return result;
	}
}
