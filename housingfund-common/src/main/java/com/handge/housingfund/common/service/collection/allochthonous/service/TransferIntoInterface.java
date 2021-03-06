package com.handge.housingfund.common.service.collection.allochthonous.service;


import com.handge.housingfund.common.service.collection.allochthonous.model.*;
import com.handge.housingfund.common.service.TokenContext;

import java.util.*;
import java.io.*;

@SuppressWarnings({"JavaDoc", "SpellCheckingInspection", "UnnecessaryInterfaceModifier"})
public interface TransferIntoInterface{

  /**
   * 
   * 办理转移-转移接续转入
   * @param LXHBH 联系函编号
   * @param ZGXM 职工姓名
   * @param ZJHM 证件号码
   * @param zhuangTai 状态 （0：账户信息审核通过 1：账户信息审核不通过 2：协商中 3：系统处理中 4：正常办结 5：账户信息已录）
   * @param ZCGJJZXMC 转出公积金中心名称
   * @param KSSJ 开始时间
   * @param JSSJ 结束时间
   * @param pageNo 当前页数
   * @param pageSize 当前页数数据条数
   */
  public HandleTransferListModle handleTransferList(TokenContext tokenContext, final String LXHBH, final String ZGXM, final String ZJHM, final String zhuangTai, final String ZCGJJZXMC, final String KSSJ, final String JSSJ, final String pageNo, final String pageSize);


  /**
   * 
   * 业务流程详情-转移接续转入
   * @param YWLSH 业务流水号
   */
  public TransferIntoBusinessDetailsModle transferIntoBusinessDetails(TokenContext tokenContext, final String YWLSH);


  /**
   * 
   * 联系函详情-转移接续转入
   * @param YWLSH 业务流水号
   */
  public TransferIntoDetailsModle transferIntoDetails(TokenContext tokenContext, final String YWLSH);


  /**
   * 
   * 办结-转移接续转入
   * @param YWLSH 业务流水号
   * @param body 
   */
  public CommonResponses transferIntoFinish(TokenContext tokenContext, final String YWLSH, final TransferIntoFinishModle body);


  /**
   * 
   * 申请受理-转移接续转入
   * @param LXHBH 联系函编号
   * @param ZGXM 职工姓名
   * @param ZJHM 证件号码
   * @param ZCGJJZXMC 转出公积金中心名称
   * @param KSSJ 开始时间
   * @param JSSJ 结束时间
   * @param pageNo 当前页数
   * @param pageSize 当前页数数据条数
   */
  public TransferIntoListModle transferIntoList(TokenContext tokenContext, final String LXHBH, final String ZGXM, final String ZJHM, final String ZCGJJZXMC,final String ZhuangTai, final String KSSJ, final String JSSJ, final String pageNo, final String pageSize);


  /**
   * 
   * 协商-转移接续转入
   * @param YWLSH 业务流水号
   * @param body 
   */
  public CommonResponses transferIntoNegotiation(TokenContext tokenContext, final String YWLSH, final TransferIntoNegotiationModle body);


  /**
   * 
   * 录入联系函-转移接续转入
   * @param type 类型（0：保存 1：提交）
   * @param body 
   */
  public CommonResponses transferIntoPost(TokenContext tokenContext, final String type, final TransferIntoPostModle body);


  /**
   * 
   * 申请修改-转移接续转入
   * @param type 类型（0：保存 1：提交）
   * @param body 
   */
  public CommonResponses transferIntoPut(TokenContext tokenContext, final String type, final TransferIntoPutModle body);


}
