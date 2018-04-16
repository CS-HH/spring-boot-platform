package com.iFox.utility.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class MD5UtilsTest {

    @Test
    public void md5Message() {
        String s = MD5Utils.md5Message("123456");
        System.out.println(s);
    }
}