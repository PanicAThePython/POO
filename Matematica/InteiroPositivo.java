
/**
 * @author (Natália Sens Weise) 
 */
public class InteiroPositivo
{
    private int x;

    public InteiroPositivo()
    {
        x = 0;
    }

    public void setValor(int valor){
        if (valor >=0){
            x = valor;
        }
    }
    
    public int getValor(){
        return x;
    }
    
    public int multiplicar(InteiroPositivo outro){
        return (x*outro.getValor());
    }
    
    public long fatorial(){
        long resultado = this.getValor();
        
        for (int i = this.getValor()-1; i > 0; i--){
            resultado*=i;
        }
        return resultado;
    }
    
    public long fatorial(int valor){
        long resultado = valor;
        for (int i = valor-1; i > 0; i--){
            resultado*=i;
        }
        return resultado;
    }
    
    public String divisoresInteiros(){
        String texto = "Os divisores inteiros são ";
        int contador = 0;
        for (int i = this.getValor(); i > 0; i--){
            if (this.getValor()% i == 0){
                texto+=i+" ";
                contador++;
            }
        }
        
        return texto+"e a quantidade de divisores é "+contador;
    }
    public String fibonacci(){
        int[] valores = new int[this.getValor()];
        if (this.getValor()>2){
            valores[0] = 1;
            valores[1] = 1;
            String respostas = valores[0]+" "+valores[1]+" ";
            for (int i = 2; i < this.getValor(); i++){
                valores[i] = valores[i-1]+valores[i-2];
                respostas+= valores[i]+" ";
            }
            return respostas;
        }
        else if (this.getValor()==0){
            return "Impossível calcular Fibonacci com valor zero";
        }
        else if (this.getValor()==1 || this.getValor()==2){
            return "1";
        }
        return "";
    }
    
    public double valorH(){
        double h = 0;
        for (double i = 1; i <= this.getValor(); i++){
            h+= (1/i);
        }
        return h;
    } 
    
    public double valorI(){
        double i = 0;
        int count = this.getValor();
        for (double num = 1; num <= this.getValor(); num++){
            i+= (num/count);
            count-=1;
        }
        return i;
    }
    
    public double valorP(){
        double p = 0;
        for (int i = 1; i<= this.getValor(); i++){
            if (i%2==0){
                double fat = Double.valueOf(fatorial(i+i));
                p-= (i/fat);
            }
            else{
                double fat = Double.valueOf(fatorial(i+i));
                p+= (i/fat);
            }
        }
        return p;
    }
}
