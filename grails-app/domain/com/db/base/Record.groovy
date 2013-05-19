package com.db.base

import com.db.cus.User

/*
* 网站记录
*/
class Record {

    static mapping = {
        table "base_record"
    }


    static constraints = {
        type inList: ["收听", "下载", "登陆","操作"]
        user nullable: true
        ip nullable: true
        url nullable: true
        action nullable: true
        content nullable: true
    }

    //类型
    String type
    //用户
    User user
    //时间
    Date dateCreated
    //IP
    String ip
    //url
    String url
    //action
    String action
    //content
    String content

    public String toString(){ return url }
}
