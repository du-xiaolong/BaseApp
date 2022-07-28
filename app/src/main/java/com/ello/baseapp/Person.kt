package com.ello.baseapp

import javax.inject.Inject

/**
 * @author dxl
 * @date 2022-07-20  周三
 */
data class Person(
    val name: String,
    val id: Int
) {
    @Inject constructor():this("zhangsan", 1)
}