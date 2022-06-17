package com.guitarShopBack.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserLoginExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserLoginExample() {
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

        public Criteria andUlIdIsNull() {
            addCriterion("ul_id is null");
            return (Criteria) this;
        }

        public Criteria andUlIdIsNotNull() {
            addCriterion("ul_id is not null");
            return (Criteria) this;
        }

        public Criteria andUlIdEqualTo(Long value) {
            addCriterion("ul_id =", value, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlIdNotEqualTo(Long value) {
            addCriterion("ul_id <>", value, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlIdGreaterThan(Long value) {
            addCriterion("ul_id >", value, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ul_id >=", value, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlIdLessThan(Long value) {
            addCriterion("ul_id <", value, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlIdLessThanOrEqualTo(Long value) {
            addCriterion("ul_id <=", value, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlIdIn(List<Long> values) {
            addCriterion("ul_id in", values, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlIdNotIn(List<Long> values) {
            addCriterion("ul_id not in", values, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlIdBetween(Long value1, Long value2) {
            addCriterion("ul_id between", value1, value2, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlIdNotBetween(Long value1, Long value2) {
            addCriterion("ul_id not between", value1, value2, "ulId");
            return (Criteria) this;
        }

        public Criteria andUlNameIsNull() {
            addCriterion("ul_name is null");
            return (Criteria) this;
        }

        public Criteria andUlNameIsNotNull() {
            addCriterion("ul_name is not null");
            return (Criteria) this;
        }

        public Criteria andUlNameEqualTo(String value) {
            addCriterion("ul_name =", value, "ulName");
            return (Criteria) this;
        }

        public Criteria andUlNameNotEqualTo(String value) {
            addCriterion("ul_name <>", value, "ulName");
            return (Criteria) this;
        }

        public Criteria andUlNameGreaterThan(String value) {
            addCriterion("ul_name >", value, "ulName");
            return (Criteria) this;
        }

        public Criteria andUlNameGreaterThanOrEqualTo(String value) {
            addCriterion("ul_name >=", value, "ulName");
            return (Criteria) this;
        }

        public Criteria andUlNameLessThan(String value) {
            addCriterion("ul_name <", value, "ulName");
            return (Criteria) this;
        }

        public Criteria andUlNameLessThanOrEqualTo(String value) {
            addCriterion("ul_name <=", value, "ulName");
            return (Criteria) this;
        }

        public Criteria andUlNameLike(String value) {
            addCriterion("ul_name like", value, "ulName");
            return (Criteria) this;
        }

        public Criteria andUlNameNotLike(String value) {
            addCriterion("ul_name not like", value, "ulName");
            return (Criteria) this;
        }

        public Criteria andUlNameIn(List<String> values) {
            addCriterion("ul_name in", values, "ulName");
            return (Criteria) this;
        }

        public Criteria andUlNameNotIn(List<String> values) {
            addCriterion("ul_name not in", values, "ulName");
            return (Criteria) this;
        }

        public Criteria andUlNameBetween(String value1, String value2) {
            addCriterion("ul_name between", value1, value2, "ulName");
            return (Criteria) this;
        }

        public Criteria andUlNameNotBetween(String value1, String value2) {
            addCriterion("ul_name not between", value1, value2, "ulName");
            return (Criteria) this;
        }

        public Criteria andUlPasswordIsNull() {
            addCriterion("ul_password is null");
            return (Criteria) this;
        }

        public Criteria andUlPasswordIsNotNull() {
            addCriterion("ul_password is not null");
            return (Criteria) this;
        }

        public Criteria andUlPasswordEqualTo(String value) {
            addCriterion("ul_password =", value, "ulPassword");
            return (Criteria) this;
        }

        public Criteria andUlPasswordNotEqualTo(String value) {
            addCriterion("ul_password <>", value, "ulPassword");
            return (Criteria) this;
        }

        public Criteria andUlPasswordGreaterThan(String value) {
            addCriterion("ul_password >", value, "ulPassword");
            return (Criteria) this;
        }

        public Criteria andUlPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("ul_password >=", value, "ulPassword");
            return (Criteria) this;
        }

        public Criteria andUlPasswordLessThan(String value) {
            addCriterion("ul_password <", value, "ulPassword");
            return (Criteria) this;
        }

        public Criteria andUlPasswordLessThanOrEqualTo(String value) {
            addCriterion("ul_password <=", value, "ulPassword");
            return (Criteria) this;
        }

        public Criteria andUlPasswordLike(String value) {
            addCriterion("ul_password like", value, "ulPassword");
            return (Criteria) this;
        }

        public Criteria andUlPasswordNotLike(String value) {
            addCriterion("ul_password not like", value, "ulPassword");
            return (Criteria) this;
        }

        public Criteria andUlPasswordIn(List<String> values) {
            addCriterion("ul_password in", values, "ulPassword");
            return (Criteria) this;
        }

        public Criteria andUlPasswordNotIn(List<String> values) {
            addCriterion("ul_password not in", values, "ulPassword");
            return (Criteria) this;
        }

        public Criteria andUlPasswordBetween(String value1, String value2) {
            addCriterion("ul_password between", value1, value2, "ulPassword");
            return (Criteria) this;
        }

        public Criteria andUlPasswordNotBetween(String value1, String value2) {
            addCriterion("ul_password not between", value1, value2, "ulPassword");
            return (Criteria) this;
        }

        public Criteria andUlTypeIsNull() {
            addCriterion("ul_type is null");
            return (Criteria) this;
        }

        public Criteria andUlTypeIsNotNull() {
            addCriterion("ul_type is not null");
            return (Criteria) this;
        }

        public Criteria andUlTypeEqualTo(Boolean value) {
            addCriterion("ul_type =", value, "ulType");
            return (Criteria) this;
        }

        public Criteria andUlTypeNotEqualTo(Boolean value) {
            addCriterion("ul_type <>", value, "ulType");
            return (Criteria) this;
        }

        public Criteria andUlTypeGreaterThan(Boolean value) {
            addCriterion("ul_type >", value, "ulType");
            return (Criteria) this;
        }

        public Criteria andUlTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ul_type >=", value, "ulType");
            return (Criteria) this;
        }

        public Criteria andUlTypeLessThan(Boolean value) {
            addCriterion("ul_type <", value, "ulType");
            return (Criteria) this;
        }

        public Criteria andUlTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("ul_type <=", value, "ulType");
            return (Criteria) this;
        }

        public Criteria andUlTypeIn(List<Boolean> values) {
            addCriterion("ul_type in", values, "ulType");
            return (Criteria) this;
        }

        public Criteria andUlTypeNotIn(List<Boolean> values) {
            addCriterion("ul_type not in", values, "ulType");
            return (Criteria) this;
        }

        public Criteria andUlTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("ul_type between", value1, value2, "ulType");
            return (Criteria) this;
        }

        public Criteria andUlTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ul_type not between", value1, value2, "ulType");
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