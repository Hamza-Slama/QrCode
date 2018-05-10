package com.hamza.testqr

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by hamza on 27/02/18.
 */


@Parcelize
class Model(val title: String, val amount: Int) : Parcelable