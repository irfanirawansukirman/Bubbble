package com.imangazalievm.bubbble.di.modules;

import com.imangazalievm.bubbble.di.scopes.Presenter;

import dagger.Module;
import dagger.Provides;

@Module
public class UserDetailsPresenterModule {

    private final long userId;

    public UserDetailsPresenterModule(long userId) {
        this.userId = userId;
    }

    @Provides
    @Presenter
    long provideUserId() {
        return userId;
    }

}
