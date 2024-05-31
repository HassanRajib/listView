package com.example.listview

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import java.text.FieldPosition

class MyListAdapter(private val context: Activity,
    private val title:Array<String>,
    private val price:Array<String>,
    private val imageId:Array<Int>
):ArrayAdapter<String> (context, R.layout.item_li, title) {
    override fun getView(position: Int, converter: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.item_li, parent, false)

        val titleTx = rowView.findViewById<TextView>(R.id.fruNam)
        val priceTx = rowView.findViewById<TextView>(R.id.frePri)
        val image = rowView.findViewById<ImageView>(R.id.fruiteImg)

        titleTx.text = title[position]
        priceTx.text = price[position]
        image.setImageResource(imageId[position])

        return rowView
    }
}