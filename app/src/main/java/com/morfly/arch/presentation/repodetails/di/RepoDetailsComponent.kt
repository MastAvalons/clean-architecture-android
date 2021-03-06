package com.morfly.arch.presentation.repodetails.di

import com.morfly.cleanarchitecture.core.di.scope.PerFragment
import dagger.Subcomponent
import com.morfly.arch.presentation.repodetails.RepoDetailsFragment


@PerFragment
@Subcomponent(modules = arrayOf(RepoDetailsModule::class))
interface RepoDetailsComponent {

    @Subcomponent.Builder
    interface Builder {
        fun build(): RepoDetailsComponent
    }

    fun inject(fragment: RepoDetailsFragment)
}