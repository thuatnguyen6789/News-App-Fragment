package com.example.myapplicationnewskotlin2022.models

import com.example.myapplicationnewskotlin2022.models.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)