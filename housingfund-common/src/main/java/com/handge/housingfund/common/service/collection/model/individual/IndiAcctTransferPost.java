package com.handge.housingfund.common.service.collection.model.individual;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;



@XmlRootElement(name = "IndiAcctTransferPost")
@XmlAccessorType(XmlAccessType.FIELD)
public class IndiAcctTransferPost  implements Serializable{

   private  String    BLZL;  //办理资料 

   private  String    JBRZJLX;  //经办人证件类型 

   private  String    ZYSXNY;  //转移生效年月 

   private  String    JBRXM;  //经办人姓名 

   private  String    YWWD;  //业务网点 

   private  ArrayList<IndiAcctTransferPostList>    list;  // 

   private  String    JBRZJHM;  //经办人证件号码 

   private  String    ZCDWZH;  //转出单位账号 

   private  String    CZY;  //操作员 

   private  String    CZLX;  //操作类型（0:保存；1:提交;） 

   private  String    ZCDWMC;  //转出单位名称 

   public  String getBLZL(){ 

       return this.BLZL;   

   }


   public  void setBLZL(String  BLZL){ 

       this.BLZL = BLZL;   

   }


   public  String getJBRZJLX(){ 

       return this.JBRZJLX;   

   }


   public  void setJBRZJLX(String  JBRZJLX){ 

       this.JBRZJLX = JBRZJLX;   

   }


   public  String getZYSXNY(){ 

       return this.ZYSXNY;   

   }


   public  void setZYSXNY(String  ZYSXNY){ 

       this.ZYSXNY = ZYSXNY;   

   }


   public  String getJBRXM(){ 

       return this.JBRXM;   

   }


   public  void setJBRXM(String  JBRXM){ 

       this.JBRXM = JBRXM;   

   }


   public  String getYWWD(){ 

       return this.YWWD;   

   }


   public  void setYWWD(String  YWWD){ 

       this.YWWD = YWWD;   

   }


   public  ArrayList<IndiAcctTransferPostList> getlist(){ 

       return this.list;   

   }


   public  void setlist(ArrayList<IndiAcctTransferPostList>  list){ 

       this.list = list;   

   }


   public  String getJBRZJHM(){ 

       return this.JBRZJHM;   

   }


   public  void setJBRZJHM(String  JBRZJHM){ 

       this.JBRZJHM = JBRZJHM;   

   }


   public  String getZCDWZH(){ 

       return this.ZCDWZH;   

   }


   public  void setZCDWZH(String  ZCDWZH){ 

       this.ZCDWZH = ZCDWZH;   

   }


   public  String getCZY(){ 

       return this.CZY;   

   }


   public  void setCZY(String  CZY){ 

       this.CZY = CZY;   

   }


   public  String getCZLX(){ 

       return this.CZLX;   

   }


   public  void setCZLX(String  CZLX){ 

       this.CZLX = CZLX;   

   }


   public  String getZCDWMC(){ 

       return this.ZCDWMC;   

   }


   public  void setZCDWMC(String  ZCDWMC){ 

       this.ZCDWMC = ZCDWMC;   

   }


   public String toString(){ 

       return "IndiAcctTransferPost{" +  
 
              "BLZL='" + this.BLZL + '\'' + "," +
              "JBRZJLX='" + this.JBRZJLX + '\'' + "," +
              "ZYSXNY='" + this.ZYSXNY + '\'' + "," +
              "JBRXM='" + this.JBRXM + '\'' + "," +
              "YWWD='" + this.YWWD + '\'' + "," +
              "list='" + this.list + '\'' + "," +
              "JBRZJHM='" + this.JBRZJHM + '\'' + "," +
              "ZCDWZH='" + this.ZCDWZH + '\'' + "," +
              "CZY='" + this.CZY + '\'' + "," +
              "CZLX='" + this.CZLX + '\'' + "," +
              "ZCDWMC='" + this.ZCDWMC + '\'' + 

      "}";

  } 
}