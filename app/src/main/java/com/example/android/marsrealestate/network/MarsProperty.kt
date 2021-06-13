/*
 * Copyright 2019, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.example.android.marsrealestate.network

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize

// class MarsProperty()
//The Parcelable interface enables objects to be serialized, so that the objects' data can be passed around between fragments or activities. In this case, for the data inside the MarsProperty object to be passed to the detail fragment via Safe Args, MarsProperty must implement the Parcelable interface.
//The good news is that Kotlin provides an easy shortcut for implementing that interface.
@Parcelize
data class MarsProperty(
    val id: String,
    // val img_src: String,
    @Json(name = "img_src") val imgSrcUrl: String,
    val type: String,
    val price: Double
)  : Parcelable {
    val isRental
        get() = type == "rent"

}
