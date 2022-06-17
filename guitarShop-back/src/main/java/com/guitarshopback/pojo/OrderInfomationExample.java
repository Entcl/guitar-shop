package com.guitarShopBack.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrderInfomationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderInfomationExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andOiIdIsNull() {
            addCriterion("oi_id is null");
            return (Criteria) this;
        }

        public Criteria andOiIdIsNotNull() {
            addCriterion("oi_id is not null");
            return (Criteria) this;
        }

        public Criteria andOiIdEqualTo(Long value) {
            addCriterion("oi_id =", value, "oiId");
            return (Criteria) this;
        }

        public Criteria andOiIdNotEqualTo(Long value) {
            addCriterion("oi_id <>", value, "oiId");
            return (Criteria) this;
        }

        public Criteria andOiIdGreaterThan(Long value) {
            addCriterion("oi_id >", value, "oiId");
            return (Criteria) this;
        }

        public Criteria andOiIdGreaterThanOrEqualTo(Long value) {
            addCriterion("oi_id >=", value, "oiId");
            return (Criteria) this;
        }

        public Criteria andOiIdLessThan(Long value) {
            addCriterion("oi_id <", value, "oiId");
            return (Criteria) this;
        }

        public Criteria andOiIdLessThanOrEqualTo(Long value) {
            addCriterion("oi_id <=", value, "oiId");
            return (Criteria) this;
        }

        public Criteria andOiIdIn(List<Long> values) {
            addCriterion("oi_id in", values, "oiId");
            return (Criteria) this;
        }

        public Criteria andOiIdNotIn(List<Long> values) {
            addCriterion("oi_id not in", values, "oiId");
            return (Criteria) this;
        }

        public Criteria andOiIdBetween(Long value1, Long value2) {
            addCriterion("oi_id between", value1, value2, "oiId");
            return (Criteria) this;
        }

        public Criteria andOiIdNotBetween(Long value1, Long value2) {
            addCriterion("oi_id not between", value1, value2, "oiId");
            return (Criteria) this;
        }

        public Criteria andOiDateIsNull() {
            addCriterion("oi_date is null");
            return (Criteria) this;
        }

        public Criteria andOiDateIsNotNull() {
            addCriterion("oi_date is not null");
            return (Criteria) this;
        }

        public Criteria andOiDateEqualTo(Date value) {
            addCriterionForJDBCDate("oi_date =", value, "oiDate");
            return (Criteria) this;
        }

        public Criteria andOiDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("oi_date <>", value, "oiDate");
            return (Criteria) this;
        }

        public Criteria andOiDateGreaterThan(Date value) {
            addCriterionForJDBCDate("oi_date >", value, "oiDate");
            return (Criteria) this;
        }

        public Criteria andOiDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("oi_date >=", value, "oiDate");
            return (Criteria) this;
        }

        public Criteria andOiDateLessThan(Date value) {
            addCriterionForJDBCDate("oi_date <", value, "oiDate");
            return (Criteria) this;
        }

        public Criteria andOiDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("oi_date <=", value, "oiDate");
            return (Criteria) this;
        }

        public Criteria andOiDateIn(List<Date> values) {
            addCriterionForJDBCDate("oi_date in", values, "oiDate");
            return (Criteria) this;
        }

        public Criteria andOiDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("oi_date not in", values, "oiDate");
            return (Criteria) this;
        }

        public Criteria andOiDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("oi_date between", value1, value2, "oiDate");
            return (Criteria) this;
        }

        public Criteria andOiDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("oi_date not between", value1, value2, "oiDate");
            return (Criteria) this;
        }

        public Criteria andOiStatusIsNull() {
            addCriterion("oi_status is null");
            return (Criteria) this;
        }

        public Criteria andOiStatusIsNotNull() {
            addCriterion("oi_status is not null");
            return (Criteria) this;
        }

        public Criteria andOiStatusEqualTo(Integer value) {
            addCriterion("oi_status =", value, "oiStatus");
            return (Criteria) this;
        }

        public Criteria andOiStatusNotEqualTo(Integer value) {
            addCriterion("oi_status <>", value, "oiStatus");
            return (Criteria) this;
        }

        public Criteria andOiStatusGreaterThan(Integer value) {
            addCriterion("oi_status >", value, "oiStatus");
            return (Criteria) this;
        }

        public Criteria andOiStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("oi_status >=", value, "oiStatus");
            return (Criteria) this;
        }

        public Criteria andOiStatusLessThan(Integer value) {
            addCriterion("oi_status <", value, "oiStatus");
            return (Criteria) this;
        }

        public Criteria andOiStatusLessThanOrEqualTo(Integer value) {
            addCriterion("oi_status <=", value, "oiStatus");
            return (Criteria) this;
        }

        public Criteria andOiStatusIn(List<Integer> values) {
            addCriterion("oi_status in", values, "oiStatus");
            return (Criteria) this;
        }

        public Criteria andOiStatusNotIn(List<Integer> values) {
            addCriterion("oi_status not in", values, "oiStatus");
            return (Criteria) this;
        }

        public Criteria andOiStatusBetween(Integer value1, Integer value2) {
            addCriterion("oi_status between", value1, value2, "oiStatus");
            return (Criteria) this;
        }

        public Criteria andOiStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("oi_status not between", value1, value2, "oiStatus");
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

        public Criteria andPiIdEqualTo(Integer value) {
            addCriterion("pi_id =", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdNotEqualTo(Integer value) {
            addCriterion("pi_id <>", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdGreaterThan(Integer value) {
            addCriterion("pi_id >", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pi_id >=", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdLessThan(Integer value) {
            addCriterion("pi_id <", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdLessThanOrEqualTo(Integer value) {
            addCriterion("pi_id <=", value, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdIn(List<Integer> values) {
            addCriterion("pi_id in", values, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdNotIn(List<Integer> values) {
            addCriterion("pi_id not in", values, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdBetween(Integer value1, Integer value2) {
            addCriterion("pi_id between", value1, value2, "piId");
            return (Criteria) this;
        }

        public Criteria andPiIdNotBetween(Integer value1, Integer value2) {
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