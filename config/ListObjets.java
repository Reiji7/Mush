package config;

public enum ListObjets {

	MOLETTE(1),
	COMMBINAISON(2),
	GANTS(3),
	SAVON(4),
	TABLIER(5),
	TROTINETTE(6),
	EXTEINCTEUR(7),
	COUTEAU(8),
	BLASTER(9),
	GRENADE(10),
	MEDIKIT(11),
	CAMERA(12),
	SOUCHE(13),
	DEBRIS(14),
	CHAT(15),
	RATION(16),
	EXTRACTEUR(17),
	SERUM(18);
	
	
	private int id;
	
	private ListObjets(int id) {
		this.id = id;
	}
	
	
	public int getID() {
		return this.id;
	}
}
