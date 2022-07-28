package com.ello.baseapp

import android.util.Log
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Inject

/**
 * @author dxl
 * @date 2022-07-21  周四
 */
interface Callback<T> {

    fun onSuccess(data: T)

    fun onFail(e: Throwable?)
}


class CallbackImpl<T> @Inject constructor() : Callback<T> {
    override fun onSuccess(data: T) {
        Log.d("dxl", "onSuccess: $data")
    }

    override fun onFail(e: Throwable?) {
        Log.e("dxl", "onFail: $e")
    }

}

@Module
@InstallIn(ActivityComponent::class)
abstract class MainAdapterModule {

    @Binds
    abstract fun bindCallback(callbackImpl: CallbackImpl<String>): Callback<String>


}