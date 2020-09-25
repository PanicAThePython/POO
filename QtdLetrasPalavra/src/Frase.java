public class Frase {

	private String texto;
	
	public Frase(String texto) {
		
		this.setTexto(texto);
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public String[] dividirFrase() {
		String[] partes = new String[this.texto.length()];
		int index = 0;
		String palavra = "";
		//partes = this.texto.split("");
        for(int i = 0; i < this.texto.length(); i++) {
        	if(this.texto.charAt(i)== ' ') {
        		partes[index] = palavra;
        		index++;
        		palavra = "";
        	}else {
        		palavra += this.texto.charAt(i);
        	}
        	
        }
        return partes;
	}
}
