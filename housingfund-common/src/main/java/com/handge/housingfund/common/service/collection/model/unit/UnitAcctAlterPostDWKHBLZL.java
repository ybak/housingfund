package com.handge.housingfund.common.service.collection.model.unit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;



@XmlRootElement(name = "UnitAcctAlterPostDWKHBLZL")
@XmlAccessorType(XmlAccessType.FIELD)
public class UnitAcctAlterPostDWKHBLZL  implements Serializable{

   private  String    BLZL;  //办理资料 

   public  String getBLZL(){ 

       return this.BLZL;   

   }


   public  void setBLZL(String  BLZL){ 

       this.BLZL = BLZL;   

   }


   public String toString(){ 

       return "UnitAcctAlterPostDWKHBLZL{" +  
 
              "BLZL='" + this.BLZL + '\'' + 

      "}";

  } 
}