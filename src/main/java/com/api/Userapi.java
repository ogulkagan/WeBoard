/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api;

import Model.User;
import com.google.gson.Gson;
import javax.ws.rs.Path;
import com.dao.Userdao;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("user")
public class Userapi {
     @Context
    private transient HttpServletRequest servletRequest;
@POST
    @Path("/login")
    @Produces(MediaType.APPLICATION_JSON)
    public String Login(@FormParam("email") String email,
        @FormParam("password") String password) {
        String deneme="";
        Userdao userdao = new Userdao();
        try {
            deneme = userdao.Login(email,password);
            Gson gson = new Gson();
            String value = gson.toJson(deneme);

            return deneme;
        } catch (WebApplicationException e) {
            String value = gson.toJson(deneme);

            return value;

        }
    }


    @POST
    @Path("/id")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getid() {
        List<User> id = new ArrayList<>();
        Userdao serdao = new Userdao();
        try {


            id = serdao.getid();
            Gson gson = new Gson();
            String value = gson.toJson(id);
            return Response.ok(value).build();
        } catch (WebApplicationException e) {
            String value = gson.toJson(id);

            return Response.ok(value).build();

        }
    }

}