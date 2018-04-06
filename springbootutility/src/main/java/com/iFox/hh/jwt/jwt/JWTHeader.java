package com.iFox.hh.jwt.jwt;
/**
 *@author exphuhong
 *@description jwt头部
 *@param
 *@date 21:24
 */
public class JWTHeader {

    private String alg = "HS256";

    public String getAlg() {
        return alg;
    }

    public void setAlg(String alg) {
        this.alg = alg;
    }

    public String getTyp() {
        return "JWT";
    }
}
