package co.edu.cesde;

import lombok.Data;

@Data

public class Monitor extends Product {
    private double screenSize;
    private double resolution;

    public void getOperation(){
        System.out.println(Calculadora.operacion);
    }
}
