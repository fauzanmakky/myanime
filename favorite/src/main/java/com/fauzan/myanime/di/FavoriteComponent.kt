package com.fauzan.myanime.di

import com.fauzan.myanime.presentation.favorite.FavoriteFragment
import dagger.Component

@FavoriteScope
@Component(dependencies = [FavoriteEntryPoint::class])
interface FavoriteComponent {
    fun inject(fragment: FavoriteFragment)

    @Component.Factory
    interface Factory {
        fun create(entryPoint: FavoriteEntryPoint): FavoriteComponent
    }
}
