/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6progra2;

/**
 *
 * @author Dell
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        pnlEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menAlumnos = new javax.swing.JMenu();
        menItemIngresarAlumno = new javax.swing.JMenuItem();
        menDocentes = new javax.swing.JMenu();
        menItemIngresarDocentes = new javax.swing.JMenuItem();
        menItemProyectosDocentes = new javax.swing.JMenuItem();
        menItemAsignarClaseDocente = new javax.swing.JMenuItem();
        menItemInformacionDocente = new javax.swing.JMenuItem();
        menItemVerClasesDocente = new javax.swing.JMenuItem();
        menAdmins = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana Principal");
        setName("frmPrincipal"); // NOI18N

        javax.swing.GroupLayout pnlEscritorioLayout = new javax.swing.GroupLayout(pnlEscritorio);
        pnlEscritorio.setLayout(pnlEscritorioLayout);
        pnlEscritorioLayout.setHorizontalGroup(
            pnlEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 987, Short.MAX_VALUE)
        );
        pnlEscritorioLayout.setVerticalGroup(
            pnlEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
        );

        menAlumnos.setText("Alumnos");

        menItemIngresarAlumno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        menItemIngresarAlumno.setText("Ingresar");
        menAlumnos.add(menItemIngresarAlumno);

        jMenuBar1.add(menAlumnos);

        menDocentes.setText("Docentes");

        menItemIngresarDocentes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, java.awt.event.InputEvent.ALT_MASK));
        menItemIngresarDocentes.setText("Ingresar");
        menDocentes.add(menItemIngresarDocentes);

        menItemProyectosDocentes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        menItemProyectosDocentes.setText("Proyectos");
        menItemProyectosDocentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menItemProyectosDocentesActionPerformed(evt);
            }
        });
        menDocentes.add(menItemProyectosDocentes);

        menItemAsignarClaseDocente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        menItemAsignarClaseDocente.setText("Asignar clase");
        menDocentes.add(menItemAsignarClaseDocente);

        menItemInformacionDocente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        menItemInformacionDocente.setText("Informacion");
        menDocentes.add(menItemInformacionDocente);

        menItemVerClasesDocente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        menItemVerClasesDocente.setText("Ver clases");
        menDocentes.add(menItemVerClasesDocente);

        jMenuBar1.add(menDocentes);

        menAdmins.setText("Admins");
        jMenuBar1.add(menAdmins);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menItemProyectosDocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menItemProyectosDocentesActionPerformed
        // TODO add your handling code here:
        crearProyecto verVentana=new crearProyecto();
        pnlEscritorio.add(verVentana);
        verVentana.show();
    }//GEN-LAST:event_menItemProyectosDocentesActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menAdmins;
    private javax.swing.JMenu menAlumnos;
    private javax.swing.JMenu menDocentes;
    private javax.swing.JMenuItem menItemAsignarClaseDocente;
    private javax.swing.JMenuItem menItemInformacionDocente;
    private javax.swing.JMenuItem menItemIngresarAlumno;
    private javax.swing.JMenuItem menItemIngresarDocentes;
    private javax.swing.JMenuItem menItemProyectosDocentes;
    private javax.swing.JMenuItem menItemVerClasesDocente;
    private javax.swing.JDesktopPane pnlEscritorio;
    // End of variables declaration//GEN-END:variables
}
