/* 
 * Copyright 2019 Mario Merlos Abella - mario.merlos.alum@iescamp.es.
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
import java.util.Scanner;

/**
 *
 * @author Mario Merlos Abella - mario.merlos.alum@iescamp.es
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        //Variables
        int consolCP;
        int cp1 = 0;
        int cp2 = 0;
        int cp3 = 0;
        int cpTotal;

        double porcentaje1;
        double porcentaje2;
        double porcentaje3;

        System.out.println("CP clientes");
        System.out.println("=================");
        do {
            System.out.print("Inserte el código postal..:");
            consolCP = SCN.nextInt();
            switch (consolCP) {
                case 46520:
                    cp1++;
                    break;
                case 46521:
                    cp2++;
                    break;
                case 46522:
                    cp3++;
                    break;

            }

        } while (consolCP != 0);
        cpTotal = cp1 + cp2 + cp3;
        porcentaje1 = (double) cp1 / (double) cpTotal * 100;
        porcentaje2 = (double) cp2 / (double) cpTotal * 100;
        porcentaje3 = (double) cp3 / (double) cpTotal * 100;
        System.out.printf(Locale.ENGLISH, "Cliente con CP %d ..: %.2f%%%n", cp1, porcentaje1);
        System.out.printf(Locale.ENGLISH, "Cliente con CP %d ..: %.2f%%%n", cp2, porcentaje2);
        System.out.printf(Locale.ENGLISH, "Cliente con CP %d ..: %.2f%%%n", cp3, porcentaje3);
    }
}
