package com.note.file.compare.ui;

import javax.swing.*;
import java.awt.*;

/**
 * @author xingzhi.lv
 * @description
 * @since 2018/12/5 17:15
 */
public class CompareButton extends JButton{
    public CompareButton() {
        super();
        this.setText("开始比对");
        Dimension preferredSize = new Dimension(20,20);
        this.setPreferredSize(preferredSize );
    }
}
