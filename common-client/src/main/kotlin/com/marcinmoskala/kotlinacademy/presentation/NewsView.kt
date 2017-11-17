package com.marcinmoskala.kotlinacademy.presentation

import com.marcinmoskala.kotlinacademy.data.News

interface NewsView {
    var loading: Boolean
    fun showList(news: List<News>)
    fun showError(throwable: Throwable)
}