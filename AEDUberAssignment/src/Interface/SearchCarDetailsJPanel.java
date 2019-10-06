/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Uber;
import Business.UberDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rohan
 */
public class SearchCarDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchCarDetailsJPanel
     */
    private UberDirectory uberDirectory;
    private final JPanel bottomPanel;
    private ArrayList<Uber> tempCarList;
   // ViewCarJPanel panel;
    int count1;
    int count2;
  //  String s;
    
    
        
    

    SearchCarDetailsJPanel(JPanel bottomPanel, UberDirectory uberDirectory) {
        
         //To change body of generated methods, choose Tools | Templates.
         initComponents();
         this.bottomPanel = bottomPanel;
         this.uberDirectory = uberDirectory;
         //s=panel.s;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSearchResult = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        carBrandTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnCarYearSearch = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        carYearTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnBrandSearch = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        minTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        maxTextField = new javax.swing.JTextField();
        btnMinMax = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        carSerialNumberTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnCarSerialNumSearch = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        carModelNumberTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnCarModelNumberSearch = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        carCityTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btnCitySearch = new javax.swing.JButton();
        selectJComboBox = new javax.swing.JComboBox<>();
        btnJComboBox = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 36)); // NOI18N
        jLabel1.setText("Search Details");

        tblSearchResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Brand", "Manufacturer", "Manu. Year", "Min. Seats", "Max Seats", "Serial Num", "Model Num", "City", "Manufacturer", "Availability", "Certificate?"
            }
        ));
        jScrollPane1.setViewportView(tblSearchResult);

        jLabel2.setText("Name of cars made by");

        carBrandTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carBrandTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("brand are?");

        btnCarYearSearch.setText("Search");
        btnCarYearSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarYearSearchActionPerformed(evt);
            }
        });

        jLabel4.setText("List of Cars made in year");

        jLabel5.setText("are?");

        btnBrandSearch.setText("Search");
        btnBrandSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrandSearchActionPerformed(evt);
            }
        });

        jLabel6.setText("Available cars with minimum ");

        jLabel7.setText("seats & maximum");

        jLabel8.setText("seats are?");

        btnMinMax.setText("Search");
        btnMinMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinMaxActionPerformed(evt);
            }
        });

        jLabel9.setText("List of cars with the serial number ");

        jLabel10.setText("are?");

        btnCarSerialNumSearch.setText("Search");
        btnCarSerialNumSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarSerialNumSearchActionPerformed(evt);
            }
        });

        jLabel11.setText("List of cars with the model number ");

        carModelNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carModelNumberTextFieldActionPerformed(evt);
            }
        });

        jLabel12.setText("are?");

        btnCarModelNumberSearch.setText("Search");
        btnCarModelNumberSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarModelNumberSearchActionPerformed(evt);
            }
        });

        jLabel13.setText("List of cars in the city of ");

        jLabel14.setText(" are?");

        btnCitySearch.setText("Search");
        btnCitySearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitySearchActionPerformed(evt);
            }
        });

        selectJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select the questions", "Find the first available car?", "How many cars are currently available? ", "How many cars are currently not available?", "List all the manufacturers used", "List of cars with expired maintenance certificate" }));
        selectJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectJComboBoxActionPerformed(evt);
            }
        });

        btnJComboBox.setText("Search");
        btnJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJComboBoxActionPerformed(evt);
            }
        });

        jButton1.setText("Click here to perform Secondary Search!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(380, 380, 380))
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(carSerialNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(carModelNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(minTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maxTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(carCityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14))
                            .addComponent(selectJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(carYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(2, 2, 2)
                                        .addComponent(carBrandTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnJComboBox)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnCarYearSearch, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnBrandSearch, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnMinMax)
                                .addComponent(btnCarSerialNumSearch, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnCarModelNumberSearch, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(btnCitySearch))
                        .addGap(133, 133, 133))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(443, 443, 443)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnJComboBox)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(carBrandTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(btnBrandSearch))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(carYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(btnCarYearSearch))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(minTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(maxTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(btnMinMax))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCarSerialNumSearch)
                            .addComponent(carSerialNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(carModelNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(btnCarModelNumberSearch))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(carCityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(btnCitySearch))
                        .addGap(39, 39, 39)
                        .addComponent(selectJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(119, 119, 119))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCarYearSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarYearSearchActionPerformed
        // TODO add your handling code here:
        String year = carYearTextField.getText();  
        if(year == null || year.equals("")){
        JOptionPane.showMessageDialog(null, "Year Number can't be empty");
        return;
        }
        
        try{
               Integer.parseInt(carYearTextField.getText());
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Enter number for Year");
            }
        if(carYearTextField.getText()!= null)
        //uberDirectory.searchCertificate(carBrandTextField.getText())!= null
        {
          
        DefaultTableModel dtm = (DefaultTableModel) tblSearchResult.getModel();
        dtm.setRowCount(0);
        tempCarList = uberDirectory.searchCarYear(carYearTextField.getText(),uberDirectory.getCarList());
        for(Uber uber: tempCarList)
                {
            Object[] row = new Object[13];
            row[0] = uber;
            row[1] = uber.getCarBrand();
            row[2] = uber.getCarManufacturer();
            row[3] = uber.getCarManufacYear();
            row[4] = uber.getCarMinSeats();
            row[5] = uber.getCarMaxSeats();
            row[6] = uber.getCarSerialNum();
            row[7] = uber.getCarModelNum();
            row[8] = uber.getCarAvailableCity();
            row[9] = uber.getCarManufacturer();
            row[10] = uber.isCarAvailability();
            row[11] = uber.isCarMaintenanceCertificate();
            
            dtm.addRow(row);
            carYearTextField.setText("");
    }
        }
    }//GEN-LAST:event_btnCarYearSearchActionPerformed

    private void btnBrandSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrandSearchActionPerformed
        // TODO add your handling code here:
        String name = carBrandTextField.getText();  
        if(name == null || name.equals("")){
        JOptionPane.showMessageDialog(null, "Brand can't be empty");
        return;
        }
        if(carBrandTextField.getText()!= null)
        //uberDirectory.searchCertificate(carBrandTextField.getText())!= null
        {
          
        DefaultTableModel dtm = (DefaultTableModel) tblSearchResult.getModel();
        dtm.setRowCount(0);
        tempCarList = uberDirectory.searchBrandName(carBrandTextField.getText(),uberDirectory.getCarList());
        for(Uber uber: tempCarList)
                {
            Object[] row = new Object[13];
            row[0] = uber;
            row[1] = uber.getCarBrand();
            row[2] = uber.getCarManufacturer();
            row[3] = uber.getCarManufacYear();
            row[4] = uber.getCarMinSeats();
            row[5] = uber.getCarMaxSeats();
            row[6] = uber.getCarSerialNum();
            row[7] = uber.getCarModelNum();
            row[8] = uber.getCarAvailableCity();
            row[9] = uber.getCarManufacturer();
            row[10] = uber.isCarAvailability();
            row[11] = uber.isCarMaintenanceCertificate();
            
            dtm.addRow(row);
            carBrandTextField.setText("");
    }
        }
    }//GEN-LAST:event_btnBrandSearchActionPerformed

    private void btnMinMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinMaxActionPerformed
        // TODO add your handling code here:
        
        String minString = minTextField.getText();
        String maxString = maxTextField.getText();
         
        if(minString.equals("") || maxString.equals("")){
        JOptionPane.showMessageDialog(null, "Seats can't be empty");
        return;
        }
       // double max = maxString.equals("") ? Double.MAX_VALUE : Double.parseDouble(maxString);
        //double min = minString.equals("") ? Double.MIN_VALUE : Double.parseDouble(minString);
        int max = Integer.parseInt(maxString);
        int min = Integer.parseInt(minString);
        DefaultTableModel dtm = (DefaultTableModel) tblSearchResult.getModel();
        dtm.setRowCount(0);
        tempCarList = uberDirectory.getMinMax(max, min ,uberDirectory.getCarList());
        for(Uber uber: tempCarList)
        {
            Object[] row = new Object[13];
            row[0] = uber;
            row[1] = uber.getCarBrand();
            row[2] = uber.getCarManufacturer();
            row[3] = uber.getCarManufacYear();
            row[4] = uber.getCarMinSeats();
            row[5] = uber.getCarMaxSeats();
            row[6] = uber.getCarSerialNum();
            row[7] = uber.getCarModelNum();
            row[8] = uber.getCarAvailableCity();
            row[9] = uber.getCarManufacturer();
            row[10] = uber.isCarAvailability();
            row[11] = uber.isCarMaintenanceCertificate();
            
            dtm.addRow(row);
        }
    }//GEN-LAST:event_btnMinMaxActionPerformed

    private void btnCarSerialNumSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarSerialNumSearchActionPerformed
        // TODO add your handling code here:
        String model = carSerialNumberTextField.getText();  
        if(model == null || model.equals("")){
        JOptionPane.showMessageDialog(null, "Serial Number can't be empty");
        return;
        }
        if(carSerialNumberTextField.getText()!= null)
        //uberDirectory.searchCertificate(carBrandTextField.getText())!= null
        {
        String s = (carSerialNumberTextField.getText());  
        DefaultTableModel dtm = (DefaultTableModel) tblSearchResult.getModel();
        dtm.setRowCount(0);
        tempCarList = uberDirectory.searchCarSerialNum(s, uberDirectory.getCarList());
        for(Uber uber: tempCarList)
                {
            Object[] row = new Object[13];
            row[0] = uber;
            row[1] = uber.getCarBrand();
            row[2] = uber.getCarManufacturer();
            row[3] = uber.getCarManufacYear();
            row[4] = uber.getCarMinSeats();
            row[5] = uber.getCarMaxSeats();
            row[6] = uber.getCarSerialNum();
            row[7] = uber.getCarModelNum();
            row[8] = uber.getCarAvailableCity();
            row[9] = uber.getCarManufacturer();
            row[10] = uber.isCarAvailability();
            row[11] = uber.isCarMaintenanceCertificate();
            
            dtm.addRow(row);
            carSerialNumberTextField.setText("");
    }
        }
        
    }//GEN-LAST:event_btnCarSerialNumSearchActionPerformed

    private void btnCarModelNumberSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarModelNumberSearchActionPerformed
        // TODO add your handling code here:
        
        
        String modelNumber = carModelNumberTextField.getText();  
        if(modelNumber == null || modelNumber.equals("")){
        JOptionPane.showMessageDialog(null, "Model Number can't be empty");
        return;
        }
        if(carModelNumberTextField.getText()!= null)
        //uberDirectory.searchCertificate(carBrandTextField.getText())!= null
        {
          
        DefaultTableModel dtm = (DefaultTableModel) tblSearchResult.getModel();
        dtm.setRowCount(0);
        tempCarList = uberDirectory.searchCarModelNum(carModelNumberTextField.getText(),uberDirectory.getCarList());
        for(Uber uber: tempCarList)
                {
            Object[] row = new Object[13];
            row[0] = uber;
            row[1] = uber.getCarBrand();
            row[2] = uber.getCarManufacturer();
            row[3] = uber.getCarManufacYear();
            row[4] = uber.getCarMinSeats();
            row[5] = uber.getCarMaxSeats();
            row[6] = uber.getCarSerialNum();
            row[7] = uber.getCarModelNum();
            row[8] = uber.getCarAvailableCity();
            row[9] = uber.getCarManufacturer();
            row[10] = uber.isCarAvailability();
            row[11] = uber.isCarMaintenanceCertificate();
            
            dtm.addRow(row);
            carModelNumberTextField.setText("");
    }
        }
        
    }//GEN-LAST:event_btnCarModelNumberSearchActionPerformed

    private void btnCitySearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitySearchActionPerformed
        // TODO add your handling code here:
        
        String city = carCityTextField.getText();  
        if(city == null || city.equals("")){
        JOptionPane.showMessageDialog(null, "City can't be empty");
        return;
        }
        if(carCityTextField.getText()!= null)
        //uberDirectory.searchCertificate(carBrandTextField.getText())!= null
        {
          
        DefaultTableModel dtm = (DefaultTableModel) tblSearchResult.getModel();
        dtm.setRowCount(0);
        tempCarList = uberDirectory.searchCarCity(carCityTextField.getText(),uberDirectory.getCarList());
        for(Uber uber: tempCarList)
                {
            Object[] row = new Object[13];
            row[0] = uber;
            row[1] = uber.getCarBrand();
            row[2] = uber.getCarManufacturer();
            row[3] = uber.getCarManufacYear();
            row[4] = uber.getCarMinSeats();
            row[5] = uber.getCarMaxSeats();
            row[6] = uber.getCarSerialNum();
            row[7] = uber.getCarModelNum();
            row[8] = uber.getCarAvailableCity();
            row[9] = uber.getCarManufacturer();
            row[10] = uber.isCarAvailability();
            row[11] = uber.isCarMaintenanceCertificate();
            
            dtm.addRow(row);
            carCityTextField.setText("");
    }
        }
    }//GEN-LAST:event_btnCitySearchActionPerformed

    private void selectJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectJComboBoxActionPerformed

    private void btnJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJComboBoxActionPerformed
        // TODO add your handling code here:
        String question = (String) selectJComboBox.getSelectedItem();
        if (question.equalsIgnoreCase("List of cars with expired maintenance certificate")){
            
            DefaultTableModel dtm = (DefaultTableModel) tblSearchResult.getModel();
            dtm.setRowCount(0);
            tempCarList = uberDirectory.searchCertificate(uberDirectory.getCarList());
            for(Uber uber: tempCarList)
            {
            Object[] row = new Object[13];
            row[0] = uber;
            row[1] = uber.getCarBrand();
            row[2] = uber.getCarManufacturer();
            row[3] = uber.getCarManufacYear();
            row[4] = uber.getCarMinSeats();
            row[5] = uber.getCarMaxSeats();
            row[6] = uber.getCarSerialNum();
            row[7] = uber.getCarModelNum();
            row[8] = uber.getCarAvailableCity();
            row[9] = uber.getCarManufacturer();
            row[10] = uber.isCarAvailability();
            row[11] = uber.isCarMaintenanceCertificate();
            
            dtm.addRow(row);
            
            }
        }
        
        if(question.equalsIgnoreCase("Find the first available car?")){
            
             DefaultTableModel dtm = (DefaultTableModel) tblSearchResult.getModel();
            dtm.setRowCount(0);
            tempCarList = uberDirectory.searchFirstAvailableCar(uberDirectory.getCarList());
            for(Uber uber: tempCarList)
            {
            Object[] row = new Object[13];
            row[0] = uber;
            row[1] = uber.getCarBrand();
            row[2] = uber.getCarManufacturer();
            row[3] = uber.getCarManufacYear();
            row[4] = uber.getCarMinSeats();
            row[5] = uber.getCarMaxSeats();
            row[6] = uber.getCarSerialNum();
            row[7] = uber.getCarModelNum();
            row[8] = uber.getCarAvailableCity();
            row[9] = uber.getCarManufacturer();
            row[10] = uber.isCarAvailability();
            row[11] = uber.isCarMaintenanceCertificate();
            
            dtm.addRow(row);
        }
        }
        
        if(question.equalsIgnoreCase("How many cars are currently available? ")){
            
            DefaultTableModel dtm = (DefaultTableModel) tblSearchResult.getModel();
            dtm.setRowCount(0);
            tempCarList = uberDirectory.searchAvailability(uberDirectory.getCarList());
            for(Uber uber: tempCarList)
            {
            Object[] row = new Object[13];
            row[0] = uber;
            row[1] = uber.getCarBrand();
            row[2] = uber.getCarManufacturer();
            row[3] = uber.getCarManufacYear();
            row[4] = uber.getCarMinSeats();
            row[5] = uber.getCarMaxSeats();
            row[6] = uber.getCarSerialNum();
            row[7] = uber.getCarModelNum();
            row[8] = uber.getCarAvailableCity();
            row[9] = uber.getCarManufacturer();
            row[10] = uber.isCarAvailability();
            row[11] = uber.isCarMaintenanceCertificate();
            
            dtm.addRow(row);
            count2 = dtm.getRowCount();
            
            }
            JOptionPane.showMessageDialog(null, count2, "Number of cars available", JOptionPane.INFORMATION_MESSAGE);
        }
        
        if(question.equalsIgnoreCase("How many cars are currently not available?"))
            
            {
            
            DefaultTableModel dtm = (DefaultTableModel) tblSearchResult.getModel();
            dtm.setRowCount(0);
            tempCarList = uberDirectory.searchNonAvailability(uberDirectory.getCarList());
            for(Uber uber: tempCarList)
                
            {
            Object[] row = new Object[13];
            row[0] = uber;
            row[1] = uber.getCarBrand();
            row[2] = uber.getCarManufacturer();
            row[3] = uber.getCarManufacYear();
            row[4] = uber.getCarMinSeats();
            row[5] = uber.getCarMaxSeats();
            row[6] = uber.getCarSerialNum();
            row[7] = uber.getCarModelNum();
            row[8] = uber.getCarAvailableCity();
            row[9] = uber.getCarManufacturer();
            row[10] = uber.isCarAvailability();
            row[11] = uber.isCarMaintenanceCertificate();
            
            dtm.addRow(row);
             count1 = dtm.getRowCount();
           
            
            
            }
            JOptionPane.showMessageDialog(null, count1, "Number of cars not available", JOptionPane.INFORMATION_MESSAGE);
        }
        
        if(question.equalsIgnoreCase("Select the questions")){
            
            DefaultTableModel dtm = (DefaultTableModel) tblSearchResult.getModel();
            dtm.setRowCount(0);
             JOptionPane.showMessageDialog(null, "Please select an option from menu");
        }
        
        
        if(question.equalsIgnoreCase("List all the manufacturers used")){
            
            DefaultTableModel dtm = (DefaultTableModel) tblSearchResult.getModel();
            dtm.setRowCount(0);
            tempCarList = uberDirectory.getCarList();
            for(Uber uber: tempCarList)
            {
            Object[] row = new Object[13];
            row[0] = null;
            row[1] = null;
            row[2] = uber.getCarManufacturer();
            row[3] = null;
            row[4] = null;
            row[5] = null;
            row[6] = null;
            row[7] = null;
            row[8] = null;
            row[9] = null;
            row[10] =null;
            row[11] = null;
           
            dtm.addRow(row);
            
            }
            
        }
        
    }//GEN-LAST:event_btnJComboBoxActionPerformed

    private void carBrandTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carBrandTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carBrandTextFieldActionPerformed

    private void carModelNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carModelNumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carModelNumberTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        SecondarySearchJPanel panel = new SecondarySearchJPanel(bottomPanel,tempCarList);
        bottomPanel.add("SecondaryWorkAreaJPanel", panel);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrandSearch;
    private javax.swing.JButton btnCarModelNumberSearch;
    private javax.swing.JButton btnCarSerialNumSearch;
    private javax.swing.JButton btnCarYearSearch;
    private javax.swing.JButton btnCitySearch;
    private javax.swing.JButton btnJComboBox;
    private javax.swing.JButton btnMinMax;
    private javax.swing.JTextField carBrandTextField;
    private javax.swing.JTextField carCityTextField;
    private javax.swing.JTextField carModelNumberTextField;
    private javax.swing.JTextField carSerialNumberTextField;
    private javax.swing.JTextField carYearTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField maxTextField;
    private javax.swing.JTextField minTextField;
    private javax.swing.JComboBox<String> selectJComboBox;
    private javax.swing.JTable tblSearchResult;
    // End of variables declaration//GEN-END:variables
}
