package cn.redinfo.biz.ba.oo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author liyl
 * @since 2019-12-05
 */
public class BasArchives implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "autoId", type = IdType.AUTO)
    private Integer autoId;
    private String mobile;
    private String url;
    @TableField("arcName")
    private String arcName;
    @TableField("idCard")
    private String idCard;
    private String birthday;
    private String gender;
    @TableField("registerAdd")
    private String registerAdd;
    private String income;
    private String nation;
    @TableField("healthStatus")
    private String healthStatus;
    private String address;
    private String medicare;
    @TableField("medicareHospital")
    private String medicareHospital;
    private String disease;
    private String contagion;
    @TableField("otherDis")
    private String otherDis;
    private String allergy;
    @TableField("areaId")
    private String areaId;
    @TableField("orgId")
    private Integer orgId;
    @TableField("pensionType")
    private String pensionType;
    private String contact;
    @TableField("isHistory")
    private Boolean isHistory;
    @TableField("contactTel")
    private String contactTel;
    @TableField("committeeCon")
    private String committeeCon;
    @TableField("committeeTel")
    private String committeeTel;
    @TableField("createTime")
    private LocalDateTime createTime;
    @TableField("updateTime")
    private LocalDateTime updateTime;
    @TableField("opUserId")
    private String opUserId;
    @TableField("opUserName")
    private String opUserName;
    @TableField("ownMoney")
    private Double ownMoney;
    @TableField("officeMoney")
    private Double officeMoney;
    private String lng;
    private String lat;
    @TableField("subsidyGrade")
    private Integer subsidyGrade;
    private Float remainder;
    @TableField("planLength")
    private Float planLength;
    @TableField("qCode")
    private String qCode;
    @TableField("loFlag")
    private Integer loFlag;
    private Integer able;
    private Integer type;


    public Integer getAutoId() {
        return autoId;
    }

    public void setAutoId(Integer autoId) {
        this.autoId = autoId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getArcName() {
        return arcName;
    }

    public void setArcName(String arcName) {
        this.arcName = arcName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRegisterAdd() {
        return registerAdd;
    }

    public void setRegisterAdd(String registerAdd) {
        this.registerAdd = registerAdd;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMedicare() {
        return medicare;
    }

    public void setMedicare(String medicare) {
        this.medicare = medicare;
    }

    public String getMedicareHospital() {
        return medicareHospital;
    }

    public void setMedicareHospital(String medicareHospital) {
        this.medicareHospital = medicareHospital;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getContagion() {
        return contagion;
    }

    public void setContagion(String contagion) {
        this.contagion = contagion;
    }

    public String getOtherDis() {
        return otherDis;
    }

    public void setOtherDis(String otherDis) {
        this.otherDis = otherDis;
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getPensionType() {
        return pensionType;
    }

    public void setPensionType(String pensionType) {
        this.pensionType = pensionType;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Boolean getHistory() {
        return isHistory;
    }

    public void setHistory(Boolean isHistory) {
        this.isHistory = isHistory;
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    public String getCommitteeCon() {
        return committeeCon;
    }

    public void setCommitteeCon(String committeeCon) {
        this.committeeCon = committeeCon;
    }

    public String getCommitteeTel() {
        return committeeTel;
    }

    public void setCommitteeTel(String committeeTel) {
        this.committeeTel = committeeTel;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public String getOpUserId() {
        return opUserId;
    }

    public void setOpUserId(String opUserId) {
        this.opUserId = opUserId;
    }

    public String getOpUserName() {
        return opUserName;
    }

    public void setOpUserName(String opUserName) {
        this.opUserName = opUserName;
    }

    public Double getOwnMoney() {
        return ownMoney;
    }

    public void setOwnMoney(Double ownMoney) {
        this.ownMoney = ownMoney;
    }

    public Double getOfficeMoney() {
        return officeMoney;
    }

    public void setOfficeMoney(Double officeMoney) {
        this.officeMoney = officeMoney;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public Integer getSubsidyGrade() {
        return subsidyGrade;
    }

    public void setSubsidyGrade(Integer subsidyGrade) {
        this.subsidyGrade = subsidyGrade;
    }

    public Float getRemainder() {
        return remainder;
    }

    public void setRemainder(Float remainder) {
        this.remainder = remainder;
    }

    public Float getPlanLength() {
        return planLength;
    }

    public void setPlanLength(Float planLength) {
        this.planLength = planLength;
    }

    public String getqCode() {
        return qCode;
    }

    public void setqCode(String qCode) {
        this.qCode = qCode;
    }

    public Integer getLoFlag() {
        return loFlag;
    }

    public void setLoFlag(Integer loFlag) {
        this.loFlag = loFlag;
    }

    public Integer getAble() {
        return able;
    }

    public void setAble(Integer able) {
        this.able = able;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "BasArchives{" +
        ", autoId=" + autoId +
        ", mobile=" + mobile +
        ", url=" + url +
        ", arcName=" + arcName +
        ", idCard=" + idCard +
        ", birthday=" + birthday +
        ", gender=" + gender +
        ", registerAdd=" + registerAdd +
        ", income=" + income +
        ", nation=" + nation +
        ", healthStatus=" + healthStatus +
        ", address=" + address +
        ", medicare=" + medicare +
        ", medicareHospital=" + medicareHospital +
        ", disease=" + disease +
        ", contagion=" + contagion +
        ", otherDis=" + otherDis +
        ", allergy=" + allergy +
        ", areaId=" + areaId +
        ", orgId=" + orgId +
        ", pensionType=" + pensionType +
        ", contact=" + contact +
        ", isHistory=" + isHistory +
        ", contactTel=" + contactTel +
        ", committeeCon=" + committeeCon +
        ", committeeTel=" + committeeTel +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", opUserId=" + opUserId +
        ", opUserName=" + opUserName +
        ", ownMoney=" + ownMoney +
        ", officeMoney=" + officeMoney +
        ", lng=" + lng +
        ", lat=" + lat +
        ", subsidyGrade=" + subsidyGrade +
        ", remainder=" + remainder +
        ", planLength=" + planLength +
        ", qCode=" + qCode +
        ", loFlag=" + loFlag +
        ", able=" + able +
        ", type=" + type +
        "}";
    }
}
