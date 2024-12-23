/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacionGUI;

import controladores.Fabrica;
import controladores.iSistema;
import datatypes.DataAlbum;
import datatypes.DataLista;
import datatypes.DataTema;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Album;
import logica.ListaParticular;
import logica.Tema;
import persistencia.ControladorPersistencia;


/**
 *
 * @author Tonny2
 */
public class AgregarTemaALista extends javax.swing.JFrame {

    ControladorPersistencia cpu;
    
    iSistema sys = new Fabrica().getSistema(cpu);
    DefaultComboBoxModel comboModel=null;
    DefaultComboBoxModel comboModel2=null;
    DefaultComboBoxModel comboModel3=null;
    DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Nombre", "Cliente"}, 0);
    DefaultTableModel model2 = new DefaultTableModel(new String[]{"ID", "Nombre"}, 0);
    DefaultTableModel modelDefecto = new DefaultTableModel(new String[]{"ID", "Nombre"}, 0);
    
    public AgregarTemaALista() {
        
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

        jPanel1 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        cmbUsuario = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTemas = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        cmbOrigenTema = new javax.swing.JComboBox<>();
        lblAlbum = new javax.swing.JLabel();
        cmbAlbum = new javax.swing.JComboBox<>();
        cmbLista = new javax.swing.JComboBox<>();
        lblLista = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableLista = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblTipoLista = new javax.swing.JLabel();
        cmbTipoLista = new javax.swing.JComboBox<>();
        lblListaDefecto = new javax.swing.JLabel();
        cmbListaDefecto = new javax.swing.JComboBox<>();
        btnCancelar = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setText("Seleccione Usuario: ");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        cmbUsuario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbUsuarioItemStateChanged(evt);
            }
        });
        cmbUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(cmbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 110, 50));

        jLabel8.setText("Seleccionar Tema:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, -1, -1));

        jTableTemas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableTemas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 230, 260));

        jLabel5.setText("Seleccionar Origen del tema:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        cmbOrigenTema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Por Defecto", "Lista Publica", "Album" }));
        cmbOrigenTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrigenTemaActionPerformed(evt);
            }
        });
        jPanel1.add(cmbOrigenTema, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 140, 50));

        lblAlbum.setText("Seleccionar Album:");
        jPanel1.add(lblAlbum, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        cmbAlbum.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbAlbumItemStateChanged(evt);
            }
        });
        cmbAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAlbumActionPerformed(evt);
            }
        });
        jPanel1.add(cmbAlbum, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 110, 50));

        cmbLista.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbListaItemStateChanged(evt);
            }
        });
        cmbLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbListaActionPerformed(evt);
            }
        });
        jPanel1.add(cmbLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 110, 50));

        lblLista.setText("Seleccionar Lista Publica:");
        jPanel1.add(lblLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        jButton1.setText("Agregar tema a Lista");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 220, 60));

        jTableLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableLista);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 240, 150));

        jLabel1.setText("Seleccionar Lista:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 160, 20));

        lblTipoLista.setText("Seleccionar Tipo Lista:");
        jPanel1.add(lblTipoLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        cmbTipoLista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Particular", "Por Defecto" }));
        cmbTipoLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoListaActionPerformed(evt);
            }
        });
        jPanel1.add(cmbTipoLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 110, 50));

        lblListaDefecto.setText("Seleccionar Lista por Defecto:");
        jPanel1.add(lblListaDefecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, -1, -1));

        cmbListaDefecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbListaDefectoActionPerformed(evt);
            }
        });
        jPanel1.add(cmbListaDefecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 520, 110, 40));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 530, 220, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbOrigenTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrigenTemaActionPerformed
        String itemSeleccionado=(String)cmbOrigenTema.getSelectedItem();
        
        
        
        if("Por Defecto".equals((itemSeleccionado))){
            lblListaDefecto.setVisible(true);
            cmbListaDefecto.setVisible(true);
            
            lblAlbum.setVisible(false);
            cmbAlbum.setVisible(false);
            
            lblLista.setVisible(false);
            cmbLista.setVisible(false);
            
            List<DataLista> listasDefecto= new ArrayList();
            listasDefecto = sys.traerListasPorDefecto();

            Vector <DataLista> list = new Vector<>(listasDefecto);
            comboModel3=new DefaultComboBoxModel(list);
            cmbListaDefecto.setModel(comboModel3);
            
            
            
        }
        
        if("Album".equals(itemSeleccionado)){
            lblAlbum.setVisible(true);
            cmbAlbum.setVisible(true);
            
            lblLista.setVisible(false);
            cmbLista.setVisible(false);
            
            lblListaDefecto.setVisible(false);
            cmbListaDefecto.setVisible(false);
        }

        if("Lista Publica".equals(itemSeleccionado)){
            lblLista.setVisible(true);
            cmbLista.setVisible(true);
            
            lblListaDefecto.setVisible(false);
            cmbListaDefecto.setVisible(false);
            
            lblAlbum.setVisible(false);
            cmbAlbum.setVisible(false);
            
        Vector<DataLista> listas= new Vector<>();
        listas=sys.traerListasParticularesPublicas();
        
        comboModel2= new DefaultComboBoxModel(listas);
        cmbLista.setModel(comboModel2);
            /*List <ListaParticular> listasParticularesPublicas = sys.traerListasParticularesPublicas();
            
            for(ListaParticular lp: listasParticularesPublicas){
                cmbLista.addItem(lp.getNombre());
            }
        */
        }
    }//GEN-LAST:event_cmbOrigenTemaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DataAlbum dtAlbum2= (DataAlbum)cmbAlbum.getSelectedItem();


        int row = jTableLista.getSelectedRow();
        int listaId=0;
        if (row != -1) {

            if(cmbTipoLista.getSelectedIndex()==1){

                listaId = (int) modelDefecto.getValueAt(row, 0);
                //JOptionPane.showMessageDialog(null, listaId);
            }else{
                listaId = (int) model.getValueAt(row, 0);
            }

        }

         if (jTableLista.getSelectedRow()==-1 || jTableTemas.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una lista y un tema.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }else{
             int row2 = jTableTemas.getSelectedRow();
             Long idTema=0L;
             if (row2 != -1) {
             idTema = (Long) model2.getValueAt(row2, 0);
            }

            if(sys.existeTemaLista(idTema, listaId)){
                JOptionPane.showMessageDialog(null, "Este Tema ya existe en la lista seleccionada!");

            }else{
                sys.agregarTemaLista(listaId, idTema);
                JOptionPane.showMessageDialog(null, "Tema agregado con Exito","Felicitaciones",JOptionPane.WARNING_MESSAGE);
                model2.removeRow(jTableTemas.getSelectedRow());
            }
         }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         lblAlbum.setVisible(false);
        lblLista.setVisible(false);
        cmbAlbum.setVisible(false);
        cmbLista.setVisible(false);
        lblListaDefecto.setVisible(false);
        cmbListaDefecto.setVisible(false);
        
          List <String> listaUsuarios = sys.traerNickNamesClientes();
           if(listaUsuarios!=null){
             
            for(String user: listaUsuarios){
                cmbUsuario.addItem(user);
            }
    }      
           
        Vector<DataAlbum> listaAlbum = new Vector<>();
        listaAlbum=sys.traerAlbumes();
        
        comboModel= new DefaultComboBoxModel(listaAlbum);
        cmbAlbum.setModel(comboModel);
    }//GEN-LAST:event_formWindowOpened

    private void cmbUsuarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbUsuarioItemStateChanged
       
       
    }//GEN-LAST:event_cmbUsuarioItemStateChanged

    private void cmbAlbumItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbAlbumItemStateChanged
        
    }//GEN-LAST:event_cmbAlbumItemStateChanged

    private void cmbListaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbListaItemStateChanged
        
       
    }//GEN-LAST:event_cmbListaItemStateChanged

    private void cmbListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbListaActionPerformed
       
        model2.setRowCount(0);
        DataLista dtLista= (DataLista)cmbLista.getSelectedItem();
        
        
       List<DataTema> listaTemas = sys.traerTemasPorIdListaReproduccion(dtLista.getId());
        for (DataTema dtT: listaTemas) {
            model2.addRow(new Object[]{dtT.getId(),dtT.getNombre()});
        }
        
        jTableTemas.setModel(model2);
        
    }//GEN-LAST:event_cmbListaActionPerformed

    private void cmbTipoListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoListaActionPerformed
        
        model2.setRowCount(0);
        model.setRowCount(0);
        modelDefecto.setRowCount(0);
        if(cmbTipoLista.getSelectedIndex()==0){
            lblUsuario.setVisible(true);
            cmbUsuario.setVisible(true);
        }
        if(cmbTipoLista.getSelectedIndex()==1){
            lblUsuario.setVisible(false);
            cmbUsuario.setVisible(false);
            modelDefecto.setRowCount(0);
            List<DataLista> listasDefecto = sys.traerListasPorDefecto();
            
             for (DataLista listaDF : listasDefecto) {
            modelDefecto.addRow(new Object[]{listaDF.getId(), listaDF.getNombre()});
        }
            
            jTableLista.setModel(modelDefecto);
        }
    }//GEN-LAST:event_cmbTipoListaActionPerformed

    private void cmbUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUsuarioActionPerformed
        model.setRowCount(0);
        String nickname = (String)cmbUsuario.getSelectedItem();
        List<DataLista> lista= sys.traerListasParticularesPorClientes(nickname);
        for (DataLista DPListaP : lista) {
            model.addRow(new Object[]{DPListaP.getId(), DPListaP.getNombre(), DPListaP.getExtra()});
        }
        
        jTableLista.setModel(model);
    }//GEN-LAST:event_cmbUsuarioActionPerformed

    private void cmbAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAlbumActionPerformed
        model2.setRowCount(0);
        DataAlbum dtAlbum= (DataAlbum)cmbAlbum.getSelectedItem();
        
        
        List<DataTema> lista= sys.traerTemasPorIdAlbum(dtAlbum.getId());
        for (DataTema DPTema: lista) {
            model2.addRow(new Object[]{DPTema.getId(),DPTema.getNombre()});
        }
        
        jTableTemas.setModel(model2);
    }//GEN-LAST:event_cmbAlbumActionPerformed

    private void cmbListaDefectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbListaDefectoActionPerformed
        model2.setRowCount(0);
        DataLista dtList = (DataLista) cmbListaDefecto.getSelectedItem();
        
        
        List <DataTema> dataListas = sys.traerTemasPorListasPorDefectoId(dtList.getId());

        for (DataTema DTTema: dataListas) {
            model2.addRow(new Object[]{DTTema.getId(),DTTema.getNombre()});
        }
        
        jTableTemas.setModel(model2);
    }//GEN-LAST:event_cmbListaDefectoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cmbAlbum;
    private javax.swing.JComboBox<String> cmbLista;
    private javax.swing.JComboBox<String> cmbListaDefecto;
    private javax.swing.JComboBox<String> cmbOrigenTema;
    private javax.swing.JComboBox<String> cmbTipoLista;
    private javax.swing.JComboBox<String> cmbUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableLista;
    private javax.swing.JTable jTableTemas;
    private javax.swing.JLabel lblAlbum;
    private javax.swing.JLabel lblLista;
    private javax.swing.JLabel lblListaDefecto;
    private javax.swing.JLabel lblTipoLista;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}
