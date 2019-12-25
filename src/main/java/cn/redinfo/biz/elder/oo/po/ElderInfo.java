package cn.redinfo.biz.elder.oo.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * <p>
 * 
 * </p>
 *
 * @author liyl
 * @since 2019-12-05
 */
public class ElderInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private String elderName;
    private String elderTel;
    private String idCard;
    private String url;
    private String cardUrl;
    private String birthday;
    private String gender;
    private String nativePlace;
    private String nation;
    private String address;
    private String disease;
    private String contagion;
    private String otherDisease;
    private String allergy;
    private String healthStatus;
    private String areaId;
    private Long orgId;
    /**
     * 0社会老人 1政府购买居家养老
     */
    private Long pensionType;
    private String linkmanName;
    private String linkmanTel;
    private Integer isDel;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;
    private String remark;
    private Long elderId;
    private String qrCode;
    private String lng;
    private String lat;
    /**
     * 0要定位 1不要
     */
    private Integer isLocation;
    /**
     * 信息采集编号
     */
    private Long collectId;
    private Integer subLvl;
    private BigDecimal perAccount;
    private BigDecimal subAccount;
    private Integer selfcareAbility;
    private Integer elderType;
    private Integer currentSituation;
    /**
     * 0没有 1有
     */
    private Integer isPlan;
    private List<ElderInfoMember> memList;
    
    
    public List<ElderInfoMember> getMemList() {
        return memList;
    }
    public void setMemList(List<ElderInfoMember> memList) {
        this.memList = memList;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getElderName() {
        return elderName;
    }
    public void setElderName(String elderName) {
        this.elderName = elderName;
    }
    public String getElderTel() {
        return elderTel;
    }
    public void setElderTel(String elderTel) {
        this.elderTel = elderTel;
    }
    public String getIdCard() {
        return idCard;
    }
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getCardUrl() {
        return cardUrl;
    }
    public void setCardUrl(String cardUrl) {
        this.cardUrl = cardUrl;
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
    public String getNativePlace() {
        return nativePlace;
    }
    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }
    public String getNation() {
        return nation;
    }
    public void setNation(String nation) {
        this.nation = nation;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
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
    public String getOtherDisease() {
        return otherDisease;
    }
    public void setOtherDisease(String otherDisease) {
        this.otherDisease = otherDisease;
    }
    public String getAllergy() {
        return allergy;
    }
    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }
    public String getHealthStatus() {
        return healthStatus;
    }
    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }
    public String getAreaId() {
        return areaId;
    }
    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }
    public Long getOrgId() {
        return orgId;
    }
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }
    public Long getPensionType() {
        return pensionType;
    }
    public void setPensionType(Long pensionType) {
        this.pensionType = pensionType;
    }
    public String getLinkmanName() {
        return linkmanName;
    }
    public void setLinkmanName(String linkmanName) {
        this.linkmanName = linkmanName;
    }
    public String getLinkmanTel() {
        return linkmanTel;
    }
    public void setLinkmanTel(String linkmanTel) {
        this.linkmanTel = linkmanTel;
    }
    public Integer getIsDel() {
        return isDel;
    }
    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }
    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
    public LocalDateTime getGmtModified() {
        return gmtModified;
    }
    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public Long getElderId() {
        return elderId;
    }
    public void setElderId(Long elderId) {
        this.elderId = elderId;
    }
    public String getQrCode() {
        return qrCode;
    }
    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
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
    public Integer getIsLocation() {
        return isLocation;
    }
    public void setIsLocation(Integer isLocation) {
        this.isLocation = isLocation;
    }
    public Long getCollectId() {
        return collectId;
    }
    public void setCollectId(Long collectId) {
        this.collectId = collectId;
    }
    public Integer getSubLvl() {
        return subLvl;
    }
    public void setSubLvl(Integer subLvl) {
        this.subLvl = subLvl;
    }
    public BigDecimal getPerAccount() {
        return perAccount;
    }
    public void setPerAccount(BigDecimal perAccount) {
        this.perAccount = perAccount;
    }
    public BigDecimal getSubAccount() {
        return subAccount;
    }
    public void setSubAccount(BigDecimal subAccount) {
        this.subAccount = subAccount;
    }
    public Integer getSelfcareAbility() {
        return selfcareAbility;
    }
    public void setSelfcareAbility(Integer selfcareAbility) {
        this.selfcareAbility = selfcareAbility;
    }
    public Integer getElderType() {
        return elderType;
    }
    public void setElderType(Integer elderType) {
        this.elderType = elderType;
    }
    public Integer getCurrentSituation() {
        return currentSituation;
    }
    public void setCurrentSituation(Integer currentSituation) {
        this.currentSituation = currentSituation;
    }
    public Integer getIsPlan() {
        return isPlan;
    }
    public void setIsPlan(Integer isPlan) {
        this.isPlan = isPlan;
    }
    @Override
    public String toString() {
        return "ElderInfo [id=" + id + ", elderName=" + elderName + ", elderTel=" + elderTel + ", idCard=" + idCard
                + ", birthday=" + birthday + ", gender=" + gender + ", nativePlace=" + nativePlace + ", nation="
                + nation + ", address=" + address + ", areaId=" + areaId + ", pensionType=" + pensionType
                + ", linkmanName=" + linkmanName + ", linkmanTel=" + linkmanTel + ", qrCode=" + qrCode + ", lng=" + lng
                + ", lat=" + lat + ", isLocation=" + isLocation + ", subLvl=" + subLvl + ", perAccount=" + perAccount
                + ", subAccount=" + subAccount + ", currentSituation=" + currentSituation + ", memList=" + memList
                + "]";
    }

    
}
