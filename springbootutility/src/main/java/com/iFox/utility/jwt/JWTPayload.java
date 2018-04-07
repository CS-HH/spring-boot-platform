package com.iFox.utility.jwt;

import java.util.Date;

public class JWTPayload {

    //***************************** JWT标准字段 ****************************/

    /**
     * 签发者 issuer
     */
    private String iss;

    /**
     * 签发时间(时间戳) issued at
     */
    private Date iat;

    /**
     * 过期时间(时间戳) expire
     * 为防止Replay Attacks, 过期时间应该设置的比较短，比如exp = iat + 2(s)
     */
    private Date exp;

    /**
     * not before(时间戳)
     * 如果当前时间在nbf里的时间之前，则Token不被接受
     */
    private Date nbf;

    /**
     * JWT ID
     * 当前token的唯一标识, 使用UUID
     */
    private String jti;
    /**
     * 接收方 Audience

     */
    private String[] aud;

    /**
     * 面向的用户 Subject
     */
    private String sub;


    public String getIss() {
        return iss;
    }

    public void setIss(String iss) {
        this.iss = iss;
    }

    public Date getIat() {
        return iat;
    }

    public void setIat(Date iat) {
        this.iat = iat;
    }

    public Date getExp() {
        return exp;
    }

    public void setExp(Date exp) {
        this.exp = exp;
    }

    public Date getNbf() {
        return nbf;
    }

    public void setNbf(Date nbf) {
        this.nbf = nbf;
    }

    public String getJti() {
        return jti;
    }

    public void setJti(String jti) {
        this.jti = jti;
    }

    public String[] getAud() {
        return aud;
    }

    public void setAud(String[] aud) {
        this.aud = aud;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }



}
