package com.iFox.hh.model;

public class UserRole {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role.userId
     *
     * @mbggenerated Sat Apr 14 15:21:15 CST 2018
     */
    private Integer userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role.roleId
     *
     * @mbggenerated Sat Apr 14 15:21:15 CST 2018
     */
    private Integer roleid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role.userId
     *
     * @return the value of user_role.userId
     *
     * @mbggenerated Sat Apr 14 15:21:15 CST 2018
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role.userId
     *
     * @param userid the value for user_role.userId
     *
     * @mbggenerated Sat Apr 14 15:21:15 CST 2018
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role.roleId
     *
     * @return the value of user_role.roleId
     *
     * @mbggenerated Sat Apr 14 15:21:15 CST 2018
     */
    public Integer getRoleid() {
        return roleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role.roleId
     *
     * @param roleid the value for user_role.roleId
     *
     * @mbggenerated Sat Apr 14 15:21:15 CST 2018
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }
}