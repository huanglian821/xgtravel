package com.stars.travel.model.base;

import java.util.Date;

public class Journey implements BaseBean {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String phone;

    private String name;

    private Date createtime;

    private Date updatetime;

    private Boolean isEnable;

    private Boolean isShared;

    private Integer topCount;

    private Short status;

    private String title;

    private String budget;

    private Integer totalday;

    private String destination;

    private Integer sharetimes;

    private String coverImage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Boolean getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }

    public Boolean getIsShared() {
        return isShared;
    }

    public void setIsShared(Boolean isShared) {
        this.isShared = isShared;
    }

    public Integer getTopCount() {
        return topCount;
    }

    public void setTopCount(Integer topCount) {
        this.topCount = topCount;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget == null ? null : budget.trim();
    }

    public Integer getTotalday() {
        return totalday;
    }

    public void setTotalday(Integer totalday) {
        this.totalday = totalday;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    public Integer getSharetimes() {
        return sharetimes;
    }

    public void setSharetimes(Integer sharetimes) {
        this.sharetimes = sharetimes;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage == null ? null : coverImage.trim();
    }

    /** 
     * 拷贝，将对象中的字段全部拷贝到子对象中
     * @param bean 接收对象的子类
     * @return 拷贝完成后的子类
     */ 
    public  <T extends Journey> T copy(T bean) {
        bean.setId(getId());
        bean.setPhone(getPhone());
        bean.setName(getName());
        bean.setCreatetime(getCreatetime());
        bean.setUpdatetime(getUpdatetime());
        bean.setIsEnable(getIsEnable());
        bean.setIsShared(getIsShared());
        bean.setTopCount(getTopCount());
        bean.setStatus(getStatus());
        bean.setTitle(getTitle());
        bean.setBudget(getBudget());
        bean.setTotalday(getTotalday());
        bean.setDestination(getDestination());
        bean.setSharetimes(getSharetimes());
        bean.setCoverImage(getCoverImage());
        return bean;
    }

    /** 
     * 格式化显示
     */ 
    @Override
    public String toString() {
        return "{" + 
        	"id:" + getId() + 
        	", phone:" + getPhone() + 
        	", name:" + getName() + 
        	", createtime:" + getCreatetime() + 
        	", updatetime:" + getUpdatetime() + 
        	", isEnable:" + getIsEnable() + 
        	", isShared:" + getIsShared() + 
        	", topCount:" + getTopCount() + 
        	", status:" + getStatus() + 
        	", title:" + getTitle() + 
        	", budget:" + getBudget() + 
        	", totalday:" + getTotalday() + 
        	", destination:" + getDestination() + 
        	", sharetimes:" + getSharetimes() + 
        	", coverImage:" + getCoverImage() + 
        "}";
    }
}