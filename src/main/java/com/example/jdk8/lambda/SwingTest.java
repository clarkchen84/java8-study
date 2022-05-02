package com.example.jdk8.lambda;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 一个关于使用匿名内部类和lamda表达式比较的简单例子
 */
public class SwingTest {
    public static void main(String[] args) {
        createSwingByAnonymousInnerClass();
        //createSwingByLambda();
    }


    /**
     * 创建一个Swing 画面， 事件使用java 内部类的方式
     */
    public static void createSwingByAnonymousInnerClass(){
        JFrame jFrame = new JFrame("My JFrame");
        JButton jButton =new JButton("Test");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Test pressed");
            }
        });
        jFrame.add(jButton);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    /**
     * 创建一个Swing 画面， 事件使用lambda的方式
     */
    public static void createSwingByLambda(){
        JFrame jFrame = new JFrame("My JFrame");
        JButton jButton =new JButton("Test");
        jButton.addActionListener(e -> System.out.println("Test pressed"));
        jFrame.add(jButton);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
