/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6progra2;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class IngresarAlumno extends javax.swing.JInternalFrame {

    /**
     * Creates new form IngresarAlumno
     */
    public IngresarAlumno() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblContraAlumno = new javax.swing.JLabel();
        lblUsuarioAlumno = new javax.swing.JLabel();
        txtUsuarioAlumno = new javax.swing.JTextField();
        btnIngresarAlumno = new javax.swing.JButton();
        ptxtContraAlumno = new javax.swing.JPasswordField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Contra:");

        lblContraAlumno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblContraAlumno.setText("Contra:");

        lblUsuarioAlumno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUsuarioAlumno.setText("Usuario:");

        txtUsuarioAlumno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        btnIngresarAlumno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnIngresarAlumno.setText("Ingresar");
        btnIngresarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarAlumnoActionPerformed(evt);
            }
        });

        ptxtContraAlumno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuarioAlumno)
                            .addComponent(lblContraAlumno))
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuarioAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(ptxtContraAlumno)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnIngresarAlumno)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuarioAlumno)
                    .addComponent(txtUsuarioAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContraAlumno)
                    .addComponent(ptxtContraAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(btnIngresarAlumno)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarAlumnoActionPerformed
        // TODO add your handling code here:
        
        //Usuarios Default
        String [] Alumnos ={"javier","alexis"};
        String [] Contras =new String[2];
        Contras[0]="hola"; //clave javier
        Contras[1]="qp2"; //clave jose
        
        //Validacion
        String usuario=txtUsuarioAlumno.getText();
        String contrasena=ptxtContraAlumno.getText();
        
        boolean mensaje=false;
        
        for(int i=0;i<Alumnos.length;i++){
            if(Alumnos[i].equals(usuario) && Contras[i].equals(contrasena)){
                mensaje=true;
            }
        }
        if(mensaje){
            Principal frm=new Principal();
            frm.setVisible(true);
            JOptionPane.showMessageDialog(null,"Bienvenido");
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null,"Intente de nuevo");
            txtUsuarioAlumno.setText("");
            ptxtContraAlumno.setText("");
        }
        
    }//GEN-LAST:event_btnIngresarAlumnoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresarAlumno;
    private javax.swing.JLabel lblContraAlumno;
    private javax.swing.JLabel lblUsuarioAlumno;
    private javax.swing.JPasswordField ptxtContraAlumno;
    private javax.swing.JTextField txtUsuarioAlumno;
    // End of variables declaration//GEN-END:variables
}
