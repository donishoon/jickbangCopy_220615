package com.dohn.jickbangcopy_220615.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.dohn.jickbangcopy_220615.datas.RoomData

class RoomAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<RoomData>
) : ArrayAdapter<RoomData>(mContext, resId, mList) {
}