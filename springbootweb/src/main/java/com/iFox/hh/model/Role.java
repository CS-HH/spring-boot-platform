package com.iFox.hh.model;

public class Role {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.id
     *
     * @mbggenerated Sat Apr 14 15:21:15 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.roleDesc
     *
     * @mbggenerated Sat Apr 14 15:21:15 CST 2018
     */
    private String roledesc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.id
     *
     * @return the value of role.id
     *
     * @mbggenerated Sat Apr 14 15:21:15 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.id
     *
     * @param id the value for role.id
     *
     * @mbggenerated Sat Apr 14 15:21:15 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.roleDesc
     *
     * @return the value of role.roleDesc
     *
     * @mbggenerated Sat Apr 14 15:21:15 CST 2018
     */
    public String getRoledesc() {
        return roledesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.roleDesc
     *
     * @param roledesc the value for role.roleDesc
     *
     * @mbggenerated Sat Apr 14 15:21:15 CST 2018
     */
    public void setRoledesc(String roledesc) {
        this.roledesc = roledesc;
    }
}