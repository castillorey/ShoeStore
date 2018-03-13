package com.kevinmcr.shoestore;

/**
 * Created by android on 12/03/2018.
 */

public class Metodos {

    public static int calcular(int cantidad,boolean esHombre, int tipoZapato, int tipoMarca){
        int resultado = 0;

        if(esHombre){
            resultado = cantidad * (hombre(tipoZapato,tipoMarca));
        }else{
            resultado = cantidad * (mujer(tipoZapato,tipoMarca));
        }
        return resultado;
    }

    public static int mujer(int tipoZapato, int tipoMarca){
        int resultado = 0;
        switch(tipoZapato){
            case 0: //Zapatilla

                switch (tipoMarca){
                    case 0:
                        resultado = 100000;
                        break;
                    case 1:
                        resultado = 130000;
                        break;
                    case 2:
                        resultado = 110000;
                        break;
                }

                break;

            case 1: //Clasico

                switch (tipoMarca){
                    case 0:
                        resultado = 60000;
                        break;
                    case 1:
                        resultado = 70000;
                        break;
                    case 2:
                        resultado = 120000;
                        break;
                }

                break;
        }

        return resultado;
    }

    public static int hombre (int tipoZapato, int tipoMarca){
        int resultado = 0;
        switch(tipoZapato){
            case 0: //Zapatilla

                switch (tipoMarca){
                    case 0:
                        resultado = 120000;
                        break;
                    case 1:
                        resultado = 140000;
                        break;
                    case 2:
                        resultado = 130000;
                        break;
                }

                break;

            case 1: //Clasico

                switch (tipoMarca){
                    case 0:
                        resultado = 50000;
                        break;
                    case 1:
                        resultado = 80000;
                        break;
                    case 2:
                        resultado = 100000;
                        break;
                }

                break;
        }
        return resultado;
    }
}
