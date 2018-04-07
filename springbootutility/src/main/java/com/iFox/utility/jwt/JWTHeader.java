package com.iFox.utility.jwt;

/**
 * jwt头部
 *@author exphuhong
 *@since  12:18 2018/4/7
 *
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
