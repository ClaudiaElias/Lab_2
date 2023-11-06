package laboratorio_2;

import javax.swing.JOptionPane;

/**
 *
 * @author clau
 */
public class Metodos_Lab2 {

    public boolean validarNumEntero(String cadena) {    //validar que la cadena sea un número entero
        int tam = cadena.length();
        boolean entero = true;
        int i = 0;
        while (i < tam && entero == true) {
            String caracter = cadena.substring(i, i + 1);
            if (caracter.equals("0") || caracter.equals("1") || caracter.equals("2") || caracter.equals("3") || caracter.equals("4") || caracter.equals("5") || caracter.equals("6") || caracter.equals("7") || caracter.equals("8") || caracter.equals("9")) {
                i++;
            } else {
                entero = false;
            }
        }
        return entero;
    }

    public boolean repetido(String cad, int numestudiantes, String M[][]) { //valida que el código no esté registrado 
        int i = 0, j = 0;
        while (i < numestudiantes) {
            if (cad.equals(M[i][j])) {
                return true;
            } else {
                i++;
            }
        }
        return false;
    }

    public boolean validarCodigoEst(String cadena, int numestudiantes, String M[][]) {  //valida que el código del estudiante no tenga más de 8 dígitos y sea un número entero
        if (cadena.length() != 8) {
            JOptionPane.showMessageDialog(null, "El código debe tener 8 dígitos.");
            return false;
        }
        if (validarNumEntero(cadena) == false) {
            JOptionPane.showMessageDialog(null, "El código debe ser un número entero.");
            return false;
        }
        if (repetido(cadena, numestudiantes, M)) {
            JOptionPane.showMessageDialog(null, "El código ya está registrado. \nIngrese datos de un nuevo estudiante.");
            return false;
        }
        return true;
    }

    public boolean camposVacios(String cadena) {
        if (cadena.equals("")) {
            return true;
        }
        return false;
    }

    public boolean validarSemestre(String cadena) {
        if (validarNumEntero(cadena)) {
            int semestre = Integer.parseInt(cadena);
            if (semestre < 1 || semestre > 12) {
                JOptionPane.showMessageDialog(null, "El semestre cursado debe estar entre 1 y 12.");
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "El semestre cursado debe ser un número entero entre 1 y 12.");
            return false;
        }
        return true;
    }

    public double calcularNotaDefinitiva(String nota1, String nota2, String nota3, String nota4, String nota5) {
        double n1 = Double.parseDouble(nota1);
        double n2 = Double.parseDouble(nota2);
        double n3 = Double.parseDouble(nota3);
        double n4 = Double.parseDouble(nota4);
        double n5 = Double.parseDouble(nota5);
        double notadef = (n1 + n2 + n3 + n4 + n5) * 0.2;
        return notadef;
    }

    public boolean validarCantPuntos(String cadena, int longitudcad) {
        int i = 0, puntos = 0;
        while (i < longitudcad && puntos <= 1) {
            String aux = cadena.substring(i, i + 1);
            if (aux.equals(".")) {
                puntos++;
            }
            i++;
        }
        if (puntos > 1 || puntos == 0) {
            return false;
        }
        return true;
    }

    public boolean validarNotas(String cadena) { //verifica que las notas estén escritas correctamente
        int tam = cadena.length();
        if (tam < 3 || tam > 4) {
            JOptionPane.showMessageDialog(null, "Las notas deben ser entre 0.0 y 5.0");
            return false;
        }
        if (validarCantPuntos(cadena, tam) == false) {
            JOptionPane.showMessageDialog(null, "Las notas deben ser entre 0.0 y 5.\n Ingrese valores válidos");
            return false;
        }
        String pentera = cadena.substring(0, 1), decimales;
        decimales = cadena.substring(2);
        if (validarNumEntero(pentera) && validarNumEntero(decimales)) {
            if (Integer.parseInt(pentera) > 5 || (Integer.parseInt(pentera) == 5 && Integer.parseInt(decimales) != 0)) {
                JOptionPane.showMessageDialog(null, "Las notas deben ser entre 0.0 y 5.\n Ingrese valores válidos");
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Las notas deben ser entre 0.0 y 5.\n Ingrese valores válidos");
            return false;
        }
        return true;
    }

    public int compararCaracteres(String cadena1, String cadena2) {
        String aux1 = cadena1.toUpperCase();
        String aux2 = cadena2.toUpperCase();
        int comparahasta;
        int tam1 = aux1.length();
        int tam2 = aux2.length();
        if (tam1 > tam2) {
            comparahasta = tam2;
        } else {
            comparahasta = tam1;
        }
        int i = 0;
        while (i < comparahasta) {
            char caracter1 = aux1.charAt(i);
            char caracter2 = aux2.charAt(i);
            int num1 = (int) caracter1;
            int num2 = (int) caracter2;
            if (num1 < num2) {
                return 1;
            }
            if (num2 < num1) {
                return 2;
            }
            i++;
            if (i == comparahasta) {
                if (tam1 < tam2) {
                    return 1;
                } else {
                    return 2;
                }
            }
        }
        return 2;
    }

    public void ordenAlfabetico(String M[][], int n, int m) {
        String aux;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (compararCaracteres(M[j][1], M[j + 1][1]) == 2) {
                    for (int l = 0; l < m; l++) {
                        aux = M[j][l];
                        M[j][l] = M[j + 1][l];
                        M[j + 1][l] = aux;
                    }
                }
            }
        }
    }

    public void estPorSemConNotaMay(String mEstudiantes[][], int estudiantes, String nota) {
        String resultado = "";
        double notaev = Double.parseDouble(nota);
        for (int i = 0; i < estudiantes; i++) {
            int j = 9;
            double notaDef = Double.parseDouble(mEstudiantes[i][j]);
            int semestre = Integer.parseInt(mEstudiantes[i][3]);
            if (notaDef > notaev) {
                resultado += "\n \nSEMESTRE " + semestre + ": \n " + mEstudiantes[i][0] + " " + mEstudiantes[i][1] + " " + mEstudiantes[i][2] + " ";
            }
        }
        JOptionPane.showMessageDialog(null, resultado, "ESTUDIANTES CON NOTAS SUPERIORES A 4.0 POR SEMESTRE", JOptionPane.INFORMATION_MESSAGE);

    }

    public double promedio(String mEstudiantes[][], int estudiantes, int fila, int semestreev) {
        int cont = 0, k = semestreev;
        double nota = 0;
        double prom = 0;
        for (int i = 0; i < estudiantes; i++) {
            int j = fila;
            int semestre = Integer.parseInt(mEstudiantes[i][3]);
            if (k == semestre) {
                nota = Double.parseDouble(mEstudiantes[i][j]);
                cont++;
                prom = prom + nota;
            }
        }
        if (cont != 0) {
            prom = prom / cont;
        }
        return prom;
    }
    public void notasSupPromSemestre (String mEstudiantes[][],int estudiantes, String nota){
        String resultado = "";
        double notaev = Double.parseDouble(nota);
        for (int i = 0; i < estudiantes; i++) {
            int j = 9;
            double notaDef = Double.parseDouble(mEstudiantes[i][j]);
            int semestre = Integer.parseInt(mEstudiantes[i][3]);
            if (notaDef > notaev) {
                resultado += "\n \nSEMESTRE " + semestre + ": \n " + mEstudiantes[i][0] + " " + mEstudiantes[i][1] + " " + mEstudiantes[i][2] + " ";
            }
        }
        JOptionPane.showMessageDialog(null, resultado, "ESTUDIANTES CON NOTAS SUPERIORES A 4.0 POR SEMESTRE", JOptionPane.INFORMATION_MESSAGE);

    }
}
