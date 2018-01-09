package com.zxcf.core.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BidrequestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BidrequestExample() {
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

        public Criteria andReturntypeIsNull() {
            addCriterion("returnType is null");
            return (Criteria) this;
        }

        public Criteria andReturntypeIsNotNull() {
            addCriterion("returnType is not null");
            return (Criteria) this;
        }

        public Criteria andReturntypeEqualTo(Integer value) {
            addCriterion("returnType =", value, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeNotEqualTo(Integer value) {
            addCriterion("returnType <>", value, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeGreaterThan(Integer value) {
            addCriterion("returnType >", value, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("returnType >=", value, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeLessThan(Integer value) {
            addCriterion("returnType <", value, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeLessThanOrEqualTo(Integer value) {
            addCriterion("returnType <=", value, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeIn(List<Integer> values) {
            addCriterion("returnType in", values, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeNotIn(List<Integer> values) {
            addCriterion("returnType not in", values, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeBetween(Integer value1, Integer value2) {
            addCriterion("returnType between", value1, value2, "returntype");
            return (Criteria) this;
        }

        public Criteria andReturntypeNotBetween(Integer value1, Integer value2) {
            addCriterion("returnType not between", value1, value2, "returntype");
            return (Criteria) this;
        }

        public Criteria andBidrequesttypeIsNull() {
            addCriterion("bidRequestType is null");
            return (Criteria) this;
        }

        public Criteria andBidrequesttypeIsNotNull() {
            addCriterion("bidRequestType is not null");
            return (Criteria) this;
        }

        public Criteria andBidrequesttypeEqualTo(Byte value) {
            addCriterion("bidRequestType =", value, "bidrequesttype");
            return (Criteria) this;
        }

        public Criteria andBidrequesttypeNotEqualTo(Byte value) {
            addCriterion("bidRequestType <>", value, "bidrequesttype");
            return (Criteria) this;
        }

        public Criteria andBidrequesttypeGreaterThan(Byte value) {
            addCriterion("bidRequestType >", value, "bidrequesttype");
            return (Criteria) this;
        }

        public Criteria andBidrequesttypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("bidRequestType >=", value, "bidrequesttype");
            return (Criteria) this;
        }

        public Criteria andBidrequesttypeLessThan(Byte value) {
            addCriterion("bidRequestType <", value, "bidrequesttype");
            return (Criteria) this;
        }

        public Criteria andBidrequesttypeLessThanOrEqualTo(Byte value) {
            addCriterion("bidRequestType <=", value, "bidrequesttype");
            return (Criteria) this;
        }

        public Criteria andBidrequesttypeIn(List<Byte> values) {
            addCriterion("bidRequestType in", values, "bidrequesttype");
            return (Criteria) this;
        }

        public Criteria andBidrequesttypeNotIn(List<Byte> values) {
            addCriterion("bidRequestType not in", values, "bidrequesttype");
            return (Criteria) this;
        }

        public Criteria andBidrequesttypeBetween(Byte value1, Byte value2) {
            addCriterion("bidRequestType between", value1, value2, "bidrequesttype");
            return (Criteria) this;
        }

        public Criteria andBidrequesttypeNotBetween(Byte value1, Byte value2) {
            addCriterion("bidRequestType not between", value1, value2, "bidrequesttype");
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

        public Criteria andBidrequeststateEqualTo(Byte value) {
            addCriterion("bidRequestState =", value, "bidrequeststate");
            return (Criteria) this;
        }

        public Criteria andBidrequeststateNotEqualTo(Byte value) {
            addCriterion("bidRequestState <>", value, "bidrequeststate");
            return (Criteria) this;
        }

        public Criteria andBidrequeststateGreaterThan(Byte value) {
            addCriterion("bidRequestState >", value, "bidrequeststate");
            return (Criteria) this;
        }

        public Criteria andBidrequeststateGreaterThanOrEqualTo(Byte value) {
            addCriterion("bidRequestState >=", value, "bidrequeststate");
            return (Criteria) this;
        }

        public Criteria andBidrequeststateLessThan(Byte value) {
            addCriterion("bidRequestState <", value, "bidrequeststate");
            return (Criteria) this;
        }

        public Criteria andBidrequeststateLessThanOrEqualTo(Byte value) {
            addCriterion("bidRequestState <=", value, "bidrequeststate");
            return (Criteria) this;
        }

        public Criteria andBidrequeststateIn(List<Byte> values) {
            addCriterion("bidRequestState in", values, "bidrequeststate");
            return (Criteria) this;
        }

        public Criteria andBidrequeststateNotIn(List<Byte> values) {
            addCriterion("bidRequestState not in", values, "bidrequeststate");
            return (Criteria) this;
        }

        public Criteria andBidrequeststateBetween(Byte value1, Byte value2) {
            addCriterion("bidRequestState between", value1, value2, "bidrequeststate");
            return (Criteria) this;
        }

        public Criteria andBidrequeststateNotBetween(Byte value1, Byte value2) {
            addCriterion("bidRequestState not between", value1, value2, "bidrequeststate");
            return (Criteria) this;
        }

        public Criteria andBidrequestamountIsNull() {
            addCriterion("bidRequestAmount is null");
            return (Criteria) this;
        }

        public Criteria andBidrequestamountIsNotNull() {
            addCriterion("bidRequestAmount is not null");
            return (Criteria) this;
        }

        public Criteria andBidrequestamountEqualTo(BigDecimal value) {
            addCriterion("bidRequestAmount =", value, "bidrequestamount");
            return (Criteria) this;
        }

        public Criteria andBidrequestamountNotEqualTo(BigDecimal value) {
            addCriterion("bidRequestAmount <>", value, "bidrequestamount");
            return (Criteria) this;
        }

        public Criteria andBidrequestamountGreaterThan(BigDecimal value) {
            addCriterion("bidRequestAmount >", value, "bidrequestamount");
            return (Criteria) this;
        }

        public Criteria andBidrequestamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bidRequestAmount >=", value, "bidrequestamount");
            return (Criteria) this;
        }

        public Criteria andBidrequestamountLessThan(BigDecimal value) {
            addCriterion("bidRequestAmount <", value, "bidrequestamount");
            return (Criteria) this;
        }

        public Criteria andBidrequestamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bidRequestAmount <=", value, "bidrequestamount");
            return (Criteria) this;
        }

        public Criteria andBidrequestamountIn(List<BigDecimal> values) {
            addCriterion("bidRequestAmount in", values, "bidrequestamount");
            return (Criteria) this;
        }

        public Criteria andBidrequestamountNotIn(List<BigDecimal> values) {
            addCriterion("bidRequestAmount not in", values, "bidrequestamount");
            return (Criteria) this;
        }

        public Criteria andBidrequestamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bidRequestAmount between", value1, value2, "bidrequestamount");
            return (Criteria) this;
        }

        public Criteria andBidrequestamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bidRequestAmount not between", value1, value2, "bidrequestamount");
            return (Criteria) this;
        }

        public Criteria andCurrentrateIsNull() {
            addCriterion("currentRate is null");
            return (Criteria) this;
        }

        public Criteria andCurrentrateIsNotNull() {
            addCriterion("currentRate is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentrateEqualTo(BigDecimal value) {
            addCriterion("currentRate =", value, "currentrate");
            return (Criteria) this;
        }

        public Criteria andCurrentrateNotEqualTo(BigDecimal value) {
            addCriterion("currentRate <>", value, "currentrate");
            return (Criteria) this;
        }

        public Criteria andCurrentrateGreaterThan(BigDecimal value) {
            addCriterion("currentRate >", value, "currentrate");
            return (Criteria) this;
        }

        public Criteria andCurrentrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("currentRate >=", value, "currentrate");
            return (Criteria) this;
        }

        public Criteria andCurrentrateLessThan(BigDecimal value) {
            addCriterion("currentRate <", value, "currentrate");
            return (Criteria) this;
        }

        public Criteria andCurrentrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("currentRate <=", value, "currentrate");
            return (Criteria) this;
        }

        public Criteria andCurrentrateIn(List<BigDecimal> values) {
            addCriterion("currentRate in", values, "currentrate");
            return (Criteria) this;
        }

        public Criteria andCurrentrateNotIn(List<BigDecimal> values) {
            addCriterion("currentRate not in", values, "currentrate");
            return (Criteria) this;
        }

        public Criteria andCurrentrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("currentRate between", value1, value2, "currentrate");
            return (Criteria) this;
        }

        public Criteria andCurrentrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("currentRate not between", value1, value2, "currentrate");
            return (Criteria) this;
        }

        public Criteria andMonthes2returnIsNull() {
            addCriterion("monthes2Return is null");
            return (Criteria) this;
        }

        public Criteria andMonthes2returnIsNotNull() {
            addCriterion("monthes2Return is not null");
            return (Criteria) this;
        }

        public Criteria andMonthes2returnEqualTo(Byte value) {
            addCriterion("monthes2Return =", value, "monthes2return");
            return (Criteria) this;
        }

        public Criteria andMonthes2returnNotEqualTo(Byte value) {
            addCriterion("monthes2Return <>", value, "monthes2return");
            return (Criteria) this;
        }

        public Criteria andMonthes2returnGreaterThan(Byte value) {
            addCriterion("monthes2Return >", value, "monthes2return");
            return (Criteria) this;
        }

        public Criteria andMonthes2returnGreaterThanOrEqualTo(Byte value) {
            addCriterion("monthes2Return >=", value, "monthes2return");
            return (Criteria) this;
        }

        public Criteria andMonthes2returnLessThan(Byte value) {
            addCriterion("monthes2Return <", value, "monthes2return");
            return (Criteria) this;
        }

        public Criteria andMonthes2returnLessThanOrEqualTo(Byte value) {
            addCriterion("monthes2Return <=", value, "monthes2return");
            return (Criteria) this;
        }

        public Criteria andMonthes2returnIn(List<Byte> values) {
            addCriterion("monthes2Return in", values, "monthes2return");
            return (Criteria) this;
        }

        public Criteria andMonthes2returnNotIn(List<Byte> values) {
            addCriterion("monthes2Return not in", values, "monthes2return");
            return (Criteria) this;
        }

        public Criteria andMonthes2returnBetween(Byte value1, Byte value2) {
            addCriterion("monthes2Return between", value1, value2, "monthes2return");
            return (Criteria) this;
        }

        public Criteria andMonthes2returnNotBetween(Byte value1, Byte value2) {
            addCriterion("monthes2Return not between", value1, value2, "monthes2return");
            return (Criteria) this;
        }

        public Criteria andBidcountIsNull() {
            addCriterion("bidCount is null");
            return (Criteria) this;
        }

        public Criteria andBidcountIsNotNull() {
            addCriterion("bidCount is not null");
            return (Criteria) this;
        }

        public Criteria andBidcountEqualTo(Integer value) {
            addCriterion("bidCount =", value, "bidcount");
            return (Criteria) this;
        }

        public Criteria andBidcountNotEqualTo(Integer value) {
            addCriterion("bidCount <>", value, "bidcount");
            return (Criteria) this;
        }

        public Criteria andBidcountGreaterThan(Integer value) {
            addCriterion("bidCount >", value, "bidcount");
            return (Criteria) this;
        }

        public Criteria andBidcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("bidCount >=", value, "bidcount");
            return (Criteria) this;
        }

        public Criteria andBidcountLessThan(Integer value) {
            addCriterion("bidCount <", value, "bidcount");
            return (Criteria) this;
        }

        public Criteria andBidcountLessThanOrEqualTo(Integer value) {
            addCriterion("bidCount <=", value, "bidcount");
            return (Criteria) this;
        }

        public Criteria andBidcountIn(List<Integer> values) {
            addCriterion("bidCount in", values, "bidcount");
            return (Criteria) this;
        }

        public Criteria andBidcountNotIn(List<Integer> values) {
            addCriterion("bidCount not in", values, "bidcount");
            return (Criteria) this;
        }

        public Criteria andBidcountBetween(Integer value1, Integer value2) {
            addCriterion("bidCount between", value1, value2, "bidcount");
            return (Criteria) this;
        }

        public Criteria andBidcountNotBetween(Integer value1, Integer value2) {
            addCriterion("bidCount not between", value1, value2, "bidcount");
            return (Criteria) this;
        }

        public Criteria andTotalrewardamountIsNull() {
            addCriterion("totalRewardAmount is null");
            return (Criteria) this;
        }

        public Criteria andTotalrewardamountIsNotNull() {
            addCriterion("totalRewardAmount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalrewardamountEqualTo(BigDecimal value) {
            addCriterion("totalRewardAmount =", value, "totalrewardamount");
            return (Criteria) this;
        }

        public Criteria andTotalrewardamountNotEqualTo(BigDecimal value) {
            addCriterion("totalRewardAmount <>", value, "totalrewardamount");
            return (Criteria) this;
        }

        public Criteria andTotalrewardamountGreaterThan(BigDecimal value) {
            addCriterion("totalRewardAmount >", value, "totalrewardamount");
            return (Criteria) this;
        }

        public Criteria andTotalrewardamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("totalRewardAmount >=", value, "totalrewardamount");
            return (Criteria) this;
        }

        public Criteria andTotalrewardamountLessThan(BigDecimal value) {
            addCriterion("totalRewardAmount <", value, "totalrewardamount");
            return (Criteria) this;
        }

        public Criteria andTotalrewardamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("totalRewardAmount <=", value, "totalrewardamount");
            return (Criteria) this;
        }

        public Criteria andTotalrewardamountIn(List<BigDecimal> values) {
            addCriterion("totalRewardAmount in", values, "totalrewardamount");
            return (Criteria) this;
        }

        public Criteria andTotalrewardamountNotIn(List<BigDecimal> values) {
            addCriterion("totalRewardAmount not in", values, "totalrewardamount");
            return (Criteria) this;
        }

        public Criteria andTotalrewardamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalRewardAmount between", value1, value2, "totalrewardamount");
            return (Criteria) this;
        }

        public Criteria andTotalrewardamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalRewardAmount not between", value1, value2, "totalrewardamount");
            return (Criteria) this;
        }

        public Criteria andCurrentsumIsNull() {
            addCriterion("currentSum is null");
            return (Criteria) this;
        }

        public Criteria andCurrentsumIsNotNull() {
            addCriterion("currentSum is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentsumEqualTo(BigDecimal value) {
            addCriterion("currentSum =", value, "currentsum");
            return (Criteria) this;
        }

        public Criteria andCurrentsumNotEqualTo(BigDecimal value) {
            addCriterion("currentSum <>", value, "currentsum");
            return (Criteria) this;
        }

        public Criteria andCurrentsumGreaterThan(BigDecimal value) {
            addCriterion("currentSum >", value, "currentsum");
            return (Criteria) this;
        }

        public Criteria andCurrentsumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("currentSum >=", value, "currentsum");
            return (Criteria) this;
        }

        public Criteria andCurrentsumLessThan(BigDecimal value) {
            addCriterion("currentSum <", value, "currentsum");
            return (Criteria) this;
        }

        public Criteria andCurrentsumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("currentSum <=", value, "currentsum");
            return (Criteria) this;
        }

        public Criteria andCurrentsumIn(List<BigDecimal> values) {
            addCriterion("currentSum in", values, "currentsum");
            return (Criteria) this;
        }

        public Criteria andCurrentsumNotIn(List<BigDecimal> values) {
            addCriterion("currentSum not in", values, "currentsum");
            return (Criteria) this;
        }

        public Criteria andCurrentsumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("currentSum between", value1, value2, "currentsum");
            return (Criteria) this;
        }

        public Criteria andCurrentsumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("currentSum not between", value1, value2, "currentsum");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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

        public Criteria andDisabledateIsNull() {
            addCriterion("disableDate is null");
            return (Criteria) this;
        }

        public Criteria andDisabledateIsNotNull() {
            addCriterion("disableDate is not null");
            return (Criteria) this;
        }

        public Criteria andDisabledateEqualTo(Date value) {
            addCriterion("disableDate =", value, "disabledate");
            return (Criteria) this;
        }

        public Criteria andDisabledateNotEqualTo(Date value) {
            addCriterion("disableDate <>", value, "disabledate");
            return (Criteria) this;
        }

        public Criteria andDisabledateGreaterThan(Date value) {
            addCriterion("disableDate >", value, "disabledate");
            return (Criteria) this;
        }

        public Criteria andDisabledateGreaterThanOrEqualTo(Date value) {
            addCriterion("disableDate >=", value, "disabledate");
            return (Criteria) this;
        }

        public Criteria andDisabledateLessThan(Date value) {
            addCriterion("disableDate <", value, "disabledate");
            return (Criteria) this;
        }

        public Criteria andDisabledateLessThanOrEqualTo(Date value) {
            addCriterion("disableDate <=", value, "disabledate");
            return (Criteria) this;
        }

        public Criteria andDisabledateIn(List<Date> values) {
            addCriterion("disableDate in", values, "disabledate");
            return (Criteria) this;
        }

        public Criteria andDisabledateNotIn(List<Date> values) {
            addCriterion("disableDate not in", values, "disabledate");
            return (Criteria) this;
        }

        public Criteria andDisabledateBetween(Date value1, Date value2) {
            addCriterion("disableDate between", value1, value2, "disabledate");
            return (Criteria) this;
        }

        public Criteria andDisabledateNotBetween(Date value1, Date value2) {
            addCriterion("disableDate not between", value1, value2, "disabledate");
            return (Criteria) this;
        }

        public Criteria andCreateuserIdIsNull() {
            addCriterion("createuser_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateuserIdIsNotNull() {
            addCriterion("createuser_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuserIdEqualTo(Long value) {
            addCriterion("createuser_id =", value, "createuserId");
            return (Criteria) this;
        }

        public Criteria andCreateuserIdNotEqualTo(Long value) {
            addCriterion("createuser_id <>", value, "createuserId");
            return (Criteria) this;
        }

        public Criteria andCreateuserIdGreaterThan(Long value) {
            addCriterion("createuser_id >", value, "createuserId");
            return (Criteria) this;
        }

        public Criteria andCreateuserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("createuser_id >=", value, "createuserId");
            return (Criteria) this;
        }

        public Criteria andCreateuserIdLessThan(Long value) {
            addCriterion("createuser_id <", value, "createuserId");
            return (Criteria) this;
        }

        public Criteria andCreateuserIdLessThanOrEqualTo(Long value) {
            addCriterion("createuser_id <=", value, "createuserId");
            return (Criteria) this;
        }

        public Criteria andCreateuserIdIn(List<Long> values) {
            addCriterion("createuser_id in", values, "createuserId");
            return (Criteria) this;
        }

        public Criteria andCreateuserIdNotIn(List<Long> values) {
            addCriterion("createuser_id not in", values, "createuserId");
            return (Criteria) this;
        }

        public Criteria andCreateuserIdBetween(Long value1, Long value2) {
            addCriterion("createuser_id between", value1, value2, "createuserId");
            return (Criteria) this;
        }

        public Criteria andCreateuserIdNotBetween(Long value1, Long value2) {
            addCriterion("createuser_id not between", value1, value2, "createuserId");
            return (Criteria) this;
        }

        public Criteria andDisabledaysIsNull() {
            addCriterion("disableDays is null");
            return (Criteria) this;
        }

        public Criteria andDisabledaysIsNotNull() {
            addCriterion("disableDays is not null");
            return (Criteria) this;
        }

        public Criteria andDisabledaysEqualTo(Byte value) {
            addCriterion("disableDays =", value, "disabledays");
            return (Criteria) this;
        }

        public Criteria andDisabledaysNotEqualTo(Byte value) {
            addCriterion("disableDays <>", value, "disabledays");
            return (Criteria) this;
        }

        public Criteria andDisabledaysGreaterThan(Byte value) {
            addCriterion("disableDays >", value, "disabledays");
            return (Criteria) this;
        }

        public Criteria andDisabledaysGreaterThanOrEqualTo(Byte value) {
            addCriterion("disableDays >=", value, "disabledays");
            return (Criteria) this;
        }

        public Criteria andDisabledaysLessThan(Byte value) {
            addCriterion("disableDays <", value, "disabledays");
            return (Criteria) this;
        }

        public Criteria andDisabledaysLessThanOrEqualTo(Byte value) {
            addCriterion("disableDays <=", value, "disabledays");
            return (Criteria) this;
        }

        public Criteria andDisabledaysIn(List<Byte> values) {
            addCriterion("disableDays in", values, "disabledays");
            return (Criteria) this;
        }

        public Criteria andDisabledaysNotIn(List<Byte> values) {
            addCriterion("disableDays not in", values, "disabledays");
            return (Criteria) this;
        }

        public Criteria andDisabledaysBetween(Byte value1, Byte value2) {
            addCriterion("disableDays between", value1, value2, "disabledays");
            return (Criteria) this;
        }

        public Criteria andDisabledaysNotBetween(Byte value1, Byte value2) {
            addCriterion("disableDays not between", value1, value2, "disabledays");
            return (Criteria) this;
        }

        public Criteria andMinbidamountIsNull() {
            addCriterion("minBidAmount is null");
            return (Criteria) this;
        }

        public Criteria andMinbidamountIsNotNull() {
            addCriterion("minBidAmount is not null");
            return (Criteria) this;
        }

        public Criteria andMinbidamountEqualTo(BigDecimal value) {
            addCriterion("minBidAmount =", value, "minbidamount");
            return (Criteria) this;
        }

        public Criteria andMinbidamountNotEqualTo(BigDecimal value) {
            addCriterion("minBidAmount <>", value, "minbidamount");
            return (Criteria) this;
        }

        public Criteria andMinbidamountGreaterThan(BigDecimal value) {
            addCriterion("minBidAmount >", value, "minbidamount");
            return (Criteria) this;
        }

        public Criteria andMinbidamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("minBidAmount >=", value, "minbidamount");
            return (Criteria) this;
        }

        public Criteria andMinbidamountLessThan(BigDecimal value) {
            addCriterion("minBidAmount <", value, "minbidamount");
            return (Criteria) this;
        }

        public Criteria andMinbidamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("minBidAmount <=", value, "minbidamount");
            return (Criteria) this;
        }

        public Criteria andMinbidamountIn(List<BigDecimal> values) {
            addCriterion("minBidAmount in", values, "minbidamount");
            return (Criteria) this;
        }

        public Criteria andMinbidamountNotIn(List<BigDecimal> values) {
            addCriterion("minBidAmount not in", values, "minbidamount");
            return (Criteria) this;
        }

        public Criteria andMinbidamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("minBidAmount between", value1, value2, "minbidamount");
            return (Criteria) this;
        }

        public Criteria andMinbidamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("minBidAmount not between", value1, value2, "minbidamount");
            return (Criteria) this;
        }

        public Criteria andApplytimeIsNull() {
            addCriterion("applyTime is null");
            return (Criteria) this;
        }

        public Criteria andApplytimeIsNotNull() {
            addCriterion("applyTime is not null");
            return (Criteria) this;
        }

        public Criteria andApplytimeEqualTo(Date value) {
            addCriterion("applyTime =", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotEqualTo(Date value) {
            addCriterion("applyTime <>", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeGreaterThan(Date value) {
            addCriterion("applyTime >", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("applyTime >=", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeLessThan(Date value) {
            addCriterion("applyTime <", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeLessThanOrEqualTo(Date value) {
            addCriterion("applyTime <=", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeIn(List<Date> values) {
            addCriterion("applyTime in", values, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotIn(List<Date> values) {
            addCriterion("applyTime not in", values, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeBetween(Date value1, Date value2) {
            addCriterion("applyTime between", value1, value2, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotBetween(Date value1, Date value2) {
            addCriterion("applyTime not between", value1, value2, "applytime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIsNull() {
            addCriterion("publishTime is null");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIsNotNull() {
            addCriterion("publishTime is not null");
            return (Criteria) this;
        }

        public Criteria andPublishtimeEqualTo(Date value) {
            addCriterion("publishTime =", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotEqualTo(Date value) {
            addCriterion("publishTime <>", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeGreaterThan(Date value) {
            addCriterion("publishTime >", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("publishTime >=", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLessThan(Date value) {
            addCriterion("publishTime <", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLessThanOrEqualTo(Date value) {
            addCriterion("publishTime <=", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIn(List<Date> values) {
            addCriterion("publishTime in", values, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotIn(List<Date> values) {
            addCriterion("publishTime not in", values, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeBetween(Date value1, Date value2) {
            addCriterion("publishTime between", value1, value2, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotBetween(Date value1, Date value2) {
            addCriterion("publishTime not between", value1, value2, "publishtime");
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