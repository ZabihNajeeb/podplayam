package com.trios2024amdj.podplay.repository

import com.trios2024amdj.podplay.service.ItunesService

class ItunesRepo(private val itunesService: ItunesService) {
    suspend fun searchByTerm(term: String) =
        itunesService.searchPodcastByTerm(term)
}