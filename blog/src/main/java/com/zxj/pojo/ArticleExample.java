package com.zxj.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
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

        public Criteria andArticleIdIsNull() {
            addCriterion("article_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNotNull() {
            addCriterion("article_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleIdEqualTo(String value) {
            addCriterion("article_id =", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotEqualTo(String value) {
            addCriterion("article_id <>", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThan(String value) {
            addCriterion("article_id >", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThanOrEqualTo(String value) {
            addCriterion("article_id >=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThan(String value) {
            addCriterion("article_id <", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThanOrEqualTo(String value) {
            addCriterion("article_id <=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLike(String value) {
            addCriterion("article_id like", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotLike(String value) {
            addCriterion("article_id not like", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIn(List<String> values) {
            addCriterion("article_id in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotIn(List<String> values) {
            addCriterion("article_id not in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdBetween(String value1, String value2) {
            addCriterion("article_id between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotBetween(String value1, String value2) {
            addCriterion("article_id not between", value1, value2, "articleId");
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

        public Criteria andOverviewIsNull() {
            addCriterion("overview is null");
            return (Criteria) this;
        }

        public Criteria andOverviewIsNotNull() {
            addCriterion("overview is not null");
            return (Criteria) this;
        }

        public Criteria andOverviewEqualTo(String value) {
            addCriterion("overview =", value, "overview");
            return (Criteria) this;
        }

        public Criteria andOverviewNotEqualTo(String value) {
            addCriterion("overview <>", value, "overview");
            return (Criteria) this;
        }

        public Criteria andOverviewGreaterThan(String value) {
            addCriterion("overview >", value, "overview");
            return (Criteria) this;
        }

        public Criteria andOverviewGreaterThanOrEqualTo(String value) {
            addCriterion("overview >=", value, "overview");
            return (Criteria) this;
        }

        public Criteria andOverviewLessThan(String value) {
            addCriterion("overview <", value, "overview");
            return (Criteria) this;
        }

        public Criteria andOverviewLessThanOrEqualTo(String value) {
            addCriterion("overview <=", value, "overview");
            return (Criteria) this;
        }

        public Criteria andOverviewLike(String value) {
            addCriterion("overview like", value, "overview");
            return (Criteria) this;
        }

        public Criteria andOverviewNotLike(String value) {
            addCriterion("overview not like", value, "overview");
            return (Criteria) this;
        }

        public Criteria andOverviewIn(List<String> values) {
            addCriterion("overview in", values, "overview");
            return (Criteria) this;
        }

        public Criteria andOverviewNotIn(List<String> values) {
            addCriterion("overview not in", values, "overview");
            return (Criteria) this;
        }

        public Criteria andOverviewBetween(String value1, String value2) {
            addCriterion("overview between", value1, value2, "overview");
            return (Criteria) this;
        }

        public Criteria andOverviewNotBetween(String value1, String value2) {
            addCriterion("overview not between", value1, value2, "overview");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andMarkdownIsNull() {
            addCriterion("markdown is null");
            return (Criteria) this;
        }

        public Criteria andMarkdownIsNotNull() {
            addCriterion("markdown is not null");
            return (Criteria) this;
        }

        public Criteria andMarkdownEqualTo(String value) {
            addCriterion("markdown =", value, "markdown");
            return (Criteria) this;
        }

        public Criteria andMarkdownNotEqualTo(String value) {
            addCriterion("markdown <>", value, "markdown");
            return (Criteria) this;
        }

        public Criteria andMarkdownGreaterThan(String value) {
            addCriterion("markdown >", value, "markdown");
            return (Criteria) this;
        }

        public Criteria andMarkdownGreaterThanOrEqualTo(String value) {
            addCriterion("markdown >=", value, "markdown");
            return (Criteria) this;
        }

        public Criteria andMarkdownLessThan(String value) {
            addCriterion("markdown <", value, "markdown");
            return (Criteria) this;
        }

        public Criteria andMarkdownLessThanOrEqualTo(String value) {
            addCriterion("markdown <=", value, "markdown");
            return (Criteria) this;
        }

        public Criteria andMarkdownLike(String value) {
            addCriterion("markdown like", value, "markdown");
            return (Criteria) this;
        }

        public Criteria andMarkdownNotLike(String value) {
            addCriterion("markdown not like", value, "markdown");
            return (Criteria) this;
        }

        public Criteria andMarkdownIn(List<String> values) {
            addCriterion("markdown in", values, "markdown");
            return (Criteria) this;
        }

        public Criteria andMarkdownNotIn(List<String> values) {
            addCriterion("markdown not in", values, "markdown");
            return (Criteria) this;
        }

        public Criteria andMarkdownBetween(String value1, String value2) {
            addCriterion("markdown between", value1, value2, "markdown");
            return (Criteria) this;
        }

        public Criteria andMarkdownNotBetween(String value1, String value2) {
            addCriterion("markdown not between", value1, value2, "markdown");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andSortOneIsNull() {
            addCriterion("sort_one is null");
            return (Criteria) this;
        }

        public Criteria andSortOneIsNotNull() {
            addCriterion("sort_one is not null");
            return (Criteria) this;
        }

        public Criteria andSortOneEqualTo(String value) {
            addCriterion("sort_one =", value, "sortOne");
            return (Criteria) this;
        }

        public Criteria andSortOneNotEqualTo(String value) {
            addCriterion("sort_one <>", value, "sortOne");
            return (Criteria) this;
        }

        public Criteria andSortOneGreaterThan(String value) {
            addCriterion("sort_one >", value, "sortOne");
            return (Criteria) this;
        }

        public Criteria andSortOneGreaterThanOrEqualTo(String value) {
            addCriterion("sort_one >=", value, "sortOne");
            return (Criteria) this;
        }

        public Criteria andSortOneLessThan(String value) {
            addCriterion("sort_one <", value, "sortOne");
            return (Criteria) this;
        }

        public Criteria andSortOneLessThanOrEqualTo(String value) {
            addCriterion("sort_one <=", value, "sortOne");
            return (Criteria) this;
        }

        public Criteria andSortOneLike(String value) {
            addCriterion("sort_one like", value, "sortOne");
            return (Criteria) this;
        }

        public Criteria andSortOneNotLike(String value) {
            addCriterion("sort_one not like", value, "sortOne");
            return (Criteria) this;
        }

        public Criteria andSortOneIn(List<String> values) {
            addCriterion("sort_one in", values, "sortOne");
            return (Criteria) this;
        }

        public Criteria andSortOneNotIn(List<String> values) {
            addCriterion("sort_one not in", values, "sortOne");
            return (Criteria) this;
        }

        public Criteria andSortOneBetween(String value1, String value2) {
            addCriterion("sort_one between", value1, value2, "sortOne");
            return (Criteria) this;
        }

        public Criteria andSortOneNotBetween(String value1, String value2) {
            addCriterion("sort_one not between", value1, value2, "sortOne");
            return (Criteria) this;
        }

        public Criteria andSortTwoIsNull() {
            addCriterion("sort_two is null");
            return (Criteria) this;
        }

        public Criteria andSortTwoIsNotNull() {
            addCriterion("sort_two is not null");
            return (Criteria) this;
        }

        public Criteria andSortTwoEqualTo(String value) {
            addCriterion("sort_two =", value, "sortTwo");
            return (Criteria) this;
        }

        public Criteria andSortTwoNotEqualTo(String value) {
            addCriterion("sort_two <>", value, "sortTwo");
            return (Criteria) this;
        }

        public Criteria andSortTwoGreaterThan(String value) {
            addCriterion("sort_two >", value, "sortTwo");
            return (Criteria) this;
        }

        public Criteria andSortTwoGreaterThanOrEqualTo(String value) {
            addCriterion("sort_two >=", value, "sortTwo");
            return (Criteria) this;
        }

        public Criteria andSortTwoLessThan(String value) {
            addCriterion("sort_two <", value, "sortTwo");
            return (Criteria) this;
        }

        public Criteria andSortTwoLessThanOrEqualTo(String value) {
            addCriterion("sort_two <=", value, "sortTwo");
            return (Criteria) this;
        }

        public Criteria andSortTwoLike(String value) {
            addCriterion("sort_two like", value, "sortTwo");
            return (Criteria) this;
        }

        public Criteria andSortTwoNotLike(String value) {
            addCriterion("sort_two not like", value, "sortTwo");
            return (Criteria) this;
        }

        public Criteria andSortTwoIn(List<String> values) {
            addCriterion("sort_two in", values, "sortTwo");
            return (Criteria) this;
        }

        public Criteria andSortTwoNotIn(List<String> values) {
            addCriterion("sort_two not in", values, "sortTwo");
            return (Criteria) this;
        }

        public Criteria andSortTwoBetween(String value1, String value2) {
            addCriterion("sort_two between", value1, value2, "sortTwo");
            return (Criteria) this;
        }

        public Criteria andSortTwoNotBetween(String value1, String value2) {
            addCriterion("sort_two not between", value1, value2, "sortTwo");
            return (Criteria) this;
        }

        public Criteria andImageLargeIsNull() {
            addCriterion("image_large is null");
            return (Criteria) this;
        }

        public Criteria andImageLargeIsNotNull() {
            addCriterion("image_large is not null");
            return (Criteria) this;
        }

        public Criteria andImageLargeEqualTo(String value) {
            addCriterion("image_large =", value, "imageLarge");
            return (Criteria) this;
        }

        public Criteria andImageLargeNotEqualTo(String value) {
            addCriterion("image_large <>", value, "imageLarge");
            return (Criteria) this;
        }

        public Criteria andImageLargeGreaterThan(String value) {
            addCriterion("image_large >", value, "imageLarge");
            return (Criteria) this;
        }

        public Criteria andImageLargeGreaterThanOrEqualTo(String value) {
            addCriterion("image_large >=", value, "imageLarge");
            return (Criteria) this;
        }

        public Criteria andImageLargeLessThan(String value) {
            addCriterion("image_large <", value, "imageLarge");
            return (Criteria) this;
        }

        public Criteria andImageLargeLessThanOrEqualTo(String value) {
            addCriterion("image_large <=", value, "imageLarge");
            return (Criteria) this;
        }

        public Criteria andImageLargeLike(String value) {
            addCriterion("image_large like", value, "imageLarge");
            return (Criteria) this;
        }

        public Criteria andImageLargeNotLike(String value) {
            addCriterion("image_large not like", value, "imageLarge");
            return (Criteria) this;
        }

        public Criteria andImageLargeIn(List<String> values) {
            addCriterion("image_large in", values, "imageLarge");
            return (Criteria) this;
        }

        public Criteria andImageLargeNotIn(List<String> values) {
            addCriterion("image_large not in", values, "imageLarge");
            return (Criteria) this;
        }

        public Criteria andImageLargeBetween(String value1, String value2) {
            addCriterion("image_large between", value1, value2, "imageLarge");
            return (Criteria) this;
        }

        public Criteria andImageLargeNotBetween(String value1, String value2) {
            addCriterion("image_large not between", value1, value2, "imageLarge");
            return (Criteria) this;
        }

        public Criteria andImageSmallIsNull() {
            addCriterion("image_small is null");
            return (Criteria) this;
        }

        public Criteria andImageSmallIsNotNull() {
            addCriterion("image_small is not null");
            return (Criteria) this;
        }

        public Criteria andImageSmallEqualTo(String value) {
            addCriterion("image_small =", value, "imageSmall");
            return (Criteria) this;
        }

        public Criteria andImageSmallNotEqualTo(String value) {
            addCriterion("image_small <>", value, "imageSmall");
            return (Criteria) this;
        }

        public Criteria andImageSmallGreaterThan(String value) {
            addCriterion("image_small >", value, "imageSmall");
            return (Criteria) this;
        }

        public Criteria andImageSmallGreaterThanOrEqualTo(String value) {
            addCriterion("image_small >=", value, "imageSmall");
            return (Criteria) this;
        }

        public Criteria andImageSmallLessThan(String value) {
            addCriterion("image_small <", value, "imageSmall");
            return (Criteria) this;
        }

        public Criteria andImageSmallLessThanOrEqualTo(String value) {
            addCriterion("image_small <=", value, "imageSmall");
            return (Criteria) this;
        }

        public Criteria andImageSmallLike(String value) {
            addCriterion("image_small like", value, "imageSmall");
            return (Criteria) this;
        }

        public Criteria andImageSmallNotLike(String value) {
            addCriterion("image_small not like", value, "imageSmall");
            return (Criteria) this;
        }

        public Criteria andImageSmallIn(List<String> values) {
            addCriterion("image_small in", values, "imageSmall");
            return (Criteria) this;
        }

        public Criteria andImageSmallNotIn(List<String> values) {
            addCriterion("image_small not in", values, "imageSmall");
            return (Criteria) this;
        }

        public Criteria andImageSmallBetween(String value1, String value2) {
            addCriterion("image_small between", value1, value2, "imageSmall");
            return (Criteria) this;
        }

        public Criteria andImageSmallNotBetween(String value1, String value2) {
            addCriterion("image_small not between", value1, value2, "imageSmall");
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