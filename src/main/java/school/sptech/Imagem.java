package school.sptech;


import java.util.ArrayList;
import java.util.List;

public class Imagem {

    private List<Figura> figuras = new ArrayList<>();



    public void adicionar(Figura figura){
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas(){
         Double soma = 0.0;
        for (Figura figura : figuras) {
            soma += figura.calcularArea();
        }
        return soma;
    }

    public List<Figura> buscarPorAreaMaiorQue20(){
        List listaMaiorQue20 = new ArrayList<>();
        for (Figura figura : figuras) {
            if (figura.calcularArea() > 20){
                listaMaiorQue20.add(figura);
            }
        }
        return listaMaiorQue20;
    }
    public List<Figura> buscarQuadrados(){

        List<Figura> quadradosEncontrados = new ArrayList<>();

        for (Figura figura : figuras) {
            if (figura instanceof Quadrado){
                quadradosEncontrados.add(figura);
            }
        }
        return quadradosEncontrados;

    }

}
