package com.handge.housingfund.database.entities;

import javax.persistence.*;
import java.util.Date;

// default package
// Generated 2017-8-8 15:42:03 by Hibernate Tools 5.2.3.Final

/**
 * HGuaranteeVice generated by hbm2java
 */
@Entity
@Table(name = "c_loan_guarantee_vice")
@org.hibernate.annotations.Table(appliesTo = "c_loan_guarantee_vice", comment = "保证表")
public class CLoanGuaranteeVice extends Common implements java.io.Serializable {

    private static final long serialVersionUID = 8710678467019864255L;
    @Column(name = "BZFLX", columnDefinition = "VARCHAR(2) DEFAULT NULL COMMENT '保证方类型（0：个人 1：机构）'")
    private String bzflx;
    @Column(name = "FRDBXM", columnDefinition = "VARCHAR(120) DEFAULT NULL COMMENT '法人代表姓名'")
    private String frdbxm;
    @Column(name = "FRDBSFZHM", columnDefinition = "VARCHAR(18) DEFAULT NULL COMMENT '法人代表身份证号码'")
    private String frdbsfzhm;
    @Column(name = "FRDBLXDH", columnDefinition = "VARCHAR(20) DEFAULT NULL COMMENT '法人代表联系电话'")
    private String frdblxdh;
    @Column(name = "FRDBXJZDZ", columnDefinition = "VARCHAR(255) DEFAULT NULL COMMENT '法人代表现居住地址'")
    private String frdbxjzdz;
    @Column(name = "TXDZ", columnDefinition = "VARCHAR(255) DEFAULT NULL COMMENT '通讯地址'")
    private String txdz;
    @Column(name = "YZBM", columnDefinition = "VARCHAR(6) DEFAULT NULL COMMENT '邮政编码'")
    private String yzbm;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "cLoanHousingGuaranteeContractVice", columnDefinition = "VARCHAR(32) DEFAULT NULL COMMENT '担保合同信息副表'")
    private CLoanHousingGuaranteeContractVice cLoanHousingGuaranteeContractVice;

    public CLoanGuaranteeVice() {
    }

    public CLoanGuaranteeVice(String id, Date created_at, Date updated_at, Date deleted_at, boolean deleted,
                              String bzflx, String frdbxm, String frdbsfzhm, String frdblxdh, String frdbxjzdz, String txdz,
                              String yzbm, CLoanHousingGuaranteeContractVice cLoanHousingGuaranteeContractVice) {
        this.id = id;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.deleted_at = deleted_at;
        this.deleted = deleted;
        this.bzflx = bzflx;
        this.frdbxm = frdbxm;
        this.frdbsfzhm = frdbsfzhm;
        this.frdblxdh = frdblxdh;
        this.frdbxjzdz = frdbxjzdz;
        this.txdz = txdz;
        this.yzbm = yzbm;
        this.cLoanHousingGuaranteeContractVice = cLoanHousingGuaranteeContractVice;
    }

    public CLoanHousingGuaranteeContractVice getcLoanHousingGuaranteeContractVice() {
        return cLoanHousingGuaranteeContractVice;
    }

    public void setcLoanHousingGuaranteeContractVice(CLoanHousingGuaranteeContractVice cLoanHousingGuaranteeContractVice) {
        this.updated_at = new Date();
        this.cLoanHousingGuaranteeContractVice = cLoanHousingGuaranteeContractVice;
    }

    public String getBzflx() {
        return bzflx;
    }

    public void setBzflx(String bzflx) {
        this.updated_at = new Date();
        this.bzflx = bzflx;
    }

    public String getFrdbxm() {
        return frdbxm;
    }

    public void setFrdbxm(String frdbxm) {
        this.updated_at = new Date();
        this.frdbxm = frdbxm;
    }

    public String getFrdbsfzhm() {
        return frdbsfzhm;
    }

    public void setFrdbsfzhm(String frdbsfzhm) {
        this.updated_at = new Date();
        this.frdbsfzhm = frdbsfzhm;
    }

    public String getFrdblxdh() {
        return frdblxdh;
    }

    public void setFrdblxdh(String frdblxdh) {
        this.updated_at = new Date();
        this.frdblxdh = frdblxdh;
    }

    public String getFrdbxjzdz() {
        return frdbxjzdz;
    }

    public void setFrdbxjzdz(String frdbxjzdz) {
        this.updated_at = new Date();
        this.frdbxjzdz = frdbxjzdz;
    }

    public String getTxdz() {
        return txdz;
    }

    public void setTxdz(String txdz) {
        this.updated_at = new Date();
        this.txdz = txdz;
    }

    public String getYzbm() {
        return yzbm;
    }

    public void setYzbm(String yzbm) {
        this.updated_at = new Date();
        this.yzbm = yzbm;
    }

}