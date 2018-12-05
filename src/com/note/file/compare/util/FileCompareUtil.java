package com.note.file.compare.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * @author xingzhi.lv
 * @description
 * @since 2018/12/5 16:30
 */
public class FileCompareUtil {

    /**
     * 返回源文件多出来的行
     * @return
     */
    public Set<String> buildSourceMore(String sourcePath,String targetPath) throws IOException {

        File source = new File(sourcePath);
        File target = new File(targetPath);

        Set<String> resultSet = new HashSet<>();
        Set<String> sourceSet = new HashSet<>();
        FileReader sourceReader = new FileReader(source);
        BufferedReader sourceBufferedReader = new BufferedReader(sourceReader);

        String sourceContext = "";
        while((sourceContext = sourceBufferedReader.readLine())!=null ){
            sourceSet.add(sourceContext);
        }

        Set<String> targetSet = new HashSet<>();
        FileReader targetReader = new FileReader(target);
        BufferedReader targetBufferedReader = new BufferedReader(targetReader);

        String targetContext = "";
        while((targetContext = targetBufferedReader.readLine())!=null ){
            targetSet.add(targetContext);
        }
        sourceSet.forEach(s->{
            s = s.replace(" ","");
            if (!targetSet.contains(s)){
                resultSet.add(s);
            }
        });

        return resultSet;
    }

}
