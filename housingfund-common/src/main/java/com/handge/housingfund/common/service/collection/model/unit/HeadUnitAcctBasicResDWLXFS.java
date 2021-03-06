package com.handge.housingfund.common.service.collection.model.unit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;



@XmlRootElement(name = "HeadUnitAcctBasicResDWLXFS")
@XmlAccessorType(XmlAccessType.FIELD)
public class HeadUnitAcctBasicResDWLXFS  implements Serializable{

   private  String    CZHM;  //传真号码 

   private  String    DWLXDH;  //单位联系电话 

   private  String    DWDZXX;  //单位电子信箱 

   private  String    DWYB;  //单位邮编 

   public  String getCZHM(){ 

       return this.CZHM;   

   }


   public  void setCZHM(String  CZHM){ 

       this.CZHM = CZHM;   

   }


   public  String getDWLXDH(){ 

       return this.DWLXDH;   

   }


   public  void setDWLXDH(String  DWLXDH){ 

       this.DWLXDH = DWLXDH;   

   }


   public  String getDWDZXX(){ 

       return this.DWDZXX;   

   }


   public  void setDWDZXX(String  DWDZXX){ 

       this.DWDZXX = DWDZXX;   

   }


   public  String getDWYB(){ 

       return this.DWYB;   

   }


   public  void setDWYB(String  DWYB){ 

       this.DWYB = DWYB;   

   }


   public String toString(){ 

       return "HeadUnitAcctBasicResDWLXFS{" +  
 
              "CZHM='" + this.CZHM + '\'' + "," +
              "DWLXDH='" + this.DWLXDH + '\'' + "," +
              "DWDZXX='" + this.DWDZXX + '\'' + "," +
              "DWYB='" + this.DWYB + '\'' + 

      "}";

  } 
}