package com.presldn.empowerment.networking.dagger.injection.component

import com.presldn.empowerment.networking.dagger.module.NetworkModule
import com.presldn.empowerment.viewmodels.QuoteListViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface ViewModelInjector {
    fun inject(quoteListViewModel: QuoteListViewModel)

    @Component.Builder
    interface Builder {
        fun Builder(): ViewModelInjector

        fun networkModule(networkModule: NetworkModule): Builder
    }
}