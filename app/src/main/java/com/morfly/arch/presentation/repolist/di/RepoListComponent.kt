package com.morfly.arch.presentation.repolist.di

import com.morfly.cleanarchitecture.core.di.scope.PerFragment
import dagger.Subcomponent
import com.morfly.arch.presentation.repolist.RepoListFragment

@PerFragment
@Subcomponent(modules = arrayOf(RepoListModule::class))
interface RepoListComponent {

    @Subcomponent.Builder
    interface Builder {
        fun build(): RepoListComponent
    }

    fun inject(fragment: RepoListFragment)
}