/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacionGUI;

import controladores.Fabrica;
import controladores.iSistema;
import datatypes.DataAlbumEliminado;
import datatypes.DataArtistaEliminado;
import datatypes.DataTemaEliminado;
import excepciones.UsuarioNoExisteException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencia.ControladorPersistencia;

/**
 *
 * @author dokgo
 */
public class ConsultaBajaArtista extends javax.swing.JInternalFrame {

    ControladorPersistencia cpu = new ControladorPersistencia();
    iSistema sys = new Fabrica().getSistema(cpu);
    
    private javax.swing.event.ListSelectionListener albumSelectionListener;
    /**
     * Creates new form ConsultaBajaArtista
     */
    public ConsultaBajaArtista() {
        
        initComponents();
        jLabel_ArtistaEliminado.setVisible(false);
        jLabel_sitioweb.setVisible(false);
        
        
        
        jComboBox_nickname.setSelectedItem(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Nickname = new javax.swing.JLabel();
        jButton_Salir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_infoUser = new javax.swing.JTable();
        jComboBox_nickname = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_infoTema = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_infoAlbum = new javax.swing.JTable();
        jLabel_Albums = new javax.swing.JLabel();
        jLabel_TemasAlbum = new javax.swing.JLabel();
        jLabel_ArtistaEliminado = new javax.swing.JLabel();
        jLabel_FechaEliminado = new javax.swing.JLabel();
        jLabel_sitioweb = new javax.swing.JLabel();
        jLabel_sitioWeb = new javax.swing.JLabel();
        jLabel_Biografia = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea_biografia = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Consulta Baja Artista");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Nickname.setText("Ingrese nickname a consultar: ");
        getContentPane().add(jLabel_Nickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jButton_Salir.setText("Salir");
        jButton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 580, 210, -1));

        jTable_infoUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Nickaname", "Nombre", "Apellido", "Email", "FechaNac"
            }
        ));
        jTable_infoUser.setEnabled(false);
        jScrollPane1.setViewportView(jTable_infoUser);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 850, 50));

        try {
            DataArtistaEliminado[] dataArtistasE = sys.getArtistasEliminados();
            String[] nicksA = new String[dataArtistasE.length];
            for (int i = 0; i < dataArtistasE.length; i++) {
                nicksA[i] = dataArtistasE[i].getNickname();
            }
            jComboBox_nickname.setModel(new javax.swing.DefaultComboBoxModel<>(nicksA));
        } catch (UsuarioNoExisteException e) {
            // Manejar la excepción
        }
        jComboBox_nickname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_nicknameActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_nickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 300, -1));

        jTable_infoTema.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Duración", "Archivo", "Dirección Web"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_infoTema.setEnabled(false);
        jScrollPane2.setViewportView(jTable_infoTema);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 850, 110));

        jTable_infoAlbum.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Fecha Creación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable_infoAlbum);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 850, 110));

        jLabel_Albums.setText("Albums");
        getContentPane().add(jLabel_Albums, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel_TemasAlbum.setText("Temas");
        getContentPane().add(jLabel_TemasAlbum, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        jLabel_ArtistaEliminado.setText("Artista eliminado el");
        getContentPane().add(jLabel_ArtistaEliminado, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 140, -1));

        jLabel_FechaEliminado.setText(" ");
        getContentPane().add(jLabel_FechaEliminado, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 120, -1));

        jLabel_sitioweb.setText("Sitio Web: ");
        getContentPane().add(jLabel_sitioweb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel_sitioWeb.setText(" ");
        getContentPane().add(jLabel_sitioWeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 280, -1));

        jLabel_Biografia.setText("Biografia");
        getContentPane().add(jLabel_Biografia, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, -1, -1));

        jTextArea_biografia.setColumns(20);
        jTextArea_biografia.setRows(5);
        jTextArea_biografia.setEnabled(false);
        jScrollPane5.setViewportView(jTextArea_biografia);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 270, 140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_nicknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_nicknameActionPerformed
        if (jComboBox_nickname.getSelectedItem() == null) {
            return;
        }
        
        DefaultTableModel model3 = (DefaultTableModel) jTable_infoTema.getModel();
        model3.setRowCount(0);
        jTable_infoTema.setModel(model3);
        jTable_infoTema.repaint();
        DefaultTableModel model2 = (DefaultTableModel) jTable_infoAlbum.getModel();
        model2.setRowCount(0);
        jTable_infoAlbum.setModel(model2);
        jTable_infoAlbum.repaint();
        String nickname = jComboBox_nickname.getSelectedItem().toString();
        
        try {
            DataArtistaEliminado[] artistasE = sys.getArtistasEliminados();

            // busca al artista
            for (DataArtistaEliminado dataArtista : artistasE) {
                if (dataArtista.getNickname().equals(nickname)) {

                    // crea la tabla
                    DefaultTableModel model = new DefaultTableModel(){//(DefaultTableModel) jTable_info.getModel();
                    
                        @Override
                        public boolean isCellEditable(int row, int column){
                            return false;
                        }
                    };
                    model.setRowCount(0); // limpiar la tabla antes de agregar nuevos datos
                    model.setColumnIdentifiers(new Object[]{"Nickname", "Nombre", "Apellido", "Email", "FechaNac"});

                    // mete los datos del artista en la tabla
                    model.addRow(new Object[]{
                        dataArtista.getNickname(),
                        dataArtista.getNombre(),
                        dataArtista.getApellido(),
                        dataArtista.getEmail(),
                        dataArtista.getFechaNac().toString(),
                    });
                    jTable_infoUser.setModel(model);
                    jTable_infoUser.repaint();
                    
                    //biografia
                    String biografia = dataArtista.getBiografia();
                    if(biografia == null){
                        biografia = "Vacio";
                    }
                    jTextArea_biografia.setText(biografia);
                    jTextArea_biografia.setLineWrap(true);
                    jTextArea_biografia.setWrapStyleWord(true);
                    
                    //Sitioweb
                    String sitioWeb = dataArtista.getSitioWeb();
                    if(sitioWeb != null){
                        jLabel_sitioweb.setVisible(true);
                        jLabel_sitioWeb.setText(sitioWeb);
                    }else{
                        jLabel_sitioweb.setVisible(false);
                        jLabel_sitioWeb.setText("");
                    }
                    
                    
        
                    //FechaEliminado
                    LocalDate FechaE = dataArtista.getFechaEliminado();
                    jLabel_ArtistaEliminado.setVisible(true);
                    jLabel_FechaEliminado.setText(FechaE.toString());
                    
                    // Remover el listener anterior si existe
                    if (albumSelectionListener != null) {
                        jTable_infoAlbum.getSelectionModel().removeListSelectionListener(albumSelectionListener);
                    }
                    
                    //cargaralbumes artista
                    List<DataAlbumEliminado> albumesData = sys.traerAlbumesArtistaEliminado(nickname);
                    if (albumesData.size() == 1) {
                        // Si solo hay un álbum, muestra los temas de ese álbum y el álbum en jTable_infoAlbum
                        DataAlbumEliminado album = albumesData.get(0);
                        cargarAlbumesEnTabla(albumesData); // Cargar el álbum único en jTable_infoAlbum
                        cargarTemasEnTabla(album.getTemas()); // Cargar los temas en jTable_infoTema
                    } else {
                        // Si hay más de un álbum, muestra los álbumes en jTable_infoAlbum
                        cargarAlbumesEnTabla(albumesData);
                        // Agrega un listener para detectar la selección de un álbum en jTable_infoAlbum
//                        jTable_infoAlbum.getSelectionModel().addListSelectionListener(event -> {
//                            if (!event.getValueIsAdjusting()) {
//                                int selectedRow = jTable_infoAlbum.getSelectedRow();
//                                if (selectedRow >= 0) {
//                                    DataAlbumEliminado selectedAlbum = albumesData.get(selectedRow);
//                                    cargarTemasEnTabla(selectedAlbum.getTemas());
//                                }
//                            }
//                        });
                        albumSelectionListener = new javax.swing.event.ListSelectionListener() {
                        @Override
                        public void valueChanged(javax.swing.event.ListSelectionEvent event) {
                            if (!event.getValueIsAdjusting()) {
                                int selectedRow = jTable_infoAlbum.getSelectedRow();
                                    if (selectedRow >= 0) {
                                        DataAlbumEliminado selectedAlbum = albumesData.get(selectedRow);
                                        cargarTemasEnTabla(selectedAlbum.getTemas());
                                    }
                                }
                            }
                        };
                    jTable_infoAlbum.getSelectionModel().addListSelectionListener(albumSelectionListener);
                    }

                    break;
                }
            }          
        } catch (UsuarioNoExisteException e) {
            JOptionPane.showMessageDialog(null, "No se encontraron artistas eliminados", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_jComboBox_nicknameActionPerformed

    private void cargarAlbumesEnTabla(List<DataAlbumEliminado> albumesData) {
        DefaultTableModel albumModel = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Hace que todas las celdas no sean editables
            }
        };

        albumModel.setColumnIdentifiers(new Object[]{"Nombre", "Fecha Creación"});

        for (DataAlbumEliminado album : albumesData) {
            albumModel.addRow(new Object[]{album.getNombre(), album.getFechaCreacion()});
        }

        jTable_infoAlbum.setModel(albumModel);
        jTable_infoAlbum.repaint();
    }

    // Método para cargar los temas en jTable_infoTema
    private void cargarTemasEnTabla(List<DataTemaEliminado> temas) {
        DefaultTableModel temaModel = new DefaultTableModel();
        temaModel.setColumnIdentifiers(new Object[]{"Nombre", "Duración", "Archivo", "Dirección Web"});

        for (DataTemaEliminado tema : temas) {
            temaModel.addRow(new Object[]{tema.getNombre(), tema.getDuracion(), tema.getArchivo(), tema.getDireccionWeb()});
        }

        jTable_infoTema.setModel(temaModel);
        jTable_infoTema.repaint();
    }
    
    private void jButton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalirActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable_infoUser.getModel();
        model.setRowCount(0);
        DefaultTableModel model2 = (DefaultTableModel) jTable_infoAlbum.getModel();
        model2.setRowCount(0);
        DefaultTableModel model3 = (DefaultTableModel) jTable_infoTema.getModel();
        model3.setRowCount(0);
        
        jComboBox_nickname.setSelectedItem(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButton_SalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JComboBox<String> jComboBox_nickname;
    private javax.swing.JLabel jLabel_Albums;
    private javax.swing.JLabel jLabel_ArtistaEliminado;
    private javax.swing.JLabel jLabel_Biografia;
    private javax.swing.JLabel jLabel_FechaEliminado;
    private javax.swing.JLabel jLabel_Nickname;
    private javax.swing.JLabel jLabel_TemasAlbum;
    private javax.swing.JLabel jLabel_sitioWeb;
    private javax.swing.JLabel jLabel_sitioweb;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable_infoAlbum;
    private javax.swing.JTable jTable_infoTema;
    private javax.swing.JTable jTable_infoUser;
    private javax.swing.JTextArea jTextArea_biografia;
    // End of variables declaration//GEN-END:variables
}
