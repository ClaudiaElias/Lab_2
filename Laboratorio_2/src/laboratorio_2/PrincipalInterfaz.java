package laboratorio_2;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author clau
 */
public class PrincipalInterfaz extends javax.swing.JFrame {

    String Mestudiantes[][] = new String[100][10];
    String DefSup4[][] = new String[100][100];
    Metodos_Lab2 Metodos = new Metodos_Lab2();

    int estudiantesregis = 0;

    public PrincipalInterfaz() {
        initComponents();
        llenarMatriz();
    }

    public void llenarMatriz() {
        String columnasTabla[] = {"Código", "Primer apellido", "Primer nombre", "semestre", "Nota 1", "Nota 2", "Nota 3", "Nota 4", "Nota 5", "Nota definitiva"};
        String tablaM[][] = new String[estudiantesregis][columnasTabla.length];
        for (int i = 0; i < estudiantesregis; i++) {
            for (int j = 0; j < columnasTabla.length; j++) {
                tablaM[i][j] = Mestudiantes[i][j];
            }
        }
        DefaultTableModel table = new DefaultTableModel(tablaM, columnasTabla);
        tabla.setModel(table);
    }

    public void superioresaNota(String nota) {
        String Mcodigos[][] = new String[100][100];
        double aux1, aux2 = Double.parseDouble(nota);
        for (int k = 1; k <= 12; k++) {
            int j = 4;
            for (int i = 0; i < estudiantesregis; i++) {
                aux1 = Double.parseDouble(Mestudiantes[i][j]);

            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Textonombre = new javax.swing.JTextField();
        Textcod = new javax.swing.JTextField();
        Textoapellido = new javax.swing.JTextField();
        Texton1 = new javax.swing.JTextField();
        Texton2 = new javax.swing.JTextField();
        Texton3 = new javax.swing.JTextField();
        Texton4 = new javax.swing.JTextField();
        Texton5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        Textosemestre = new javax.swing.JTextField();
        labelcod = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Btnregistrar = new javax.swing.JButton();
        btnordenar = new javax.swing.JButton();
        Btndefsup4 = new javax.swing.JButton();
        Btnsuppromsemestre = new javax.swing.JButton();
        Btnnotasinfglobal = new javax.swing.JButton();

        jTextField4.setForeground(new java.awt.Color(204, 204, 204));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField4.setText("Ingrese el primer apellido del estudiante");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setForeground(new java.awt.Color(255, 51, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel1.setText("UNIVERSIDAD DEL NORTE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(236, 236, 236))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Registro de notas para estudiantes de ciencias de la salud");

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        jLabel3.setText("Primer nombre");

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        jLabel4.setText("Código");

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        jLabel5.setText("Primer apellido");

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        jLabel6.setText("Nota No. 1");

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        jLabel7.setText("Nota No. 2");

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        jLabel8.setText("Nota No. 3");

        jLabel9.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        jLabel9.setText("Nota No. 4");

        jLabel10.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        jLabel10.setText("Nota No. 5");

        Textonombre.setForeground(new java.awt.Color(204, 204, 204));
        Textonombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        Textcod.setForeground(new java.awt.Color(204, 204, 204));
        Textcod.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Textcod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextcodKeyReleased(evt);
            }
        });

        Textoapellido.setForeground(new java.awt.Color(204, 204, 204));
        Textoapellido.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        Texton1.setForeground(new java.awt.Color(204, 204, 204));
        Texton1.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        Texton2.setForeground(new java.awt.Color(204, 204, 204));
        Texton2.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        Texton3.setForeground(new java.awt.Color(204, 204, 204));
        Texton3.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        Texton4.setForeground(new java.awt.Color(204, 204, 204));
        Texton4.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        Texton5.setForeground(new java.awt.Color(204, 204, 204));
        Texton5.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        tabla.setBackground(new java.awt.Color(204, 204, 255));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        Textosemestre.setForeground(new java.awt.Color(204, 204, 204));
        Textosemestre.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        labelcod.setForeground(new java.awt.Color(204, 204, 204));
        labelcod.setText("Ingrese codigo");

        jLabel11.setFont(new java.awt.Font("Tempus Sans ITC", 0, 12)); // NOI18N
        jLabel11.setText("Semestre");

        Btnregistrar.setBackground(new java.awt.Color(204, 204, 255));
        Btnregistrar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Btnregistrar.setText("REGISTRAR");
        Btnregistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnregistrarMouseClicked(evt);
            }
        });
        Btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnregistrarActionPerformed(evt);
            }
        });

        btnordenar.setBackground(new java.awt.Color(204, 204, 255));
        btnordenar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnordenar.setText("ORDENAR");
        btnordenar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnordenarMousePressed(evt);
            }
        });
        btnordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnordenarActionPerformed(evt);
            }
        });

        Btndefsup4.setBackground(new java.awt.Color(204, 204, 255));
        Btndefsup4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Btndefsup4.setText("DEFINITIVAS SUPERIOR A 4.0");
        Btndefsup4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btndefsup4ActionPerformed(evt);
            }
        });

        Btnsuppromsemestre.setBackground(new java.awt.Color(204, 204, 255));
        Btnsuppromsemestre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Btnsuppromsemestre.setText("NOTAS SUPERIOR PROMEDIO SEMESTRAL");
        Btnsuppromsemestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnsuppromsemestreActionPerformed(evt);
            }
        });

        Btnnotasinfglobal.setBackground(new java.awt.Color(204, 204, 255));
        Btnnotasinfglobal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Btnnotasinfglobal.setText("NOTAS INFERIORES A GLOBAL");
        Btnnotasinfglobal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnnotasinfglobalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(286, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(171, 171, 171))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Texton1, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                            .addComponent(Textosemestre)
                            .addComponent(Textonombre)
                            .addComponent(Textoapellido)
                            .addComponent(Texton2)
                            .addComponent(Texton3)
                            .addComponent(Texton4)
                            .addComponent(Texton5)
                            .addComponent(Textcod)))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Btnregistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnordenar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btndefsup4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btnsuppromsemestre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Btnnotasinfglobal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(labelcod, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelcod)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(Btnregistrar))
                    .addComponent(Textcod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(Textonombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Textoapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(Textosemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnordenar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btndefsup4)))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(Texton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(Texton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(Texton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Texton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(Texton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Btnsuppromsemestre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btnnotasinfglobal)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void TextcodKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextcodKeyReleased
        if (Textcod.getText().length() == 0) {
            labelcod.setText("Ingrese el codigo");
            labelcod.setVisible(true);

        } else {
            labelcod.setVisible(false);
            Textcod.setForeground(Color.black);
        }
    }//GEN-LAST:event_TextcodKeyReleased

    private void BtnregistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnregistrarMouseClicked
        /**
         * String codigo = Textcod.getText(); String nombre =
         * Textonombre.getText(); String apellido = Textoapellido.getText();
         * String semestrec = Textosemestre.getText(); String n1 =
         * Texton1.getText(); String n2 = Texton2.getText(); String n3 =
         * Texton3.getText(); String n4 = Texton4.getText(); String n5 =
         * Texton5.getText(); System.out.println("asignó variables"); double
         * ndef = Metodos.calcularNotaDefinitiva(n1, n2, n3, n4, n5);
         *
         * if (Metodos.validarCodigoEst(codigo, estudiantesregis, Mestudiantes)
         * && Metodos.validarSemestre(semestrec) && Metodos.validarNotas(n1) &&
         * Metodos.validarNotas(n2) && Metodos.validarNotas(n3) &&
         * Metodos.validarNotas(n4) && Metodos.validarNotas(n5)) {
         * Mestudiantes[estudiantesregis][0] = codigo;
         * Mestudiantes[estudiantesregis][1] = nombre;
         * Mestudiantes[estudiantesregis][2] = apellido;
         * Mestudiantes[estudiantesregis][3] = semestrec;
         * Mestudiantes[estudiantesregis][4] = n1;
         * Mestudiantes[estudiantesregis][5] = n2;
         * Mestudiantes[estudiantesregis][6] = n3;
         * Mestudiantes[estudiantesregis][7] = n4;
         * Mestudiantes[estudiantesregis][8] = n5;
         * Mestudiantes[estudiantesregis][9] = Double.toString(ndef);
         * estudiantesregis++; System.out.println("Guardar en M");
         * llenarMatriz(); Textcod.setText(""); Textonombre.setText("");
         * Textoapellido.setText(""); Textosemestre.setText("");
         * Texton1.setText(""); Texton2.setText(""); Texton3.setText("");
         * Texton4.setText(""); Texton5.setText(""); } else {
         * JOptionPane.showMessageDialog(null, "Error: no se hizo el registro");
        }*
         */
    }//GEN-LAST:event_BtnregistrarMouseClicked

    private void btnordenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnordenarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnordenarActionPerformed

    private void btnordenarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnordenarMousePressed
        Metodos.ordenAlfabetico(Mestudiantes, estudiantesregis, 10);
        llenarMatriz();
    }//GEN-LAST:event_btnordenarMousePressed

    private void BtnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnregistrarActionPerformed
        boolean sw = true;
        double ndef=0;
        String codigo = Textcod.getText();
        String nombre = Textonombre.getText();
        String apellido = Textoapellido.getText();
        String semestrec = Textosemestre.getText();
        String n1 = Texton1.getText();
        String n2 = Texton2.getText();
        String n3 = Texton3.getText();
        String n4 = Texton4.getText();
        String n5 = Texton5.getText();
        if (Metodos.camposVacios(n1) || Metodos.camposVacios(n2) || Metodos.camposVacios(n3) || Metodos.camposVacios(n4) || Metodos.camposVacios(n5)|| Metodos.camposVacios(codigo)||Metodos.camposVacios(nombre)|| Metodos.camposVacios(apellido)||Metodos.camposVacios(semestrec)) {
            JOptionPane.showMessageDialog(null,"No puede haber campos vacíos");
            sw = false;
        }else{
        ndef = Metodos.calcularNotaDefinitiva(n1, n2, n3, n4, n5);
        }
        if (Metodos.validarCodigoEst(codigo, estudiantesregis, Mestudiantes) == false) {
            sw = false;
        }
        if (Metodos.validarNotas(n1) == false) {
            sw = false;
        } 
        if (Metodos.validarNotas(n2) == false) {
            sw = false;
        }
        if (Metodos.validarNotas(n3) == false) {
            sw = false;
        }
        if (Metodos.validarNotas(n4) == false) {
            sw = false;
        }
        if (Metodos.validarNotas(n5) == false) {
            sw = false;
        }
        if (Metodos.validarSemestre(semestrec) == false) {
            sw = false;
        }
        if (sw == true) {
            Mestudiantes[estudiantesregis][0] = codigo;
            Mestudiantes[estudiantesregis][1] = apellido;
            Mestudiantes[estudiantesregis][2] = nombre;
            Mestudiantes[estudiantesregis][3] = semestrec;
            Mestudiantes[estudiantesregis][4] = n1;
            Mestudiantes[estudiantesregis][5] = n2;
            Mestudiantes[estudiantesregis][6] = n3;
            Mestudiantes[estudiantesregis][7] = n4;
            Mestudiantes[estudiantesregis][8] = n5;
            Mestudiantes[estudiantesregis][9] = Double.toString(ndef);
            estudiantesregis++;
            llenarMatriz();
            Textcod.setText("");
            Textonombre.setText("");
            Textoapellido.setText("");
            Textosemestre.setText("");
            Texton1.setText("");
            Texton2.setText("");
            Texton3.setText("");
            Texton4.setText("");
            Texton5.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Error: no se hizo el registro");
        }
    }//GEN-LAST:event_BtnregistrarActionPerformed

    private void BtnsuppromsemestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnsuppromsemestreActionPerformed
        Metodos.calcularEstudiantesEncimaProm(Mestudiantes, estudiantesregis);
    }//GEN-LAST:event_BtnsuppromsemestreActionPerformed

    private void Btndefsup4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btndefsup4ActionPerformed
       String nota="4.0";
        Metodos.estPorSemConNotaMay(Mestudiantes, estudiantesregis,nota);
    }//GEN-LAST:event_Btndefsup4ActionPerformed

    private void BtnnotasinfglobalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnnotasinfglobalActionPerformed
        //TODO add your handling code here:
    }//GEN-LAST:event_BtnnotasinfglobalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalInterfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btndefsup4;
    private javax.swing.JButton Btnnotasinfglobal;
    private javax.swing.JButton Btnregistrar;
    private javax.swing.JButton Btnsuppromsemestre;
    private javax.swing.JTextField Textcod;
    private javax.swing.JTextField Textoapellido;
    private javax.swing.JTextField Texton1;
    private javax.swing.JTextField Texton2;
    private javax.swing.JTextField Texton3;
    private javax.swing.JTextField Texton4;
    private javax.swing.JTextField Texton5;
    private javax.swing.JTextField Textonombre;
    private javax.swing.JTextField Textosemestre;
    private javax.swing.JButton btnordenar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel labelcod;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
