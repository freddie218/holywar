package com.fasheng.service.model;

import java.util.Date;

public class UserCatogeryConcernDO extends BaseDO<Integer>{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_catogery_concern.id
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_catogery_concern.user_id
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_catogery_concern.msg_catogery_id
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    private Integer msgCatogeryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_catogery_concern.gmt_create
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_catogery_concern.gmt_update
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    private Date gmtUpdate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_catogery_concern.id
     *
     * @return the value of user_catogery_concern.id
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_catogery_concern.id
     *
     * @param id the value for user_catogery_concern.id
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_catogery_concern.user_id
     *
     * @return the value of user_catogery_concern.user_id
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_catogery_concern.user_id
     *
     * @param userId the value for user_catogery_concern.user_id
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_catogery_concern.msg_catogery_id
     *
     * @return the value of user_catogery_concern.msg_catogery_id
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public Integer getMsgCatogeryId() {
        return msgCatogeryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_catogery_concern.msg_catogery_id
     *
     * @param msgCatogeryId the value for user_catogery_concern.msg_catogery_id
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public void setMsgCatogeryId(Integer msgCatogeryId) {
        this.msgCatogeryId = msgCatogeryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_catogery_concern.gmt_create
     *
     * @return the value of user_catogery_concern.gmt_create
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_catogery_concern.gmt_create
     *
     * @param gmtCreate the value for user_catogery_concern.gmt_create
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_catogery_concern.gmt_update
     *
     * @return the value of user_catogery_concern.gmt_update
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public Date getGmtUpdate() {
        return gmtUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_catogery_concern.gmt_update
     *
     * @param gmtUpdate the value for user_catogery_concern.gmt_update
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public void setGmtUpdate(Date gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }
}