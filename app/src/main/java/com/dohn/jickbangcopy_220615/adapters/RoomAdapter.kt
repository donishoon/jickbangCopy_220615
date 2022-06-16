package com.dohn.jickbangcopy_220615.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.dohn.jickbangcopy_220615.R
import com.dohn.jickbangcopy_220615.datas.RoomData

class RoomAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<RoomData>
) : ArrayAdapter<RoomData>(mContext, resId, mList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if( tempRow == null ) {

            tempRow = LayoutInflater.from(mContext).inflate(R.layout.room_list_item, null)

        }

        val row = tempRow!!

        return row

    }

}