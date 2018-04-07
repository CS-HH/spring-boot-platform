package com.iFox.utility.jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.impl.PublicClaims;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

public class JWTUtils {

    /**
     * @param jwtHeader
     * @param jwtPayload
     * @param secret
     * @author exphuhong
     * @description 生成jwt
     * @date 21:40
     */
    public static String generateJWT(JWTHeader jwtHeader, JWTPayload jwtPayload, String secret) throws UnsupportedEncodingException {

        /**
         *通过HMAC256算法加密密钥
         *
         * */
        Algorithm algorithm = Algorithm.HMAC256(secret);
        Map<String, Object> headerMap = new HashMap<>();
        headerMap.put(PublicClaims.ALGORITHM, jwtHeader.getAlg());
        headerMap.put(PublicClaims.TYPE, jwtHeader.getTyp());

        return JWT.create()
                .withHeader(headerMap)
                .withIssuer(jwtPayload.getIss())
                .withIssuedAt(jwtPayload.getIat())
                .withExpiresAt(jwtPayload.getExp())
                .withNotBefore(jwtPayload.getNbf())
                .withJWTId(jwtPayload.getJti())
                .withAudience(jwtPayload.getAud())
                .withSubject(jwtPayload.getSub())
                .sign(algorithm);

    }

    /**
     * 验证token
     *
     * @author exphuhong
     * @since 18:53 2018/4/6
     */
    public static DecodedJWT verifyToken(String token, String secret) throws UnsupportedEncodingException {
        Algorithm algorithm = Algorithm.HMAC256(secret);
        JWTVerifier jwtVerifier = JWT.require(algorithm).build();
        return jwtVerifier.verify(token);
    }



}

