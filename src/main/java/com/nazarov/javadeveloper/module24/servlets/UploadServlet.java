package com.nazarov.javadeveloper.module24.servlets;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
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
//    private MainService mainService;
//
//    @Override
//    public void init() throws ServletException {
//        this.mainService = new MainServiceImpl();
//    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader br = req.getReader();

        Gson gson = new Gson();
        JsonReader jr = gson.newJsonReader(br);
        jr.beginObject();
        while (jr.hasNext()){
            System.out.println(jr.nextString());
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}