package com.handge.housingfund.common.service.account.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by tanyi on 2017/7/14.
 */
@XmlRootElement(name = "LoginReq")
@XmlAccessorType(XmlAccessType.FIELD)
public class LoginReq extends Req<Login> implements Serializable {

}
