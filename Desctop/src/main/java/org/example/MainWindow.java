package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MainWindow extends JFrame{

    Label lastName = new Label("Имя: ");
    Label firstName = new Label("Фамилия: ");
    Label age = new Label("Возраст: ");
    Label result = new Label("Результат: ");

    TextField textLast = new TextField();
    TextField textFirst = new TextField();
    TextField textAge = new TextField();

    public MainWindow() throws HeadlessException
    {
        this.setBounds(200,200,400,500);
        this.setTitle("AWT-Abstract Window Toolkit");
        //Button button = new Button("Кнопка");
        //add(button);
        //button.setBounds(50,50,100,50);

        //result = new Label();

        Button btnSubmit = new Button("Submit");
        Button btnReset = new Button("Reset");

        //lastName.setBounds(30,50,100,32);
        //firstName.setBounds(30,100,100,32);
        //age.setBounds(30,150,100,32);

        //textLast.setBounds(200,50,100,30);
        //textFirst.setBounds(200,100,100,30);
        //textAge.setBounds(200,150,100,30);

        //btnSubmit.setBounds(50,200,100,50);
        //btnReset.setBounds(200,200,100,50);
        
        this.add(lastName);
        this.add(textLast);

        this.add(firstName);
        this.add(textFirst);

        this.add(age);
        this.add(textAge);

        this.add(btnSubmit);
        this.add(btnReset);
        this.add(result);

        btnSubmit.addActionListener(this::btnSubmitHandler);
        //this.addWindowListener(new WindowListener() {
            //@Override
            //public void windowOpened(WindowEvent e) {
            //}
            //@Override
            //public void windowClosing(WindowEvent e) {
                //dispose();
            //}
            //@Override
            //public void windowClosed(WindowEvent e) {
            //}
            //@Override
            //public void windowIconified(WindowEvent e) {
            //}
            //@Override
            //public void windowDeiconified(WindowEvent e) {
            //}
            //@Override
           // public void windowActivated(WindowEvent e) {
            //}
            //@Override
            //public void windowDeactivated(WindowEvent e) {
            //}
        //});

        GridLayout grid = new GridLayout(5, 2,10,50);
        //this.setLayout(new GridLayout(4,2,20,50));
        this.setLayout(grid);
        this.setVisible(true);
    }

    private void btnSubmitHandler(ActionEvent e)
    {
        String results = textLast.getText() + " " + textFirst.getText() + " " + textAge.getText();
        this.result.setText(results);
    }

    //public void btnSubmitHandler(ActiveEvent e)
    //{
        //String results = "";
        //this.result.setText("Submit");
    //}



}

