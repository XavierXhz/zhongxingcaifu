package com.zxcf.core.entity;

import java.util.ArrayList;
import java.util.List;

public class CompanybankinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanybankinfoExample() {
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

        public Criteria andBanknameIsNull() {
            addCriterion("bankname is null");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNotNull() {
            addCriterion("bankname is not null");
            return (Criteria) this;
        }

        public Criteria andBanknameEqualTo(String value) {
            addCriterion("bankname =", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotEqualTo(String value) {
            addCriterion("bankname <>", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThan(String value) {
            addCriterion("bankname >", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThanOrEqualTo(String value) {
            addCriterion("bankname >=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThan(String value) {
            addCriterion("bankname <", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThanOrEqualTo(String value) {
            addCriterion("bankname <=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLike(String value) {
            addCriterion("bankname like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotLike(String value) {
            addCriterion("bankname not like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameIn(List<String> values) {
            addCriterion("bankname in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotIn(List<String> values) {
            addCriterion("bankname not in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameBetween(String value1, String value2) {
            addCriterion("bankname between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotBetween(String value1, String value2) {
            addCriterion("bankname not between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andAccountnameIsNull() {
            addCriterion("accountname is null");
            return (Criteria) this;
        }

        public Criteria andAccountnameIsNotNull() {
            addCriterion("accountname is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnameEqualTo(String value) {
            addCriterion("accountname =", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotEqualTo(String value) {
            addCriterion("accountname <>", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameGreaterThan(String value) {
            addCriterion("accountname >", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameGreaterThanOrEqualTo(String value) {
            addCriterion("accountname >=", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLessThan(String value) {
            addCriterion("accountname <", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLessThanOrEqualTo(String value) {
            addCriterion("accountname <=", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLike(String value) {
            addCriterion("accountname like", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotLike(String value) {
            addCriterion("accountname not like", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameIn(List<String> values) {
            addCriterion("accountname in", values, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotIn(List<String> values) {
            addCriterion("accountname not in", values, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameBetween(String value1, String value2) {
            addCriterion("accountname between", value1, value2, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotBetween(String value1, String value2) {
            addCriterion("accountname not between", value1, value2, "accountname");
            return (Criteria) this;
        }

        public Criteria andBanknumberIsNull() {
            addCriterion("banknumber is null");
            return (Criteria) this;
        }

        public Criteria andBanknumberIsNotNull() {
            addCriterion("banknumber is not null");
            return (Criteria) this;
        }

        public Criteria andBanknumberEqualTo(String value) {
            addCriterion("banknumber =", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberNotEqualTo(String value) {
            addCriterion("banknumber <>", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberGreaterThan(String value) {
            addCriterion("banknumber >", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberGreaterThanOrEqualTo(String value) {
            addCriterion("banknumber >=", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberLessThan(String value) {
            addCriterion("banknumber <", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberLessThanOrEqualTo(String value) {
            addCriterion("banknumber <=", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberLike(String value) {
            addCriterion("banknumber like", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberNotLike(String value) {
            addCriterion("banknumber not like", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberIn(List<String> values) {
            addCriterion("banknumber in", values, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberNotIn(List<String> values) {
            addCriterion("banknumber not in", values, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberBetween(String value1, String value2) {
            addCriterion("banknumber between", value1, value2, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberNotBetween(String value1, String value2) {
            addCriterion("banknumber not between", value1, value2, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBankforknameIsNull() {
            addCriterion("bankforkname is null");
            return (Criteria) this;
        }

        public Criteria andBankforknameIsNotNull() {
            addCriterion("bankforkname is not null");
            return (Criteria) this;
        }

        public Criteria andBankforknameEqualTo(String value) {
            addCriterion("bankforkname =", value, "bankforkname");
            return (Criteria) this;
        }

        public Criteria andBankforknameNotEqualTo(String value) {
            addCriterion("bankforkname <>", value, "bankforkname");
            return (Criteria) this;
        }

        public Criteria andBankforknameGreaterThan(String value) {
            addCriterion("bankforkname >", value, "bankforkname");
            return (Criteria) this;
        }

        public Criteria andBankforknameGreaterThanOrEqualTo(String value) {
            addCriterion("bankforkname >=", value, "bankforkname");
            return (Criteria) this;
        }

        public Criteria andBankforknameLessThan(String value) {
            addCriterion("bankforkname <", value, "bankforkname");
            return (Criteria) this;
        }

        public Criteria andBankforknameLessThanOrEqualTo(String value) {
            addCriterion("bankforkname <=", value, "bankforkname");
            return (Criteria) this;
        }

        public Criteria andBankforknameLike(String value) {
            addCriterion("bankforkname like", value, "bankforkname");
            return (Criteria) this;
        }

        public Criteria andBankforknameNotLike(String value) {
            addCriterion("bankforkname not like", value, "bankforkname");
            return (Criteria) this;
        }

        public Criteria andBankforknameIn(List<String> values) {
            addCriterion("bankforkname in", values, "bankforkname");
            return (Criteria) this;
        }

        public Criteria andBankforknameNotIn(List<String> values) {
            addCriterion("bankforkname not in", values, "bankforkname");
            return (Criteria) this;
        }

        public Criteria andBankforknameBetween(String value1, String value2) {
            addCriterion("bankforkname between", value1, value2, "bankforkname");
            return (Criteria) this;
        }

        public Criteria andBankforknameNotBetween(String value1, String value2) {
            addCriterion("bankforkname not between", value1, value2, "bankforkname");
            return (Criteria) this;
        }

        public Criteria andIconclsIsNull() {
            addCriterion("iconCls is null");
            return (Criteria) this;
        }

        public Criteria andIconclsIsNotNull() {
            addCriterion("iconCls is not null");
            return (Criteria) this;
        }

        public Criteria andIconclsEqualTo(String value) {
            addCriterion("iconCls =", value, "iconcls");
            return (Criteria) this;
        }

        public Criteria andIconclsNotEqualTo(String value) {
            addCriterion("iconCls <>", value, "iconcls");
            return (Criteria) this;
        }

        public Criteria andIconclsGreaterThan(String value) {
            addCriterion("iconCls >", value, "iconcls");
            return (Criteria) this;
        }

        public Criteria andIconclsGreaterThanOrEqualTo(String value) {
            addCriterion("iconCls >=", value, "iconcls");
            return (Criteria) this;
        }

        public Criteria andIconclsLessThan(String value) {
            addCriterion("iconCls <", value, "iconcls");
            return (Criteria) this;
        }

        public Criteria andIconclsLessThanOrEqualTo(String value) {
            addCriterion("iconCls <=", value, "iconcls");
            return (Criteria) this;
        }

        public Criteria andIconclsLike(String value) {
            addCriterion("iconCls like", value, "iconcls");
            return (Criteria) this;
        }

        public Criteria andIconclsNotLike(String value) {
            addCriterion("iconCls not like", value, "iconcls");
            return (Criteria) this;
        }

        public Criteria andIconclsIn(List<String> values) {
            addCriterion("iconCls in", values, "iconcls");
            return (Criteria) this;
        }

        public Criteria andIconclsNotIn(List<String> values) {
            addCriterion("iconCls not in", values, "iconcls");
            return (Criteria) this;
        }

        public Criteria andIconclsBetween(String value1, String value2) {
            addCriterion("iconCls between", value1, value2, "iconcls");
            return (Criteria) this;
        }

        public Criteria andIconclsNotBetween(String value1, String value2) {
            addCriterion("iconCls not between", value1, value2, "iconcls");
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