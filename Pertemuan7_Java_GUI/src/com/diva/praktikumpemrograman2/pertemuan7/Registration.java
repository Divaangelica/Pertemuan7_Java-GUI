package com.diva.praktikumpemrograman2.pertemuan7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registration extends JFrame {

    private JTextField namaLengkapTextField;
    private JPasswordField passwordField;
    private JRadioButton lakiLakiRadioButton;
    private JRadioButton perempuanRadioButton;
    private JComboBox kelasComboBox;
    private JCheckBox mainGameCheckBox;
    private JCheckBox nontonCheckBox;
    private JCheckBox membacaCheckBox;
    private JCheckBox jajanCheckBox;
    private JSpinner usiaSpinner;
    private JSlider beratbadanSlider;
    private JSlider tinggibadanSlider;
    private JTextArea alamatTextArea;
    private JButton SUBMITButton;
    private JLabel namaLengkapLabel;
    private JLabel passwordLabel;
    private JLabel jenisKelaminLabel;
    private JLabel kelasLabel;
    private JLabel hobiLabel;
    private JLabel usiaLabel;
    private JLabel beratBadanLabel;
    private JLabel tinggiBadanLabel;
    private JLabel alamatLabel;
    private JPanel MenuPanel;
    private ButtonGroup genderGroup;

    public Registration() {
        //Menentukan judul aplikasi
        super("Form Registrasi");

        //Menentukan apa yang terjadi jika tombol [X] ditekan
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Menentukan resolusi window/frame
        this.setSize(600, 720);

        //Menentukan panel mana yang akan dijadikan konten (paten/tidak custumize)
        this.setContentPane(MenuPanel);

        //Menentukan apa yang terjadi jika tombol submit di klik
        SUBMITButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Mengambil nilai dari textfield nama
                String nama = namaLengkapTextField.getText();

                //Mengambil nilai dari password
                char[] password = passwordField.getPassword();

                //Mengambil nilai dari radiobutton jeniskelamin
                String jk = "";

                if (lakiLakiRadioButton.isSelected()) {
                    jk = lakiLakiRadioButton.getText();
                } else if (perempuanRadioButton.isSelected()) {
                    jk = perempuanRadioButton.getText();
                }

                //Mengambil nilai dari combobox kelas
                String kelas = (String) kelasComboBox.getSelectedItem();

                //Mengambil nilai dari checkbox hobi
                boolean hobiMainGame = mainGameCheckBox.isSelected();
                boolean nonton = nontonCheckBox.isSelected();
                boolean membaca = membacaCheckBox.isSelected();
                boolean jajan = jajanCheckBox.isSelected();

                //Mengambil nilai dari spinner usia
                int usia = (int) usiaSpinner.getValue();

                //Mengambil nilai dari slider beratbadan
                int beratbadan = beratbadanSlider.getValue();

                //Mengatur max dan min dari slider
                tinggibadanSlider.setMaximum(200);
                int tinggibadan = tinggibadanSlider.getValue();

                //Mengambil nilai dari text area alamat
                String alamat = alamatTextArea.getText();

                JOptionPane.showMessageDialog(null, "Submit data " + nama + " berhasil!");

            }
        });
    }

    public static void main(String[] args) {
        JFrame mainFrame = new Registration();
        mainFrame.setVisible(true);
    }
}
