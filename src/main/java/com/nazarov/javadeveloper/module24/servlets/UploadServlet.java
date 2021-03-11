package com.nazarov.javadeveloper.module24.servlets;

import com.google.gson.Gson;
import com.nazarov.javadeveloper.module24.dto.UserData;
import com.nazarov.javadeveloper.module24.entity.File;
import com.nazarov.javadeveloper.module24.service.MainService;
import com.nazarov.javadeveloper.module24.service.impl.MainServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class UploadServlet extends HttpServlet {
    private MainService mainService;

    @Override
    public void init() throws ServletException {
        this.mainService = new MainServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader br = req.getReader();
        Gson gson = new Gson();
        UserData userData = gson.fromJson(br, UserData.class);
        File file = mainService.upload(userData);
        if(file == null){
            resp.setStatus(404);
            throw new Error("Don't worry, be happy!");
        }

        resp.setContentType("text/html");
        
        PrintWriter pw = resp.getWriter();
        String style = "<style type=\"text/css\">\n" +
                "   .block1 { \n" +
                "    width: 200px; \n" +
                "    background: #ccc;\n" +
                "    padding: 5px;\n" +
                "    padding-right: 20px; \n" +
                "    border: solid 1px black; \n" +
                "    float: left";
        String head = "        <!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>UploadRequest</title>\n" +
                "</head>";
        String body = "<body >\n" +
                "<div class=\"block1\">" +
                "File name: " + file.getFileName() + "\n" +
                "File size: " + file.getSize() + "\n" +
                "File status: " + file.getStatus() + "\n" +
                "File created: " + file.getCreated() + "\n" +
                "File last modified: " + file.getLastModified() + "\n" +
                "</div>" +
                "</body >";
        String footer = "</html >";

        pw.println(head + body + footer);
        resp.setStatus(200);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}