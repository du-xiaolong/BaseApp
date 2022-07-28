package com.ello.baseapp

import android.util.Log

/**
 * @author dxl
 * @date 2022-07-21  周四
 */
class RoomHelper(private val room:String) {

    init {
        Log.d("dxl", System.currentTimeMillis().toString())
    }

    fun makeRoom() {
        Log.d("dxl", "makeRoom: $room")
    }
}