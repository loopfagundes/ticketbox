package br.com.dbserver.utils;

import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.service.ExtentService;
import com.aventstack.extentreports.service.ExtentTestManager;

import java.io.OutputStream;
import java.io.PrintStream;

public class PrintStreamExtent extends PrintStream {
    public PrintStreamExtent(OutputStream out) {
        super(out);
    }

    @Override
    public void println(String linha) {
        if(ExtentService.getInstance() != null) {
            ExtentTestManager.getTest().info(MarkupHelper.createCodeBlock(linha));
        }
        super.println(linha);
    }
}