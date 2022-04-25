package com.example.android_pattern_mvp.presenter

import com.example.android_pattern_mvp.model.Post


interface MainPresenterImpl {
    fun apiPostList()
    fun apiPostDelete(post: Post)
}