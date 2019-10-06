/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Uber;
import Business.UberDirectory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author rohan
 */
public class CreateCarJPanel extends javax.swing.JPanel {
    private JPanel bottomPanel;
    private UberDirectory uberDirectory;
    /**
     * Creates new form CreateCarJPanel
     */
    

    public CreateCarJPanel(JPanel bottomPanel, UberDirectory uberDirectory) {
        initComponents(); 
         this.bottomPanel = bottomPanel;
         this.uberDirectory = uberDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        carNameTextField = new javax.swing.JTextField();
        carBrandTextField = new javax.swing.JTextField();
        carManufYearTextField = new javax.swing.JTextField();
        carMinSeatsTextField = new javax.swing.JTextField();
        carMaxSeatsTextField = new javax.swing.JTextField();
        carSerialNumberTextField = new javax.swing.JTextField();
        carModelNumberTextField = new javax.swing.JTextField();
        carCityTextField = new javax.swing.JTextField();
        carManufacturerTextField = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        radioYes = new javax.swing.JCheckBox();
        radioNo = new javax.swing.JCheckBox();
        radioTrue = new javax.swing.JCheckBox();
        radioFalse = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 36)); // NOI18N
        jLabel1.setText("Create ");

        jLabel2.setText("Car Name  :");

        jLabel3.setText("Certificate Available?  :");

        jLabel4.setText("Brand  :");

        jLabel5.setText("Availability  :");

        jLabel6.setText("City Available in  :");

        jLabel7.setText("Manufacturer  :");

        jLabel8.setText("Manufacture Year  :");

        jLabel9.setText("Minumum seats  :");

        jLabel10.setText("Maximum Seats  :");

        jLabel11.setText("Serial Number  :");

        jLabel12.setText("Model Number  :");

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        buttonGroup3.add(radioYes);
        radioYes.setText("Yes");
        radioYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioYesActionPerformed(evt);
            }
        });

        buttonGroup3.add(radioNo);
        radioNo.setText("No");

        buttonGroup4.add(radioTrue);
        radioTrue.setText("Yes");

        buttonGroup4.add(radioFalse);
        radioFalse.setText("No");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(carManufacturerTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(carCityTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(carModelNumberTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(carSerialNumberTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(carMaxSeatsTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(carMinSeatsTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(carManufYearTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(carBrandTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(carNameTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(259, 259, 259))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(radioTrue)
                                    .addGap(18, 18, 18)
                                    .addComponent(radioFalse))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(radioYes)
                                    .addGap(18, 18, 18)
                                    .addComponent(radioNo))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                    .addGroup(layout.createSequentialGroup()
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                            .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                    .addComponent(jLabel2)
                                                                                    .addComponent(carNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jLabel4))
                                                                            .addComponent(carBrandTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(jLabel8))
                                                                    .addComponent(carManufYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel9))
                                                            .addComponent(carMinSeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel10))
                                                    .addComponent(carMaxSeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel11))
                                            .addComponent(carSerialNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel12))
                                    .addComponent(carModelNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addComponent(carCityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(carManufacturerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioYes)
                    .addComponent(radioNo)
                    .addComponent(jLabel5))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioTrue)
                    .addComponent(radioFalse)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        String name = carNameTextField.getText();  
        if(name == null || name.equals("")){
        JOptionPane.showMessageDialog(null, "Name can't be empty");
        return;
        }
        
        String brand = carBrandTextField.getText();
        if(brand == null || brand.equals("")){
        JOptionPane.showMessageDialog(null, "Brand can't be empty");
        return;
        }
        
        String year = (carManufYearTextField.getText());
        if(year == null || year.equals("")){
        JOptionPane.showMessageDialog(null, "Year can't be empty");
        return;
        }
        
        String minSeats = (carMinSeatsTextField.getText());
        if(minSeats == null || minSeats.equals("")){
        JOptionPane.showMessageDialog(null, "Seats can't be empty");
        return;
        }
        
        String maxSeats = (carMinSeatsTextField.getText());
        if(maxSeats == null || maxSeats.equals("")){
        JOptionPane.showMessageDialog(null, "Seats can't be empty");
        return;
        }
        
        String serialNumber = (carSerialNumberTextField.getText());
        if(serialNumber == null || serialNumber.equals("")){
        JOptionPane.showMessageDialog(null, "Serial Number can't be empty");
        return;
        }
        
        String modelNumber = carModelNumberTextField.getText();
        if(modelNumber == null || modelNumber.equals("")){
        JOptionPane.showMessageDialog(null, "Model Number can't be empty");
        return;
        }
        
        String city = carCityTextField.getText();
        if(city == null || city.equals("")){
        JOptionPane.showMessageDialog(null, "City can't be empty");
        return;
        }
        
        String manufacturer = carManufacturerTextField.getText();
        if(manufacturer == null || manufacturer.equals("")){
        JOptionPane.showMessageDialog(null, "Car Manufacturer can't be empty");
        return;
        }
        
        try{
               Integer.parseInt(carManufYearTextField.getText());
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Enter number for Year");
            }
        
        try{
               Integer.parseInt(carMinSeatsTextField.getText());
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Enter number for Min seats");
            }
        
        try{
               Integer.parseInt(carMaxSeatsTextField.getText());
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Enter number for Max seats");
            }
        
        try{
               Integer.parseInt(carSerialNumberTextField.getText());
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Enter number for Serial Number");
            }
        if(radioYes.isSelected()== false && radioNo.isSelected() == false ){
            JOptionPane.showMessageDialog(null,"Please select the availability");
            return;
        }
        
        if(radioTrue.isSelected()== false && radioFalse.isSelected() == false ){
            JOptionPane.showMessageDialog(null,"Please select the status of maintenance certificate ");
            return;
        }
        
        
        
        
        Uber uber = uberDirectory.addCar();
        uber.setCarName(name);
        uber.setCarBrand(brand);
        uber.setCarManufacYear(Integer.parseInt(carManufYearTextField.getText()));
        uber.setCarMinSeats(Integer.parseInt(carMinSeatsTextField.getText()));
        uber.setCarMaxSeats(Integer.parseInt(carMaxSeatsTextField.getText()));
        uber.setCarSerialNum(Integer.parseInt(carSerialNumberTextField.getText()));
        uber.setCarModelNum(modelNumber);
        uber.setCarAvailableCity(city);
        uber.setCarManufacturer(manufacturer);
        uber.setCarAvailability(radioYes.isSelected());
        uber.setCarMaintenanceCertificate(radioTrue.isSelected());
        JOptionPane.showMessageDialog(null,"Car Created Successfully");
    }//GEN-LAST:event_btnCreateActionPerformed

    private void radioYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioYesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioYesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JTextField carBrandTextField;
    private javax.swing.JTextField carCityTextField;
    private javax.swing.JTextField carManufYearTextField;
    private javax.swing.JTextField carManufacturerTextField;
    private javax.swing.JTextField carMaxSeatsTextField;
    private javax.swing.JTextField carMinSeatsTextField;
    private javax.swing.JTextField carModelNumberTextField;
    private javax.swing.JTextField carNameTextField;
    private javax.swing.JTextField carSerialNumberTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JCheckBox radioFalse;
    private javax.swing.JCheckBox radioNo;
    private javax.swing.JCheckBox radioTrue;
    private javax.swing.JCheckBox radioYes;
    // End of variables declaration//GEN-END:variables
}
