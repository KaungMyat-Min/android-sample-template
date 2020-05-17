package me.kaungmyatmin.mytemplate.util

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.schedulers.Schedulers

class ObserverUtil {
    companion object {

        fun <T> setupIoChannel(observable: Observable<T>): Observable<T> =
            observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
    }

}