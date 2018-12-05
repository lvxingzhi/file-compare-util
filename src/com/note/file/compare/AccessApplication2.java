package com.note.file.compare;
import com.note.file.compare.ui.CompareButton;
import com.note.file.compare.ui.MainFrame;
import com.note.file.compare.ui.MainPanel;
import com.note.file.compare.util.FileCompareUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Set;

/**
 * @author xingzhi.lv
 * @description
 * @since 2018/12/5 17:06
 */
public class AccessApplication2 {
    public static void main(String[] args) throws IOException {
        MainFrame mainFrame = new MainFrame();
        MainPanel mainPanel = new MainPanel();
        GridLayout gridLayout = new GridLayout(3,1,5,5);
        mainPanel.setLayout(gridLayout);
        mainFrame.getContentPane().add(mainPanel, BorderLayout.CENTER);

        MainPanel mainPanel1 = new MainPanel();
        FlowLayout flowLayout = new FlowLayout();
        mainPanel1.setLayout(flowLayout);
        MainPanel mainPanel2 = new MainPanel();
        GridLayout gridLayout2 = new GridLayout(2,2,5,5);
        mainPanel2.setLayout(gridLayout2);
        MainPanel mainPanel3 = new MainPanel();
        GridLayout gridLayout3 = new GridLayout(1,2,10,10);
        mainPanel3.setLayout(gridLayout3);

        mainPanel.add(mainPanel1);
        mainPanel.add(mainPanel2);
        mainPanel.add(mainPanel3);
        JButton submit = new JButton("1");
        submit.setPreferredSize(new Dimension(60,60));
        mainPanel1.add(submit);
        mainPanel2.add(new JLabel("左文件路径"));
        mainPanel2.add(new JTextField("2"));
        mainPanel2.add(new JLabel("右文件路径"));
        mainPanel2.add(new JTextField("2"));
        mainPanel3.add(new JTextArea("3"));
        mainPanel3.add(new JTextArea("3"));






        mainFrame.setSize(400, 300);//设置长和宽
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true); //设置窗口的可见性
    }
}
