package com.guitarShopBack.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserInfomationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfomationExample() {
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

        public Criteria andUiIdIsNull() {
            addCriterion("ui_id is null");
            return (Criteria) this;
        }

        public Criteria andUiIdIsNotNull() {
            addCriterion("ui_id is not null");
            return (Criteria) this;
        }

        public Criteria andUiIdEqualTo(Integer value) {
            addCriterion("ui_id =", value, "uiId");
            return (Criteria) this;
        }

        public Criteria andUiIdNotEqualTo(Integer value) {
            addCriterion("ui_id <>", value, "uiId");
            return (Criteria) this;
        }

        public Criteria andUiIdGreaterThan(Integer value) {
            addCriterion("ui_id >", value, "uiId");
            return (Criteria) this;
        }

        public Criteria andUiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ui_id >=", value, "uiId");
            return (Criteria) this;
        }

        public Criteria andUiIdLessThan(Integer value) {
            addCriterion("ui_id <", value, "uiId");
            return (Criteria) this;
        }

        public Criteria andUiIdLessThanOrEqualTo(Integer value) {
            addCriterion("ui_id <=", value, "uiId");
            return (Criteria) this;
        }

        public Criteria andUiIdIn(List<Integer> values) {
            addCriterion("ui_id in", values, "uiId");
            return (Criteria) this;
        }

        public Criteria andUiIdNotIn(List<Integer> values) {
            addCriterion("ui_id not in", values, "uiId");
            return (Criteria) this;
        }

        public Criteria andUiIdBetween(Integer value1, Integer value2) {
            addCriterion("ui_id between", value1, value2, "uiId");
            return (Criteria) this;
        }

        public Criteria andUiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ui_id not between", value1, value2, "uiId");
            return (Criteria) this;
        }

        public Criteria andUiNameIsNull() {
            addCriterion("ui_name is null");
            return (Criteria) this;
        }

        public Criteria andUiNameIsNotNull() {
            addCriterion("ui_name is not null");
            return (Criteria) this;
        }

        public Criteria andUiNameEqualTo(String value) {
            addCriterion("ui_name =", value, "uiName");
            return (Criteria) this;
        }

        public Criteria andUiNameNotEqualTo(String value) {
            addCriterion("ui_name <>", value, "uiName");
            return (Criteria) this;
        }

        public Criteria andUiNameGreaterThan(String value) {
            addCriterion("ui_name >", value, "uiName");
            return (Criteria) this;
        }

        public Criteria andUiNameGreaterThanOrEqualTo(String value) {
            addCriterion("ui_name >=", value, "uiName");
            return (Criteria) this;
        }

        public Criteria andUiNameLessThan(String value) {
            addCriterion("ui_name <", value, "uiName");
            return (Criteria) this;
        }

        public Criteria andUiNameLessThanOrEqualTo(String value) {
            addCriterion("ui_name <=", value, "uiName");
            return (Criteria) this;
        }

        public Criteria andUiNameLike(String value) {
            addCriterion("ui_name like", value, "uiName");
            return (Criteria) this;
        }

        public Criteria andUiNameNotLike(String value) {
            addCriterion("ui_name not like", value, "uiName");
            return (Criteria) this;
        }

        public Criteria andUiNameIn(List<String> values) {
            addCriterion("ui_name in", values, "uiName");
            return (Criteria) this;
        }

        public Criteria andUiNameNotIn(List<String> values) {
            addCriterion("ui_name not in", values, "uiName");
            return (Criteria) this;
        }

        public Criteria andUiNameBetween(String value1, String value2) {
            addCriterion("ui_name between", value1, value2, "uiName");
            return (Criteria) this;
        }

        public Criteria andUiNameNotBetween(String value1, String value2) {
            addCriterion("ui_name not between", value1, value2, "uiName");
            return (Criteria) this;
        }

        public Criteria andUiAddressIsNull() {
            addCriterion("ui_address is null");
            return (Criteria) this;
        }

        public Criteria andUiAddressIsNotNull() {
            addCriterion("ui_address is not null");
            return (Criteria) this;
        }

        public Criteria andUiAddressEqualTo(String value) {
            addCriterion("ui_address =", value, "uiAddress");
            return (Criteria) this;
        }

        public Criteria andUiAddressNotEqualTo(String value) {
            addCriterion("ui_address <>", value, "uiAddress");
            return (Criteria) this;
        }

        public Criteria andUiAddressGreaterThan(String value) {
            addCriterion("ui_address >", value, "uiAddress");
            return (Criteria) this;
        }

        public Criteria andUiAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ui_address >=", value, "uiAddress");
            return (Criteria) this;
        }

        public Criteria andUiAddressLessThan(String value) {
            addCriterion("ui_address <", value, "uiAddress");
            return (Criteria) this;
        }

        public Criteria andUiAddressLessThanOrEqualTo(String value) {
            addCriterion("ui_address <=", value, "uiAddress");
            return (Criteria) this;
        }

        public Criteria andUiAddressLike(String value) {
            addCriterion("ui_address like", value, "uiAddress");
            return (Criteria) this;
        }

        public Criteria andUiAddressNotLike(String value) {
            addCriterion("ui_address not like", value, "uiAddress");
            return (Criteria) this;
        }

        public Criteria andUiAddressIn(List<String> values) {
            addCriterion("ui_address in", values, "uiAddress");
            return (Criteria) this;
        }

        public Criteria andUiAddressNotIn(List<String> values) {
            addCriterion("ui_address not in", values, "uiAddress");
            return (Criteria) this;
        }

        public Criteria andUiAddressBetween(String value1, String value2) {
            addCriterion("ui_address between", value1, value2, "uiAddress");
            return (Criteria) this;
        }

        public Criteria andUiAddressNotBetween(String value1, String value2) {
            addCriterion("ui_address not between", value1, value2, "uiAddress");
            return (Criteria) this;
        }

        public Criteria andUiPhoneIsNull() {
            addCriterion("ui_phone is null");
            return (Criteria) this;
        }

        public Criteria andUiPhoneIsNotNull() {
            addCriterion("ui_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUiPhoneEqualTo(String value) {
            addCriterion("ui_phone =", value, "uiPhone");
            return (Criteria) this;
        }

        public Criteria andUiPhoneNotEqualTo(String value) {
            addCriterion("ui_phone <>", value, "uiPhone");
            return (Criteria) this;
        }

        public Criteria andUiPhoneGreaterThan(String value) {
            addCriterion("ui_phone >", value, "uiPhone");
            return (Criteria) this;
        }

        public Criteria andUiPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("ui_phone >=", value, "uiPhone");
            return (Criteria) this;
        }

        public Criteria andUiPhoneLessThan(String value) {
            addCriterion("ui_phone <", value, "uiPhone");
            return (Criteria) this;
        }

        public Criteria andUiPhoneLessThanOrEqualTo(String value) {
            addCriterion("ui_phone <=", value, "uiPhone");
            return (Criteria) this;
        }

        public Criteria andUiPhoneLike(String value) {
            addCriterion("ui_phone like", value, "uiPhone");
            return (Criteria) this;
        }

        public Criteria andUiPhoneNotLike(String value) {
            addCriterion("ui_phone not like", value, "uiPhone");
            return (Criteria) this;
        }

        public Criteria andUiPhoneIn(List<String> values) {
            addCriterion("ui_phone in", values, "uiPhone");
            return (Criteria) this;
        }

        public Criteria andUiPhoneNotIn(List<String> values) {
            addCriterion("ui_phone not in", values, "uiPhone");
            return (Criteria) this;
        }

        public Criteria andUiPhoneBetween(String value1, String value2) {
            addCriterion("ui_phone between", value1, value2, "uiPhone");
            return (Criteria) this;
        }

        public Criteria andUiPhoneNotBetween(String value1, String value2) {
            addCriterion("ui_phone not between", value1, value2, "uiPhone");
            return (Criteria) this;
        }

        public Criteria andUiZipIsNull() {
            addCriterion("ui_zip is null");
            return (Criteria) this;
        }

        public Criteria andUiZipIsNotNull() {
            addCriterion("ui_zip is not null");
            return (Criteria) this;
        }

        public Criteria andUiZipEqualTo(Integer value) {
            addCriterion("ui_zip =", value, "uiZip");
            return (Criteria) this;
        }

        public Criteria andUiZipNotEqualTo(Integer value) {
            addCriterion("ui_zip <>", value, "uiZip");
            return (Criteria) this;
        }

        public Criteria andUiZipGreaterThan(Integer value) {
            addCriterion("ui_zip >", value, "uiZip");
            return (Criteria) this;
        }

        public Criteria andUiZipGreaterThanOrEqualTo(Integer value) {
            addCriterion("ui_zip >=", value, "uiZip");
            return (Criteria) this;
        }

        public Criteria andUiZipLessThan(Integer value) {
            addCriterion("ui_zip <", value, "uiZip");
            return (Criteria) this;
        }

        public Criteria andUiZipLessThanOrEqualTo(Integer value) {
            addCriterion("ui_zip <=", value, "uiZip");
            return (Criteria) this;
        }

        public Criteria andUiZipIn(List<Integer> values) {
            addCriterion("ui_zip in", values, "uiZip");
            return (Criteria) this;
        }

        public Criteria andUiZipNotIn(List<Integer> values) {
            addCriterion("ui_zip not in", values, "uiZip");
            return (Criteria) this;
        }

        public Criteria andUiZipBetween(Integer value1, Integer value2) {
            addCriterion("ui_zip between", value1, value2, "uiZip");
            return (Criteria) this;
        }

        public Criteria andUiZipNotBetween(Integer value1, Integer value2) {
            addCriterion("ui_zip not between", value1, value2, "uiZip");
            return (Criteria) this;
        }

        public Criteria andUiEmailIsNull() {
            addCriterion("ui_email is null");
            return (Criteria) this;
        }

        public Criteria andUiEmailIsNotNull() {
            addCriterion("ui_email is not null");
            return (Criteria) this;
        }

        public Criteria andUiEmailEqualTo(String value) {
            addCriterion("ui_email =", value, "uiEmail");
            return (Criteria) this;
        }

        public Criteria andUiEmailNotEqualTo(String value) {
            addCriterion("ui_email <>", value, "uiEmail");
            return (Criteria) this;
        }

        public Criteria andUiEmailGreaterThan(String value) {
            addCriterion("ui_email >", value, "uiEmail");
            return (Criteria) this;
        }

        public Criteria andUiEmailGreaterThanOrEqualTo(String value) {
            addCriterion("ui_email >=", value, "uiEmail");
            return (Criteria) this;
        }

        public Criteria andUiEmailLessThan(String value) {
            addCriterion("ui_email <", value, "uiEmail");
            return (Criteria) this;
        }

        public Criteria andUiEmailLessThanOrEqualTo(String value) {
            addCriterion("ui_email <=", value, "uiEmail");
            return (Criteria) this;
        }

        public Criteria andUiEmailLike(String value) {
            addCriterion("ui_email like", value, "uiEmail");
            return (Criteria) this;
        }

        public Criteria andUiEmailNotLike(String value) {
            addCriterion("ui_email not like", value, "uiEmail");
            return (Criteria) this;
        }

        public Criteria andUiEmailIn(List<String> values) {
            addCriterion("ui_email in", values, "uiEmail");
            return (Criteria) this;
        }

        public Criteria andUiEmailNotIn(List<String> values) {
            addCriterion("ui_email not in", values, "uiEmail");
            return (Criteria) this;
        }

        public Criteria andUiEmailBetween(String value1, String value2) {
            addCriterion("ui_email between", value1, value2, "uiEmail");
            return (Criteria) this;
        }

        public Criteria andUiEmailNotBetween(String value1, String value2) {
            addCriterion("ui_email not between", value1, value2, "uiEmail");
            return (Criteria) this;
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