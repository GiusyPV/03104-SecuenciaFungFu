/* 
 * Copyright 2019 Josefina Pugliese Vazquez - josefinapwork@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;

/**
 *
 * @author Josefina Pugliese Vazquez
 */
public class Main {

    public static void main(String[] args) {
        //Constantes
        final double DIN_INI = 2.0;
        final double PRE_PELI = 1.3;
        final double PRE_PALO = 0.45;
        
        
        //Cabecera
        System.out.println("Secuencia de Kung-Fu");
        System.out.println("====================");
        
        //Cuerpo
        System.out.printf(Locale.ENGLISH, "Dinero inicial .....: %.2f €%n", DIN_INI);
        
        //Separador
        System.out.println("---");
        
        //Precios
        System.out.printf(Locale.ENGLISH, "Precio película ....: %.2f €%n", PRE_PELI);
        System.out.printf(Locale.ENGLISH, "Parte palomitas ....: %.2f €%n", PRE_PALO);
        
        //Separador
        System.out.println("---");
        
        //Suma Gastos
        double gasTotales = PRE_PELI + PRE_PALO;
        System.out.printf(Locale.ENGLISH, "Gastos por persona .: %.2f €%n", gasTotales);
        
        //Separador
        System.out.println("---");
        
        //Dinero restante
        double dinRest = DIN_INI - gasTotales;
        System.out.printf(Locale.ENGLISH, "Dinero restante ....: %.2f €%n", dinRest);
        
    }
}
