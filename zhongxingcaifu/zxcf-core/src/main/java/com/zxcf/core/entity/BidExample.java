package com.zxcf.core.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BidExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BidExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andActualrateIsNull() {
            addCriterion("actualRate is null");
            return (Criteria) this;
        }

        public Criteria andActualrateIsNotNull() {
            addCriterion("actualRate is not null");
            return (Criteria) this;
        }

        public Criteria andActualrateEqualTo(BigDecimal value) {
            addCriterion("actualRate =", value, "actualrate");
            return (Criteria) this;
        }

        public Criteria andActualrateNotEqualTo(BigDecimal value) {
            addCriterion("actualRate <>", value, "actualrate");
            return (Criteria) this;
        }

        public Criteria andActualrateGreaterThan(BigDecimal value) {
            addCriterion("actualRate >", value, "actualrate");
            return (Criteria) this;
        }

        public Criteria andActualrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("actualRate >=", value, "actualrate");
            return (Criteria) this;
        }

        public Criteria andActualrateLessThan(BigDecimal value) {
            addCriterion("actualRate <", value, "actualrate");
            return (Criteria) this;
        }

        public Criteria andActualrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("actualRate <=", value, "actualrate");
            return (Criteria) this;
        }

        public Criteria andActualrateIn(List<BigDecimal> values) {
            addCriterion("actualRate in", values, "actualrate");
            return (Criteria) this;
        }

        public Criteria andActualrateNotIn(List<BigDecimal> values) {
            addCriterion("actualRate not in", values, "actualrate");
            return (Criteria) this;
        }

        public Criteria andActualrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actualRate between", value1, value2, "actualrate");
            return (Criteria) this;
        }

        public Criteria andActualrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("actualRate not between", value1, value2, "actualrate");
            return (Criteria) this;
        }

        public Criteria andAvailableamountIsNull() {
            addCriterion("availableAmount is null");
            return (Criteria) this;
        }

        public Criteria andAvailableamountIsNotNull() {
            addCriterion("availableAmount is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableamountEqualTo(BigDecimal value) {
            addCriterion("availableAmount =", value, "availableamount");
            return (Criteria) this;
        }

        public Criteria andAvailableamountNotEqualTo(BigDecimal value) {
            addCriterion("availableAmount <>", value, "availableamount");
            return (Criteria) this;
        }

        public Criteria andAvailableamountGreaterThan(BigDecimal value) {
            addCriterion("availableAmount >", value, "availableamount");
            return (Criteria) this;
        }

        public Criteria andAvailableamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("availableAmount >=", value, "availableamount");
            return (Criteria) this;
        }

        public Criteria andAvailableamountLessThan(BigDecimal value) {
            addCriterion("availableAmount <", value, "availableamount");
            return (Criteria) this;
        }

        public Criteria andAvailableamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("availableAmount <=", value, "availableamount");
            return (Criteria) this;
        }

        public Criteria andAvailableamountIn(List<BigDecimal> values) {
            addCriterion("availableAmount in", values, "availableamount");
            return (Criteria) this;
        }

        public Criteria andAvailableamountNotIn(List<BigDecimal> values) {
            addCriterion("availableAmount not in", values, "availableamount");
            return (Criteria) this;
        }

        public Criteria andAvailableamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("availableAmount between", value1, value2, "availableamount");
            return (Criteria) this;
        }

        public Criteria andAvailableamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("availableAmount not between", value1, value2, "availableamount");
            return (Criteria) this;
        }

        public Criteria andBidrequestIdIsNull() {
            addCriterion("bidrequest_id is null");
            return (Criteria) this;
        }

        public Criteria andBidrequestIdIsNotNull() {
            addCriterion("bidrequest_id is not null");
            return (Criteria) this;
        }

        public Criteria andBidrequestIdEqualTo(Long value) {
            addCriterion("bidrequest_id =", value, "bidrequestId");
            return (Criteria) this;
        }

        public Criteria andBidrequestIdNotEqualTo(Long value) {
            addCriterion("bidrequest_id <>", value, "bidrequestId");
            return (Criteria) this;
        }

        public Criteria andBidrequestIdGreaterThan(Long value) {
            addCriterion("bidrequest_id >", value, "bidrequestId");
            return (Criteria) this;
        }

        public Criteria andBidrequestIdGreaterThanOrEqualTo(Long value) {
            addCriterion("bidrequest_id >=", value, "bidrequestId");
            return (Criteria) this;
        }

        public Criteria andBidrequestIdLessThan(Long value) {
            addCriterion("bidrequest_id <", value, "bidrequestId");
            return (Criteria) this;
        }

        public Criteria andBidrequestIdLessThanOrEqualTo(Long value) {
            addCriterion("bidrequest_id <=", value, "bidrequestId");
            return (Criteria) this;
        }

        public Criteria andBidrequestIdIn(List<Long> values) {
            addCriterion("bidrequest_id in", values, "bidrequestId");
            return (Criteria) this;
        }

        public Criteria andBidrequestIdNotIn(List<Long> values) {
            addCriterion("bidrequest_id not in", values, "bidrequestId");
            return (Criteria) this;
        }

        public Criteria andBidrequestIdBetween(Long value1, Long value2) {
            addCriterion("bidrequest_id between", value1, value2, "bidrequestId");
            return (Criteria) this;
        }

        public Criteria andBidrequestIdNotBetween(Long value1, Long value2) {
            addCriterion("bidrequest_id not between", value1, value2, "bidrequestId");
            return (Criteria) this;
        }

        public Criteria andBiduserIdIsNull() {
            addCriterion("bidUser_id is null");
            return (Criteria) this;
        }

        public Criteria andBiduserIdIsNotNull() {
            addCriterion("bidUser_id is not null");
            return (Criteria) this;
        }

        public Criteria andBiduserIdEqualTo(Long value) {
            addCriterion("bidUser_id =", value, "biduserId");
            return (Criteria) this;
        }

        public Criteria andBiduserIdNotEqualTo(Long value) {
            addCriterion("bidUser_id <>", value, "biduserId");
            return (Criteria) this;
        }

        public Criteria andBiduserIdGreaterThan(Long value) {
            addCriterion("bidUser_id >", value, "biduserId");
            return (Criteria) this;
        }

        public Criteria andBiduserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("bidUser_id >=", value, "biduserId");
            return (Criteria) this;
        }

        public Criteria andBiduserIdLessThan(Long value) {
            addCriterion("bidUser_id <", value, "biduserId");
            return (Criteria) this;
        }

        public Criteria andBiduserIdLessThanOrEqualTo(Long value) {
            addCriterion("bidUser_id <=", value, "biduserId");
            return (Criteria) this;
        }

        public Criteria andBiduserIdIn(List<Long> values) {
            addCriterion("bidUser_id in", values, "biduserId");
            return (Criteria) this;
        }

        public Criteria andBiduserIdNotIn(List<Long> values) {
            addCriterion("bidUser_id not in", values, "biduserId");
            return (Criteria) this;
        }

        public Criteria andBiduserIdBetween(Long value1, Long value2) {
            addCriterion("bidUser_id between", value1, value2, "biduserId");
            return (Criteria) this;
        }

        public Criteria andBiduserIdNotBetween(Long value1, Long value2) {
            addCriterion("bidUser_id not between", value1, value2, "biduserId");
            return (Criteria) this;
        }

        public Criteria andBidtimeIsNull() {
            addCriterion("bidTime is null");
            return (Criteria) this;
        }

        public Criteria andBidtimeIsNotNull() {
            addCriterion("bidTime is not null");
            return (Criteria) this;
        }

        public Criteria andBidtimeEqualTo(Date value) {
            addCriterion("bidTime =", value, "bidtime");
            return (Criteria) this;
        }

        public Criteria andBidtimeNotEqualTo(Date value) {
            addCriterion("bidTime <>", value, "bidtime");
            return (Criteria) this;
        }

        public Criteria andBidtimeGreaterThan(Date value) {
            addCriterion("bidTime >", value, "bidtime");
            return (Criteria) this;
        }

        public Criteria andBidtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bidTime >=", value, "bidtime");
            return (Criteria) this;
        }

        public Criteria andBidtimeLessThan(Date value) {
            addCriterion("bidTime <", value, "bidtime");
            return (Criteria) this;
        }

        public Criteria andBidtimeLessThanOrEqualTo(Date value) {
            addCriterion("bidTime <=", value, "bidtime");
            return (Criteria) this;
        }

        public Criteria andBidtimeIn(List<Date> values) {
            addCriterion("bidTime in", values, "bidtime");
            return (Criteria) this;
        }

        public Criteria andBidtimeNotIn(List<Date> values) {
            addCriterion("bidTime not in", values, "bidtime");
            return (Criteria) this;
        }

        public Criteria andBidtimeBetween(Date value1, Date value2) {
            addCriterion("bidTime between", value1, value2, "bidtime");
            return (Criteria) this;
        }

        public Criteria andBidtimeNotBetween(Date value1, Date value2) {
            addCriterion("bidTime not between", value1, value2, "bidtime");
            return (Criteria) this;
        }

        public Criteria andBidrequesttitleIsNull() {
            addCriterion("bidRequestTitle is null");
            return (Criteria) this;
        }

        public Criteria andBidrequesttitleIsNotNull() {
            addCriterion("bidRequestTitle is not null");
            return (Criteria) this;
        }

        public Criteria andBidrequesttitleEqualTo(String value) {
            addCriterion("bidRequestTitle =", value, "bidrequesttitle");
            return (Criteria) this;
        }

        public Criteria andBidrequesttitleNotEqualTo(String value) {
            addCriterion("bidRequestTitle <>", value, "bidrequesttitle");
            return (Criteria) this;
        }

        public Criteria andBidrequesttitleGreaterThan(String value) {
            addCriterion("bidRequestTitle >", value, "bidrequesttitle");
            return (Criteria) this;
        }

        public Criteria andBidrequesttitleGreaterThanOrEqualTo(String value) {
            addCriterion("bidRequestTitle >=", value, "bidrequesttitle");
            return (Criteria) this;
        }

        public Criteria andBidrequesttitleLessThan(String value) {
            addCriterion("bidRequestTitle <", value, "bidrequesttitle");
            return (Criteria) this;
        }

        public Criteria andBidrequesttitleLessThanOrEqualTo(String value) {
            addCriterion("bidRequestTitle <=", value, "bidrequesttitle");
            return (Criteria) this;
        }

        public Criteria andBidrequesttitleLike(String value) {
            addCriterion("bidRequestTitle like", value, "bidrequesttitle");
            return (Criteria) this;
        }

        public Criteria andBidrequesttitleNotLike(String value) {
            addCriterion("bidRequestTitle not like", value, "bidrequesttitle");
            return (Criteria) this;
        }

        public Criteria andBidrequesttitleIn(List<String> values) {
            addCriterion("bidRequestTitle in", values, "bidrequesttitle");
            return (Criteria) this;
        }

        public Criteria andBidrequesttitleNotIn(List<String> values) {
            addCriterion("bidRequestTitle not in", values, "bidrequesttitle");
            return (Criteria) this;
        }

        public Criteria andBidrequesttitleBetween(String value1, String value2) {
            addCriterion("bidRequestTitle between", value1, value2, "bidrequesttitle");
            return (Criteria) this;
        }

        public Criteria andBidrequesttitleNotBetween(String value1, String value2) {
            addCriterion("bidRequestTitle not between", value1, value2, "bidrequesttitle");
            return (Criteria) this;
        }

        public Criteria andBidrequeststateIsNull() {
            addCriterion("bidRequestState is null");
            return (Criteria) this;
        }

        public Criteria andBidrequeststateIsNotNull() {
            addCriterion("bidRequestState is not null");
            return (Criteria) this;
        }

        public Criteria andBidrequeststateEqualTo(Integer value) {
            addCriterion("bidRequestState =", value, "bidrequeststate");
            return (Criteria) this;
        }

        public Criteria andBidrequeststateNotEqualTo(Integer value) {
            addCriterion("bidRequestState <>", value, "bidrequeststate");
            return (Criteria) this;
        }

        public Criteria andBidrequeststateGreaterThan(Integer value) {
            addCriterion("bidRequestState >", value, "bidrequeststate");
            return (Criteria) this;
        }

        public Criteria andBidrequeststateGreaterThanOrEqualTo(Integer value) {
            addCriterion("bidRequestState >=", value, "bidrequeststate");
            return (Criteria) this;
        }

        public Criteria andBidrequeststateLessThan(Integer value) {
            addCriterion("bidRequestState <", value, "bidrequeststate");
            return (Criteria) this;
        }

        public Criteria andBidrequeststateLessThanOrEqualTo(Integer value) {
            addCriterion("bidRequestState <=", value, "bidrequeststate");
            return (Criteria) this;
        }

        public Criteria andBidrequeststateIn(List<Integer> values) {
            addCriterion("bidRequestState in", values, "bidrequeststate");
            return (Criteria) this;
        }

        public Criteria andBidrequeststateNotIn(List<Integer> values) {
            addCriterion("bidRequestState not in", values, "bidrequeststate");
            return (Criteria) this;
        }

        public Criteria andBidrequeststateBetween(Integer value1, Integer value2) {
            addCriterion("bidRequestState between", value1, value2, "bidrequeststate");
            return (Criteria) this;
        }

        public Criteria andBidrequeststateNotBetween(Integer value1, Integer value2) {
            addCriterion("bidRequestState not between", value1, value2, "bidrequeststate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

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
    }
}