package com.vteba.iterq.api.question.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuestionBean {
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
     * 是否指定 distinct 去除重复
     * 对应数据库表字段 question
     */
    private boolean distinct;

    /**
     * 逻辑or语句
     * 对应数据库表字段 question
     */
    private List<Criteria> oredCriteria;

    /**
     */
    public QuestionBean() {
        oredCriteria = new ArrayList<Criteria>();
    }

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
     * 设置是否指定 distinct 去除重复
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 是否设置了distinct语句，true是，false否。
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 获得逻辑or语句
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 添加逻辑or语句
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 添加逻辑and语句
     */
    public void and(Criteria criteria) {
        criteria.setAndRelation(true);
        oredCriteria.add(criteria);
    }

    /**
     * 新建逻辑或or语句
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 新建逻辑and语句
     */
    public Criteria and() {
        Criteria criteria = createCriteriaInternal();
        criteria.setAndRelation(true);
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 创建查询条件，如果逻辑或为空，同时将查询条件放入。
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * 创建新查询条件。
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 清除逻辑或or语句，并且distinct为false，不去重。
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * 该类对应数据库表 question
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void orCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition, true));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void orCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value, true));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void orCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2, true));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria orIdIsNull() {
            orCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria orIdIsNotNull() {
            orCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria orIdEqualTo(String value) {
            orCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria orIdNotEqualTo(String value) {
            orCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria orIdGreaterThan(String value) {
            orCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria orIdGreaterThanOrEqualTo(String value) {
            orCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria orIdLessThan(String value) {
            orCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria orIdLessThanOrEqualTo(String value) {
            orCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria orIdLike(String value) {
            orCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria orIdNotLike(String value) {
            orCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria orIdIn(List<String> values) {
            orCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria orIdNotIn(List<String> values) {
            orCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria orIdBetween(String value1, String value2) {
            orCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria orIdNotBetween(String value1, String value2) {
            orCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria orUserIdIsNull() {
            orCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria orUserIdIsNotNull() {
            orCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria orUserIdEqualTo(String value) {
            orCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria orUserIdNotEqualTo(String value) {
            orCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria orUserIdGreaterThan(String value) {
            orCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria orUserIdGreaterThanOrEqualTo(String value) {
            orCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria orUserIdLessThan(String value) {
            orCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria orUserIdLessThanOrEqualTo(String value) {
            orCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria orUserIdLike(String value) {
            orCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria orUserIdNotLike(String value) {
            orCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria orUserIdIn(List<String> values) {
            orCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria orUserIdNotIn(List<String> values) {
            orCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria orUserIdBetween(String value1, String value2) {
            orCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria orUserIdNotBetween(String value1, String value2) {
            orCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria orUserNameIsNull() {
            orCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria orUserNameIsNotNull() {
            orCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria orUserNameEqualTo(String value) {
            orCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria orUserNameNotEqualTo(String value) {
            orCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria orUserNameGreaterThan(String value) {
            orCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria orUserNameGreaterThanOrEqualTo(String value) {
            orCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria orUserNameLessThan(String value) {
            orCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria orUserNameLessThanOrEqualTo(String value) {
            orCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria orUserNameLike(String value) {
            orCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria orUserNameNotLike(String value) {
            orCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria orUserNameIn(List<String> values) {
            orCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria orUserNameNotIn(List<String> values) {
            orCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria orUserNameBetween(String value1, String value2) {
            orCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria orUserNameNotBetween(String value1, String value2) {
            orCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria orNickNameIsNull() {
            orCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria orNickNameIsNotNull() {
            orCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria orNickNameEqualTo(String value) {
            orCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria orNickNameNotEqualTo(String value) {
            orCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria orNickNameGreaterThan(String value) {
            orCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria orNickNameGreaterThanOrEqualTo(String value) {
            orCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria orNickNameLessThan(String value) {
            orCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria orNickNameLessThanOrEqualTo(String value) {
            orCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria orNickNameLike(String value) {
            orCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria orNickNameNotLike(String value) {
            orCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria orNickNameIn(List<String> values) {
            orCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria orNickNameNotIn(List<String> values) {
            orCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria orNickNameBetween(String value1, String value2) {
            orCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria orNickNameNotBetween(String value1, String value2) {
            orCriterion("nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andAskTimeIsNull() {
            addCriterion("ask_time is null");
            return (Criteria) this;
        }

        public Criteria andAskTimeIsNotNull() {
            addCriterion("ask_time is not null");
            return (Criteria) this;
        }

        public Criteria andAskTimeEqualTo(Date value) {
            addCriterion("ask_time =", value, "askTime");
            return (Criteria) this;
        }

        public Criteria andAskTimeNotEqualTo(Date value) {
            addCriterion("ask_time <>", value, "askTime");
            return (Criteria) this;
        }

        public Criteria andAskTimeGreaterThan(Date value) {
            addCriterion("ask_time >", value, "askTime");
            return (Criteria) this;
        }

        public Criteria andAskTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ask_time >=", value, "askTime");
            return (Criteria) this;
        }

        public Criteria andAskTimeLessThan(Date value) {
            addCriterion("ask_time <", value, "askTime");
            return (Criteria) this;
        }

        public Criteria andAskTimeLessThanOrEqualTo(Date value) {
            addCriterion("ask_time <=", value, "askTime");
            return (Criteria) this;
        }

        public Criteria orAskTimeIsNull() {
            orCriterion("ask_time is null");
            return (Criteria) this;
        }

        public Criteria orAskTimeIsNotNull() {
            orCriterion("ask_time is not null");
            return (Criteria) this;
        }

        public Criteria orAskTimeEqualTo(Date value) {
            orCriterion("ask_time =", value, "askTime");
            return (Criteria) this;
        }

        public Criteria orAskTimeNotEqualTo(Date value) {
            orCriterion("ask_time <>", value, "askTime");
            return (Criteria) this;
        }

        public Criteria orAskTimeGreaterThan(Date value) {
            orCriterion("ask_time >", value, "askTime");
            return (Criteria) this;
        }

        public Criteria orAskTimeGreaterThanOrEqualTo(Date value) {
            orCriterion("ask_time >=", value, "askTime");
            return (Criteria) this;
        }

        public Criteria orAskTimeLessThan(Date value) {
            orCriterion("ask_time <", value, "askTime");
            return (Criteria) this;
        }

        public Criteria orAskTimeLessThanOrEqualTo(Date value) {
            orCriterion("ask_time <=", value, "askTime");
            return (Criteria) this;
        }

        public Criteria andAskTimeIn(List<Date> values) {
            addCriterion("ask_time in", values, "askTime");
            return (Criteria) this;
        }

        public Criteria andAskTimeNotIn(List<Date> values) {
            addCriterion("ask_time not in", values, "askTime");
            return (Criteria) this;
        }

        public Criteria andAskTimeBetween(Date value1, Date value2) {
            addCriterion("ask_time between", value1, value2, "askTime");
            return (Criteria) this;
        }

        public Criteria andAskTimeNotBetween(Date value1, Date value2) {
            addCriterion("ask_time not between", value1, value2, "askTime");
            return (Criteria) this;
        }

        public Criteria orAskTimeIn(List<Date> values) {
            orCriterion("ask_time in", values, "askTime");
            return (Criteria) this;
        }

        public Criteria orAskTimeNotIn(List<Date> values) {
            orCriterion("ask_time not in", values, "askTime");
            return (Criteria) this;
        }

        public Criteria orAskTimeBetween(Date value1, Date value2) {
            orCriterion("ask_time between", value1, value2, "askTime");
            return (Criteria) this;
        }

        public Criteria orAskTimeNotBetween(Date value1, Date value2) {
            orCriterion("ask_time not between", value1, value2, "askTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeIsNull() {
            addCriterion("answer_time is null");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeIsNotNull() {
            addCriterion("answer_time is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeEqualTo(Date value) {
            addCriterion("answer_time =", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeNotEqualTo(Date value) {
            addCriterion("answer_time <>", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeGreaterThan(Date value) {
            addCriterion("answer_time >", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("answer_time >=", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeLessThan(Date value) {
            addCriterion("answer_time <", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeLessThanOrEqualTo(Date value) {
            addCriterion("answer_time <=", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria orAnswerTimeIsNull() {
            orCriterion("answer_time is null");
            return (Criteria) this;
        }

        public Criteria orAnswerTimeIsNotNull() {
            orCriterion("answer_time is not null");
            return (Criteria) this;
        }

        public Criteria orAnswerTimeEqualTo(Date value) {
            orCriterion("answer_time =", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria orAnswerTimeNotEqualTo(Date value) {
            orCriterion("answer_time <>", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria orAnswerTimeGreaterThan(Date value) {
            orCriterion("answer_time >", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria orAnswerTimeGreaterThanOrEqualTo(Date value) {
            orCriterion("answer_time >=", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria orAnswerTimeLessThan(Date value) {
            orCriterion("answer_time <", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria orAnswerTimeLessThanOrEqualTo(Date value) {
            orCriterion("answer_time <=", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeIn(List<Date> values) {
            addCriterion("answer_time in", values, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeNotIn(List<Date> values) {
            addCriterion("answer_time not in", values, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeBetween(Date value1, Date value2) {
            addCriterion("answer_time between", value1, value2, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeNotBetween(Date value1, Date value2) {
            addCriterion("answer_time not between", value1, value2, "answerTime");
            return (Criteria) this;
        }

        public Criteria orAnswerTimeIn(List<Date> values) {
            orCriterion("answer_time in", values, "answerTime");
            return (Criteria) this;
        }

        public Criteria orAnswerTimeNotIn(List<Date> values) {
            orCriterion("answer_time not in", values, "answerTime");
            return (Criteria) this;
        }

        public Criteria orAnswerTimeBetween(Date value1, Date value2) {
            orCriterion("answer_time between", value1, value2, "answerTime");
            return (Criteria) this;
        }

        public Criteria orAnswerTimeNotBetween(Date value1, Date value2) {
            orCriterion("answer_time not between", value1, value2, "answerTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeIsNull() {
            addCriterion("response_time is null");
            return (Criteria) this;
        }

        public Criteria andResponseTimeIsNotNull() {
            addCriterion("response_time is not null");
            return (Criteria) this;
        }

        public Criteria andResponseTimeEqualTo(Integer value) {
            addCriterion("response_time =", value, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeNotEqualTo(Integer value) {
            addCriterion("response_time <>", value, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeGreaterThan(Integer value) {
            addCriterion("response_time >", value, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("response_time >=", value, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeLessThan(Integer value) {
            addCriterion("response_time <", value, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeLessThanOrEqualTo(Integer value) {
            addCriterion("response_time <=", value, "responseTime");
            return (Criteria) this;
        }

        public Criteria orResponseTimeIsNull() {
            orCriterion("response_time is null");
            return (Criteria) this;
        }

        public Criteria orResponseTimeIsNotNull() {
            orCriterion("response_time is not null");
            return (Criteria) this;
        }

        public Criteria orResponseTimeEqualTo(Integer value) {
            orCriterion("response_time =", value, "responseTime");
            return (Criteria) this;
        }

        public Criteria orResponseTimeNotEqualTo(Integer value) {
            orCriterion("response_time <>", value, "responseTime");
            return (Criteria) this;
        }

        public Criteria orResponseTimeGreaterThan(Integer value) {
            orCriterion("response_time >", value, "responseTime");
            return (Criteria) this;
        }

        public Criteria orResponseTimeGreaterThanOrEqualTo(Integer value) {
            orCriterion("response_time >=", value, "responseTime");
            return (Criteria) this;
        }

        public Criteria orResponseTimeLessThan(Integer value) {
            orCriterion("response_time <", value, "responseTime");
            return (Criteria) this;
        }

        public Criteria orResponseTimeLessThanOrEqualTo(Integer value) {
            orCriterion("response_time <=", value, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeIn(List<Integer> values) {
            addCriterion("response_time in", values, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeNotIn(List<Integer> values) {
            addCriterion("response_time not in", values, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeBetween(Integer value1, Integer value2) {
            addCriterion("response_time between", value1, value2, "responseTime");
            return (Criteria) this;
        }

        public Criteria andResponseTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("response_time not between", value1, value2, "responseTime");
            return (Criteria) this;
        }

        public Criteria orResponseTimeIn(List<Integer> values) {
            orCriterion("response_time in", values, "responseTime");
            return (Criteria) this;
        }

        public Criteria orResponseTimeNotIn(List<Integer> values) {
            orCriterion("response_time not in", values, "responseTime");
            return (Criteria) this;
        }

        public Criteria orResponseTimeBetween(Integer value1, Integer value2) {
            orCriterion("response_time between", value1, value2, "responseTime");
            return (Criteria) this;
        }

        public Criteria orResponseTimeNotBetween(Integer value1, Integer value2) {
            orCriterion("response_time not between", value1, value2, "responseTime");
            return (Criteria) this;
        }

        public Criteria andAnswerIdIsNull() {
            addCriterion("answer_id is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIdIsNotNull() {
            addCriterion("answer_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerIdEqualTo(String value) {
            addCriterion("answer_id =", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdNotEqualTo(String value) {
            addCriterion("answer_id <>", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdGreaterThan(String value) {
            addCriterion("answer_id >", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdGreaterThanOrEqualTo(String value) {
            addCriterion("answer_id >=", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdLessThan(String value) {
            addCriterion("answer_id <", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdLessThanOrEqualTo(String value) {
            addCriterion("answer_id <=", value, "answerId");
            return (Criteria) this;
        }

        public Criteria orAnswerIdIsNull() {
            orCriterion("answer_id is null");
            return (Criteria) this;
        }

        public Criteria orAnswerIdIsNotNull() {
            orCriterion("answer_id is not null");
            return (Criteria) this;
        }

        public Criteria orAnswerIdEqualTo(String value) {
            orCriterion("answer_id =", value, "answerId");
            return (Criteria) this;
        }

        public Criteria orAnswerIdNotEqualTo(String value) {
            orCriterion("answer_id <>", value, "answerId");
            return (Criteria) this;
        }

        public Criteria orAnswerIdGreaterThan(String value) {
            orCriterion("answer_id >", value, "answerId");
            return (Criteria) this;
        }

        public Criteria orAnswerIdGreaterThanOrEqualTo(String value) {
            orCriterion("answer_id >=", value, "answerId");
            return (Criteria) this;
        }

        public Criteria orAnswerIdLessThan(String value) {
            orCriterion("answer_id <", value, "answerId");
            return (Criteria) this;
        }

        public Criteria orAnswerIdLessThanOrEqualTo(String value) {
            orCriterion("answer_id <=", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdLike(String value) {
            addCriterion("answer_id like", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdNotLike(String value) {
            addCriterion("answer_id not like", value, "answerId");
            return (Criteria) this;
        }

        public Criteria orAnswerIdLike(String value) {
            orCriterion("answer_id like", value, "answerId");
            return (Criteria) this;
        }

        public Criteria orAnswerIdNotLike(String value) {
            orCriterion("answer_id not like", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdIn(List<String> values) {
            addCriterion("answer_id in", values, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdNotIn(List<String> values) {
            addCriterion("answer_id not in", values, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdBetween(String value1, String value2) {
            addCriterion("answer_id between", value1, value2, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdNotBetween(String value1, String value2) {
            addCriterion("answer_id not between", value1, value2, "answerId");
            return (Criteria) this;
        }

        public Criteria orAnswerIdIn(List<String> values) {
            orCriterion("answer_id in", values, "answerId");
            return (Criteria) this;
        }

        public Criteria orAnswerIdNotIn(List<String> values) {
            orCriterion("answer_id not in", values, "answerId");
            return (Criteria) this;
        }

        public Criteria orAnswerIdBetween(String value1, String value2) {
            orCriterion("answer_id between", value1, value2, "answerId");
            return (Criteria) this;
        }

        public Criteria orAnswerIdNotBetween(String value1, String value2) {
            orCriterion("answer_id not between", value1, value2, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerNameIsNull() {
            addCriterion("answer_name is null");
            return (Criteria) this;
        }

        public Criteria andAnswerNameIsNotNull() {
            addCriterion("answer_name is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerNameEqualTo(String value) {
            addCriterion("answer_name =", value, "answerName");
            return (Criteria) this;
        }

        public Criteria andAnswerNameNotEqualTo(String value) {
            addCriterion("answer_name <>", value, "answerName");
            return (Criteria) this;
        }

        public Criteria andAnswerNameGreaterThan(String value) {
            addCriterion("answer_name >", value, "answerName");
            return (Criteria) this;
        }

        public Criteria andAnswerNameGreaterThanOrEqualTo(String value) {
            addCriterion("answer_name >=", value, "answerName");
            return (Criteria) this;
        }

        public Criteria andAnswerNameLessThan(String value) {
            addCriterion("answer_name <", value, "answerName");
            return (Criteria) this;
        }

        public Criteria andAnswerNameLessThanOrEqualTo(String value) {
            addCriterion("answer_name <=", value, "answerName");
            return (Criteria) this;
        }

        public Criteria orAnswerNameIsNull() {
            orCriterion("answer_name is null");
            return (Criteria) this;
        }

        public Criteria orAnswerNameIsNotNull() {
            orCriterion("answer_name is not null");
            return (Criteria) this;
        }

        public Criteria orAnswerNameEqualTo(String value) {
            orCriterion("answer_name =", value, "answerName");
            return (Criteria) this;
        }

        public Criteria orAnswerNameNotEqualTo(String value) {
            orCriterion("answer_name <>", value, "answerName");
            return (Criteria) this;
        }

        public Criteria orAnswerNameGreaterThan(String value) {
            orCriterion("answer_name >", value, "answerName");
            return (Criteria) this;
        }

        public Criteria orAnswerNameGreaterThanOrEqualTo(String value) {
            orCriterion("answer_name >=", value, "answerName");
            return (Criteria) this;
        }

        public Criteria orAnswerNameLessThan(String value) {
            orCriterion("answer_name <", value, "answerName");
            return (Criteria) this;
        }

        public Criteria orAnswerNameLessThanOrEqualTo(String value) {
            orCriterion("answer_name <=", value, "answerName");
            return (Criteria) this;
        }

        public Criteria andAnswerNameLike(String value) {
            addCriterion("answer_name like", value, "answerName");
            return (Criteria) this;
        }

        public Criteria andAnswerNameNotLike(String value) {
            addCriterion("answer_name not like", value, "answerName");
            return (Criteria) this;
        }

        public Criteria orAnswerNameLike(String value) {
            orCriterion("answer_name like", value, "answerName");
            return (Criteria) this;
        }

        public Criteria orAnswerNameNotLike(String value) {
            orCriterion("answer_name not like", value, "answerName");
            return (Criteria) this;
        }

        public Criteria andAnswerNameIn(List<String> values) {
            addCriterion("answer_name in", values, "answerName");
            return (Criteria) this;
        }

        public Criteria andAnswerNameNotIn(List<String> values) {
            addCriterion("answer_name not in", values, "answerName");
            return (Criteria) this;
        }

        public Criteria andAnswerNameBetween(String value1, String value2) {
            addCriterion("answer_name between", value1, value2, "answerName");
            return (Criteria) this;
        }

        public Criteria andAnswerNameNotBetween(String value1, String value2) {
            addCriterion("answer_name not between", value1, value2, "answerName");
            return (Criteria) this;
        }

        public Criteria orAnswerNameIn(List<String> values) {
            orCriterion("answer_name in", values, "answerName");
            return (Criteria) this;
        }

        public Criteria orAnswerNameNotIn(List<String> values) {
            orCriterion("answer_name not in", values, "answerName");
            return (Criteria) this;
        }

        public Criteria orAnswerNameBetween(String value1, String value2) {
            orCriterion("answer_name between", value1, value2, "answerName");
            return (Criteria) this;
        }

        public Criteria orAnswerNameNotBetween(String value1, String value2) {
            orCriterion("answer_name not between", value1, value2, "answerName");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria orStateIsNull() {
            orCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria orStateIsNotNull() {
            orCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria orStateEqualTo(Integer value) {
            orCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria orStateNotEqualTo(Integer value) {
            orCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria orStateGreaterThan(Integer value) {
            orCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria orStateGreaterThanOrEqualTo(Integer value) {
            orCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria orStateLessThan(Integer value) {
            orCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria orStateLessThanOrEqualTo(Integer value) {
            orCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria orStateIn(List<Integer> values) {
            orCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria orStateNotIn(List<Integer> values) {
            orCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria orStateBetween(Integer value1, Integer value2) {
            orCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria orStateNotBetween(Integer value1, Integer value2) {
            orCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNull() {
            addCriterion("close_time is null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNotNull() {
            addCriterion("close_time is not null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeEqualTo(Date value) {
            addCriterion("close_time =", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotEqualTo(Date value) {
            addCriterion("close_time <>", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThan(Date value) {
            addCriterion("close_time >", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("close_time >=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThan(Date value) {
            addCriterion("close_time <", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThanOrEqualTo(Date value) {
            addCriterion("close_time <=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria orCloseTimeIsNull() {
            orCriterion("close_time is null");
            return (Criteria) this;
        }

        public Criteria orCloseTimeIsNotNull() {
            orCriterion("close_time is not null");
            return (Criteria) this;
        }

        public Criteria orCloseTimeEqualTo(Date value) {
            orCriterion("close_time =", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria orCloseTimeNotEqualTo(Date value) {
            orCriterion("close_time <>", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria orCloseTimeGreaterThan(Date value) {
            orCriterion("close_time >", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria orCloseTimeGreaterThanOrEqualTo(Date value) {
            orCriterion("close_time >=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria orCloseTimeLessThan(Date value) {
            orCriterion("close_time <", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria orCloseTimeLessThanOrEqualTo(Date value) {
            orCriterion("close_time <=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIn(List<Date> values) {
            addCriterion("close_time in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotIn(List<Date> values) {
            addCriterion("close_time not in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeBetween(Date value1, Date value2) {
            addCriterion("close_time between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotBetween(Date value1, Date value2) {
            addCriterion("close_time not between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria orCloseTimeIn(List<Date> values) {
            orCriterion("close_time in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria orCloseTimeNotIn(List<Date> values) {
            orCriterion("close_time not in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria orCloseTimeBetween(Date value1, Date value2) {
            orCriterion("close_time between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria orCloseTimeNotBetween(Date value1, Date value2) {
            orCriterion("close_time not between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andUsedTimeIsNull() {
            addCriterion("used_time is null");
            return (Criteria) this;
        }

        public Criteria andUsedTimeIsNotNull() {
            addCriterion("used_time is not null");
            return (Criteria) this;
        }

        public Criteria andUsedTimeEqualTo(Long value) {
            addCriterion("used_time =", value, "usedTime");
            return (Criteria) this;
        }

        public Criteria andUsedTimeNotEqualTo(Long value) {
            addCriterion("used_time <>", value, "usedTime");
            return (Criteria) this;
        }

        public Criteria andUsedTimeGreaterThan(Long value) {
            addCriterion("used_time >", value, "usedTime");
            return (Criteria) this;
        }

        public Criteria andUsedTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("used_time >=", value, "usedTime");
            return (Criteria) this;
        }

        public Criteria andUsedTimeLessThan(Long value) {
            addCriterion("used_time <", value, "usedTime");
            return (Criteria) this;
        }

        public Criteria andUsedTimeLessThanOrEqualTo(Long value) {
            addCriterion("used_time <=", value, "usedTime");
            return (Criteria) this;
        }

        public Criteria orUsedTimeIsNull() {
            orCriterion("used_time is null");
            return (Criteria) this;
        }

        public Criteria orUsedTimeIsNotNull() {
            orCriterion("used_time is not null");
            return (Criteria) this;
        }

        public Criteria orUsedTimeEqualTo(Long value) {
            orCriterion("used_time =", value, "usedTime");
            return (Criteria) this;
        }

        public Criteria orUsedTimeNotEqualTo(Long value) {
            orCriterion("used_time <>", value, "usedTime");
            return (Criteria) this;
        }

        public Criteria orUsedTimeGreaterThan(Long value) {
            orCriterion("used_time >", value, "usedTime");
            return (Criteria) this;
        }

        public Criteria orUsedTimeGreaterThanOrEqualTo(Long value) {
            orCriterion("used_time >=", value, "usedTime");
            return (Criteria) this;
        }

        public Criteria orUsedTimeLessThan(Long value) {
            orCriterion("used_time <", value, "usedTime");
            return (Criteria) this;
        }

        public Criteria orUsedTimeLessThanOrEqualTo(Long value) {
            orCriterion("used_time <=", value, "usedTime");
            return (Criteria) this;
        }

        public Criteria andUsedTimeIn(List<Long> values) {
            addCriterion("used_time in", values, "usedTime");
            return (Criteria) this;
        }

        public Criteria andUsedTimeNotIn(List<Long> values) {
            addCriterion("used_time not in", values, "usedTime");
            return (Criteria) this;
        }

        public Criteria andUsedTimeBetween(Long value1, Long value2) {
            addCriterion("used_time between", value1, value2, "usedTime");
            return (Criteria) this;
        }

        public Criteria andUsedTimeNotBetween(Long value1, Long value2) {
            addCriterion("used_time not between", value1, value2, "usedTime");
            return (Criteria) this;
        }

        public Criteria orUsedTimeIn(List<Long> values) {
            orCriterion("used_time in", values, "usedTime");
            return (Criteria) this;
        }

        public Criteria orUsedTimeNotIn(List<Long> values) {
            orCriterion("used_time not in", values, "usedTime");
            return (Criteria) this;
        }

        public Criteria orUsedTimeBetween(Long value1, Long value2) {
            orCriterion("used_time between", value1, value2, "usedTime");
            return (Criteria) this;
        }

        public Criteria orUsedTimeNotBetween(Long value1, Long value2) {
            orCriterion("used_time not between", value1, value2, "usedTime");
            return (Criteria) this;
        }

        public Criteria andCommunicationIsNull() {
            addCriterion("communication is null");
            return (Criteria) this;
        }

        public Criteria andCommunicationIsNotNull() {
            addCriterion("communication is not null");
            return (Criteria) this;
        }

        public Criteria andCommunicationEqualTo(Integer value) {
            addCriterion("communication =", value, "communication");
            return (Criteria) this;
        }

        public Criteria andCommunicationNotEqualTo(Integer value) {
            addCriterion("communication <>", value, "communication");
            return (Criteria) this;
        }

        public Criteria andCommunicationGreaterThan(Integer value) {
            addCriterion("communication >", value, "communication");
            return (Criteria) this;
        }

        public Criteria andCommunicationGreaterThanOrEqualTo(Integer value) {
            addCriterion("communication >=", value, "communication");
            return (Criteria) this;
        }

        public Criteria andCommunicationLessThan(Integer value) {
            addCriterion("communication <", value, "communication");
            return (Criteria) this;
        }

        public Criteria andCommunicationLessThanOrEqualTo(Integer value) {
            addCriterion("communication <=", value, "communication");
            return (Criteria) this;
        }

        public Criteria orCommunicationIsNull() {
            orCriterion("communication is null");
            return (Criteria) this;
        }

        public Criteria orCommunicationIsNotNull() {
            orCriterion("communication is not null");
            return (Criteria) this;
        }

        public Criteria orCommunicationEqualTo(Integer value) {
            orCriterion("communication =", value, "communication");
            return (Criteria) this;
        }

        public Criteria orCommunicationNotEqualTo(Integer value) {
            orCriterion("communication <>", value, "communication");
            return (Criteria) this;
        }

        public Criteria orCommunicationGreaterThan(Integer value) {
            orCriterion("communication >", value, "communication");
            return (Criteria) this;
        }

        public Criteria orCommunicationGreaterThanOrEqualTo(Integer value) {
            orCriterion("communication >=", value, "communication");
            return (Criteria) this;
        }

        public Criteria orCommunicationLessThan(Integer value) {
            orCriterion("communication <", value, "communication");
            return (Criteria) this;
        }

        public Criteria orCommunicationLessThanOrEqualTo(Integer value) {
            orCriterion("communication <=", value, "communication");
            return (Criteria) this;
        }

        public Criteria andCommunicationIn(List<Integer> values) {
            addCriterion("communication in", values, "communication");
            return (Criteria) this;
        }

        public Criteria andCommunicationNotIn(List<Integer> values) {
            addCriterion("communication not in", values, "communication");
            return (Criteria) this;
        }

        public Criteria andCommunicationBetween(Integer value1, Integer value2) {
            addCriterion("communication between", value1, value2, "communication");
            return (Criteria) this;
        }

        public Criteria andCommunicationNotBetween(Integer value1, Integer value2) {
            addCriterion("communication not between", value1, value2, "communication");
            return (Criteria) this;
        }

        public Criteria orCommunicationIn(List<Integer> values) {
            orCriterion("communication in", values, "communication");
            return (Criteria) this;
        }

        public Criteria orCommunicationNotIn(List<Integer> values) {
            orCriterion("communication not in", values, "communication");
            return (Criteria) this;
        }

        public Criteria orCommunicationBetween(Integer value1, Integer value2) {
            orCriterion("communication between", value1, value2, "communication");
            return (Criteria) this;
        }

        public Criteria orCommunicationNotBetween(Integer value1, Integer value2) {
            orCriterion("communication not between", value1, value2, "communication");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNull() {
            addCriterion("platform is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNotNull() {
            addCriterion("platform is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformEqualTo(Integer value) {
            addCriterion("platform =", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualTo(Integer value) {
            addCriterion("platform <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThan(Integer value) {
            addCriterion("platform >", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualTo(Integer value) {
            addCriterion("platform >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThan(Integer value) {
            addCriterion("platform <", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualTo(Integer value) {
            addCriterion("platform <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria orPlatformIsNull() {
            orCriterion("platform is null");
            return (Criteria) this;
        }

        public Criteria orPlatformIsNotNull() {
            orCriterion("platform is not null");
            return (Criteria) this;
        }

        public Criteria orPlatformEqualTo(Integer value) {
            orCriterion("platform =", value, "platform");
            return (Criteria) this;
        }

        public Criteria orPlatformNotEqualTo(Integer value) {
            orCriterion("platform <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria orPlatformGreaterThan(Integer value) {
            orCriterion("platform >", value, "platform");
            return (Criteria) this;
        }

        public Criteria orPlatformGreaterThanOrEqualTo(Integer value) {
            orCriterion("platform >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria orPlatformLessThan(Integer value) {
            orCriterion("platform <", value, "platform");
            return (Criteria) this;
        }

        public Criteria orPlatformLessThanOrEqualTo(Integer value) {
            orCriterion("platform <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformIn(List<Integer> values) {
            addCriterion("platform in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotIn(List<Integer> values) {
            addCriterion("platform not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformBetween(Integer value1, Integer value2) {
            addCriterion("platform between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotBetween(Integer value1, Integer value2) {
            addCriterion("platform not between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria orPlatformIn(List<Integer> values) {
            orCriterion("platform in", values, "platform");
            return (Criteria) this;
        }

        public Criteria orPlatformNotIn(List<Integer> values) {
            orCriterion("platform not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria orPlatformBetween(Integer value1, Integer value2) {
            orCriterion("platform between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria orPlatformNotBetween(Integer value1, Integer value2) {
            orCriterion("platform not between", value1, value2, "platform");
            return (Criteria) this;
        }
    }

    /**
     * 该类对应数据库表 question
     */
    public static class Criteria extends GeneratedCriteria {
        protected boolean andRelation;

        public boolean isAndRelation() {
            return andRelation;
        }

        protected Criteria() {
            super();
        }

        public void setAndRelation(boolean andRelation) {
            this.andRelation = andRelation;
        }
    }

    /**
     * 该类对应数据库表 question
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean orValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isOrValue() {
            return orValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, boolean orValue) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
            this.orValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, boolean orValue) {
            this(condition, value, null);
            this.orValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, boolean orValue) {
            this(condition, value, secondValue, null);
            this.orValue = true;
        }
    }
}