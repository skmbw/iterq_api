package com.vteba.iterq.api.question.model;

import java.util.Date;

public class Question {
    /**
     * order by 排序语句
     * 对应数据库表字段 question
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 question
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 question
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 question
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 question.id
     */
    private String id;

    /**
     * 对应数据库表字段 question.user_id
     */
    private String userId;

    /**
     * 对应数据库表字段 question.user_name
     */
    private String userName;

    /**
     * 对应数据库表字段 question.nick_name
     */
    private String nickName;

    /**
     * 对应数据库表字段 question.ask_time
     */
    private Date askTime;

    /**
     * 对应数据库表字段 question.answer_time
     */
    private Date answerTime;

    /**
     * 对应数据库表字段 question.response_time
     */
    private Integer responseTime;

    /**
     * 对应数据库表字段 question.answer_id
     */
    private String answerId;

    /**
     * 对应数据库表字段 question.answer_name
     */
    private String answerName;

    /**
     * 对应数据库表字段 question.state
     */
    private Integer state;

    /**
     * 对应数据库表字段 question.close_time
     */
    private Date closeTime;

    /**
     * 对应数据库表字段 question.used_time
     */
    private Long usedTime;

    /**
     * 对应数据库表字段 question.communication
     */
    private Integer communication;

    /**
     * 对应数据库表字段 question.platform
     */
    private Integer platform;

    /**
     * 设置 order by 排序语句
     */
    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    /**
     * 获得 order by 排序语句
     */
    public String getOrderBy() {
        return orderBy;
    }

    /**
     * 设置 start，分页开始记录
     */
    public void setStart(Integer start) {
        this.start = start;
    }

    /**
     * 获得 start，分页开始记录
     */
    public Integer getStart() {
        return start;
    }

    /**
     * 设置 pageSize，分页大小
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 获得 pageSize，分页大小
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * 设置 distinct，是否去重
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 获得 distinct，是否去重
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 获得字段 question.id 的值
     *
     * @return the value of question.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 question.id 的值
     *
     * @param id the value for question.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 question.user_id 的值
     *
     * @return the value of question.user_id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置字段 question.user_id 的值
     *
     * @param userId the value for question.user_id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获得字段 question.user_name 的值
     *
     * @return the value of question.user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置字段 question.user_name 的值
     *
     * @param userName the value for question.user_name
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获得字段 question.nick_name 的值
     *
     * @return the value of question.nick_name
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置字段 question.nick_name 的值
     *
     * @param nickName the value for question.nick_name
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获得字段 question.ask_time 的值
     *
     * @return the value of question.ask_time
     */
    public Date getAskTime() {
        return askTime;
    }

    /**
     * 设置字段 question.ask_time 的值
     *
     * @param askTime the value for question.ask_time
     */
    public void setAskTime(Date askTime) {
        this.askTime = askTime;
    }

    /**
     * 获得字段 question.answer_time 的值
     *
     * @return the value of question.answer_time
     */
    public Date getAnswerTime() {
        return answerTime;
    }

    /**
     * 设置字段 question.answer_time 的值
     *
     * @param answerTime the value for question.answer_time
     */
    public void setAnswerTime(Date answerTime) {
        this.answerTime = answerTime;
    }

    /**
     * 获得字段 question.response_time 的值
     *
     * @return the value of question.response_time
     */
    public Integer getResponseTime() {
        return responseTime;
    }

    /**
     * 设置字段 question.response_time 的值
     *
     * @param responseTime the value for question.response_time
     */
    public void setResponseTime(Integer responseTime) {
        this.responseTime = responseTime;
    }

    /**
     * 获得字段 question.answer_id 的值
     *
     * @return the value of question.answer_id
     */
    public String getAnswerId() {
        return answerId;
    }

    /**
     * 设置字段 question.answer_id 的值
     *
     * @param answerId the value for question.answer_id
     */
    public void setAnswerId(String answerId) {
        this.answerId = answerId;
    }

    /**
     * 获得字段 question.answer_name 的值
     *
     * @return the value of question.answer_name
     */
    public String getAnswerName() {
        return answerName;
    }

    /**
     * 设置字段 question.answer_name 的值
     *
     * @param answerName the value for question.answer_name
     */
    public void setAnswerName(String answerName) {
        this.answerName = answerName;
    }

    /**
     * 获得字段 question.state 的值
     *
     * @return the value of question.state
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置字段 question.state 的值
     *
     * @param state the value for question.state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获得字段 question.close_time 的值
     *
     * @return the value of question.close_time
     */
    public Date getCloseTime() {
        return closeTime;
    }

    /**
     * 设置字段 question.close_time 的值
     *
     * @param closeTime the value for question.close_time
     */
    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    /**
     * 获得字段 question.used_time 的值
     *
     * @return the value of question.used_time
     */
    public Long getUsedTime() {
        return usedTime;
    }

    /**
     * 设置字段 question.used_time 的值
     *
     * @param usedTime the value for question.used_time
     */
    public void setUsedTime(Long usedTime) {
        this.usedTime = usedTime;
    }

    /**
     * 获得字段 question.communication 的值
     *
     * @return the value of question.communication
     */
    public Integer getCommunication() {
        return communication;
    }

    /**
     * 设置字段 question.communication 的值
     *
     * @param communication the value for question.communication
     */
    public void setCommunication(Integer communication) {
        this.communication = communication;
    }

    /**
     * 获得字段 question.platform 的值
     *
     * @return the value of question.platform
     */
    public Integer getPlatform() {
        return platform;
    }

    /**
     * 设置字段 question.platform 的值
     *
     * @param platform the value for question.platform
     */
    public void setPlatform(Integer platform) {
        this.platform = platform;
    }
}