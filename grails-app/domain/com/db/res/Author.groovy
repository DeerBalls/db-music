package com.db.res

/*
* 音乐作者
*/
class Author {

    static mapping = {
        table "res_author"
    }

    static constraints = {
        engName nullable: true
        birthday nullable: true
        hometown nullable: true
        intro nullable: true
        gender inList: ["男", "女", "未知"]
        type inList: ["作曲", "作词", "演唱"]
    }

    //姓名
    String name
    //英文名
    String engName
    //性别
    String gender
    //生日
    String birthday
    //籍贯
    String hometown
    //简介
    String intro
    //类型（词、曲、唱）
    String type

    public String toString(){ return name }

}
