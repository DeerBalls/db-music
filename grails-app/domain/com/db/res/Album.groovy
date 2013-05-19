package com.db.res

/*
* 音乐专辑
*/
class Album {

    static mapping = {
        table "res_album"
    }

    static constraints = {
        author nullable: true
        language nullable: true
        genre nullable: true
        issueDate nullable: true
        company nullable: true
        intro nullable: true
    }

    static hasMany = [musics:Music,tags:Tag]

    //名称
    String name
    //作者（歌手）
    Author author
    //语言
    String language
    //流派
    String genre
    //发行时间
    String issueDate
    //唱片公司
    String company
    //简介
    String intro

    public String toString(){ return name }
}
