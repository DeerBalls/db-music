package com.db.cus

/*
* 网站会员
*/
class User {

    static mapping = {
        table "cus_user"
    }

    static constraints = {
        username unique: true
        email email: true
        name nullable: true
        engName nullable: true
        gender nullable: true
        birthday nullable: true
        hometown nullable: true
        listBox nullable: true
    }
    //用户名
    String username
    //密码
    String password
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
    //邮箱
    String email
    //维护的歌曲表单
    ListBox listBox

    public String toString(){ return username }

}
