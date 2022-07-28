package com.ello.baseapp

import javax.inject.Inject

/**
 * @author dxl
 * @date 2022-07-21  周四
 */
class MainAdapter<T> @Inject constructor(val callback: Callback<T>) {

    fun adapterCallback(result: Result<T>) {
        if (result.isSuccess) {
            callback.onSuccess(result.getOrThrow())
        }else {
            callback.onFail(result.exceptionOrNull())
        }
    }
}