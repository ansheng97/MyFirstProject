package com.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        // 1. 获取桌面上 test.txt 的完整路径
        // 把 "你的用户名" 换成你自己的 Windows 用户名
        String filePath = "C:\\Users\\anshe\\Desktop\\肿瘤科统计语句.txt";

        // 2. 用 try-with-resources 自动关闭文件流（推荐写法）
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNum = 1;

            // 3. 逐行读取，直到读完
            while ((line = reader.readLine()) != null) {
                System.out.println("第 " + lineNum + " 行：" + line);
                lineNum++;
            }

        } catch (IOException e) {
            // 4. 如果文件不存在或读取失败，打印错误信息
            System.err.println("读取文件失败，请检查文件路径是否正确！");
            e.printStackTrace();
        }
    }
}