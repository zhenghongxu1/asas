package com.chinasofti.pojo;

import java.io.Serializable;

public class Faceuser implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column faceuser.id
     *
     * @mbg.generated Mon Sep 30 22:46:52 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column faceuser.user_id
     *
     * @mbg.generated Mon Sep 30 22:46:52 CST 2019
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column faceuser.base64
     *
     * @mbg.generated Mon Sep 30 22:46:52 CST 2019
     */
    private String base64;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table faceuser
     *
     * @mbg.generated Mon Sep 30 22:46:52 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column faceuser.id
     *
     * @return the value of faceuser.id
     *
     * @mbg.generated Mon Sep 30 22:46:52 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column faceuser.id
     *
     * @param id the value for faceuser.id
     *
     * @mbg.generated Mon Sep 30 22:46:52 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column faceuser.user_id
     *
     * @return the value of faceuser.user_id
     *
     * @mbg.generated Mon Sep 30 22:46:52 CST 2019
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column faceuser.user_id
     *
     * @param userId the value for faceuser.user_id
     *
     * @mbg.generated Mon Sep 30 22:46:52 CST 2019
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column faceuser.base64
     *
     * @return the value of faceuser.base64
     *
     * @mbg.generated Mon Sep 30 22:46:52 CST 2019
     */
    public String getBase64() {
        return base64;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column faceuser.base64
     *
     * @param base64 the value for faceuser.base64
     *
     * @mbg.generated Mon Sep 30 22:46:52 CST 2019
     */
    public void setBase64(String base64) {
        this.base64 = base64 == null ? null : base64.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table faceuser
     *
     * @mbg.generated Mon Sep 30 22:46:52 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", base64=").append(base64);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}