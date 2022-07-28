package com.ello.baseapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * @author dxl
 * @date
 */
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    companion object {
        const val TAG = "dxl"
    }


    @Inject
    lateinit var person: Person

    @Inject
    lateinit var mainAdapter: MainAdapter<String>

    @Inject
    @DXL2_ROOM
    lateinit var roomHelper: RoomHelper

    @Inject
    @DXL2_ROOM
    lateinit var roomHelper2: RoomHelper


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Log.d(TAG, "onCreate: $person")

//        mainAdapter.adapterCallback(Result.success("哈哈哈"))

        roomHelper.makeRoom()


        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.RESUMED) {
                Log.d(TAG, "onCreate: sssssssssssssssssss")
            }
        }
    }


}