package com.zxcf.core.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SystemaccountflowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SystemaccountflowExample() {
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

        public Criteria andTradetimeIsNull() {
            addCriterion("tradeTime is null");
            return (Criteria) this;
        }

        public Criteria andTradetimeIsNotNull() {
            addCriterion("tradeTime is not null");
            return (Criteria) this;
        }

        public Criteria andTradetimeEqualTo(Date value) {
            addCriterion("tradeTime =", value, "tradetime");
            return (Criteria) this;
        }

        public Criteria andTradetimeNotEqualTo(Date value) {
            addCriterion("tradeTime <>", value, "tradetime");
            return (Criteria) this;
        }

        public Criteria andTradetimeGreaterThan(Date value) {
            addCriterion("tradeTime >", value, "tradetime");
            return (Criteria) this;
        }

        public Criteria andTradetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tradeTime >=", value, "tradetime");
            return (Criteria) this;
        }

        public Criteria andTradetimeLessThan(Date value) {
            addCriterion("tradeTime <", value, "tradetime");
            return (Criteria) this;
        }

        public Criteria andTradetimeLessThanOrEqualTo(Date value) {
            addCriterion("tradeTime <=", value, "tradetime");
            return (Criteria) this;
        }

        public Criteria andTradetimeIn(List<Date> values) {
            addCriterion("tradeTime in", values, "tradetime");
            return (Criteria) this;
        }

        public Criteria andTradetimeNotIn(List<Date> values) {
            addCriterion("tradeTime not in", values, "tradetime");
            return (Criteria) this;
        }

        public Criteria andTradetimeBetween(Date value1, Date value2) {
            addCriterion("tradeTime between", value1, value2, "tradetime");
            return (Criteria) this;
        }

        public Criteria andTradetimeNotBetween(Date value1, Date value2) {
            addCriterion("tradeTime not between", value1, value2, "tradetime");
            return (Criteria) this;
        }

        public Criteria andActiontypeIsNull() {
            addCriterion("actionType is null");
            return (Criteria) this;
        }

        public Criteria andActiontypeIsNotNull() {
            addCriterion("actionType is not null");
            return (Criteria) this;
        }

        public Criteria andActiontypeEqualTo(Byte value) {
            addCriterion("actionType =", value, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeNotEqualTo(Byte value) {
            addCriterion("actionType <>", value, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeGreaterThan(Byte value) {
            addCriterion("actionType >", value, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("actionType >=", value, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeLessThan(Byte value) {
            addCriterion("actionType <", value, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeLessThanOrEqualTo(Byte value) {
            addCriterion("actionType <=", value, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeIn(List<Byte> values) {
            addCriterion("actionType in", values, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeNotIn(List<Byte> values) {
            addCriterion("actionType not in", values, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeBetween(Byte value1, Byte value2) {
            addCriterion("actionType between", value1, value2, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeNotBetween(Byte value1, Byte value2) {
            addCriterion("actionType not between", value1, value2, "actiontype");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andUsableamountIsNull() {
            addCriterion("usableAmount is null");
            return (Criteria) this;
        }

        public Criteria andUsableamountIsNotNull() {
            addCriterion("usableAmount is not null");
            return (Criteria) this;
        }

        public Criteria andUsableamountEqualTo(BigDecimal value) {
            addCriterion("usableAmount =", value, "usableamount");
            return (Criteria) this;
        }

        public Criteria andUsableamountNotEqualTo(BigDecimal value) {
            addCriterion("usableAmount <>", value, "usableamount");
            return (Criteria) this;
        }

        public Criteria andUsableamountGreaterThan(BigDecimal value) {
            addCriterion("usableAmount >", value, "usableamount");
            return (Criteria) this;
        }

        public Criteria andUsableamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("usableAmount >=", value, "usableamount");
            return (Criteria) this;
        }

        public Criteria andUsableamountLessThan(BigDecimal value) {
            addCriterion("usableAmount <", value, "usableamount");
            return (Criteria) this;
        }

        public Criteria andUsableamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("usableAmount <=", value, "usableamount");
            return (Criteria) this;
        }

        public Criteria andUsableamountIn(List<BigDecimal> values) {
            addCriterion("usableAmount in", values, "usableamount");
            return (Criteria) this;
        }

        public Criteria andUsableamountNotIn(List<BigDecimal> values) {
            addCriterion("usableAmount not in", values, "usableamount");
            return (Criteria) this;
        }

        public Criteria andUsableamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("usableAmount between", value1, value2, "usableamount");
            return (Criteria) this;
        }

        public Criteria andUsableamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("usableAmount not between", value1, value2, "usableamount");
            return (Criteria) this;
        }

        public Criteria andFreezedamountIsNull() {
            addCriterion("freezedAmount is null");
            return (Criteria) this;
        }

        public Criteria andFreezedamountIsNotNull() {
            addCriterion("freezedAmount is not null");
            return (Criteria) this;
        }

        public Criteria andFreezedamountEqualTo(BigDecimal value) {
            addCriterion("freezedAmount =", value, "freezedamount");
            return (Criteria) this;
        }

        public Criteria andFreezedamountNotEqualTo(BigDecimal value) {
            addCriterion("freezedAmount <>", value, "freezedamount");
            return (Criteria) this;
        }

        public Criteria andFreezedamountGreaterThan(BigDecimal value) {
            addCriterion("freezedAmount >", value, "freezedamount");
            return (Criteria) this;
        }

        public Criteria andFreezedamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("freezedAmount >=", value, "freezedamount");
            return (Criteria) this;
        }

        public Criteria andFreezedamountLessThan(BigDecimal value) {
            addCriterion("freezedAmount <", value, "freezedamount");
            return (Criteria) this;
        }

        public Criteria andFreezedamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("freezedAmount <=", value, "freezedamount");
            return (Criteria) this;
        }

        public Criteria andFreezedamountIn(List<BigDecimal> values) {
            addCriterion("freezedAmount in", values, "freezedamount");
            return (Criteria) this;
        }

        public Criteria andFreezedamountNotIn(List<BigDecimal> values) {
            addCriterion("freezedAmount not in", values, "freezedamount");
            return (Criteria) this;
        }

        public Criteria andFreezedamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freezedAmount between", value1, value2, "freezedamount");
            return (Criteria) this;
        }

        public Criteria andFreezedamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freezedAmount not between", value1, value2, "freezedamount");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
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