package com.db.res

import com.db.cus.User

/*
* 乐曲
*/
class Music {

    static mapping = {
        table "res_music"
    }

    static constraints = {
        album nullable: true
        user nullable: true
        uploadDate nullable: true
        intro nullable: true
    }

    static hasMany = [author:Author,tags:Tag]

    //名称
    String name
    //所属专辑
    Album album
    //上传人
    User user
    //上传时间
    Date uploadDate
    //文件存储位置
    String location
    //简介
    String intro

    public String toString(){ return name }

}
