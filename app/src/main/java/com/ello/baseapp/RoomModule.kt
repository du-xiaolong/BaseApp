package com.ello.baseapp

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Qualifier

/**
 * @author dxl
 * @date 2022-07-21  周四
 */
@Module
@InstallIn(ActivityComponent::class)
object RoomModule {

    @DXL1_ROOM
    @Provides
    fun provideRoomHelper1(): RoomHelper {
        return RoomHelper("测试1")
    }

    @DXL2_ROOM
    @Provides
    @ActivityScoped
    fun provideRoomHelper2(): RoomHelper {
        return RoomHelper("测试2")
    }

}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class DXL1_ROOM

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class DXL2_ROOM