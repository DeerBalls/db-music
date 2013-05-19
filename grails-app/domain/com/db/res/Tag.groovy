package com.db.res

/*
* 音乐标签
*/
class Tag {

    static mapping = {
        table "res_tag"
    }

    static constraints = {
        title blank: false
        type nullable: true
        note nullable: true
    }

    //标题
    String title
    //类别
    String type
    //备注
    String note

    public String toString(){ return title }

}
