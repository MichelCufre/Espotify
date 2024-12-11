/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacionGUI;

import controladores.Fabrica;
import controladores.iSistema;
import datatypes.DataRegistro;
import java.util.List;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import persistencia.ControladorPersistencia;

/**
 *
 * @author dokgo
 */
public class Registros extends javax.swing.JInternalFrame {

    ControladorPersistencia cpu = new ControladorPersistencia();
    iSistema sys = new Fabrica().getSistema(cpu);
    private Timer timer;
    /**
     * Creates new form Registros
     */
    public Registros() {
        initComponents();
        cargarRegistros();
        iniciarActualizacion();
        jTable_registros.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        configurarColumnasTabla();
    }
    
    
    public void cargarRegistros(){
        
        List<DataRegistro> registros = sys.obtenerRegistros();

        String[] columnas = { "ID", "IP", "URL", "Browser", "OS" };
        
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        for (DataRegistro registro : registros) {
            Object[] fila = {
                registro.getId(),
                registro.getIp(),
                registro.getUrl(),
                registro.getUserAgent(),
                registro.getOs()
            };
            modelo.addRow(fila);
        }
        
        int[] anchos = new int[columnas.length];
        for(int i = 0; i < jTable_registros.getColumnCount(); i++) {
            anchos[i] = jTable_registros.getColumnModel().getColumn(i).getWidth();
        }

        jTable_registros.setModel(modelo);
        
        configurarColumnasTabla();
        
        if(anchos[0] != 0) {
            for(int i = 0; i < jTable_registros.getColumnCount(); i++) {
                jTable_registros.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
        }
    }
    
    private void iniciarActualizacion() {
        //5000 es igual a 5seg, ta en miliseg
        timer = new Timer(5000, e -> cargarRegistros());
        timer.start();
    }
    
    public void setVisible(boolean b) {
        if (!b) {
            if (timer != null) {
                timer.stop();
            }
        }
        super.setVisible(b);
    }
    
    private void configurarColumnasTabla() {
    if (jTable_registros.getColumnModel().getColumnCount() > 0) {
        jTable_registros.getColumnModel().getColumn(0).setResizable(false);
        jTable_registros.getColumnModel().getColumn(0).setMinWidth(50);
        jTable_registros.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTable_registros.getColumnModel().getColumn(0).setMaxWidth(50);

        // IP - Tamaño fijo para IPs
        jTable_registros.getColumnModel().getColumn(1).setMinWidth(120);
        jTable_registros.getColumnModel().getColumn(1).setPreferredWidth(120);
        jTable_registros.getColumnModel().getColumn(1).setMaxWidth(120);

        // URL - Columna más grande y flexible
        jTable_registros.getColumnModel().getColumn(2).setMinWidth(430);
        jTable_registros.getColumnModel().getColumn(2).setPreferredWidth(430);

        // Browser
        jTable_registros.getColumnModel().getColumn(3).setMinWidth(80);
        jTable_registros.getColumnModel().getColumn(3).setPreferredWidth(80);
        jTable_registros.getColumnModel().getColumn(3).setMaxWidth(80);

        // OS
        jTable_registros.getColumnModel().getColumn(4).setMinWidth(80);
        jTable_registros.getColumnModel().getColumn(4).setPreferredWidth(80);
        jTable_registros.getColumnModel().getColumn(4).setMaxWidth(80);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_registros = new javax.swing.JTable();
        jButton_Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Registros De Acceso Al Sitio");
        setPreferredSize(new java.awt.Dimension(890, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_registros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "IP", "URL", "Browser", "OS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_registros);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 7, 860, 560));

        jButton_Salir.setText("Salir");
        jButton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 600, 210, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalirActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable_registros.getModel();
        model.setRowCount(0);
        jTable_registros.repaint();
        this.setVisible(false);
    }//GEN-LAST:event_jButton_SalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_registros;
    // End of variables declaration//GEN-END:variables
}