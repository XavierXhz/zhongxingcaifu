package com.zxcf.core.entity;

import java.util.ArrayList;
import java.util.List;

public class UserinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserinfoExample() {
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

        public Criteria andBitstateIsNull() {
            addCriterion("bitState is null");
            return (Criteria) this;
        }

        public Criteria andBitstateIsNotNull() {
            addCriterion("bitState is not null");
            return (Criteria) this;
        }

        public Criteria andBitstateEqualTo(Long value) {
            addCriterion("bitState =", value, "bitstate");
            return (Criteria) this;
        }

        public Criteria andBitstateNotEqualTo(Long value) {
            addCriterion("bitState <>", value, "bitstate");
            return (Criteria) this;
        }

        public Criteria andBitstateGreaterThan(Long value) {
            addCriterion("bitState >", value, "bitstate");
            return (Criteria) this;
        }

        public Criteria andBitstateGreaterThanOrEqualTo(Long value) {
            addCriterion("bitState >=", value, "bitstate");
            return (Criteria) this;
        }

        public Criteria andBitstateLessThan(Long value) {
            addCriterion("bitState <", value, "bitstate");
            return (Criteria) this;
        }

        public Criteria andBitstateLessThanOrEqualTo(Long value) {
            addCriterion("bitState <=", value, "bitstate");
            return (Criteria) this;
        }

        public Criteria andBitstateIn(List<Long> values) {
            addCriterion("bitState in", values, "bitstate");
            return (Criteria) this;
        }

        public Criteria andBitstateNotIn(List<Long> values) {
            addCriterion("bitState not in", values, "bitstate");
            return (Criteria) this;
        }

        public Criteria andBitstateBetween(Long value1, Long value2) {
            addCriterion("bitState between", value1, value2, "bitstate");
            return (Criteria) this;
        }

        public Criteria andBitstateNotBetween(Long value1, Long value2) {
            addCriterion("bitState not between", value1, value2, "bitstate");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("realName is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realName is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realName =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realName <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realName >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realName >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realName <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realName <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realName like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realName not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realName in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realName not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realName between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realName not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andRealauthidIsNull() {
            addCriterion("realAuthId is null");
            return (Criteria) this;
        }

        public Criteria andRealauthidIsNotNull() {
            addCriterion("realAuthId is not null");
            return (Criteria) this;
        }

        public Criteria andRealauthidEqualTo(Long value) {
            addCriterion("realAuthId =", value, "realauthid");
            return (Criteria) this;
        }

        public Criteria andRealauthidNotEqualTo(Long value) {
            addCriterion("realAuthId <>", value, "realauthid");
            return (Criteria) this;
        }

        public Criteria andRealauthidGreaterThan(Long value) {
            addCriterion("realAuthId >", value, "realauthid");
            return (Criteria) this;
        }

        public Criteria andRealauthidGreaterThanOrEqualTo(Long value) {
            addCriterion("realAuthId >=", value, "realauthid");
            return (Criteria) this;
        }

        public Criteria andRealauthidLessThan(Long value) {
            addCriterion("realAuthId <", value, "realauthid");
            return (Criteria) this;
        }

        public Criteria andRealauthidLessThanOrEqualTo(Long value) {
            addCriterion("realAuthId <=", value, "realauthid");
            return (Criteria) this;
        }

        public Criteria andRealauthidIn(List<Long> values) {
            addCriterion("realAuthId in", values, "realauthid");
            return (Criteria) this;
        }

        public Criteria andRealauthidNotIn(List<Long> values) {
            addCriterion("realAuthId not in", values, "realauthid");
            return (Criteria) this;
        }

        public Criteria andRealauthidBetween(Long value1, Long value2) {
            addCriterion("realAuthId between", value1, value2, "realauthid");
            return (Criteria) this;
        }

        public Criteria andRealauthidNotBetween(Long value1, Long value2) {
            addCriterion("realAuthId not between", value1, value2, "realauthid");
            return (Criteria) this;
        }

        public Criteria andIdnumberIsNull() {
            addCriterion("idNumber is null");
            return (Criteria) this;
        }

        public Criteria andIdnumberIsNotNull() {
            addCriterion("idNumber is not null");
            return (Criteria) this;
        }

        public Criteria andIdnumberEqualTo(String value) {
            addCriterion("idNumber =", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotEqualTo(String value) {
            addCriterion("idNumber <>", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberGreaterThan(String value) {
            addCriterion("idNumber >", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberGreaterThanOrEqualTo(String value) {
            addCriterion("idNumber >=", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLessThan(String value) {
            addCriterion("idNumber <", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLessThanOrEqualTo(String value) {
            addCriterion("idNumber <=", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLike(String value) {
            addCriterion("idNumber like", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotLike(String value) {
            addCriterion("idNumber not like", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberIn(List<String> values) {
            addCriterion("idNumber in", values, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotIn(List<String> values) {
            addCriterion("idNumber not in", values, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberBetween(String value1, String value2) {
            addCriterion("idNumber between", value1, value2, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotBetween(String value1, String value2) {
            addCriterion("idNumber not between", value1, value2, "idnumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIsNull() {
            addCriterion("phoneNumber is null");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIsNotNull() {
            addCriterion("phoneNumber is not null");
            return (Criteria) this;
        }

        public Criteria andPhonenumberEqualTo(String value) {
            addCriterion("phoneNumber =", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotEqualTo(String value) {
            addCriterion("phoneNumber <>", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberGreaterThan(String value) {
            addCriterion("phoneNumber >", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberGreaterThanOrEqualTo(String value) {
            addCriterion("phoneNumber >=", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLessThan(String value) {
            addCriterion("phoneNumber <", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLessThanOrEqualTo(String value) {
            addCriterion("phoneNumber <=", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLike(String value) {
            addCriterion("phoneNumber like", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotLike(String value) {
            addCriterion("phoneNumber not like", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIn(List<String> values) {
            addCriterion("phoneNumber in", values, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotIn(List<String> values) {
            addCriterion("phoneNumber not in", values, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberBetween(String value1, String value2) {
            addCriterion("phoneNumber between", value1, value2, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotBetween(String value1, String value2) {
            addCriterion("phoneNumber not between", value1, value2, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andIncomegradeIdIsNull() {
            addCriterion("incomeGrade_id is null");
            return (Criteria) this;
        }

        public Criteria andIncomegradeIdIsNotNull() {
            addCriterion("incomeGrade_id is not null");
            return (Criteria) this;
        }

        public Criteria andIncomegradeIdEqualTo(Long value) {
            addCriterion("incomeGrade_id =", value, "incomegradeId");
            return (Criteria) this;
        }

        public Criteria andIncomegradeIdNotEqualTo(Long value) {
            addCriterion("incomeGrade_id <>", value, "incomegradeId");
            return (Criteria) this;
        }

        public Criteria andIncomegradeIdGreaterThan(Long value) {
            addCriterion("incomeGrade_id >", value, "incomegradeId");
            return (Criteria) this;
        }

        public Criteria andIncomegradeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("incomeGrade_id >=", value, "incomegradeId");
            return (Criteria) this;
        }

        public Criteria andIncomegradeIdLessThan(Long value) {
            addCriterion("incomeGrade_id <", value, "incomegradeId");
            return (Criteria) this;
        }

        public Criteria andIncomegradeIdLessThanOrEqualTo(Long value) {
            addCriterion("incomeGrade_id <=", value, "incomegradeId");
            return (Criteria) this;
        }

        public Criteria andIncomegradeIdIn(List<Long> values) {
            addCriterion("incomeGrade_id in", values, "incomegradeId");
            return (Criteria) this;
        }

        public Criteria andIncomegradeIdNotIn(List<Long> values) {
            addCriterion("incomeGrade_id not in", values, "incomegradeId");
            return (Criteria) this;
        }

        public Criteria andIncomegradeIdBetween(Long value1, Long value2) {
            addCriterion("incomeGrade_id between", value1, value2, "incomegradeId");
            return (Criteria) this;
        }

        public Criteria andIncomegradeIdNotBetween(Long value1, Long value2) {
            addCriterion("incomeGrade_id not between", value1, value2, "incomegradeId");
            return (Criteria) this;
        }

        public Criteria andMarriageIdIsNull() {
            addCriterion("marriage_id is null");
            return (Criteria) this;
        }

        public Criteria andMarriageIdIsNotNull() {
            addCriterion("marriage_id is not null");
            return (Criteria) this;
        }

        public Criteria andMarriageIdEqualTo(Long value) {
            addCriterion("marriage_id =", value, "marriageId");
            return (Criteria) this;
        }

        public Criteria andMarriageIdNotEqualTo(Long value) {
            addCriterion("marriage_id <>", value, "marriageId");
            return (Criteria) this;
        }

        public Criteria andMarriageIdGreaterThan(Long value) {
            addCriterion("marriage_id >", value, "marriageId");
            return (Criteria) this;
        }

        public Criteria andMarriageIdGreaterThanOrEqualTo(Long value) {
            addCriterion("marriage_id >=", value, "marriageId");
            return (Criteria) this;
        }

        public Criteria andMarriageIdLessThan(Long value) {
            addCriterion("marriage_id <", value, "marriageId");
            return (Criteria) this;
        }

        public Criteria andMarriageIdLessThanOrEqualTo(Long value) {
            addCriterion("marriage_id <=", value, "marriageId");
            return (Criteria) this;
        }

        public Criteria andMarriageIdIn(List<Long> values) {
            addCriterion("marriage_id in", values, "marriageId");
            return (Criteria) this;
        }

        public Criteria andMarriageIdNotIn(List<Long> values) {
            addCriterion("marriage_id not in", values, "marriageId");
            return (Criteria) this;
        }

        public Criteria andMarriageIdBetween(Long value1, Long value2) {
            addCriterion("marriage_id between", value1, value2, "marriageId");
            return (Criteria) this;
        }

        public Criteria andMarriageIdNotBetween(Long value1, Long value2) {
            addCriterion("marriage_id not between", value1, value2, "marriageId");
            return (Criteria) this;
        }

        public Criteria andKidcountIdIsNull() {
            addCriterion("kidCount_id is null");
            return (Criteria) this;
        }

        public Criteria andKidcountIdIsNotNull() {
            addCriterion("kidCount_id is not null");
            return (Criteria) this;
        }

        public Criteria andKidcountIdEqualTo(Long value) {
            addCriterion("kidCount_id =", value, "kidcountId");
            return (Criteria) this;
        }

        public Criteria andKidcountIdNotEqualTo(Long value) {
            addCriterion("kidCount_id <>", value, "kidcountId");
            return (Criteria) this;
        }

        public Criteria andKidcountIdGreaterThan(Long value) {
            addCriterion("kidCount_id >", value, "kidcountId");
            return (Criteria) this;
        }

        public Criteria andKidcountIdGreaterThanOrEqualTo(Long value) {
            addCriterion("kidCount_id >=", value, "kidcountId");
            return (Criteria) this;
        }

        public Criteria andKidcountIdLessThan(Long value) {
            addCriterion("kidCount_id <", value, "kidcountId");
            return (Criteria) this;
        }

        public Criteria andKidcountIdLessThanOrEqualTo(Long value) {
            addCriterion("kidCount_id <=", value, "kidcountId");
            return (Criteria) this;
        }

        public Criteria andKidcountIdIn(List<Long> values) {
            addCriterion("kidCount_id in", values, "kidcountId");
            return (Criteria) this;
        }

        public Criteria andKidcountIdNotIn(List<Long> values) {
            addCriterion("kidCount_id not in", values, "kidcountId");
            return (Criteria) this;
        }

        public Criteria andKidcountIdBetween(Long value1, Long value2) {
            addCriterion("kidCount_id between", value1, value2, "kidcountId");
            return (Criteria) this;
        }

        public Criteria andKidcountIdNotBetween(Long value1, Long value2) {
            addCriterion("kidCount_id not between", value1, value2, "kidcountId");
            return (Criteria) this;
        }

        public Criteria andEducationbackgroundIdIsNull() {
            addCriterion("educationBackground_id is null");
            return (Criteria) this;
        }

        public Criteria andEducationbackgroundIdIsNotNull() {
            addCriterion("educationBackground_id is not null");
            return (Criteria) this;
        }

        public Criteria andEducationbackgroundIdEqualTo(Long value) {
            addCriterion("educationBackground_id =", value, "educationbackgroundId");
            return (Criteria) this;
        }

        public Criteria andEducationbackgroundIdNotEqualTo(Long value) {
            addCriterion("educationBackground_id <>", value, "educationbackgroundId");
            return (Criteria) this;
        }

        public Criteria andEducationbackgroundIdGreaterThan(Long value) {
            addCriterion("educationBackground_id >", value, "educationbackgroundId");
            return (Criteria) this;
        }

        public Criteria andEducationbackgroundIdGreaterThanOrEqualTo(Long value) {
            addCriterion("educationBackground_id >=", value, "educationbackgroundId");
            return (Criteria) this;
        }

        public Criteria andEducationbackgroundIdLessThan(Long value) {
            addCriterion("educationBackground_id <", value, "educationbackgroundId");
            return (Criteria) this;
        }

        public Criteria andEducationbackgroundIdLessThanOrEqualTo(Long value) {
            addCriterion("educationBackground_id <=", value, "educationbackgroundId");
            return (Criteria) this;
        }

        public Criteria andEducationbackgroundIdIn(List<Long> values) {
            addCriterion("educationBackground_id in", values, "educationbackgroundId");
            return (Criteria) this;
        }

        public Criteria andEducationbackgroundIdNotIn(List<Long> values) {
            addCriterion("educationBackground_id not in", values, "educationbackgroundId");
            return (Criteria) this;
        }

        public Criteria andEducationbackgroundIdBetween(Long value1, Long value2) {
            addCriterion("educationBackground_id between", value1, value2, "educationbackgroundId");
            return (Criteria) this;
        }

        public Criteria andEducationbackgroundIdNotBetween(Long value1, Long value2) {
            addCriterion("educationBackground_id not between", value1, value2, "educationbackgroundId");
            return (Criteria) this;
        }

        public Criteria andHouseconditionIdIsNull() {
            addCriterion("houseCondition_id is null");
            return (Criteria) this;
        }

        public Criteria andHouseconditionIdIsNotNull() {
            addCriterion("houseCondition_id is not null");
            return (Criteria) this;
        }

        public Criteria andHouseconditionIdEqualTo(Long value) {
            addCriterion("houseCondition_id =", value, "houseconditionId");
            return (Criteria) this;
        }

        public Criteria andHouseconditionIdNotEqualTo(Long value) {
            addCriterion("houseCondition_id <>", value, "houseconditionId");
            return (Criteria) this;
        }

        public Criteria andHouseconditionIdGreaterThan(Long value) {
            addCriterion("houseCondition_id >", value, "houseconditionId");
            return (Criteria) this;
        }

        public Criteria andHouseconditionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("houseCondition_id >=", value, "houseconditionId");
            return (Criteria) this;
        }

        public Criteria andHouseconditionIdLessThan(Long value) {
            addCriterion("houseCondition_id <", value, "houseconditionId");
            return (Criteria) this;
        }

        public Criteria andHouseconditionIdLessThanOrEqualTo(Long value) {
            addCriterion("houseCondition_id <=", value, "houseconditionId");
            return (Criteria) this;
        }

        public Criteria andHouseconditionIdIn(List<Long> values) {
            addCriterion("houseCondition_id in", values, "houseconditionId");
            return (Criteria) this;
        }

        public Criteria andHouseconditionIdNotIn(List<Long> values) {
            addCriterion("houseCondition_id not in", values, "houseconditionId");
            return (Criteria) this;
        }

        public Criteria andHouseconditionIdBetween(Long value1, Long value2) {
            addCriterion("houseCondition_id between", value1, value2, "houseconditionId");
            return (Criteria) this;
        }

        public Criteria andHouseconditionIdNotBetween(Long value1, Long value2) {
            addCriterion("houseCondition_id not between", value1, value2, "houseconditionId");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
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