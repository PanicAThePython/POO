public class NameGenerator {
	private static String nomeJedi;
	private static String sbnmJedi;
	
	public static String generateStarWarsName(String[] entrada) {
		String[] nome = entrada[0].split(" ");
		int ultima = nome.length - 1;
		nomeJedi = nome[ultima].substring(0, 3);
		nomeJedi += nome[0].substring(0, 2).toLowerCase();
		sbnmJedi = entrada[1].substring(0, 2);
		sbnmJedi += entrada[2].substring(0, 3).toLowerCase();
		return nomeJedi + " "+ sbnmJedi;
	}
}
