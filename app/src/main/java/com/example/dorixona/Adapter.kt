package com.example.dorixona

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter

class Adapter(context: Context, var kitoblar:MutableList<Kitob>):ArrayAdapter<Kitob>(context, R.layout.book_item2, kitoblar){
    override fun getCount(): Int {
        return kitoblar.size
    }

//    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//        val binding:
//    }
}