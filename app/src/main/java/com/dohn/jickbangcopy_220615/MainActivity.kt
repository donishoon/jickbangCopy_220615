package com.dohn.jickbangcopy_220615

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dohn.jickbangcopy_220615.adapters.RoomAdapter
import com.dohn.jickbangcopy_220615.datas.RoomData
import kotlinx.android.synthetic.main.activity_main.*

//  여기는 메인화면

class MainActivity : AppCompatActivity() {

//    방 데이터를 담을 목록 공간.

    val mRoomList = ArrayList<RoomData>()

//    어댑터 변수만 생성 => 대입은 나중에.
    lateinit var mAdapter : RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add( RoomData( 8500, "서울시 동대문구", 5, "1번째 방입니다."  ) )
        mRoomList.add( RoomData( 13400, "서울시 동대문구", 3, "2번째 방입니다."  ) )
        mRoomList.add( RoomData( 11100, "서울시 서대문구", 0, "3번째 방입니다."  ) )
        mRoomList.add( RoomData( 444200, "서울시 서대문구", -1, "4번째 방입니다."  ) )
        mRoomList.add( RoomData( 45000, "서울시 강남구", 10, "5번째 방입니다."  ) )
        mRoomList.add( RoomData( 25000, "서울시 강남구", 16, "6번째 방입니다."  ) )
        mRoomList.add( RoomData( 15000, "서울시 강남구", 1, "7번째 방입니다."  ) )
        mRoomList.add( RoomData( 9000, "서울시 서초구", -3, "8번째 방입니다."  ) )
        mRoomList.add( RoomData( 1900, "서울시 서초구", 12, "9번째 방입니다."  ) )
        mRoomList.add( RoomData( 30000, "서울시 서초구", 11, "9번째 방입니다."  ) )
        mRoomList.add( RoomData( 3000, "서울시 구로구", 7, "10번째 방입니다."  ) )

        mAdapter = RoomAdapter( this, R.layout.room_list_item, mRoomList )

        roomListView.adapter = mAdapter


        roomListView.setOnItemClickListener { parent, view, position, id ->

            val clickedRoom = mRoomList[position]

            val myIntent = Intent (this, ViewRoomDetailActivity::class.java)
            myIntent.putExtra("roomInfo", clickedRoom)
            startActivity(myIntent)


        }


    }
}