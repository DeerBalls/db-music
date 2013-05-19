package com.db.cus

/*
* 收听列表项
*/
class ListBox {

    static mapping = {
        table "cus_listBox"
    }

    static constraints = {
        title nullable: true
        user nullable: true
    }

    static hasMany = [listBoxItems:ListBoxItem]

    //标题
    User title

    //所属用户
    User user

    public String toString(){ return title }

}
