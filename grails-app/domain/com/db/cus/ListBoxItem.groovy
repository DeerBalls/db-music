package com.db.cus

import com.db.res.*
/*
* 收听列表
*/
class ListBoxItem {

    static mapping = {
        table "cus_listBoxItem"
    }

    static constraints = {
    }

    static belongsTo = [listBox:ListBox]

    static hasMany = [musics:Music]

    //标题
    User title

    public String toString(){ return title }

}
