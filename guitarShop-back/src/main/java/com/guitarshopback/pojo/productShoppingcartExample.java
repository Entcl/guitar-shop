package com.guitarShopBack.pojo;

import java.util.ArrayList;
import java.util.List;

public class productShoppingcartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public productShoppingcartExample() {
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

        public Criteria andPsIdIsNull() {
            addCriterion("ps_id is null");
            return (Criteria) this;
        }

        public Criteria andPsIdIsNotNull() {
            addCriterion("ps_id is not null");
            return (Criteria) this;
        }

        public Criteria andPsIdEqualTo(Long value) {
            addCriterion("ps_id =", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotEqualTo(Long value) {
            addCriterion("ps_id <>", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdGreaterThan(Long value) {
            addCriterion("ps_id >", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ps_id >=", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdLessThan(Long value) {
            addCriterion("ps_id <", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdLessThanOrEqualTo(Long value) {
            addCriterion("ps_id <=", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdIn(List<Long> values) {
            addCriterion("ps_id in", values, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotIn(List<Long> values) {
            addCriterion("ps_id not in", values, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdBetween(Long value1, Long value2) {
            addCriterion("ps_id between", value1, value2, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotBetween(Long value1, Long value2) {
            addCriterion("ps_id not between", value1, value2, "psId");
            return (Criteria) this;
        }

        public Criteria andPiIdIsNull() {
            addCriterion("pi_id is null");
            return (Criteria) this;
        }

        public Criteria andPiIdIsNotNull() {
            addCriterion("pi_id is not null");
            return (Criteria) this;
        }

        public Criteria andPiIdEqualTo(Long value) {
            addCriterion("pi_id =", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdNotEqualTo(Long value) {
            addCriterion("pi_id <>", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdGreaterThan(Long value) {
            addCriterion("pi_id >", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pi_id >=", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdLessThan(Long value) {
            addCriterion("pi_id <", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdLessThanOrEqualTo(Long value) {
            addCriterion("pi_id <=", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdIn(List<Long> values) {
            addCriterion("pi_id in", values, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdNotIn(List<Long> values) {
            addCriterion("pi_id not in", values, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdBetween(Long value1, Long value2) {
            addCriterion("pi_id between", value1, value2, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdNotBetween(Long value1, Long value2) {
            addCriterion("pi_id not between", value1, value2, "piId");
            return (Criteria) this;
        }

        public Criteria andPiPriceIsNull() {
            addCriterion("pi_price is null");
            return (Criteria) this;
        }

        public Criteria andPiPriceIsNotNull() {
            addCriterion("pi_price is not null");
            return (Criteria) this;
        }

        public Criteria andPiPriceEqualTo(Double value) {
            addCriterion("pi_price =", value, "piPrice");
            return (Criteria) this;
        }

        public Criteria andPiPriceNotEqualTo(Double value) {
            addCriterion("pi_price <>", value, "piPrice");
            return (Criteria) this;
        }

        public Criteria andPiPriceGreaterThan(Double value) {
            addCriterion("pi_price >", value, "piPrice");
            return (Criteria) this;
        }

        public Criteria andPiPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("pi_price >=", value, "piPrice");
            return (Criteria) this;
        }

        public Criteria andPiPriceLessThan(Double value) {
            addCriterion("pi_price <", value, "piPrice");
            return (Criteria) this;
        }

        public Criteria andPiPriceLessThanOrEqualTo(Double value) {
            addCriterion("pi_price <=", value, "piPrice");
            return (Criteria) this;
        }

        public Criteria andPiPriceIn(List<Double> values) {
            addCriterion("pi_price in", values, "piPrice");
            return (Criteria) this;
        }

        public Criteria andPiPriceNotIn(List<Double> values) {
            addCriterion("pi_price not in", values, "piPrice");
            return (Criteria) this;
        }

        public Criteria andPiPriceBetween(Double value1, Double value2) {
            addCriterion("pi_price between", value1, value2, "piPrice");
            return (Criteria) this;
        }

        public Criteria andPiPriceNotBetween(Double value1, Double value2) {
            addCriterion("pi_price not between", value1, value2, "piPrice");
            return (Criteria) this;
        }

        public Criteria andPiAmountIsNull() {
            addCriterion("pi_amount is null");
            return (Criteria) this;
        }

        public Criteria andPiAmountIsNotNull() {
            addCriterion("pi_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPiAmountEqualTo(Integer value) {
            addCriterion("pi_amount =", value, "piAmount");
            return (Criteria) this;
        }

        public Criteria andPiAmountNotEqualTo(Integer value) {
            addCriterion("pi_amount <>", value, "piAmount");
            return (Criteria) this;
        }

        public Criteria andPiAmountGreaterThan(Integer value) {
            addCriterion("pi_amount >", value, "piAmount");
            return (Criteria) this;
        }

        public Criteria andPiAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("pi_amount >=", value, "piAmount");
            return (Criteria) this;
        }

        public Criteria andPiAmountLessThan(Integer value) {
            addCriterion("pi_amount <", value, "piAmount");
            return (Criteria) this;
        }

        public Criteria andPiAmountLessThanOrEqualTo(Integer value) {
            addCriterion("pi_amount <=", value, "piAmount");
            return (Criteria) this;
        }

        public Criteria andPiAmountIn(List<Integer> values) {
            addCriterion("pi_amount in", values, "piAmount");
            return (Criteria) this;
        }

        public Criteria andPiAmountNotIn(List<Integer> values) {
            addCriterion("pi_amount not in", values, "piAmount");
            return (Criteria) this;
        }

        public Criteria andPiAmountBetween(Integer value1, Integer value2) {
            addCriterion("pi_amount between", value1, value2, "piAmount");
            return (Criteria) this;
        }

        public Criteria andPiAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("pi_amount not between", value1, value2, "piAmount");
            return (Criteria) this;
        }

        public Criteria andPmIdIsNull() {
            addCriterion("pm_id is null");
            return (Criteria) this;
        }

        public Criteria andPmIdIsNotNull() {
            addCriterion("pm_id is not null");
            return (Criteria) this;
        }

        public Criteria andPmIdEqualTo(Long value) {
            addCriterion("pm_id =", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdNotEqualTo(Long value) {
            addCriterion("pm_id <>", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdGreaterThan(Long value) {
            addCriterion("pm_id >", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pm_id >=", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdLessThan(Long value) {
            addCriterion("pm_id <", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdLessThanOrEqualTo(Long value) {
            addCriterion("pm_id <=", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdIn(List<Long> values) {
            addCriterion("pm_id in", values, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdNotIn(List<Long> values) {
            addCriterion("pm_id not in", values, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdBetween(Long value1, Long value2) {
            addCriterion("pm_id between", value1, value2, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdNotBetween(Long value1, Long value2) {
            addCriterion("pm_id not between", value1, value2, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmNameIsNull() {
            addCriterion("pm_name is null");
            return (Criteria) this;
        }

        public Criteria andPmNameIsNotNull() {
            addCriterion("pm_name is not null");
            return (Criteria) this;
        }

        public Criteria andPmNameEqualTo(String value) {
            addCriterion("pm_name =", value, "pmName");
            return (Criteria) this;
        }

        public Criteria andPmNameNotEqualTo(String value) {
            addCriterion("pm_name <>", value, "pmName");
            return (Criteria) this;
        }

        public Criteria andPmNameGreaterThan(String value) {
            addCriterion("pm_name >", value, "pmName");
            return (Criteria) this;
        }

        public Criteria andPmNameGreaterThanOrEqualTo(String value) {
            addCriterion("pm_name >=", value, "pmName");
            return (Criteria) this;
        }

        public Criteria andPmNameLessThan(String value) {
            addCriterion("pm_name <", value, "pmName");
            return (Criteria) this;
        }

        public Criteria andPmNameLessThanOrEqualTo(String value) {
            addCriterion("pm_name <=", value, "pmName");
            return (Criteria) this;
        }

        public Criteria andPmNameLike(String value) {
            addCriterion("pm_name like", value, "pmName");
            return (Criteria) this;
        }

        public Criteria andPmNameNotLike(String value) {
            addCriterion("pm_name not like", value, "pmName");
            return (Criteria) this;
        }

        public Criteria andPmNameIn(List<String> values) {
            addCriterion("pm_name in", values, "pmName");
            return (Criteria) this;
        }

        public Criteria andPmNameNotIn(List<String> values) {
            addCriterion("pm_name not in", values, "pmName");
            return (Criteria) this;
        }

        public Criteria andPmNameBetween(String value1, String value2) {
            addCriterion("pm_name between", value1, value2, "pmName");
            return (Criteria) this;
        }

        public Criteria andPmNameNotBetween(String value1, String value2) {
            addCriterion("pm_name not between", value1, value2, "pmName");
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