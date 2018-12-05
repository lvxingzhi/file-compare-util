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
public class AccessApplication {
    public static void main(String[] args) throws IOException {
        MainFrame mainFrame = new MainFrame();
        MainPanel mainPanel = new MainPanel();
        GridLayout gridLayout = new GridLayout(3,2);
        mainPanel.setLayout(gridLayout);
        mainFrame.getContentPane().add(mainPanel, BorderLayout.CENTER);

        CompareButton compareButton = new CompareButton();
        mainPanel.add(compareButton);
        mainPanel.add(new JPanel());
        JTextField sourcefield =new JTextField("D:\\workspace\\file-compare\\src\\source.txt");
        mainPanel.add(sourcefield);
        JTextField targetfield =new JTextField("D:\\workspace\\file-compare\\src\\target.txt");
        mainPanel.add(targetfield);

        JTextField deffSourceText =new JTextField();
        mainPanel.add(deffSourceText);

        JTextField deffTargetText =new JTextField();
        mainPanel.add(deffTargetText);

        compareButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("开始比对");
                System.out.println("源文件目录:"+sourcefield.getText());
                System.out.println("目标文件路径:"+targetfield.getText());
                Set<String> sourceResultSet = null;
                try {
                    sourceResultSet = new FileCompareUtil().buildSourceMore(sourcefield.getText(),targetfield.getText());
                } catch (IOException e1) {
                }
                String[] showSourceDiffText = {""};
                sourceResultSet.forEach(s->{
                    showSourceDiffText[0] +="\r"+s;
                });
                deffSourceText.setText(showSourceDiffText[0]);

                Set<String> targetResultSet = null;
                try {
                    targetResultSet = new FileCompareUtil().buildSourceMore(targetfield.getText(),sourcefield.getText());
                } catch (IOException e1) {
                }
                String[] showTargetDiffText = {""};
                targetResultSet.forEach(s->{
                    showTargetDiffText[0] +="\r"+s;
                });
                deffTargetText.setText(showTargetDiffText[0]);
            }
        });


        mainFrame.setSize(400, 300);//设置长和宽
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true); //设置窗口的可见性
    }
}
