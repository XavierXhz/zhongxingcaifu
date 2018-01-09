package com.zxcf.core.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountExample() {
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

        public Criteria andTradepasswordIsNull() {
            addCriterion("tradePassword is null");
            return (Criteria) this;
        }

        public Criteria andTradepasswordIsNotNull() {
            addCriterion("tradePassword is not null");
            return (Criteria) this;
        }

        public Criteria andTradepasswordEqualTo(String value) {
            addCriterion("tradePassword =", value, "tradepassword");
            return (Criteria) this;
        }

        public Criteria andTradepasswordNotEqualTo(String value) {
            addCriterion("tradePassword <>", value, "tradepassword");
            return (Criteria) this;
        }

        public Criteria andTradepasswordGreaterThan(String value) {
            addCriterion("tradePassword >", value, "tradepassword");
            return (Criteria) this;
        }

        public Criteria andTradepasswordGreaterThanOrEqualTo(String value) {
            addCriterion("tradePassword >=", value, "tradepassword");
            return (Criteria) this;
        }

        public Criteria andTradepasswordLessThan(String value) {
            addCriterion("tradePassword <", value, "tradepassword");
            return (Criteria) this;
        }

        public Criteria andTradepasswordLessThanOrEqualTo(String value) {
            addCriterion("tradePassword <=", value, "tradepassword");
            return (Criteria) this;
        }

        public Criteria andTradepasswordLike(String value) {
            addCriterion("tradePassword like", value, "tradepassword");
            return (Criteria) this;
        }

        public Criteria andTradepasswordNotLike(String value) {
            addCriterion("tradePassword not like", value, "tradepassword");
            return (Criteria) this;
        }

        public Criteria andTradepasswordIn(List<String> values) {
            addCriterion("tradePassword in", values, "tradepassword");
            return (Criteria) this;
        }

        public Criteria andTradepasswordNotIn(List<String> values) {
            addCriterion("tradePassword not in", values, "tradepassword");
            return (Criteria) this;
        }

        public Criteria andTradepasswordBetween(String value1, String value2) {
            addCriterion("tradePassword between", value1, value2, "tradepassword");
            return (Criteria) this;
        }

        public Criteria andTradepasswordNotBetween(String value1, String value2) {
            addCriterion("tradePassword not between", value1, value2, "tradepassword");
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

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andUnreceiveinterestIsNull() {
            addCriterion("unReceiveInterest is null");
            return (Criteria) this;
        }

        public Criteria andUnreceiveinterestIsNotNull() {
            addCriterion("unReceiveInterest is not null");
            return (Criteria) this;
        }

        public Criteria andUnreceiveinterestEqualTo(BigDecimal value) {
            addCriterion("unReceiveInterest =", value, "unreceiveinterest");
            return (Criteria) this;
        }

        public Criteria andUnreceiveinterestNotEqualTo(BigDecimal value) {
            addCriterion("unReceiveInterest <>", value, "unreceiveinterest");
            return (Criteria) this;
        }

        public Criteria andUnreceiveinterestGreaterThan(BigDecimal value) {
            addCriterion("unReceiveInterest >", value, "unreceiveinterest");
            return (Criteria) this;
        }

        public Criteria andUnreceiveinterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unReceiveInterest >=", value, "unreceiveinterest");
            return (Criteria) this;
        }

        public Criteria andUnreceiveinterestLessThan(BigDecimal value) {
            addCriterion("unReceiveInterest <", value, "unreceiveinterest");
            return (Criteria) this;
        }

        public Criteria andUnreceiveinterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unReceiveInterest <=", value, "unreceiveinterest");
            return (Criteria) this;
        }

        public Criteria andUnreceiveinterestIn(List<BigDecimal> values) {
            addCriterion("unReceiveInterest in", values, "unreceiveinterest");
            return (Criteria) this;
        }

        public Criteria andUnreceiveinterestNotIn(List<BigDecimal> values) {
            addCriterion("unReceiveInterest not in", values, "unreceiveinterest");
            return (Criteria) this;
        }

        public Criteria andUnreceiveinterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unReceiveInterest between", value1, value2, "unreceiveinterest");
            return (Criteria) this;
        }

        public Criteria andUnreceiveinterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unReceiveInterest not between", value1, value2, "unreceiveinterest");
            return (Criteria) this;
        }

        public Criteria andUnreceiveprincipalIsNull() {
            addCriterion("unReceivePrincipal is null");
            return (Criteria) this;
        }

        public Criteria andUnreceiveprincipalIsNotNull() {
            addCriterion("unReceivePrincipal is not null");
            return (Criteria) this;
        }

        public Criteria andUnreceiveprincipalEqualTo(BigDecimal value) {
            addCriterion("unReceivePrincipal =", value, "unreceiveprincipal");
            return (Criteria) this;
        }

        public Criteria andUnreceiveprincipalNotEqualTo(BigDecimal value) {
            addCriterion("unReceivePrincipal <>", value, "unreceiveprincipal");
            return (Criteria) this;
        }

        public Criteria andUnreceiveprincipalGreaterThan(BigDecimal value) {
            addCriterion("unReceivePrincipal >", value, "unreceiveprincipal");
            return (Criteria) this;
        }

        public Criteria andUnreceiveprincipalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unReceivePrincipal >=", value, "unreceiveprincipal");
            return (Criteria) this;
        }

        public Criteria andUnreceiveprincipalLessThan(BigDecimal value) {
            addCriterion("unReceivePrincipal <", value, "unreceiveprincipal");
            return (Criteria) this;
        }

        public Criteria andUnreceiveprincipalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unReceivePrincipal <=", value, "unreceiveprincipal");
            return (Criteria) this;
        }

        public Criteria andUnreceiveprincipalIn(List<BigDecimal> values) {
            addCriterion("unReceivePrincipal in", values, "unreceiveprincipal");
            return (Criteria) this;
        }

        public Criteria andUnreceiveprincipalNotIn(List<BigDecimal> values) {
            addCriterion("unReceivePrincipal not in", values, "unreceiveprincipal");
            return (Criteria) this;
        }

        public Criteria andUnreceiveprincipalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unReceivePrincipal between", value1, value2, "unreceiveprincipal");
            return (Criteria) this;
        }

        public Criteria andUnreceiveprincipalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unReceivePrincipal not between", value1, value2, "unreceiveprincipal");
            return (Criteria) this;
        }

        public Criteria andUnreturnamountIsNull() {
            addCriterion("unReturnAmount is null");
            return (Criteria) this;
        }

        public Criteria andUnreturnamountIsNotNull() {
            addCriterion("unReturnAmount is not null");
            return (Criteria) this;
        }

        public Criteria andUnreturnamountEqualTo(BigDecimal value) {
            addCriterion("unReturnAmount =", value, "unreturnamount");
            return (Criteria) this;
        }

        public Criteria andUnreturnamountNotEqualTo(BigDecimal value) {
            addCriterion("unReturnAmount <>", value, "unreturnamount");
            return (Criteria) this;
        }

        public Criteria andUnreturnamountGreaterThan(BigDecimal value) {
            addCriterion("unReturnAmount >", value, "unreturnamount");
            return (Criteria) this;
        }

        public Criteria andUnreturnamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unReturnAmount >=", value, "unreturnamount");
            return (Criteria) this;
        }

        public Criteria andUnreturnamountLessThan(BigDecimal value) {
            addCriterion("unReturnAmount <", value, "unreturnamount");
            return (Criteria) this;
        }

        public Criteria andUnreturnamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unReturnAmount <=", value, "unreturnamount");
            return (Criteria) this;
        }

        public Criteria andUnreturnamountIn(List<BigDecimal> values) {
            addCriterion("unReturnAmount in", values, "unreturnamount");
            return (Criteria) this;
        }

        public Criteria andUnreturnamountNotIn(List<BigDecimal> values) {
            addCriterion("unReturnAmount not in", values, "unreturnamount");
            return (Criteria) this;
        }

        public Criteria andUnreturnamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unReturnAmount between", value1, value2, "unreturnamount");
            return (Criteria) this;
        }

        public Criteria andUnreturnamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unReturnAmount not between", value1, value2, "unreturnamount");
            return (Criteria) this;
        }

        public Criteria andRemainborrowlimitIsNull() {
            addCriterion("remainBorrowLimit is null");
            return (Criteria) this;
        }

        public Criteria andRemainborrowlimitIsNotNull() {
            addCriterion("remainBorrowLimit is not null");
            return (Criteria) this;
        }

        public Criteria andRemainborrowlimitEqualTo(BigDecimal value) {
            addCriterion("remainBorrowLimit =", value, "remainborrowlimit");
            return (Criteria) this;
        }

        public Criteria andRemainborrowlimitNotEqualTo(BigDecimal value) {
            addCriterion("remainBorrowLimit <>", value, "remainborrowlimit");
            return (Criteria) this;
        }

        public Criteria andRemainborrowlimitGreaterThan(BigDecimal value) {
            addCriterion("remainBorrowLimit >", value, "remainborrowlimit");
            return (Criteria) this;
        }

        public Criteria andRemainborrowlimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("remainBorrowLimit >=", value, "remainborrowlimit");
            return (Criteria) this;
        }

        public Criteria andRemainborrowlimitLessThan(BigDecimal value) {
            addCriterion("remainBorrowLimit <", value, "remainborrowlimit");
            return (Criteria) this;
        }

        public Criteria andRemainborrowlimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("remainBorrowLimit <=", value, "remainborrowlimit");
            return (Criteria) this;
        }

        public Criteria andRemainborrowlimitIn(List<BigDecimal> values) {
            addCriterion("remainBorrowLimit in", values, "remainborrowlimit");
            return (Criteria) this;
        }

        public Criteria andRemainborrowlimitNotIn(List<BigDecimal> values) {
            addCriterion("remainBorrowLimit not in", values, "remainborrowlimit");
            return (Criteria) this;
        }

        public Criteria andRemainborrowlimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("remainBorrowLimit between", value1, value2, "remainborrowlimit");
            return (Criteria) this;
        }

        public Criteria andRemainborrowlimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("remainBorrowLimit not between", value1, value2, "remainborrowlimit");
            return (Criteria) this;
        }

        public Criteria andBorrowlimitIsNull() {
            addCriterion("borrowLimit is null");
            return (Criteria) this;
        }

        public Criteria andBorrowlimitIsNotNull() {
            addCriterion("borrowLimit is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowlimitEqualTo(BigDecimal value) {
            addCriterion("borrowLimit =", value, "borrowlimit");
            return (Criteria) this;
        }

        public Criteria andBorrowlimitNotEqualTo(BigDecimal value) {
            addCriterion("borrowLimit <>", value, "borrowlimit");
            return (Criteria) this;
        }

        public Criteria andBorrowlimitGreaterThan(BigDecimal value) {
            addCriterion("borrowLimit >", value, "borrowlimit");
            return (Criteria) this;
        }

        public Criteria andBorrowlimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("borrowLimit >=", value, "borrowlimit");
            return (Criteria) this;
        }

        public Criteria andBorrowlimitLessThan(BigDecimal value) {
            addCriterion("borrowLimit <", value, "borrowlimit");
            return (Criteria) this;
        }

        public Criteria andBorrowlimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("borrowLimit <=", value, "borrowlimit");
            return (Criteria) this;
        }

        public Criteria andBorrowlimitIn(List<BigDecimal> values) {
            addCriterion("borrowLimit in", values, "borrowlimit");
            return (Criteria) this;
        }

        public Criteria andBorrowlimitNotIn(List<BigDecimal> values) {
            addCriterion("borrowLimit not in", values, "borrowlimit");
            return (Criteria) this;
        }

        public Criteria andBorrowlimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("borrowLimit between", value1, value2, "borrowlimit");
            return (Criteria) this;
        }

        public Criteria andBorrowlimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("borrowLimit not between", value1, value2, "borrowlimit");
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